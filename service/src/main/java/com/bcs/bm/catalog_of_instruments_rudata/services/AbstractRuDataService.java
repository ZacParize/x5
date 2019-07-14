/*
 * AbstractRuDataService.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */

package com.bcs.bm.catalog_of_instruments_rudata.services;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.web.client.RestTemplate;

import com.bcs.bm.catalog_of_instruments_rudata.aspects.Token;
import com.bcs.bm.catalog_of_instruments_rudata.components.processors.JsonProcessor;
import com.bcs.bm.catalog_of_instruments_rudata.configurations.ServiceProperties;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.RepositoryFacade;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.DefaultEntity;

public abstract class AbstractRuDataService<T extends DefaultEntity> {

    public static final String NAME = "Service";

    protected final RepositoryFacade<Map, T> repositoryFacade;

    protected final ServiceProperties serviceProperties;

    protected final JsonProcessor jsonProcessor;

    protected final RestTemplate restTemplate;

    protected final Class<T> clazz;

    protected volatile long count = 0L;

    public AbstractRuDataService(RepositoryFacade<Map, T> repositoryFacade, ServiceProperties serviceProperties, JsonProcessor jsonProcessor, RestTemplate restTemplate, Class<T> clazz) {
        this.repositoryFacade = repositoryFacade;
        this.serviceProperties = serviceProperties;
        this.jsonProcessor = jsonProcessor;
        this.restTemplate = restTemplate;
        this.clazz = clazz;
    }

    public Class<T> getClazz() {
        return clazz;
    }

    public LocalDateTime getLastUpdateTime() {
        final T record = this.repositoryFacade.findLastRecord(clazz);
        if (Objects.isNull(record)) {
            return null;
        }
        return record.getUpdatedate();
    }

    public List<T> getAll(Integer skipCount, Integer pageSize) {
        return repositoryFacade.findAll(clazz, skipCount, pageSize);
    }

    public List<T> getByKeys(List<Map<String, ?>> keys, Integer skipCount, Integer pageSize) {
        return repositoryFacade.findByKeys(clazz, keys, skipCount, pageSize);
    }

    public List<T> getByUpdateDate(LocalDateTime updateDate, Integer skipCount, Integer pageSize) {
        return repositoryFacade.findByKeysAndUpdateDate(clazz, null, updateDate, skipCount, pageSize);
    }

    public List<T> getByKeysAndUpdateDate(List<Map<String, ?>> keys, LocalDateTime updateDate, Integer skipCount, Integer pageSize) {
        return repositoryFacade.findByKeysAndUpdateDate(clazz, keys, updateDate, skipCount, pageSize);
    }

    public void deleteAll() {
        repositoryFacade.deleteAll(clazz);
        count = 0L;
    }

    public long count() { return count; }

    abstract public List<T> upload(Token token);
}
