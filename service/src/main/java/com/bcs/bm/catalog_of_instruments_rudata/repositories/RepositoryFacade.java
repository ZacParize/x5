/*
 * RepositoryFacade.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */

package com.bcs.bm.catalog_of_instruments_rudata.repositories;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.DefaultEntity;

public interface RepositoryFacade<T, R extends DefaultEntity> {

    List<R> upsert(Class<R> clazz, List<T> rows, LocalDateTime importTime);

    List<R> findAll(Class<R> clazz, Integer skipCount, Integer pageSize);

    R findLastRecord(Class<R> clazz);

    List<R> findByKeys(Class<R> clazz, List<Map<String, ?>> keys, Integer skipCount, Integer pageSize);

    List<R> findByKeysAndUpdateDate(Class<R> clazz, List<Map<String, ?>> keys, LocalDateTime updateDate, Integer skipCount, Integer pageSize);

    void deleteAll(Class<R> clazz);

    void deleteByKeys(Class<R> clazz, List<Map<String, ?>> keys);

    long count(Class<R> clazz);
}
