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
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.CorporateActionActions;

@SuppressWarnings("unchecked")
public class CorporateActionActionsServiceTest extends AbstractRuDataServiceTest<CorporateActionActions> {

    private RepositoryFacade repositoryFacade;
    private JsonProcessor jsonProcessor;
    private RestTemplate restTemplate;
    private ServiceProperties serviceProperties;
    private CorporateActionActionsService corporateActionActionsService;

    @BeforeEach
    void init() {
        restTemplate = Mockito.mock(RestTemplate.class);
        repositoryFacade = Mockito.mock(RepositoryFacadeImpl.class);
        jsonProcessor = Mockito.mock(JsonProcessor.class);
        serviceProperties = TestUtil.getDefaultProperties();
        corporateActionActionsService = new CorporateActionActionsService(repositoryFacade, jsonProcessor, restTemplate, serviceProperties);
    }

    @Test
    @DisplayName("Test CorporateActionActionsService getLastUpdateTime")
    void test_getLastUpdateDate() {
        LocalDateTime updateDate = LocalDateTime.now();
        CorporateActionActions entity = new CorporateActionActions("1", CorporateActionActions.class.getAnnotation(Document.class).collection(), updateDate);
        entity.setUpdatedate(updateDate);
        super.test_getLastUpdateDate(repositoryFacade, corporateActionActionsService, CorporateActionActions.class, updateDate, entity);
    }

    @Test
    @DisplayName("Test CorporateActionActionsService getByIds")
    void test_getByIds() {
        List<CorporateActionActions> corporateActionActionsList = Lists.newLinkedList();
        corporateActionActionsList.add(new CorporateActionActions("1", CorporateActionActions.class.getAnnotation(Document.class).collection(), LocalDateTime.now()));
        List<Map<String, ?>> keys = Arrays.asList(ImmutableMap.of("id","1"));
        super.test_getByKeys(repositoryFacade, corporateActionActionsService, CorporateActionActions.class, corporateActionActionsList, keys);
    }

    @Test
    @DisplayName("Test CorporateActionActionsService upload")
    void test_upload() {
        List<CorporateActionActions> corporateActionActionsList = Lists.newLinkedList();
        corporateActionActionsList.add(new CorporateActionActions("", CorporateActionActions.class.getAnnotation(Document.class).collection(), LocalDateTime.now()));
        ResponseEntity response = Mockito.mock(ResponseEntity.class);
        Map<String, Object> body = Maps.newHashMap();
        body.put("Columns", ImmutableList.of(ImmutableMap.of("column1", "type1"), ImmutableMap.of("column2", "type2")));
        body.put("Rows", ImmutableList.of("row1", "row2"));
        super.test_upload(repositoryFacade, corporateActionActionsService, restTemplate, jsonProcessor, CorporateActionActions.class,
                corporateActionActionsList, response, Collections.singletonList(body));
    }

    @Test
    @DisplayName("Test CorporateActionActionsService getAll")
    void test_getAll() {
        super.test_getAll(repositoryFacade, corporateActionActionsService, CorporateActionActions.class, Collections.emptyList());
    }

    @Test
    @DisplayName("Test CorporateActionActionsService deleteAll")
    void test_deleteAll() {
        super.test_deleteAll(corporateActionActionsService);
    }

    @Test
    @DisplayName("Test CorporateActionActionsService getByIdsAndUpdateDate")
    void test_getByIdsAndUpdateDate() {
        List<Map<String, ?>> keys = Arrays.asList(ImmutableMap.of("id","1"), ImmutableMap.of("id","2"), ImmutableMap.of("id","3"));
        List<CorporateActionActions> corporateActionActionsList = Arrays.asList(new CorporateActionActions("1", "", LocalDateTime.now()),
                new CorporateActionActions("2", "", LocalDateTime.now()), new CorporateActionActions("3", "", LocalDateTime.now()));
        super.test_getByKeysAndUpdateDate(repositoryFacade, corporateActionActionsService, CorporateActionActions.class, corporateActionActionsList, keys);
    }

    @Test
    @DisplayName("Test CorporateActionActionsService count")
    void count() {
        final long oldCount = corporateActionActionsService.count;
        final long newCount = new Random().nextLong();
        corporateActionActionsService.count = newCount;
        super.test_count(corporateActionActionsService, newCount);
        corporateActionActionsService.count = oldCount;
    }
}
