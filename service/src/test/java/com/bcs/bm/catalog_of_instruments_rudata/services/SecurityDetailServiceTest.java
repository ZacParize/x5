package com.bcs.bm.catalog_of_instruments_rudata.services;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.web.client.RestTemplate;
import org.testcontainers.shaded.com.google.common.collect.ImmutableMap;

import com.bcs.bm.catalog_of_instruments_rudata.TestUtil;
import com.bcs.bm.catalog_of_instruments_rudata.components.processors.JsonProcessor;
import com.bcs.bm.catalog_of_instruments_rudata.configurations.ServiceProperties;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.RepositoryFacade;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.RepositoryFacadeImpl;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.*;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.when;

@SuppressWarnings("unchecked")
public class SecurityDetailServiceTest extends AbstractRuDataServiceTest<SecurityDetail> {

    private static final String TEST_ISIN = "TESTISIN0000";
    private static SecurityDetailService securityDetailService;

    @BeforeAll
    static void init() {
        RestTemplate restTemplate = Mockito.mock(RestTemplate.class);
        RepositoryFacade repositoryFacade = Mockito.mock(RepositoryFacadeImpl.class);
        JsonProcessor jsonProcessor = Mockito.mock(JsonProcessor.class);
        ServiceProperties serviceProperties = TestUtil.getDefaultProperties();
        Map<String, AbstractRuDataService> services = Mockito.mock(Map.class);
        securityDetailService = new SecurityDetailService(repositoryFacade, jsonProcessor, restTemplate, serviceProperties, services);

        SecurityService securityService = Mockito.mock(SecurityService.class);
        FintoolReferenceDataService fintoolReferenceDataService = Mockito.mock(FintoolReferenceDataService.class);
        EmitentService emitentService = Mockito.mock(EmitentService.class);
        ShareDividendService shareDividendService = Mockito.mock(ShareDividendService.class);
        BondAmortizationService bondAmortizationService = Mockito.mock(BondAmortizationService.class);
        BondConvertationService bondConvertationService = Mockito.mock(BondConvertationService.class);
        BondCouponService bondCouponService = Mockito.mock(BondCouponService.class);
        BondMaturityService bondMaturityService = Mockito.mock(BondMaturityService.class);
        BondOfferService bondOfferService = Mockito.mock(BondOfferService.class);
        CorporateActionActionsService corporateActionActionsService = Mockito.mock(CorporateActionActionsService.class);

        when(services.get(SecurityService.NAME)).thenReturn(securityService);
        when(services.get(FintoolReferenceDataService.NAME)).thenReturn(fintoolReferenceDataService);
        when(services.get(EmitentService.NAME)).thenReturn(emitentService);
        when(services.get(ShareDividendService.NAME)).thenReturn(shareDividendService);
        when(services.get(BondAmortizationService.NAME)).thenReturn(bondAmortizationService);
        when(services.get(BondConvertationService.NAME)).thenReturn(bondConvertationService);
        when(services.get(BondCouponService.NAME)).thenReturn(bondCouponService);
        when(services.get(BondMaturityService.NAME)).thenReturn(bondMaturityService);
        when(services.get(BondOfferService.NAME)).thenReturn(bondOfferService);
        when(services.get(CorporateActionActionsService.NAME)).thenReturn(corporateActionActionsService);

        Security security = Mockito.mock(Security.class);
        FintoolReferenceData fintoolReferenceData = Mockito.mock(FintoolReferenceData.class);
        Emitent emitent = Mockito.mock(Emitent.class);
        ShareDividend shareDividend = Mockito.mock(ShareDividend.class);
        BondAmortization bondAmortization = Mockito.mock(BondAmortization.class);
        BondConvertation bondConvertation = Mockito.mock(BondConvertation.class);
        BondCoupon bondCoupon = Mockito.mock(BondCoupon.class);
        BondMaturity bondMaturity = Mockito.mock(BondMaturity.class);
        BondOffer bondOffer = Mockito.mock(BondOffer.class);
        CorporateActionActions corporateActionActions = Mockito.mock(CorporateActionActions.class);

        when(security.getIsin()).thenReturn(TEST_ISIN);
        when(securityService.getByKeys(anyList(), any(), any())).thenReturn(Collections.singletonList(security));
        when(fintoolReferenceDataService.getByKeys(anyList(), any(), any())).thenReturn(Collections.singletonList(fintoolReferenceData));
        when(emitentService.getByKeys(anyList(), any(), any())).thenReturn(Collections.singletonList(emitent));
        when(shareDividendService.getByKeys(anyList(), any(), any())).thenReturn(Collections.singletonList(shareDividend));
        when(bondAmortizationService.getByKeys(anyList(), any(), any())).thenReturn(Collections.singletonList(bondAmortization));
        when(bondConvertationService.getByKeys(anyList(), any(), any())).thenReturn(Collections.singletonList(bondConvertation));
        when(bondCouponService.getByKeys(anyList(), any(), any())).thenReturn(Collections.singletonList(bondCoupon));
        when(bondMaturityService.getByKeys(anyList(), any(), any())).thenReturn(Collections.singletonList(bondMaturity));
        when(bondOfferService.getByKeys(anyList(), any(), any())).thenReturn(Collections.singletonList(bondOffer));
        when(corporateActionActionsService.getByKeys(anyList(), any(), any())).thenReturn(Collections.singletonList(corporateActionActions));
    }

