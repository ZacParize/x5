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
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.CorporateActionKindGroups;

@SuppressWarnings("unchecked")
public class CorporateActionKindGroupsServiceTest extends AbstractRuDataServiceTest<CorporateActionKindGroups> {

    private RepositoryFacade repositoryFacade;
    private JsonProcessor jsonProcessor;
    private RestTemplate restTemplate;
    private ServiceProperties serviceProperties;
    private CorporateActionKindGroupsService corporateActionKindGroupsService;

    @BeforeEach
    void init() {
        restTemplate = Mockito.mock(RestTemplate.class);
        repositoryFacade = Mockito.mock(RepositoryFacadeImpl.class);
        jsonProcessor = Mockito.mock(JsonProcessor.class);
        serviceProperties = TestUtil.getDefaultProperties();
        corporateActionKindGroupsService = new CorporateActionKindGroupsService(repositoryFacade, jsonProcessor, restTemplate, serviceProperties);
    }

    @Test
    @DisplayName("Test CorporateActionKindGroupsService getLastUpdateTime")
    void test_getLastUpdateDate() {
        LocalDateTime updateDate = LocalDateTime.now();
        CorporateActionKindGroups entity = new CorporateActionKindGroups("1", CorporateActionKindGroups.class.getAnnotation(Document.class).collection(), updateDate);
        entity.setUpdatedate(updateDate);
        super.test_getLastUpdateDate(repositoryFacade, corporateActionKindGroupsService, CorporateActionKindGroups.class, updateDate, entity);
    }

    @Test
    @DisplayName("Test CorporateActionKindGroupsService getByIds")
    void test_getByIds() {
        List<CorporateActionKindGroups> corporateActionKindGroupsList = Lists.newLinkedList();
        corporateActionKindGroupsList.add(new CorporateActionKindGroups("1", CorporateActionKindGroups.class.getAnnotation(Document.class).collection(), LocalDateTime.now()));
        List<Map<String, ?>> keys = Arrays.asList(ImmutableMap.of("id","1"));
        super.test_getByKeys(repositoryFacade, corporateActionKindGroupsService, CorporateActionKindGroups.class, corporateActionKindGroupsList, keys);
    }

    @Test
    @DisplayName("Test CorporateActionKindGroupsService upload")
    void test_upload() {
        List<CorporateActionKindGroups> corporateActionKindGroupsList = Lists.newLinkedList();
        corporateActionKindGroupsList.add(new CorporateActionKindGroups("", CorporateActionKindGroups.class.getAnnotation(Document.class).collection(), LocalDateTime.now()));
        ResponseEntity response = Mockito.mock(ResponseEntity.class);
        Map<String, Object> body = Maps.newHashMap();
        body.put("Columns", ImmutableList.of(ImmutableMap.of("column1", "type1"), ImmutableMap.of("column2", "type2")));
        body.put("Rows", ImmutableList.of("row1", "row2"));
        super.test_upload(repositoryFacade, corporateActionKindGroupsService, restTemplate, jsonProcessor, CorporateActionKindGroups.class,
                corporateActionKindGroupsList, response, Collections.singletonList(body));
    }

    @Test
    @DisplayName("Test CorporateActionKindGroupsService getAll")
    void test_getAll() {
        super.test_getAll(repositoryFacade, corporateActionKindGroupsService, CorporateActionKindGroups.class, Collections.emptyList());
    }

    @Test
    @DisplayName("Test CorporateActionKindGroupsService deleteAll")
    void test_deleteAll() {
        super.test_deleteAll(corporateActionKindGroupsService);
    }

    @Test
    @DisplayName("Test CorporateActionKindGroupsService getByIdsAndUpdateDate")
    void test_getByIdsAndUpdateDate() {
        List<Map<String, ?>> keys = Arrays.asList(ImmutableMap.of("id","1"), ImmutableMap.of("id","2"), ImmutableMap.of("id","3"));
        List<CorporateActionKindGroups> corporateActionKindGroupsList = Arrays.asList(new CorporateActionKindGroups("1", "", LocalDateTime.now()),
                new CorporateActionKindGroups("2", "", LocalDateTime.now()), new CorporateActionKindGroups("3", "", LocalDateTime.now()));
        super.test_getByKeysAndUpdateDate(repositoryFacade, corporateActionKindGroupsService, CorporateActionKindGroups.class, corporateActionKindGroupsList, keys);
    }

    @Test
    @DisplayName("Test CorporateActionKindGroupsService count")
    void count() {
        final long oldCount = corporateActionKindGroupsService.count;
        final long newCount = new Random().nextLong();
        corporateActionKindGroupsService.count = newCount;
        super.test_count(corporateActionKindGroupsService, newCount);
        corporateActionKindGroupsService.count = oldCount;
    }
}
