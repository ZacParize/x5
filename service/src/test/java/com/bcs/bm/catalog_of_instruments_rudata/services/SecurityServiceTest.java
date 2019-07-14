/*
 * SecuritiesServiceTest.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */

package com.bcs.bm.catalog_of_instruments_rudata.services;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import com.bcs.bm.catalog_of_instruments_rudata.TestUtil;
import com.bcs.bm.catalog_of_instruments_rudata.components.processors.JsonProcessor;
import com.bcs.bm.catalog_of_instruments_rudata.configurations.ServiceProperties;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.RepositoryFacade;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.RepositoryFacadeImpl;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.Security;

@SuppressWarnings("unchecked")
class SecurityServiceTest extends AbstractRuDataServiceTest<Security> {

    private RepositoryFacade repositoryFacade;
    private JsonProcessor jsonProcessor;
    private RestTemplate restTemplate;
    private ServiceProperties serviceProperties;
    private SecurityService securityService;

    @BeforeEach
    void init() {
        restTemplate = Mockito.mock(RestTemplate.class);
        repositoryFacade = Mockito.mock(RepositoryFacadeImpl.class);
        jsonProcessor = Mockito.mock(JsonProcessor.class);
        serviceProperties = TestUtil.getDefaultProperties();
        securityService = new SecurityService(repositoryFacade, jsonProcessor, restTemplate, serviceProperties);
    }

    @Test
    @DisplayName("Test SecurityService getLastUpdateTime")
    void test_getLastUpdateDate() {
        LocalDateTime updateDate = LocalDateTime.now();
        Security entity = new Security("1", Security.class.getAnnotation(Document.class).collection(), updateDate);
        entity.setUpdatedate(updateDate);
        super.test_getLastUpdateDate(repositoryFacade, securityService, Security.class, updateDate, entity);
    }

    @Test
    @DisplayName("Test SecurityService getByKeys")
    void test_getByKeys() {
        List<Security> securityList = Lists.newLinkedList();
        securityList.add(new Security("1", Security.class.getAnnotation(Document.class).collection(), LocalDateTime.now()));
        List<Map<String, ?>> keys = Arrays.asList(ImmutableMap.of("id","1"));
        super.test_getByKeys(repositoryFacade, securityService, Security.class, securityList, keys);
    }

    @Test
    @DisplayName("Test SecurityService upload")
    void test_upload() {
        List<Security> securityList = Lists.newLinkedList();
        securityList.add(new Security("1", Security.class.getAnnotation(Document.class).collection(), LocalDateTime.now()));
        ResponseEntity response = Mockito.mock(ResponseEntity.class);
        Map<String, Object> body = Maps.newHashMap();
        body.put("column11", ImmutableMap.of("key1","value1"));
        body.put("column12", ImmutableMap.of("key2","value2"));
        super.test_upload(repositoryFacade, securityService, restTemplate, jsonProcessor, Security.class, securityList, response, Collections.singletonList(body));
    }

    @Test
    @DisplayName("Test SecurityService getAll")
    void test_getAll() {
        super.test_getAll(repositoryFacade, securityService, Security.class, Collections.emptyList());
    }

    @Test
    @DisplayName("Test SecurityService deleteAll")
    void test_deleteAll() {
        super.test_deleteAll(securityService);
    }

    @Test
    @DisplayName("Test SecurityService getByIdsAndUpdateDate")
    void test_getByKeysAndUpdateDate() {
        List<Map<String, ?>> keys = Arrays.asList(ImmutableMap.of("id","1"), ImmutableMap.of("id","2"), ImmutableMap.of("id","3"));
        List<Security> securityList = Arrays.asList(new Security("1", "", LocalDateTime.now()), new Security("2", "", LocalDateTime.now()), new Security("3", "", LocalDateTime.now()));
        super.test_getByKeysAndUpdateDate(repositoryFacade, securityService, Security.class, securityList, keys);
    }

    @Test
    @DisplayName("Test SecurityService count")
    void count() {
        final long oldCount = securityService.count;
        final long newCount = new Random().nextLong();
        securityService.count = newCount;
        super.test_count(securityService, newCount);
        securityService.count = oldCount;
    }
}
