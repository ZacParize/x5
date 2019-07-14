package com.bcs.bm.catalog_of_instruments_rudata.services;

import java.time.LocalDateTime;

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
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.FintoolReferenceData;

@SuppressWarnings("unchecked")
class FintoolReferenceDataServiceTest extends AbstractRuDataServiceTest<FintoolReferenceData>{

    private RepositoryFacade repositoryFacade;
    private JsonProcessor jsonProcessor;
    private RestTemplate restTemplate;
    private ServiceProperties serviceProperties;
    private FintoolReferenceDataService fintoolReferenceDataService;

    @BeforeEach
    void init() {
        restTemplate = Mockito.mock(RestTemplate.class);
        repositoryFacade = Mockito.mock(RepositoryFacadeImpl.class);
        jsonProcessor = Mockito.mock(JsonProcessor.class);
        serviceProperties = TestUtil.getDefaultProperties();
        fintoolReferenceDataService = new FintoolReferenceDataService(repositoryFacade, jsonProcessor, restTemplate, serviceProperties);
    }

    @Test
    @DisplayName("Test FintoolReferenceDataService getLastUpdateTime")
    void test_getLastUpdateDate() {
        LocalDateTime updateDate = LocalDateTime.now();
        FintoolReferenceData entity = new FintoolReferenceData("1", FintoolReferenceData.class.getAnnotation(Document.class).collection(), updateDate);
        entity.setUpdatedate(updateDate);
        super.test_getLastUpdateDate(repositoryFacade, fintoolReferenceDataService, FintoolReferenceData.class, updateDate, entity);
    }

    @Test
    @DisplayName("Test FintoolReferenceDataService getByKeys")
    void test_getByKeys() {
        List<FintoolReferenceData> fintoolReferenceDataList = Lists.newLinkedList();
        fintoolReferenceDataList.add(new FintoolReferenceData("1", FintoolReferenceData.class.getAnnotation(Document.class).collection(), LocalDateTime.now()));
        List<Map<String, ?>> keys = Arrays.asList(ImmutableMap.of("id","1"));
        super.test_getByKeys(repositoryFacade, fintoolReferenceDataService, FintoolReferenceData.class, fintoolReferenceDataList, keys);
    }

    @Test
    @DisplayName("Test FintoolReferenceDataService upload")
    void test_upload() {
        List<FintoolReferenceData> fintoolReferenceDataList = Lists.newLinkedList();
        fintoolReferenceDataList.add(new FintoolReferenceData("1", FintoolReferenceData.class.getAnnotation(Document.class).collection(), LocalDateTime.now()));
        ResponseEntity response = Mockito.mock(ResponseEntity.class);
        Map<String, Object> body = Maps.newHashMap();
        body.put("column11", ImmutableMap.of("key1","value1"));
        body.put("column12", ImmutableMap.of("key2","value2"));
        super.test_upload(repositoryFacade, fintoolReferenceDataService, restTemplate, jsonProcessor, FintoolReferenceData.class, fintoolReferenceDataList, response, Collections.singletonList(body));
    }

    @Test
    @DisplayName("Test FintoolReferenceDataService getAll")
    void test_getAll() {
        super.test_getAll(repositoryFacade, fintoolReferenceDataService, FintoolReferenceData.class, Collections.emptyList());
    }

    @Test
    @DisplayName("Test FintoolReferenceDataService deleteAll")
    void test_deleteAll() {
        super.test_deleteAll(fintoolReferenceDataService);
    }

    @Test
    @DisplayName("Test FintoolReferenceDataService getByKeysAndUpdateDate")
    void test_getByKeysAndUpdateDate() {
        List<Map<String, ?>> keys = Arrays.asList(ImmutableMap.of("id","1"), ImmutableMap.of("id","2"), ImmutableMap.of("id","3"));
        List<FintoolReferenceData> fintoolReferenceDataList = Arrays.asList(new FintoolReferenceData("1", "", LocalDateTime.now()), new FintoolReferenceData("2", "", LocalDateTime.now()), new FintoolReferenceData("3", "", LocalDateTime.now()));
        super.test_getByKeysAndUpdateDate(repositoryFacade, fintoolReferenceDataService, FintoolReferenceData.class, fintoolReferenceDataList, keys);
    }

    @Test
    @DisplayName("Test FintoolReferenceDataService count")
    void count() {
        final long oldCount = fintoolReferenceDataService.count;
        final long newCount = new Random().nextLong();
        fintoolReferenceDataService.count = newCount;
        super.test_count(fintoolReferenceDataService, newCount);
        fintoolReferenceDataService.count = oldCount;
    }
}
