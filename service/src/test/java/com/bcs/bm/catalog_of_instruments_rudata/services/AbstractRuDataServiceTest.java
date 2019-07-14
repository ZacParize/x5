/*
 * AbstractServiceTest.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */

package com.bcs.bm.catalog_of_instruments_rudata.services;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.mockito.Mockito;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.google.common.collect.Lists;

import com.bcs.bm.catalog_of_instruments_rudata.aspects.Token;
import com.bcs.bm.catalog_of_instruments_rudata.components.processors.JsonProcessor;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.RepositoryFacade;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.DefaultEntity;

@SuppressWarnings("unchecked")
class AbstractRuDataServiceTest<T extends DefaultEntity> {

    void test_getLastUpdateDate(RepositoryFacade repositoryFacade, AbstractRuDataService<T> abstractRuDataService, Class<T> clazz, LocalDateTime updateDate, DefaultEntity entity) {
        Mockito.when(repositoryFacade.findLastRecord(clazz)).thenReturn(null);
        Assertions.assertNull(abstractRuDataService.getLastUpdateTime());
        Mockito.when(repositoryFacade.findLastRecord(clazz)).thenReturn(entity);
        Assertions.assertEquals(updateDate, abstractRuDataService.getLastUpdateTime());
    }

    void test_getByKeys(RepositoryFacade repositoryFacade, AbstractRuDataService<T> abstractRuDataService, Class<T> clazz, List<T> entityList, List<Map<String, ?>> keys) {
        Mockito.when(repositoryFacade.findByKeys(clazz, keys, null, null)).thenReturn(entityList);
        Mockito.when(repositoryFacade.findByKeys(clazz, null, null, null)).thenReturn(Collections.emptyList());
        Assertions.assertIterableEquals(abstractRuDataService.getByKeys(keys, null, null), entityList);
        Assertions.assertIterableEquals(abstractRuDataService.getByKeys(null, null, null), Collections.emptyList());
    }

    void test_upload(RepositoryFacade repositoryFacade, AbstractRuDataService<T> abstractRuDataService, RestTemplate restTemplate, JsonProcessor jsonProcessor, Class<T> clazz, List<T> entityList, ResponseEntity response, List<Map<String, Object>> body) {
        Mockito.when(response.getBody()).thenReturn(body);
        Mockito.when(restTemplate.exchange(Mockito.anyString(), Mockito.any(HttpMethod.class), Mockito.any(HttpEntity.class), Mockito.eq(List.class))).thenReturn(response);
        Mockito.when(jsonProcessor.apply(Mockito.anyList())).thenReturn(Lists.newArrayList());
        Mockito.when(repositoryFacade.upsert(Mockito.eq(clazz), Mockito.anyList(), Mockito.any(LocalDateTime.class))).thenReturn(entityList);
        Assertions.assertIterableEquals(abstractRuDataService.upload(null), Collections.emptyList());
        Assertions.assertIterableEquals(abstractRuDataService.upload(new Token("token_name", "token_value", LocalDateTime.now(), Duration.ofMinutes(5))), entityList);
    }

    void test_getAll(RepositoryFacade repositoryFacade, AbstractRuDataService<T> abstractRuDataService, Class<T> clazz, List<T> entityList) {
        Mockito.when(repositoryFacade.findAll(Mockito.eq(clazz), Mockito.any(), Mockito.any())).thenReturn(entityList);
        Assertions.assertIterableEquals(abstractRuDataService.getAll(null, null), entityList);
    }

    void test_deleteAll(AbstractRuDataService<T> abstractRuDataService) {
        abstractRuDataService.deleteAll();
        Assertions.assertEquals(0, abstractRuDataService.getAll(null, null).size());
    }

    void test_getByKeysAndUpdateDate(RepositoryFacade repositoryFacade, AbstractRuDataService<T> abstractRuDataService, Class<T> clazz, List<T> entities, List<Map<String, ?>> keys) {
        Assertions.assertEquals(0, abstractRuDataService.getByKeysAndUpdateDate(Collections.emptyList(), LocalDateTime.now(), null, null).size());
        Assertions.assertEquals(0, abstractRuDataService.getByKeys(null, null, null).size());
        Mockito.when(repositoryFacade.findByKeysAndUpdateDate(Mockito.eq(clazz), Mockito.anyList(), Mockito.any(), Mockito.any(), Mockito.any())).thenReturn(entities);
        Mockito.when(repositoryFacade.findByKeys(Mockito.eq(clazz), Mockito.anyList(), Mockito.any(), Mockito.any())).thenReturn(entities);
        Assertions.assertIterableEquals(abstractRuDataService.getByKeys(keys, null, null), entities);
        Assertions.assertIterableEquals(abstractRuDataService.getByKeysAndUpdateDate(keys, null, null, null), entities);
        Assertions.assertIterableEquals(abstractRuDataService.getByKeysAndUpdateDate(keys, LocalDateTime.now(), null, null), entities);
    }

    void test_count(AbstractRuDataService<T> abstractRuDataService, long testValue) {
        Assertions.assertTrue(abstractRuDataService.count() == testValue);
    }
}
