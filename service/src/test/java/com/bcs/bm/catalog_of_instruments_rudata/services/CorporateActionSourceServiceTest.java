/*
 * CorporateActionSource.java
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
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.CorporateActionKind;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.CorporateActionSource;

@SuppressWarnings("unchecked")
class CorporateActionSourceServiceTest extends AbstractRuDataServiceTest<CorporateActionSource> {
    private RepositoryFacade repositoryFacade;
    private JsonProcessor jsonProcessor;
    private RestTemplate restTemplate;
    private ServiceProperties serviceProperties;
    private CorporateActionSourceService corporateActionSourceService;

    @BeforeEach
    void init() {
        restTemplate = Mockito.mock(RestTemplate.class);
        repositoryFacade = Mockito.mock(RepositoryFacadeImpl.class);
        jsonProcessor = Mockito.mock(JsonProcessor.class);
        serviceProperties = TestUtil.getDefaultProperties();
        corporateActionSourceService = new CorporateActionSourceService(repositoryFacade, jsonProcessor, restTemplate, serviceProperties);
    }

    @Test
    @DisplayName("Test CorporateActionSourceService getLastUpdateTime")
    void test_getLastUpdateDate() {
        LocalDateTime updateDate = LocalDateTime.now();
        CorporateActionSource entity = new CorporateActionSource("1", CorporateActionKind.class.getAnnotation(Document.class).collection(), updateDate);
        entity.setImporttime(updateDate);
        super.test_getLastUpdateDate(repositoryFacade, corporateActionSourceService, CorporateActionSource.class, updateDate, entity);
    }

    @Test
    @DisplayName("Test CorporateActionSourceService getByIds")
    void test_getByIds() {
        List<CorporateActionSource> corporateActionSourceList = Lists.newLinkedList();
        corporateActionSourceList.add(new CorporateActionSource("1", CorporateActionSource.class.getAnnotation(Document.class).collection(), LocalDateTime.now()));
        List<Map<String, ?>> keys = Arrays.asList(ImmutableMap.of("id","1"));
        super.test_getByKeys(repositoryFacade, corporateActionSourceService, CorporateActionSource.class, corporateActionSourceList, keys);
    }

    @Test
    @DisplayName("Test CorporateActionSourceService upload")
    void test_upload() {
        List<CorporateActionSource> corporateActionSourceList = Lists.newLinkedList();
        corporateActionSourceList.add(new CorporateActionSource("", CorporateActionSource.class.getAnnotation(Document.class).collection(), LocalDateTime.now()));
        ResponseEntity response = Mockito.mock(ResponseEntity.class);
        Map<String, Object> body = Maps.newHashMap();
        body.put("Columns", ImmutableList.of(ImmutableMap.of("column1", "type1"), ImmutableMap.of("column2", "type2")));
        body.put("Rows", ImmutableList.of("row1", "row2"));
        super.test_upload(repositoryFacade, corporateActionSourceService, restTemplate, jsonProcessor, CorporateActionSource.class, corporateActionSourceList, response, Collections.singletonList(body));
    }

    @Test
    @DisplayName("Test CorporateActionSourceService getAll")
    void test_getAll() {
        super.test_getAll(repositoryFacade, corporateActionSourceService, CorporateActionSource.class, Collections.emptyList());
    }

    @Test
    @DisplayName("Test CorporateActionSourceService deleteAll")
    void test_deleteAll() {
        super.test_deleteAll(corporateActionSourceService);
    }

    @Test
    @DisplayName("Test CorporateActionSourceService getByIdsAndUpdateDate")
    void test_getByIdsAndUpdateDate() {
        List<Map<String, ?>> keys = Arrays.asList(ImmutableMap.of("id","1"), ImmutableMap.of("id","2"), ImmutableMap.of("id","3"));
        List<CorporateActionSource> corporateActionSourceList = Arrays.asList(new CorporateActionSource("1", "", LocalDateTime.now()), new CorporateActionSource("2", "", LocalDateTime.now()), new CorporateActionSource("3", "", LocalDateTime.now()));
        super.test_getByKeysAndUpdateDate(repositoryFacade, corporateActionSourceService, CorporateActionSource.class, corporateActionSourceList, keys);
    }

    @Test
    @DisplayName("Test CorporateActionSourceService count")
    void count() {
        final long oldCount = corporateActionSourceService.count;
        final long newCount = new Random().nextLong();
        corporateActionSourceService.count = newCount;
        super.test_count(corporateActionSourceService, newCount);
        corporateActionSourceService.count = oldCount;
    }
}