    @Test
    @DisplayName("Test SecurityDetailService getLastUpdateTime")
    void test_getLastUpdateTime() {
        assertTrue(securityDetailService.getLastUpdateTime().plus(1, ChronoUnit.MINUTES).isAfter(LocalDateTime.now()));
        assertTrue(securityDetailService.getLastUpdateTime().minus(1, ChronoUnit.MINUTES).isBefore(LocalDateTime.now()));
    }

    @Test
    @DisplayName("Test SecurityDetailService getAll")
    void test_getAll() {
        assertEquals(0, securityDetailService.getAll(null, null).size());
    }

    private void getBy(LocalDateTime updateDate) {
        List<Map<String, ?>> keys = Collections.singletonList(ImmutableMap.of("isin", TEST_ISIN));

        List<SecurityDetail> securityDetails = securityDetailService.getByKeysAndUpdateDate(keys, updateDate, null, null);

        assertEquals(1, securityDetails.size());
        assertNotNull(securityDetails.get(0).getSecurity());
        assertNotNull(securityDetails.get(0).getFintoolReferenceData());
        assertNotNull(securityDetails.get(0).getEmitent());
        assertNotNull(securityDetails.get(0).getBondMaturity());
        assertEquals(1, securityDetails.get(0).getShareDividends().size());
        assertEquals(1, securityDetails.get(0).getBondAmortizations().size());
        assertEquals(1, securityDetails.get(0).getBondConvertations().size());
        assertEquals(1, securityDetails.get(0).getBondCoupons().size());
        assertEquals(1, securityDetails.get(0).getBondOffers().size());
        assertEquals(1, securityDetails.get(0).getCorporateActionActions().size());
    }

    @Test
    @DisplayName("Test SecurityDetailService getByKeys")
    void test_getByKeys() {
        getBy(null);
    }

    @Test
    @DisplayName("Test SecurityDetailService getByKeysAndUpdateDate")
    void test_getByKeysAndUpdateDate() {
        getBy(LocalDateTime.now());
    }

    @Test
    @DisplayName("Test SecurityDetailService getByUpdateDate")
    void test_getByUpdateDate() {
        assertEquals(0, securityDetailService.getByUpdateDate(null, null, null).size());
    }


    @Test
    @DisplayName("Test SecurityDetailService deleteAll")
    void test_deleteAll() {
        super.test_deleteAll(securityDetailService);
    }

    @Test
    @DisplayName("Test SecurityDetailService upload")
    void test_upload() {
        assertEquals(0, securityDetailService.upload(null).size());
    }
}
