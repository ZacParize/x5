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
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.ShareDividend;

@SuppressWarnings("unchecked")
public class ShareDividendServiceTest extends AbstractRuDataServiceTest<ShareDividend> {

    private RepositoryFacade repositoryFacade;
    private JsonProcessor jsonProcessor;
    private RestTemplate restTemplate;
    private ServiceProperties serviceProperties;
    private ShareDividendService shareDividendService;

    @BeforeEach
    void init() {
        restTemplate = Mockito.mock(RestTemplate.class);
        repositoryFacade = Mockito.mock(RepositoryFacadeImpl.class);
        jsonProcessor = Mockito.mock(JsonProcessor.class);
        serviceProperties = TestUtil.getDefaultProperties();
        shareDividendService = new ShareDividendService(repositoryFacade, jsonProcessor, restTemplate, serviceProperties);
    }

    @Test
    @DisplayName("Test ShareDividendService getLastUpdateTime")
    void getLastUpdateDate() {
        LocalDateTime updateDate = LocalDateTime.now();
        ShareDividend entity = new ShareDividend("1", ShareDividend.class.getAnnotation(Document.class).collection(), updateDate);
        entity.setUpdatedate(updateDate);
        super.test_getLastUpdateDate(repositoryFacade, shareDividendService, ShareDividend.class, updateDate, entity);
    }

    @Test
    @DisplayName("Test ShareDividendService getByKeys")
    void getByKeys() {
        List<ShareDividend> shareDividendList = Lists.newLinkedList();
        shareDividendList.add(new ShareDividend("1", ShareDividend.class.getAnnotation(Document.class).collection(), LocalDateTime.now()));
        List<Map<String, ?>> keys = Arrays.asList(ImmutableMap.of("id","1"));
        super.test_getByKeys(repositoryFacade, shareDividendService, ShareDividend.class, shareDividendList, keys);
    }

    @Test
    @DisplayName("Test ShareDividendService upload")
    void upload() {
        List<ShareDividend> shareDividendList = Lists.newLinkedList();
        shareDividendList.add(new ShareDividend("1", ShareDividend.class.getAnnotation(Document.class).collection(), LocalDateTime.now()));
        ResponseEntity response = Mockito.mock(ResponseEntity.class);
        Map<String, Object> body = Maps.newHashMap();
        body.put("column11", ImmutableMap.of("key1","value1"));
        body.put("column12", ImmutableMap.of("key2","value2"));
        super.test_upload(repositoryFacade, shareDividendService, restTemplate, jsonProcessor, ShareDividend.class, shareDividendList, response, Collections.singletonList(body));
    }

    @Test
    @DisplayName("Test ShareDividendService getAll")
    void getAll() {
        super.test_getAll(repositoryFacade, shareDividendService, ShareDividend.class, Collections.emptyList());
    }

    @Test
    @DisplayName("Test ShareDividendService deleteAll")
    void deleteAll() {
        super.test_deleteAll(shareDividendService);
    }

    @Test
    @DisplayName("Test ShareDividendService getByIdsAndUpdateDate")
    void getByKeysAndUpdateDate() {
        List<Map<String, ?>> keys = Arrays.asList(ImmutableMap.of("id","1"), ImmutableMap.of("id","2"), ImmutableMap.of("id","3"));
        List<ShareDividend> shareDividendList = Arrays.asList(new ShareDividend("1", "", LocalDateTime.now()), new ShareDividend("2", "", LocalDateTime.now()), new ShareDividend("3", "", LocalDateTime.now()));
        super.test_getByKeysAndUpdateDate(repositoryFacade, shareDividendService, ShareDividend.class, shareDividendList, keys);
    }
}
