/*
 * RepositoryFacadeImpl.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */

package com.bcs.bm.catalog_of_instruments_rudata.repositories;

import java.time.LocalDateTime;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.function.Function;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import lombok.extern.slf4j.Slf4j;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import com.mongodb.DBCollection;

import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.DefaultEntity;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.PrimaryKeyId;
import com.bcs.bm.common.errors.ErrorGroup;

@Transactional
@Repository
@Slf4j
public class RepositoryFacadeImpl<T extends DefaultEntity> implements RepositoryFacade<Map, T> {

    private static final int MAX_BATCH_SIZE = 500;
    private final MongoTemplate mongoTemplate;
    private final ObjectMapper mapper;

    @Autowired
    public RepositoryFacadeImpl(MongoTemplate mongoTemplate, ObjectMapper mapper) {
        this.mongoTemplate = mongoTemplate;
        this.mapper = mapper;
    }

    private class UnitOfRowsOperation extends RecursiveTask<List<T>> {

        private final Function<List<Map>, List<T>> function;
        private final List<Map> rows;

        public UnitOfRowsOperation(Function<List<Map>, List<T>> function, List<Map> rows) {
            this.function = function;
            this.rows = rows;
        }

        @Override
        protected List<T> compute() {
            return function.apply(rows);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<T> upsert(Class<T> clazz, List<Map> rows, LocalDateTime importTime) {
        if (Objects.isNull(clazz) || CollectionUtils.isEmpty(rows) || Objects.isNull(importTime)) {
            return Collections.emptyList();
        }
        final String repositoryName = clazz.getAnnotation(Document.class).collection();
        final List<String> primaryKeys = Arrays.asList(clazz.getAnnotation(PrimaryKeyId.class).value());
        final int unitCount = (rows.size() / MAX_BATCH_SIZE) + 1;
        final List<T> result = Lists.newLinkedList();
        rows = Lists.newArrayList(Sets.newHashSet(rows));

        Function<List<Map>, List<T>> tempFunction = p -> {
            final List<T> localObjectsList = Lists.newArrayListWithCapacity(p.size());
            final List<Map<String, ?>> keys = Lists.newArrayListWithCapacity(p.size());
            p.forEach(e -> {
                if (!primaryKeys.stream().allMatch(e::containsKey)) {
                    log.info("Incorrect {} entity {} was detected for uploading", repositoryName, e.toString());
                    return;
                }
                T entity;
                try {
                    entity = mapper.convertValue(e, clazz);
                } catch (IllegalArgumentException ex) {
                    log.error("Error {} during {} entity parsing: {}", ErrorGroup.getErrorGroupByMessage("system.error.cantParseRequest"), repositoryName, ex.getLocalizedMessage());
                    return;
                }
                entity.setImporttime(importTime);
                entity.init();
                keys.add(Collections.singletonMap(DBCollection.ID_FIELD_NAME, entity.getPrimaryKey()));
                localObjectsList.add(entity);
            });
            deleteByKeys(clazz, keys);
            mongoTemplate.insert(localObjectsList, repositoryName);
            return localObjectsList;
        };

        final ForkJoinPool executorService = new ForkJoinPool();

        try {
            final List<ForkJoinTask<List<T>>> tasks = Lists.newArrayListWithCapacity(unitCount);
            for (int idx = 0; idx < unitCount; idx++) {
                tasks.add(executorService.submit(new UnitOfRowsOperation(tempFunction, rows.subList(idx * MAX_BATCH_SIZE, idx * MAX_BATCH_SIZE + ((idx + 1) == unitCount ? rows.size() % MAX_BATCH_SIZE : MAX_BATCH_SIZE)))));
            }

            for (ForkJoinTask<List<T>> task : tasks) {
                result.addAll(task.join());
            }
        } finally {
            executorService.shutdownNow();
        }

        return result;
    }

    @Override
    public List<T> findAll(Class<T> clazz, Integer skipCount, Integer pageSize) {
        return findByKeysAndUpdateDate(clazz, null, null, skipCount, pageSize);
    }

    @Override
    public T findLastRecord(Class<T> clazz) {
        if (Objects.isNull(clazz)) {
            return null;
        }
        final Query query = new Query().with(new Sort(Sort.Direction.DESC, "updatedate")).limit(1);
        return mongoTemplate.findOne(query, clazz);
    }

    @Override
    public List<T> findByKeys(Class<T> clazz, List<Map<String, ?>> keys, Integer skipCount, Integer pageSize) {
        return findByKeysAndUpdateDate(clazz, keys, null, skipCount, pageSize);
    }

    private void fillQueryByKeys(Query query, List<Map<String, ?>> keys, List<String> primaryKeys) {
        if (Objects.isNull(query) || CollectionUtils.isEmpty(keys) || CollectionUtils.isEmpty(primaryKeys)) {
            return;
        }
        Criteria[] criteriaOrArray = new Criteria[keys.size()];
        int criteriaOrArrayIdx = 0;
        for (Map<String, ?> key : keys) {
            if (MapUtils.isEmpty(key)) {
                continue;
            }
            int criteriaAndArrayIdx = 0;
            Criteria[] criteriaAndArray = new Criteria[key.size()];
            for (Map.Entry<String, ?> entry : key.entrySet()) {
                if (entry.getValue() instanceof Collection) {
                    criteriaAndArray[criteriaAndArrayIdx++] = Criteria.where(entry.getKey()).in((Collection)entry.getValue());
                } else {
                    criteriaAndArray[criteriaAndArrayIdx++] = Criteria.where(entry.getKey()).in(entry.getValue());
                }
            }
            criteriaOrArray[criteriaOrArrayIdx++] = new Criteria().andOperator(criteriaAndArray);
        }
        query.addCriteria(new Criteria().orOperator(criteriaOrArray));
    }

    @Override
    @SuppressWarnings("unchecked")
    public List<T> findByKeysAndUpdateDate(Class<T> clazz, List<Map<String, ?>> keys, LocalDateTime updateDate, Integer skipCount, Integer pageSize) {
        if (Objects.isNull(clazz)) {
            return Collections.emptyList();
        }
        final List<String> primaryKeys = Arrays.asList(clazz.getAnnotation(PrimaryKeyId.class).value());
        final Query query = new Query().with(new Sort(Sort.Direction.ASC, primaryKeys));
        if (CollectionUtils.isNotEmpty(keys) ) {
            fillQueryByKeys(query, keys, primaryKeys);
        }
        if (Objects.nonNull(updateDate)) {
            query.addCriteria(Criteria.where("updatedate").gt(updateDate));
        }
        if (Objects.nonNull(skipCount)) {
            query.skip(skipCount);
        }
        if (Objects.nonNull(pageSize)) {
            query.limit(pageSize);
        }
        return mongoTemplate.find(query, clazz);
    }

    @Override
    public void deleteAll(Class<T> clazz) {
        deleteByKeys(clazz, null);
    }

    @Override
    public void deleteByKeys(Class<T> clazz, List<Map<String, ?>> keys) {
        if (Objects.isNull(clazz)) {
            return;
        }
        final String repositoryName = clazz.getAnnotation(Document.class).collection();
        final Query query = new Query();
        if (CollectionUtils.isNotEmpty(keys) ) {
            fillQueryByKeys(query, keys, Arrays.asList(clazz.getAnnotation(PrimaryKeyId.class).value()));
        }
        mongoTemplate.remove(query, repositoryName);
    }

    @Override
    public long count(Class<T> clazz) {
        if (Objects.isNull(clazz)) {
            return 0L;
        }
        final String repositoryName = clazz.getAnnotation(Document.class).collection();
        final Query query = new Query();
        return mongoTemplate.count(query, repositoryName);
    }
}