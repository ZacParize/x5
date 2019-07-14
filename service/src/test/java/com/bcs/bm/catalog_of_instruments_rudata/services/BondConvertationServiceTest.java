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
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.BondConvertation;

@SuppressWarnings("unchecked")
class BondConvertationServiceTest extends AbstractRuDataServiceTest<BondConvertation>  {

    private RepositoryFacade repositoryFacade;
    private JsonProcessor jsonProcessor;
    private RestTemplate restTemplate;
    private ServiceProperties serviceProperties;
    private BondConvertationService bondConvertationService;

    @BeforeEach
    void init() {
        restTemplate = Mockito.mock(RestTemplate.class);
        repositoryFacade = Mockito.mock(RepositoryFacadeImpl.class);
        jsonProcessor = Mockito.mock(JsonProcessor.class);
        serviceProperties = TestUtil.getDefaultProperties();
        bondConvertationService = new BondConvertationService(repositoryFacade, jsonProcessor, restTemplate, serviceProperties);
    }

    @Test
    @DisplayName("Test BondConvertationService getLastUpdateTime")
    void test_getLastUpdateDate() {
        LocalDateTime updateDate = LocalDateTime.now();
        BondConvertation entity = new BondConvertation("1", BondConvertation.class.getAnnotation(Document.class).collection(), updateDate);
        entity.setUpdatedate(updateDate);
        super.test_getLastUpdateDate(repositoryFacade, bondConvertationService, BondConvertation.class, updateDate, entity);
    }

    @Test
    @DisplayName("Test BondConvertationService getByIds")
    void test_getByIds() {
        List<BondConvertation> bondConvertationList = Lists.newLinkedList();
        bondConvertationList.add(new BondConvertation("1", BondConvertation.class.getAnnotation(Document.class).collection(), LocalDateTime.now()));
        List<Map<String, ?>> keys = Arrays.asList(ImmutableMap.of("id","1"));
        super.test_getByKeys(repositoryFacade, bondConvertationService, BondConvertation.class, bondConvertationList, keys);
    }

    @Test
    @DisplayName("Test BondConvertationService upload")
    void test_upload() {
        List<BondConvertation> bondConvertationList = Lists.newLinkedList();
        bondConvertationList.add(new BondConvertation("", BondConvertation.class.getAnnotation(Document.class).collection(), LocalDateTime.now()));
        ResponseEntity response = Mockito.mock(ResponseEntity.class);
        Map<String, Object> body = Maps.newHashMap();
        body.put("Columns", ImmutableList.of(ImmutableMap.of("column1", "type1"), ImmutableMap.of("column2", "type2")));
        body.put("Rows", ImmutableList.of("row1", "row2"));
        super.test_upload(repositoryFacade, bondConvertationService, restTemplate, jsonProcessor, BondConvertation.class,
                bondConvertationList, response, Collections.singletonList(body));
    }

    @Test
    @DisplayName("Test BondConvertationService getAll")
    void test_getAll() {
        super.test_getAll(repositoryFacade, bondConvertationService, BondConvertation.class, Collections.emptyList());
    }

    @Test
    @DisplayName("Test BondConvertationService deleteAll")
    void test_deleteAll() {
        super.test_deleteAll(bondConvertationService);
    }

    @Test
    @DisplayName("Test BondConvertationService getByIdsAndUpdateDate")
    void test_getByIdsAndUpdateDate() {
        List<Map<String, ?>> keys = Arrays.asList(ImmutableMap.of("id","1"), ImmutableMap.of("id","2"), ImmutableMap.of("id","3"));
        List<BondConvertation> bondConvertationList = Arrays.asList(new BondConvertation("1", "", LocalDateTime.now()),
                new BondConvertation("2", "", LocalDateTime.now()), new BondConvertation("3", "", LocalDateTime.now()));
        super.test_getByKeysAndUpdateDate(repositoryFacade, bondConvertationService, BondConvertation.class, bondConvertationList, keys);
    }

    @Test
    @DisplayName("Test BondConvertationService count")
    void count() {
        final long oldCount = bondConvertationService.count;
        final long newCount = new Random().nextLong();
        bondConvertationService.count = newCount;
        super.test_count(bondConvertationService, newCount);
        bondConvertationService.count = oldCount;
    }
}
