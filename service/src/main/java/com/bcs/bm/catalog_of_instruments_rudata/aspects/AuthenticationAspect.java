/*
 * AuthenticationAspect.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */
package com.bcs.bm.catalog_of_instruments_rudata.aspects;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.commons.lang3.ArrayUtils;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.validation.BindingResult;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Validator;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

import com.google.common.collect.ImmutableMap;

import com.bcs.bm.catalog_of_instruments_rudata.configurations.ServiceProperties;

@Aspect
@Component(AuthenticationAspect.NAME)
@Slf4j
public class AuthenticationAspect {

    public static final String NAME = "authenticationAspect";

    private static final String TOKEN_KEY = "token";

    private final Lock lock = new ReentrantLock();

    private final ServiceProperties serviceProperties;

    private final RestTemplate restTemplate;

    private final Validator validator;

    private Token token;

    @Autowired
    public AuthenticationAspect(ServiceProperties serviceProperties, RestTemplate restTemplate, Validator validator) {
        this.serviceProperties = serviceProperties;
        this.restTemplate = restTemplate;
        this.validator = validator;
    }

    private boolean isTokenValid() {
        return Objects.nonNull(token) && (token.isValid());
    }

    private Token obtain() {
        final HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        final HttpEntity<Map<String, String>> request = new HttpEntity<>(ImmutableMap.of("login", serviceProperties.getRuData().getLogin(), "password", serviceProperties.getRuData().getPassword()), headers);
        final ResponseEntity<Map> response = restTemplate.exchange(serviceProperties.getRuData().getUrl() + "/Account/Login", HttpMethod.POST, request, Map.class);

        if (response.getStatusCode() != HttpStatus.OK || !response.getBody().containsKey(TOKEN_KEY)) {
            String message = String.format("%s: RuData returns error during token obtaining", this.getClass().getSimpleName() + "::obtain");
            log.error(message);
            throw new IllegalStateException(message);
        }

        final Token tempToken = new Token(TOKEN_KEY, (String) response.getBody().get(TOKEN_KEY), LocalDateTime.now(), serviceProperties.getRuData().getTokenLifetime());
        final BindingResult bindingResult = new DataBinder(tempToken).getBindingResult();
        validator.validate(tempToken, bindingResult);
        if (bindingResult.hasErrors()) {
            String message = String.format("%s: RuData returns incorrect token", getClass().getSimpleName() + "::obtain");
            log.error(message);
            throw new IllegalStateException(message);
        }

        return tempToken;
    }

    private void authenticate() {
        if (isTokenValid()) {
            return;
        }
        try {
            lock.lock();
            if (isTokenValid()) {
                return;
            }
            token = obtain();
            log.info("{}: RuData returns correct token", getClass().getSimpleName() + "::authenticate");
        } catch (Exception ex) {
            token = null;
            log.error("{}: error occurred when tried to obtain RuData token {}", getClass().getSimpleName() + "::authenticate", ex.getLocalizedMessage());
        } finally {
            lock.unlock();
        }
    }

    @Around("@annotation(Authenticate)")
    public void invokeAdviceMethod(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        if (Objects.isNull(proceedingJoinPoint)) {
            return;
        }
        authenticate();
        Object[] args = proceedingJoinPoint.getArgs();
        Object[] argsCopy;
        if (ArrayUtils.isEmpty(args) || Arrays.stream(args).allMatch(Objects::isNull)) {
            argsCopy = new Object[1];
            argsCopy[0] = Token.DEFAULT_TOKEN;
        } else {
            argsCopy = Arrays.copyOf(args, args.length);
        }
        for (int i = 0; i < argsCopy.length; i++) {
            if (argsCopy[i] instanceof Token) {
                argsCopy[i] = token;
            }
        }
        proceedingJoinPoint.proceed(argsCopy);
    }

}