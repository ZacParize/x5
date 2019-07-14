/*
 * CorporateActionKingServiceTest.java
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

@SuppressWarnings("unchecked")
public class CorporateActionKindServiceTest extends AbstractRuDataServiceTest<CorporateActionKind> {
    private RepositoryFacade repositoryFacade;
    private JsonProcessor jsonProcessor;
    private RestTemplate restTemplate;
    private ServiceProperties serviceProperties;
    private CorporateActionKindService corporateActionKindService;

    @BeforeEach
    void init() {
        restTemplate = Mockito.mock(RestTemplate.class);
        repositoryFacade = Mockito.mock(RepositoryFacadeImpl.class);
        jsonProcessor = Mockito.mock(JsonProcessor.class);
        serviceProperties = TestUtil.getDefaultProperties();
        corporateActionKindService = new CorporateActionKindService(repositoryFacade, jsonProcessor, restTemplate, serviceProperties);
    }

    @Test
    @DisplayName("Test CorporateActionKindService getLastUpdateTime")
    void test_getLastUpdateDate() {
        LocalDateTime updateDate = LocalDateTime.now();
        CorporateActionKind entity = new CorporateActionKind("1", CorporateActionKind.class.getAnnotation(Document.class).collection(), updateDate);
        entity.setImporttime(updateDate);
        super.test_getLastUpdateDate(repositoryFacade, corporateActionKindService, CorporateActionKind.class, updateDate, entity);
    }

    @Test
    @DisplayName("Test CorporateActionKindService getByIds")
    void test_getByIds() {
        List<CorporateActionKind> corporateActionKindList = Lists.newLinkedList();
        corporateActionKindList.add(new CorporateActionKind("1", CorporateActionKind.class.getAnnotation(Document.class).collection(), LocalDateTime.now()));
        List<Map<String, ?>> keys = Arrays.asList(ImmutableMap.of("id","1"));
        super.test_getByKeys(repositoryFacade, corporateActionKindService, CorporateActionKind.class, corporateActionKindList, keys);
    }

    @Test
    @DisplayName("Test CorporateActionKindService upload")
    void test_upload() {
        List<CorporateActionKind> corporateActionKindList = Lists.newLinkedList();
        corporateActionKindList.add(new CorporateActionKind("", CorporateActionKind.class.getAnnotation(Document.class).collection(), LocalDateTime.now()));
        ResponseEntity response = Mockito.mock(ResponseEntity.class);
        Map<String, Object> body = Maps.newHashMap();
        body.put("Columns", ImmutableList.of(ImmutableMap.of("column1", "type1"), ImmutableMap.of("column2", "type2")));
        body.put("Rows", ImmutableList.of("row1", "row2"));
        super.test_upload(repositoryFacade, corporateActionKindService, restTemplate, jsonProcessor, CorporateActionKind.class, corporateActionKindList, response, Collections.singletonList(body));
    }

    @Test
    @DisplayName("Test CorporateActionKindService getAll")
    void test_getAll() {
        super.test_getAll(repositoryFacade, corporateActionKindService, CorporateActionKind.class, Collections.emptyList());
    }

    @Test
    @DisplayName("Test CorporateActionKindService deleteAll")
    void test_deleteAll() {
        super.test_deleteAll(corporateActionKindService);
    }

    @Test
    @DisplayName("Test CorporateActionKindService getByIdsAndUpdateDate")
    void test_getByIdsAndUpdateDate() {
        List<Map<String, ?>> keys = Arrays.asList(ImmutableMap.of("id","1"), ImmutableMap.of("id","2"), ImmutableMap.of("id","3"));
        List<CorporateActionKind> corporateActionKindList = Arrays.asList(new CorporateActionKind("1", "", LocalDateTime.now()), new CorporateActionKind("2", "", LocalDateTime.now()), new CorporateActionKind("3", "", LocalDateTime.now()));
        super.test_getByKeysAndUpdateDate(repositoryFacade, corporateActionKindService, CorporateActionKind.class, corporateActionKindList, keys);
    }

    @Test
    @DisplayName("Test CorporateActionKindService count")
    void count() {
        final long oldCount = corporateActionKindService.count;
        final long newCount = new Random().nextLong();
        corporateActionKindService.count = newCount;
        super.test_count(corporateActionKindService, newCount);
        corporateActionKindService.count = oldCount;
    }
}
