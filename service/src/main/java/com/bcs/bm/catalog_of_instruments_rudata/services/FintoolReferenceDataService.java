package com.bcs.bm.catalog_of_instruments_rudata.services;

import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import com.bcs.bm.catalog_of_instruments_rudata.aspects.Authenticate;
import com.bcs.bm.catalog_of_instruments_rudata.aspects.Token;
import com.bcs.bm.catalog_of_instruments_rudata.components.processors.JsonProcessor;
import com.bcs.bm.catalog_of_instruments_rudata.configurations.ServiceProperties;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.RepositoryFacade;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.FintoolReferenceData;

@Slf4j
@Transactional
@Service(FintoolReferenceDataService.NAME)
public class FintoolReferenceDataService extends AbstractRuDataService<FintoolReferenceData> {

    public static final String NAME = "fintoolreferencedata" + AbstractRuDataService.NAME;
    private static final int PAGE_SIZE = 5000;

    @Autowired
    public FintoolReferenceDataService(RepositoryFacade<Map, FintoolReferenceData> repositoryFacade,
                                       JsonProcessor jsonProcessor,
                                       RestTemplate restTemplate,
                                       ServiceProperties serviceProperties) {
        super(repositoryFacade, serviceProperties, jsonProcessor, restTemplate, FintoolReferenceData.class);
    }

    @SneakyThrows({URISyntaxException.class})
    @SuppressWarnings("unchecked")
    private List<Map<String, Object>> handleRequest(Token token, int page, int pageSize) {
        final LocalDateTime lastUpdateDate = getLastUpdateTime();
        final HttpHeaders headers = new HttpHeaders();
        headers.set(HttpHeaders.AUTHORIZATION, "Bearer " + token.getValue());
        headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
        headers.setContentType(MediaType.APPLICATION_JSON);
        final URI uri = new URI(serviceProperties.getRuData().getUrl() + "/Info/FintoolReferenceData");
        final Map<String, Object> request = Maps.newHashMap();
        if (Objects.nonNull(lastUpdateDate)) {
            request.put("filter", "UPDATE_TIME>=#" + lastUpdateDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSSSSS")) + "Z#");
        }
        request.put("pager", new HashMap() {{
            put("Page", page);
            put("Size", pageSize);
            put("Sort", Collections.singletonList(ImmutableMap.of("Field", "fintoolid")));
        }});
        try {
            return (List<Map<String, Object>>) restTemplate.exchange(uri.toString(), HttpMethod.POST, new HttpEntity<>(request, headers), List.class).getBody();
        } catch (RestClientException ex) {
            return Collections.emptyList();
        }
    }

    public List<Map<String, Object>> getColumns(Token token) {
        final List<Map<String, Object>> result = Lists.newArrayList();
        List<Map<String, Object>> tempResult;
        int iterationNumber = 1;

        do {
            tempResult = handleRequest(token, iterationNumber++, PAGE_SIZE);
            result.addAll(tempResult);
        } while (tempResult.size() == PAGE_SIZE);

        return result;
    }

    @Authenticate
    @Override
    public List<FintoolReferenceData> upload(Token token) {
        try {
            if (Objects.isNull(token)) {
                return Collections.emptyList();
            }
            final List<Map<String, Object>> columns = getColumns(token);
            final List<FintoolReferenceData> result = repositoryFacade.upsert(clazz, jsonProcessor.apply(columns), LocalDateTime.now(ZoneOffset.UTC));
            return result;
        } finally {
            count = repositoryFacade.count(clazz);
        }
    }

}
