/*
 * ApiController.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */

package com.bcs.bm.catalog_of_instruments_rudata.controllers;

import java.time.LocalDateTime;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.constraints.NotBlank;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.context.MessageSource;
import org.springframework.http.MediaType;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

import com.google.common.collect.Maps;

import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.DefaultEntity;
import com.bcs.bm.catalog_of_instruments_rudata.services.AbstractRuDataService;
import com.bcs.bm.catalog_of_instruments_rudata.services.reactives.DefaultSubscriber;
import com.bcs.bm.common.dto.ResultDto;
import com.bcs.bm.common.errors.ErrorGroup;

import static com.bcs.bm.common.dto.ResultDto.error;

@CrossOrigin
@Validated
@RestController
@Slf4j
@RequestMapping(value = "rest", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
public class ApiController<T extends DefaultEntity> {

    private final Map<String, AbstractRuDataService<T>> services;
    private final List<String> serviceNames;
    private final MessageSource messageSource;

    public ApiController(Map<String, AbstractRuDataService<T>> services,
                         MessageSource messageSource) {
        this.services = services;
        this.serviceNames = this.services.keySet().stream().map(s -> StringUtils.replace(s, AbstractRuDataService.NAME, "")).collect(Collectors.toList());
        this.messageSource = messageSource;
    }

    @PostMapping("get-entities")
    @SuppressWarnings("unchecked")
    public List getEntities(@RequestParam(value = "reqId") @NotBlank String reqId,
                            @RequestParam(value = "entity") @NotBlank String entity,
                            @RequestBody(required = false) Map<String, ?> body) {
        final String serviceName = StringUtils.lowerCase(entity) + AbstractRuDataService.NAME;
        if (!services.keySet().contains(serviceName)) {
            throw new IllegalArgumentException("Incorrect entity type '" + entity + "'");
        }
        LocalDateTime parsedUpdateDate = null;
        Integer skipCount = null;
        Integer pageSize = null;
        List<Map<String, ?>> filter = null;
        if (MapUtils.isNotEmpty(body)) {
            Map<String, Object> tempMap = Maps.newTreeMap(String.CASE_INSENSITIVE_ORDER);
            tempMap.putAll(body);
            if (tempMap.containsKey("filter") && (tempMap.get("filter") instanceof List) && (CollectionUtils.isNotEmpty((List)tempMap.get("filter")))) {
                filter = ((List<Map<String, ?>>) tempMap.get("filter")).stream()
                                                                       .filter((Map<String, ?> map) -> map.values().stream().anyMatch(Objects::nonNull))
                                                                       .collect(Collectors.toList());
                if (filter.stream().anyMatch(e -> e.keySet().contains("") || e.keySet().contains(null) || !e.keySet().stream().allMatch(k -> k.matches("[A-Za-z0-9-_]*")))) {
                    throw new IllegalArgumentException("Incorrect filter '" + filter + "'");
                }
            }
            if (tempMap.containsKey("updateDate") && StringUtils.isNotBlank(tempMap.get("updateDate").toString())) {
                final String updateDate = tempMap.get("updateDate").toString();
                try {
                    parsedUpdateDate = LocalDateTime.parse(updateDate);
                } catch (DateTimeParseException e) {
                    throw new IllegalArgumentException("Incorrect date format '" + updateDate + "'", e);
                }
            }
            if (tempMap.containsKey("skipCount") && (tempMap.get("skipCount") instanceof Integer)) {
                skipCount = (Integer) tempMap.get("skipCount");
            }
            if (tempMap.containsKey("pageSize") && (tempMap.get("pageSize") instanceof Integer)) {
                pageSize = (Integer) tempMap.get("pageSize");
            }
        }
        return services.get(serviceName).getByKeysAndUpdateDate(filter, parsedUpdateDate, skipCount, pageSize);
    }

    @GetMapping("get-entities-count")
    public Map<String, Long> getEntitiesCount(@RequestParam(value = "reqId") @NotBlank String reqId) {
        Map<String, Long> result = Maps.newHashMapWithExpectedSize(services.size());
        services.entrySet().forEach(s -> result.put(serviceNames.stream().filter(e -> StringUtils.containsIgnoreCase(s.getKey(),e)).findFirst().get(),s.getValue().count()));
        return result;
    }

    @GetMapping("delete-all")
    public void deleteAll() {
        if (MapUtils.isEmpty(services)) {
            return;
        }
        services.forEach((k,v) -> v.deleteAll());
    }

    @GetMapping("get-all-types")
    public List<String> getEntityTypes(@RequestParam(value = "reqId") @NotBlank String reqId) {
        return serviceNames;
    }

    @GetMapping("get-subscription-count")
    public long getSubscriptionCount(@RequestParam(value = "reqId") @NotBlank String reqId) {
        return DefaultSubscriber.getSubscriptionCount();
    }

    @ExceptionHandler(Exception.class)
    public ResultDto<Object> processException(HttpServletRequest request, HttpServletResponse response, Exception e) {
        log.error("Error {} during request {} processing: {}", ErrorGroup.getErrorGroupByMessage("system.error.internal"), request.getParameter("reqId"), e.getLocalizedMessage());
        return error(messageSource, request.getParameter("reqId"), "system.error.internal", "Error during query execution");
    }
}
