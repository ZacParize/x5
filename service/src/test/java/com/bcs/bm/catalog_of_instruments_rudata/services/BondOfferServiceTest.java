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
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.BondOffer;

@SuppressWarnings("unchecked")
class BondOfferServiceTest extends AbstractRuDataServiceTest<BondOffer> {
    private RepositoryFacade repositoryFacade;
    private JsonProcessor jsonProcessor;
    private RestTemplate restTemplate;
    private ServiceProperties serviceProperties;
    private BondOfferService bondOffersService;

    @BeforeEach
    void init() {
        restTemplate = Mockito.mock(RestTemplate.class);
        repositoryFacade = Mockito.mock(RepositoryFacadeImpl.class);
        jsonProcessor = Mockito.mock(JsonProcessor.class);
        serviceProperties = TestUtil.getDefaultProperties();
        bondOffersService = new BondOfferService(repositoryFacade, jsonProcessor, restTemplate, serviceProperties);
    }

    @Test
    @DisplayName("Test BondOffersService getLastUpdateTime")
    void test_getLastUpdateDate() {
        LocalDateTime updateDate = LocalDateTime.now();
        BondOffer entity = new BondOffer("1", BondOffer.class.getAnnotation(Document.class).collection(), updateDate);
        entity.setUpdatedate(updateDate);
        super.test_getLastUpdateDate(repositoryFacade, bondOffersService, BondOffer.class, updateDate, entity);
    }

    @Test
    @DisplayName("Test BondOffersService getByIds")
    void test_getByIds() {
        List<BondOffer> bondOffersList = Lists.newLinkedList();
        bondOffersList.add(new BondOffer("1", BondOffer.class.getAnnotation(Document.class).collection(), LocalDateTime.now()));
        List<Map<String, ?>> keys = Arrays.asList(ImmutableMap.of("id","1"));
        super.test_getByKeys(repositoryFacade, bondOffersService, BondOffer.class, bondOffersList, keys);
    }

    @Test
    @DisplayName("Test BondOffersService upload")
    void test_upload() {
        List<BondOffer> bondOffersList = Lists.newLinkedList();
        bondOffersList.add(new BondOffer("", BondOffer.class.getAnnotation(Document.class).collection(), LocalDateTime.now()));
        ResponseEntity response = Mockito.mock(ResponseEntity.class);
        Map<String, Object> body = Maps.newHashMap();
        body.put("Columns", ImmutableList.of(ImmutableMap.of("column1", "type1"), ImmutableMap.of("column2", "type2")));
        body.put("Rows", ImmutableList.of("row1", "row2"));
        super.test_upload(repositoryFacade, bondOffersService, restTemplate, jsonProcessor, BondOffer.class, bondOffersList, response, Collections.singletonList(body));
    }

    @Test
    @DisplayName("Test BondOffersService getAll")
    void test_getAll() {
        super.test_getAll(repositoryFacade, bondOffersService, BondOffer.class, Collections.emptyList());
    }

    @Test
    @DisplayName("Test BondOffersService deleteAll")
    void test_deleteAll() {
        super.test_deleteAll(bondOffersService);
    }

    @Test
    @DisplayName("Test BondOffersService getByIdsAndUpdateDate")
    void test_getByIdsAndUpdateDate() {
        List<Map<String, ?>> keys = Arrays.asList(ImmutableMap.of("id","1"), ImmutableMap.of("id","2"), ImmutableMap.of("id","3"));
        List<BondOffer> fintoolReferenceDataList = Arrays.asList(new BondOffer("1", "", LocalDateTime.now()), new BondOffer("2", "", LocalDateTime.now()), new BondOffer("3", "", LocalDateTime.now()));
        super.test_getByKeysAndUpdateDate(repositoryFacade, bondOffersService, BondOffer.class, fintoolReferenceDataList, keys);
    }

    @Test
    @DisplayName("Test BondOffersService count")
    void count() {
        final long oldCount = bondOffersService.count;
        final long newCount = new Random().nextLong();
        bondOffersService.count = newCount;
        super.test_count(bondOffersService, newCount);
        bondOffersService.count = oldCount;
    }
}
