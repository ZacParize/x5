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
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.BondMaturity;

@SuppressWarnings("unchecked")
public class BondMaturityServiceTest extends AbstractRuDataServiceTest<BondMaturity> {

    private RepositoryFacade repositoryFacade;
    private JsonProcessor jsonProcessor;
    private RestTemplate restTemplate;
    private ServiceProperties serviceProperties;
    private BondMaturityService bondMaturityService;

    @BeforeEach
    void init() {
        restTemplate = Mockito.mock(RestTemplate.class);
        repositoryFacade = Mockito.mock(RepositoryFacadeImpl.class);
        jsonProcessor = Mockito.mock(JsonProcessor.class);
        serviceProperties = TestUtil.getDefaultProperties();
        bondMaturityService = new BondMaturityService(repositoryFacade, repositoryFacade, jsonProcessor, restTemplate, serviceProperties);
    }

    @Test
    @DisplayName("Test BondMaturityService getLastUpdateTime")
    void getLastUpdateDate() {
        LocalDateTime updateDate = LocalDateTime.now();
        BondMaturity entity = new BondMaturity("1", BondMaturity.class.getAnnotation(Document.class).collection(), updateDate);
        entity.setUpdatedate(updateDate);
        super.test_getLastUpdateDate(repositoryFacade, bondMaturityService, BondMaturity.class, updateDate, entity);
    }

    @Test
    @DisplayName("Test BondMaturityService getByIds")
    void getByIds() {
        List<BondMaturity> bondMaturityList = Lists.newLinkedList();
        bondMaturityList.add(new BondMaturity("1", BondMaturity.class.getAnnotation(Document.class).collection(), LocalDateTime.now()));
        List<Map<String, ?>> keys = Arrays.asList(ImmutableMap.of("id","1"));
        super.test_getByKeys(repositoryFacade, bondMaturityService, BondMaturity.class, bondMaturityList, keys);
    }

    @Test
    @DisplayName("Test BondMaturityService upload")
    void upload() {
        List<BondMaturity> bondMaturityList = Lists.newLinkedList();
        bondMaturityList.add(new BondMaturity("", BondMaturity.class.getAnnotation(Document.class).collection(), LocalDateTime.now()));
        ResponseEntity response = Mockito.mock(ResponseEntity.class);
        Map<String, Object> body = Maps.newHashMap();
        body.put("Columns", ImmutableList.of(ImmutableMap.of("column1", "type1"), ImmutableMap.of("column2", "type2")));
        body.put("Rows", ImmutableList.of("row1", "row2"));
        super.test_upload(repositoryFacade, bondMaturityService, restTemplate, jsonProcessor, BondMaturity.class, bondMaturityList, response, Collections.singletonList(body));
    }

    @Test
    @DisplayName("Test BondMaturityService getAll")
    void getAll() {
        super.test_getAll(repositoryFacade, bondMaturityService, BondMaturity.class, Collections.emptyList());
    }

    @Test
    @DisplayName("Test BondMaturityService deleteAll")
    void deleteAll() {
        super.test_deleteAll(bondMaturityService);
    }

    @Test
    @DisplayName("Test BondMaturityService getByIdsAndUpdateDate")
    void getByIdsAndUpdateDate() {
        List<Map<String, ?>> keys = Arrays.asList(ImmutableMap.of("id","1"), ImmutableMap.of("id","2"), ImmutableMap.of("id","3"));
        List<BondMaturity> fintoolReferenceDataList = Arrays.asList(new BondMaturity("1", "", LocalDateTime.now()), new BondMaturity("2", "", LocalDateTime.now()), new BondMaturity("3", "", LocalDateTime.now()));
        super.test_getByKeysAndUpdateDate(repositoryFacade, bondMaturityService, BondMaturity.class, fintoolReferenceDataList, keys);
    }

    @Test
    @DisplayName("Test BondMaturityService count")
    void count() {
        final long oldCount = bondMaturityService.count;
        final long newCount = new Random().nextLong();
        bondMaturityService.count = newCount;
        super.test_count(bondMaturityService, newCount);
        bondMaturityService.count = oldCount;
    }
}
