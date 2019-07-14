/*
 * SecurityService.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */

package com.bcs.bm.catalog_of_instruments_rudata.services;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import lombok.SneakyThrows;

import com.google.common.collect.Maps;

import com.bcs.bm.catalog_of_instruments_rudata.aspects.Authenticate;
import com.bcs.bm.catalog_of_instruments_rudata.aspects.Token;
import com.bcs.bm.catalog_of_instruments_rudata.components.processors.JsonProcessor;
import com.bcs.bm.catalog_of_instruments_rudata.configurations.ServiceProperties;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.RepositoryFacade;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.Security;

@Transactional
@Service(SecurityService.NAME)
public class SecurityService extends AbstractRuDataService<Security> {

    public static final String NAME = "security" + AbstractRuDataService.NAME;

    @Autowired
    public SecurityService(RepositoryFacade<Map, Security> repositoryFacade,
                          JsonProcessor jsonProcessor,
                          RestTemplate restTemplate,
                          ServiceProperties serviceProperties) {
        super(repositoryFacade, serviceProperties, jsonProcessor, restTemplate, Security.class);
    }

    @SuppressWarnings("unchecked")
    @Authenticate
    @Override
    @SneakyThrows({URISyntaxException.class})
    public List<Security> upload(Token token) {
        try {
            if (Objects.isNull(token)) {
                return Collections.emptyList();
            }
            final LocalDateTime lastImport = getLastUpdateTime();
            final HttpHeaders headers = new HttpHeaders();
            headers.set(HttpHeaders.AUTHORIZATION, "Bearer " + token.getValue());
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.setContentType(MediaType.APPLICATION_JSON);
            final URI uri = new URI(serviceProperties.getRuData().getUrl() + "/Info/Securities");
            final Map<String, Object> request = Maps.newHashMap();
            request.put("filter", "FINTOOLID>0" + (Objects.nonNull(lastImport) ? " AND UPDATE_DATE>=#" + lastImport.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSSS")) + "Z#" : ""));
            request.put("count", Integer.MAX_VALUE);
            final ResponseEntity response = restTemplate.exchange(uri.toString(), HttpMethod.POST, new HttpEntity<>(request, headers), List.class);
            final List<Security> result = repositoryFacade.upsert(clazz, jsonProcessor.apply((List<Map<String, Object>>) response.getBody()), LocalDateTime.now(ZoneOffset.UTC));
            return result;
        } finally {
            count = repositoryFacade.count(clazz);
        }
    }
}
