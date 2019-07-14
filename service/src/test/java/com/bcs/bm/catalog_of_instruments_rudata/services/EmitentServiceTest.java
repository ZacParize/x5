/*
 * EmitentServiceTest.java
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

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import com.bcs.bm.catalog_of_instruments_rudata.TestUtil;
import com.bcs.bm.catalog_of_instruments_rudata.components.processors.JsonProcessor;
import com.bcs.bm.catalog_of_instruments_rudata.configurations.ServiceProperties;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.RepositoryFacade;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.RepositoryFacadeImpl;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.Emitent;

@SuppressWarnings("unchecked")
class EmitentServiceTest extends AbstractRuDataServiceTest<Emitent> {

    private RepositoryFacade repositoryFacade;
    private JsonProcessor jsonProcessor;
    private RestTemplate restTemplate;
    private ServiceProperties serviceProperties;
    private EmitentService emitentService;

    @BeforeEach
    void init() {
        restTemplate = Mockito.mock(RestTemplate.class);
        repositoryFacade = Mockito.mock(RepositoryFacadeImpl.class);
        jsonProcessor = Mockito.mock(JsonProcessor.class);
        serviceProperties = TestUtil.getDefaultProperties();
        emitentService = new EmitentService(repositoryFacade, jsonProcessor, restTemplate, serviceProperties);
    }

    @Test
    @DisplayName("Test EmitentService getLastUpdateTime")
    void test_getLastUpdateDate() {
        LocalDateTime updateDate = LocalDateTime.now();
        Emitent emitent = new Emitent("1", Emitent.class.getAnnotation(Document.class).collection(), updateDate);
        emitent.setUpdatedate(updateDate);
        super.test_getLastUpdateDate(repositoryFacade, emitentService, Emitent.class, updateDate, emitent);
    }

    @Test
    @DisplayName("Test EmitentService getByKeys")
    void test_getByKeys() {
        List<Emitent> emitentList = Lists.newLinkedList();
        emitentList.add(new Emitent("1", Emitent.class.getAnnotation(Document.class).collection(), LocalDateTime.now()));
        List<Map<String, ?>> keys = ImmutableList.of(ImmutableMap.of("id", "1"));
        super.test_getByKeys(repositoryFacade, emitentService, Emitent.class, emitentList, keys);
    }

    @Test
    @DisplayName("Test EmitentService upload")
    void test_upload() {
        List<Emitent> emitentList = Lists.newLinkedList();
        emitentList.add(new Emitent("1", Emitent.class.getAnnotation(Document.class).collection(), LocalDateTime.now()));
        ResponseEntity response = Mockito.mock(ResponseEntity.class);
        Map<String, Object> body = Maps.newHashMap();
        body.put("column11", ImmutableMap.of("key1","value1"));
        body.put("column12", ImmutableMap.of("key2","value2"));
        super.test_upload(repositoryFacade, emitentService, restTemplate, jsonProcessor, Emitent.class, emitentList, response, Collections.singletonList(body));
    }

    @Test
    @DisplayName("Test EmitentService getAll")
    void test_getAll() {
        super.test_getAll(repositoryFacade, emitentService, Emitent.class, Collections.emptyList());
    }

    @Test
    @DisplayName("Test EmitentService deleteAll")
    void test_deleteAll() {
        super.test_deleteAll(emitentService);
    }

    @Test
    @DisplayName("Test EmitentService getByKeysAndUpdateDate")
    void test_getByKeysAndUpdateDate() {
        List<Map<String, ?>> keys = Arrays.asList(ImmutableMap.of("id","1"), ImmutableMap.of("id","2"), ImmutableMap.of("id","3"));
        List<Emitent> emitents = Arrays.asList(new Emitent("1", "", LocalDateTime.now()), new Emitent("2", "", LocalDateTime.now()), new Emitent("3", "", LocalDateTime.now()));
        super.test_getByKeysAndUpdateDate(repositoryFacade, emitentService, Emitent.class, emitents, keys);
    }

    @Test
    @DisplayName("Test EmitentService count")
    void count() {
        final long oldCount = emitentService.count;
        final long newCount = new Random().nextLong();
        emitentService.count = newCount;
        super.test_count(emitentService, newCount);
        emitentService.count = oldCount;
    }
}
