package com.bcs.bm.catalog_of_instruments_rudata.services;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

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
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.InfoCurrencies;

@SuppressWarnings("unchecked")
public class InfoCurrenciesServiceTest extends AbstractRuDataServiceTest<InfoCurrencies> {

    private RepositoryFacade repositoryFacade;
    private JsonProcessor jsonProcessor;
    private RestTemplate restTemplate;
    private ServiceProperties serviceProperties;
    private InfoCurrenciesService infoCurrenciesService;

    @BeforeEach
    void init() {
        restTemplate = Mockito.mock(RestTemplate.class);
        repositoryFacade = Mockito.mock(RepositoryFacadeImpl.class);
        jsonProcessor = Mockito.mock(JsonProcessor.class);
        serviceProperties = TestUtil.getDefaultProperties();
        infoCurrenciesService = new InfoCurrenciesService(repositoryFacade, jsonProcessor, restTemplate, serviceProperties);
    }

    @Test
    @DisplayName("Test InfoCurrenciesService getLastUpdateTime")
    void getLastUpdateDate() {
        LocalDateTime updateDate = LocalDateTime.now();
        InfoCurrencies entity = new InfoCurrencies("1", InfoCurrencies.class.getAnnotation(Document.class).collection(), updateDate);
        entity.setUpdatedate(updateDate);
        super.test_getLastUpdateDate(repositoryFacade, infoCurrenciesService, InfoCurrencies.class, updateDate, entity);
    }

    @Test
    @DisplayName("Test InfoCurrenciesService getByKeys")
    void getByKeys() {
        List<InfoCurrencies> infoCurrenciesList = Lists.newLinkedList();
        infoCurrenciesList.add(new InfoCurrencies("1", InfoCurrencies.class.getAnnotation(Document.class).collection(), LocalDateTime.now()));
        List<Map<String, ?>> keys = Arrays.asList(ImmutableMap.of("id","1"));
        super.test_getByKeys(repositoryFacade, infoCurrenciesService, InfoCurrencies.class, infoCurrenciesList, keys);
    }

    @Test
    @DisplayName("Test InfoCurrenciesService upload")
    void upload() {
        List<InfoCurrencies> infoCurrenciesList = Lists.newLinkedList();
        infoCurrenciesList.add(new InfoCurrencies("1", InfoCurrencies.class.getAnnotation(Document.class).collection(), LocalDateTime.now()));
        ResponseEntity response = Mockito.mock(ResponseEntity.class);
        Map<String, Object> body = Maps.newHashMap();
        body.put("column11", ImmutableMap.of("key1","value1"));
        body.put("column12", ImmutableMap.of("key2","value2"));
        super.test_upload(repositoryFacade, infoCurrenciesService, restTemplate, jsonProcessor, InfoCurrencies.class, infoCurrenciesList, response, Collections.singletonList(body));
    }

    @Test
    @DisplayName("Test InfoCurrenciesService getAll")
    void getAll() {
        super.test_getAll(repositoryFacade, infoCurrenciesService, InfoCurrencies.class, Collections.emptyList());
    }

    @Test
    @DisplayName("Test InfoCurrenciesService deleteAll")
    void deleteAll() {
        super.test_deleteAll(infoCurrenciesService);
    }

    @Test
    @DisplayName("Test InfoCurrenciesService getByIdsAndUpdateDate")
    void getByKeysAndUpdateDate() {
        List<Map<String, ?>> keys = Arrays.asList(ImmutableMap.of("id","1"), ImmutableMap.of("id","2"), ImmutableMap.of("id","3"));
        List<InfoCurrencies> infoCurrenciesList = Arrays.asList(new InfoCurrencies("1", "", LocalDateTime.now()), new InfoCurrencies("2", "", LocalDateTime.now()), new InfoCurrencies("3", "", LocalDateTime.now()));
        super.test_getByKeysAndUpdateDate(repositoryFacade, infoCurrenciesService, InfoCurrencies.class, infoCurrenciesList, keys);
    }
}
