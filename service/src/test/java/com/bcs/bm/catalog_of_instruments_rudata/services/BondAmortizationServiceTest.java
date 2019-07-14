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
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.BondAmortization;

@SuppressWarnings("unchecked")
class BondAmortizationServiceTest extends AbstractRuDataServiceTest<BondAmortization> {

    private RepositoryFacade repositoryFacade;
    private JsonProcessor jsonProcessor;
    private RestTemplate restTemplate;
    private ServiceProperties serviceProperties;
    private BondAmortizationService bondAmortizationService;

    @BeforeEach
    void init() {
        restTemplate = Mockito.mock(RestTemplate.class);
        repositoryFacade = Mockito.mock(RepositoryFacadeImpl.class);
        jsonProcessor = Mockito.mock(JsonProcessor.class);
        serviceProperties = TestUtil.getDefaultProperties();
        bondAmortizationService = new BondAmortizationService(repositoryFacade, jsonProcessor, restTemplate, serviceProperties);
    }

    @Test
    @DisplayName("Test BondAmortizationService getLastUpdateTime")
    void getLastUpdateDate() {
        LocalDateTime updateDate = LocalDateTime.now();
        BondAmortization entity = new BondAmortization("1", BondAmortization.class.getAnnotation(Document.class).collection(), updateDate);
        entity.setUpdatedate(updateDate);
        super.test_getLastUpdateDate(repositoryFacade, bondAmortizationService, BondAmortization.class, updateDate, entity);
    }

    @Test
    @DisplayName("Test BondAmortizationService getByIds")
    void getByIds() {
        List<BondAmortization> bondAmortizationList = Lists.newLinkedList();
        bondAmortizationList.add(new BondAmortization("1", BondAmortization.class.getAnnotation(Document.class).collection(), LocalDateTime.now()));
        List<Map<String, ?>> keys = Arrays.asList(ImmutableMap.of("id","1"));
        super.test_getByKeys(repositoryFacade, bondAmortizationService, BondAmortization.class, bondAmortizationList, keys);
    }

    @Test
    @DisplayName("Test BondAmortizationService upload")
    void upload() {
        List<BondAmortization> bondAmortizationList = Lists.newLinkedList();
        bondAmortizationList.add(new BondAmortization("", BondAmortization.class.getAnnotation(Document.class).collection(), LocalDateTime.now()));
        ResponseEntity response = Mockito.mock(ResponseEntity.class);
        Map<String, Object> body = Maps.newHashMap();
        body.put("Columns", ImmutableList.of(ImmutableMap.of("column1", "type1"), ImmutableMap.of("column2", "type2")));
        body.put("Rows", ImmutableList.of("row1", "row2"));
        super.test_upload(repositoryFacade, bondAmortizationService, restTemplate, jsonProcessor, BondAmortization.class,
                bondAmortizationList, response, Collections.singletonList(body));
    }

    @Test
    @DisplayName("Test BondAmortizationService getAll")
    void getAll() {
        super.test_getAll(repositoryFacade, bondAmortizationService, BondAmortization.class, Collections.emptyList());
    }

    @Test
    @DisplayName("Test BondAmortizationService deleteAll")
    void deleteAll() {
        super.test_deleteAll(bondAmortizationService);
    }

    @Test
    @DisplayName("Test BondAmortizationService getByIdsAndUpdateDate")
    void getByIdsAndUpdateDate() {
        List<Map<String, ?>> keys = Arrays.asList(ImmutableMap.of("id","1"), ImmutableMap.of("id","2"), ImmutableMap.of("id","3"));
        List<BondAmortization> fintoolReferenceDataList = Arrays.asList(new BondAmortization("1", "", LocalDateTime.now()),
                new BondAmortization("2", "", LocalDateTime.now()), new BondAmortization("3", "", LocalDateTime.now()));
        super.test_getByKeysAndUpdateDate(repositoryFacade, bondAmortizationService, BondAmortization.class, fintoolReferenceDataList, keys);
    }

    @Test
    @DisplayName("Test BondAmortizationService count")
    void count() {
        final long oldCount = bondAmortizationService.count;
        final long newCount = new Random().nextLong();
        bondAmortizationService.count = newCount;
        super.test_count(bondAmortizationService, newCount);
        bondAmortizationService.count = oldCount;
    }
}
