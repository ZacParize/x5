package com.bcs.bm.catalog_of_instruments_rudata.services;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import lombok.SneakyThrows;

import com.google.common.collect.Maps;

import com.bcs.bm.catalog_of_instruments_rudata.aspects.Authenticate;
import com.bcs.bm.catalog_of_instruments_rudata.aspects.Token;
import com.bcs.bm.catalog_of_instruments_rudata.components.processors.JsonProcessor;
import com.bcs.bm.catalog_of_instruments_rudata.configurations.ServiceProperties;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.RepositoryFacade;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.CorporateActionKindGroups;

@Transactional
@Service(CorporateActionKindGroupsService.NAME)
public class CorporateActionKindGroupsService extends AbstractRuDataService<CorporateActionKindGroups> {

    public static final String NAME = "corporateactionkindgroups" + AbstractRuDataService.NAME;

    @Autowired
    public CorporateActionKindGroupsService(RepositoryFacade<Map, CorporateActionKindGroups> repositoryFacade,
                          JsonProcessor jsonProcessor,
                          RestTemplate restTemplate,
                          ServiceProperties serviceProperties) {
        super(repositoryFacade, serviceProperties, jsonProcessor, restTemplate, CorporateActionKindGroups.class);
    }

    @SuppressWarnings("unchecked")
    @Authenticate
    @Override
    @SneakyThrows({URISyntaxException.class})
    public List<CorporateActionKindGroups> upload(Token token) {
        try {
            if (Objects.isNull(token)) {
                return Collections.emptyList();
            }
            final HttpHeaders headers = new HttpHeaders();
            headers.set(HttpHeaders.AUTHORIZATION, "Bearer " + token.getValue());
            headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
            headers.setContentType(MediaType.APPLICATION_JSON);
            final URI uri = new URI(serviceProperties.getRuData().getUrl() + "/CorporateAction/KindGroups");
            final ResponseEntity response = restTemplate.exchange(uri.toString(), HttpMethod.POST, new HttpEntity<>(Maps.newHashMap(), headers), List.class);
            final List<CorporateActionKindGroups> result = repositoryFacade.upsert(clazz, jsonProcessor.apply((List<Map<String, Object>>) response.getBody()), LocalDateTime.now(ZoneOffset.UTC));
            return result;
        } finally {
            count = repositoryFacade.count(clazz);
        }
    }
}
