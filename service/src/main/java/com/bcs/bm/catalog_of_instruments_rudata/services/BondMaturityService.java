package com.bcs.bm.catalog_of_instruments_rudata.services;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import lombok.extern.slf4j.Slf4j;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import com.bcs.bm.catalog_of_instruments_rudata.aspects.Authenticate;
import com.bcs.bm.catalog_of_instruments_rudata.aspects.Token;
import com.bcs.bm.catalog_of_instruments_rudata.components.processors.JsonProcessor;
import com.bcs.bm.catalog_of_instruments_rudata.configurations.ServiceProperties;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.RepositoryFacade;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.BondMaturity;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.Security;

@Transactional
@Service(BondMaturityService.NAME)
@Slf4j
public class BondMaturityService extends AbstractRuDataService<BondMaturity> {

    private RepositoryFacade<Map, Security> securityFacade;

    public static final String NAME = "bondmaturity" + AbstractRuDataService.NAME;

    @Autowired
    public BondMaturityService(RepositoryFacade<Map, BondMaturity> maturityFacade,
                          RepositoryFacade<Map, Security> securityFacade,
                          JsonProcessor jsonProcessor,
                          RestTemplate restTemplate,
                          ServiceProperties serviceProperties) {
        super(maturityFacade, serviceProperties, jsonProcessor, restTemplate, BondMaturity.class);
        this.securityFacade = securityFacade;
    }

    @Authenticate
    @SuppressWarnings("unchecked")
    @Override
    public List<BondMaturity> upload(Token token) {
        try {
            if (Objects.isNull(token)) {
                return Collections.emptyList();
            }
            List<Map<String, Object>> maturities = new CopyOnWriteArrayList<>();
            List<Security> securities = selectSecurities();
            log.info("BondMaturity upload started. Filtered Securities size: " + securities.size());
            securities.parallelStream().forEach(security -> {
                HttpHeaders headers = new HttpHeaders();
                headers.set(HttpHeaders.AUTHORIZATION, "Bearer " + token.getValue());
                headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
                headers.setContentType(MediaType.APPLICATION_JSON);
                URI uri;
                try {
                    uri = new URI(serviceProperties.getRuData().getUrl() + "/Info/ResidualFaceValue");
                } catch (URISyntaxException e) {
                    throw new RuntimeException(e);
                }
                Map<String, Object> request = Maps.newHashMap();
                request.put("id", security.getIsin());
                request.put("date", security.getEndmtydate());
                request.put("isCloseRegister", true);
                request.put("isPercent", false);
                ResponseEntity response = restTemplate.exchange(uri.toString(), HttpMethod.POST, new HttpEntity<>(request, headers), Map.class);
                Double faceValue = (Double) ((Map<String, Object>) response.getBody()).get("faceValue");
                Map<String, Object> maturity = new HashMap<>();
                maturity.put("fintoolid", security.getFintoolid());
                maturity.put("isin", security.getIsin());
                maturity.put("mtydate", security.getEndmtydate());
                maturity.put("payperbond", faceValue);
                maturity.put("updatedate", LocalDateTime.now());
                maturities.add(maturity);
            });
            final List<BondMaturity> result = repositoryFacade.upsert(clazz, jsonProcessor.apply(maturities), LocalDateTime.now(ZoneOffset.UTC));
            return result;
        } finally {
            count = repositoryFacade.count(clazz);
        }
    }

    private List<Security> selectSecurities() {
        LocalDateTime lastUpdateDate = getLastUpdateTime();
        return securityFacade.findAll(Security.class, null, null).parallelStream()
                .filter(security -> (security.getFintooltype() != null
                        && security.getFintooltype().equals("Облигация"))
                        && (lastUpdateDate == null || security.getUpdatedate().isAfter(lastUpdateDate))
                        && security.getEndmtydate() != null
                        && security.getIsin() != null
                        && repositoryFacade.findByKeys(BondMaturity.class, Lists.newArrayList(
                                ImmutableMap.of("fintoolid", security.getFintoolid())), null, null).isEmpty())
                .collect(Collectors.toList());
    }
}