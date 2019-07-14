package com.bcs.bm.catalog_of_instruments_rudata.services;

import java.time.LocalDateTime;
import java.util.stream.Collectors;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

import com.google.common.collect.ImmutableMap;

import com.bcs.bm.catalog_of_instruments_rudata.aspects.Token;
import com.bcs.bm.catalog_of_instruments_rudata.components.processors.JsonProcessor;
import com.bcs.bm.catalog_of_instruments_rudata.configurations.ServiceProperties;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.RepositoryFacade;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.*;

@Slf4j
@Service(SecurityDetailService.NAME)
public class SecurityDetailService extends AbstractRuDataService<SecurityDetail> {

    public static final String NAME = "securitydetail" + AbstractRuDataService.NAME;

    private final Map<String, AbstractRuDataService> services;

    @Autowired
    public SecurityDetailService(RepositoryFacade<Map, SecurityDetail> repositoryFacade,
                                 JsonProcessor jsonProcessor,
                                 RestTemplate restTemplate,
                                 ServiceProperties serviceProperties,
                                 Map<String, AbstractRuDataService> services) {
        super(repositoryFacade, serviceProperties, jsonProcessor, restTemplate, SecurityDetail.class);
        this.services = services;
    }

    public LocalDateTime getLastUpdateTime() {
        return LocalDateTime.now();
    }

    public List<SecurityDetail> getAll(Integer skipCount, Integer pageSize) {
        return Collections.emptyList();
    }

    public List<SecurityDetail> getByKeys(List<Map<String, ?>> keys, Integer skipCount, Integer pageSize) {
        return getByKeysAndUpdateDate(keys, null, skipCount, pageSize);
    }

    public List<SecurityDetail> getByUpdateDate(LocalDateTime updateDate, Integer skipCount, Integer pageSize) {
        return Collections.emptyList();
    }

    @SuppressWarnings("unchecked")
    public List<SecurityDetail> getByKeysAndUpdateDate(List<Map<String, ?>> keys, LocalDateTime updateDate, Integer skipCount, Integer pageSize) {
        if (CollectionUtils.isEmpty(keys) || keys.stream().noneMatch(e -> e.containsKey("isin"))) {
            return Collections.emptyList();
        }

        List<Security> securities = services.get(SecurityService.NAME).getByKeys(keys, skipCount, pageSize);
        if (securities.size() == 0) {
            throw new IllegalArgumentException("Couldn't find " + Security.class.getSimpleName() +
                    " by isin = '" + keys.stream().filter(e -> e.containsKey("isin") && Objects.nonNull(e.get("isin")))
                    .map(m -> m.get("isin").toString()).collect(Collectors.joining(", ")) + "'");
        }

        List<SecurityDetail> result = new ArrayList<>(securities.size());
        securities.forEach(security -> {
                List<Map<String, ?>> isincodeKey = Collections.singletonList(
                        ImmutableMap.of("isincode", security.getIsin()));
                List<FintoolReferenceData> fintoolReferenceDatas = services.get(FintoolReferenceDataService.NAME).getByKeys(isincodeKey, skipCount, pageSize);
                if (fintoolReferenceDatas.size() != 1) {
                    log.error("Couldn't find single {} by isincode = '{}'", FintoolReferenceData.class.getSimpleName(), security.getIsin());
                }

                List<Map<String, ?>> fininstidKey = Collections.singletonList(
                        ImmutableMap.of("fininstid", security.getFininstid()));
                List<Emitent> emitents = services.get(EmitentService.NAME).getByKeys(fininstidKey, skipCount, pageSize);
                if (emitents.size() != 1) {
                    log.error("Couldn't find single {} by fininstid = '{}'", Emitent.class.getSimpleName(), security.getFininstid());
                }

                List<Map<String, ?>> fintoolidKey = Collections.singletonList(
                        ImmutableMap.of("fintoolid", security.getFintoolid()));
                List<ShareDividend> shareDividends = services.get(ShareDividendService.NAME).getByKeys(fintoolidKey, skipCount, null);
                List<CorporateActionActions> corporateActionActions = services.get(CorporateActionActionsService.NAME).getByKeys(fintoolidKey, skipCount, null);
                List<BondMaturity> bondMaturities = services.get(BondMaturityService.NAME).getByKeys(fintoolidKey, skipCount, pageSize);
                if (bondMaturities.size() != 1) {
                    log.info("Couldn't find single {} by fintoolid = '{}'", BondMaturity.class.getSimpleName(), security.getFintoolid());
                }

                List<Map<String, ?>> idfintoolKey = Collections.singletonList(
                        ImmutableMap.of("idfintool", security.getIdfintool()));
                List<BondAmortization> bondAmortizations = services.get(BondAmortizationService.NAME).getByKeys(idfintoolKey, skipCount, null);
                List<BondConvertation> bondConvertations = services.get(BondConvertationService.NAME).getByKeys(idfintoolKey, skipCount, null);
                List<BondCoupon> bondCoupons = services.get(BondCouponService.NAME).getByKeys(idfintoolKey, skipCount, null);
                List<BondOffer> bondOffers = services.get(BondOfferService.NAME).getByKeys(idfintoolKey, skipCount, null);

                SecurityDetail securityDetail = new SecurityDetail(security.getIsin(), SecurityDetail.class.getSimpleName(), LocalDateTime.now());
                securityDetail.setSecurity(security);
                securityDetail.setFintoolReferenceData(fintoolReferenceDatas.size() == 0 ? null : fintoolReferenceDatas.get(0));
                securityDetail.setEmitent(emitents.size() == 0 ? null : emitents.get(0));
                securityDetail.setShareDividends(shareDividends);
                securityDetail.setBondAmortizations(bondAmortizations);
                securityDetail.setBondConvertations(bondConvertations);
                securityDetail.setBondCoupons(bondCoupons);
                securityDetail.setBondMaturity(bondMaturities.size() == 0 ? null : bondMaturities.get(0));
                securityDetail.setBondOffers(bondOffers);
                securityDetail.setCorporateActionActions(corporateActionActions);
                result.add(securityDetail);
            }
        );

        return result;
    }

    public void deleteAll() {}

    @Override
    public List<SecurityDetail> upload(Token token) {
        return Collections.emptyList();
    }
}
