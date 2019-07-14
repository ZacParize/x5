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
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.BondCoupon;

@SuppressWarnings("unchecked")
class BondCouponServiceTest extends AbstractRuDataServiceTest<BondCoupon> {

    private RepositoryFacade repositoryFacade;
    private JsonProcessor jsonProcessor;
    private RestTemplate restTemplate;
    private ServiceProperties serviceProperties;
    private BondCouponService bondCouponService;

    @BeforeEach
    void init() {
        restTemplate = Mockito.mock(RestTemplate.class);
        repositoryFacade = Mockito.mock(RepositoryFacadeImpl.class);
        jsonProcessor = Mockito.mock(JsonProcessor.class);
        serviceProperties = TestUtil.getDefaultProperties();
        bondCouponService = new BondCouponService(repositoryFacade, jsonProcessor, restTemplate, serviceProperties);
    }

    @Test
    @DisplayName("Test BondCouponService getLastUpdateTime")
    void test_getLastUpdateDate() {
        LocalDateTime updateDate = LocalDateTime.now();
        BondCoupon entity = new BondCoupon("1", BondCoupon.class.getAnnotation(Document.class).collection(), updateDate);
        entity.setUpdatedate(updateDate);
        super.test_getLastUpdateDate(repositoryFacade, bondCouponService, BondCoupon.class, updateDate, entity);
    }

    @Test
    @DisplayName("Test BondCouponService getByIds")
    void test_getByIds() {
        List<BondCoupon> bondCouponList = Lists.newLinkedList();
        bondCouponList.add(new BondCoupon("1", BondCoupon.class.getAnnotation(Document.class).collection(), LocalDateTime.now()));
        List<Map<String, ?>> keys = Arrays.asList(ImmutableMap.of("id","1"));
        super.test_getByKeys(repositoryFacade, bondCouponService, BondCoupon.class, bondCouponList, keys);
    }

    @Test
    @DisplayName("Test BondCouponService upload")
    void test_upload() {
        List<BondCoupon> bondCouponList = Lists.newLinkedList();
        bondCouponList.add(new BondCoupon("", BondCoupon.class.getAnnotation(Document.class).collection(), LocalDateTime.now()));
        ResponseEntity response = Mockito.mock(ResponseEntity.class);
        Map<String, Object> body = Maps.newHashMap();
        body.put("Columns", ImmutableList.of(ImmutableMap.of("column1", "type1"), ImmutableMap.of("column2", "type2")));
        body.put("Rows", ImmutableList.of("row1", "row2"));
        super.test_upload(repositoryFacade, bondCouponService, restTemplate, jsonProcessor, BondCoupon.class,
                bondCouponList, response, Collections.singletonList(body));
    }

    @Test
    @DisplayName("Test BondCouponService getAll")
    void test_getAll() {
        super.test_getAll(repositoryFacade, bondCouponService, BondCoupon.class, Collections.emptyList());
    }

    @Test
    @DisplayName("Test BondCouponService deleteAll")
    void test_deleteAll() {
        super.test_deleteAll(bondCouponService);
    }

    @Test
    @DisplayName("Test BondCouponService getByIdsAndUpdateDate")
    void test_getByIdsAndUpdateDate() {
        List<Map<String, ?>> keys = Arrays.asList(ImmutableMap.of("id","1"), ImmutableMap.of("id","2"), ImmutableMap.of("id","3"));
        List<BondCoupon> fintoolReferenceDataList = Arrays.asList(new BondCoupon("1", "", LocalDateTime.now()),
                new BondCoupon("2", "", LocalDateTime.now()), new BondCoupon("3", "", LocalDateTime.now()));
        super.test_getByKeysAndUpdateDate(repositoryFacade, bondCouponService, BondCoupon.class, fintoolReferenceDataList, keys);
    }

    @Test
    @DisplayName("Test BondCouponService count")
    void count() {
        final long oldCount = bondCouponService.count;
        final long newCount = new Random().nextLong();
        bondCouponService.count = newCount;
        super.test_count(bondCouponService, newCount);
        bondCouponService.count = oldCount;
    }
}
