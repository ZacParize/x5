package com.bcs.bm.catalog_of_instruments_rudata.controllers;

import java.time.LocalDateTime;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.bcs.bm.catalog_of_instruments_rudata.services.AbstractRuDataService;
import com.bcs.bm.catalog_of_instruments_rudata.services.BondAmortizationService;
import com.bcs.bm.catalog_of_instruments_rudata.services.BondConvertationService;
import com.bcs.bm.catalog_of_instruments_rudata.services.BondCouponService;
import com.bcs.bm.catalog_of_instruments_rudata.services.BondMaturityService;
import com.bcs.bm.catalog_of_instruments_rudata.services.BondOfferService;
import com.bcs.bm.catalog_of_instruments_rudata.services.CorporateActionActionsService;
import com.bcs.bm.catalog_of_instruments_rudata.services.CorporateActionKindGroupsService;
import com.bcs.bm.catalog_of_instruments_rudata.services.CorporateActionKindService;
import com.bcs.bm.catalog_of_instruments_rudata.services.CorporateActionSourceService;
import com.bcs.bm.catalog_of_instruments_rudata.services.EmitentService;
import com.bcs.bm.catalog_of_instruments_rudata.services.FintoolReferenceDataService;
import com.bcs.bm.catalog_of_instruments_rudata.services.SecurityService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SuppressWarnings("unchecked")
class ApiControllerTest {

    private static final String defaultReqId = "reqId";
    private ApiController apiController;
    private Map<String, AbstractRuDataService> services;

    @BeforeEach
    void init() {
        services = new HashMap<>();
        services.put(EmitentService.NAME, Mockito.mock(EmitentService.class));
        services.put(SecurityService.NAME, Mockito.mock(SecurityService.class));
        services.put(FintoolReferenceDataService.NAME, Mockito.mock(FintoolReferenceDataService.class));
        services.put(BondOfferService.NAME, Mockito.mock(BondOfferService.class));
        services.put(BondMaturityService.NAME, Mockito.mock(BondMaturityService.class));
        services.put(BondAmortizationService.NAME, Mockito.mock(BondAmortizationService.class));
        services.put(BondConvertationService.NAME, Mockito.mock(BondConvertationService.class));
        services.put(BondCouponService.NAME, Mockito.mock(BondCouponService.class));
        services.put(CorporateActionKindService.NAME, Mockito.mock(CorporateActionKindService.class));
        services.put(CorporateActionKindGroupsService.NAME, Mockito.mock(CorporateActionKindGroupsService.class));
        services.put(CorporateActionActionsService.NAME, Mockito.mock(CorporateActionActionsService.class));
        services.put(CorporateActionSourceService.NAME, Mockito.mock(CorporateActionSourceService.class));
        apiController = new ApiController(services, null);
    }

    @Test
    @DisplayName("Test ApiController.getEntities when updateDate is empty")
    void getEntities_UpdateDateBlankIsEmpty() {
        services.keySet().forEach(service -> {
            apiController.getEntities(defaultReqId, service.replace(AbstractRuDataService.NAME, ""), Collections.emptyMap());
            Mockito.verify(services.get(service)).getByKeysAndUpdateDate(null, null, null, null);
        });
    }

    @Test
    @DisplayName("Test ApiController.getEntities when updateDate is correct")
    void getEntities_UpdateDateNotBlankIsCorrect() {
        services.keySet().forEach(service -> {
            apiController.getEntities(defaultReqId, service.replace(AbstractRuDataService.NAME, ""), Collections.singletonMap("updatedate", "2000-10-31T01:30:00.000"));
            Mockito.verify(services.get(service)).getByKeysAndUpdateDate(null, LocalDateTime.parse("2000-10-31T01:30:00.000"), null, null);
        });
    }

    @Test
    @DisplayName("Test ApiController.getEntities with incorrect params")
    void getEntities_IncorrectParams() {
        services.keySet().forEach(service -> assertThrows(IllegalArgumentException.class, () -> apiController.getEntities(defaultReqId, AbstractRuDataService.NAME, Collections.emptyMap())));
        assertThrows(IllegalArgumentException.class, () -> apiController.getEntities(defaultReqId, null, Collections.emptyMap()));
        assertThrows(IllegalArgumentException.class, () -> apiController.getEntities(defaultReqId, "nonexistent", Collections.emptyMap()));
        assertThrows(IllegalArgumentException.class, () -> apiController.getEntities(defaultReqId, "", Collections.emptyMap()));
        assertThrows(IllegalArgumentException.class, () -> apiController.getEntities(defaultReqId, null, null));
        assertThrows(IllegalArgumentException.class, () -> apiController.getEntities(null, null, null));
    }

    @Test
    @DisplayName("Test ApiController.deleteAll")
    void test_deleteAll() {
        apiController.deleteAll();
        services.keySet().forEach(service -> {
            Mockito.verify(services.get(service)).deleteAll();
        });
    }

    @Test
    @DisplayName("Test ApiController.getEntitiesCount")
    void getEntitiesCount() {
        final Map<String, Long> mapOfEntiitesCount = apiController.getEntitiesCount("1");
        final List<String> listOfServicesNames = services.keySet().stream().map(s -> s.replace(AbstractRuDataService.NAME, "")).collect(Collectors.toList());
        assertEquals(mapOfEntiitesCount.size(), listOfServicesNames.size());
        mapOfEntiitesCount.forEach((key, value) -> {
            assertTrue(listOfServicesNames.contains(key));
            assertEquals(value, (Long) 0L);
        });
    }

    @Test
    @DisplayName("Test ApiController.getEntityTypes")
    void test_getEntityTypes() {
        assertTrue(apiController.getEntityTypes("1").containsAll(services.keySet().stream().map(s -> s.replace(AbstractRuDataService.NAME, "")).collect(Collectors.toList())));
    }

    @Test
    @DisplayName("Test ApiController.getSubscriptionCount")
    void test_getSubscriptionCount() {
        assertTrue(apiController.getSubscriptionCount("1") == 0L);
    }
}