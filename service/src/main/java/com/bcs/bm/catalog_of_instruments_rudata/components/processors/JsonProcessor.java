/*
 * JsonProcessor.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */

package com.bcs.bm.catalog_of_instruments_rudata.components.processors;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.RecursiveTask;
import java.util.function.Function;

import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import lombok.extern.slf4j.Slf4j;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

@Component(JsonProcessor.NAME)
@Slf4j
public class JsonProcessor implements Function<List<Map<String, Object>>,List<Map>> {

    public static final String NAME = "jsonProcessor";
    private static final int MAX_BATCH_SIZE = 5000;

    private class UnitOfRowsCount extends RecursiveTask<List<Map<String, Object>>> {

        private final List<Map<String, Object>> columns;
        private final Function<Map<String, Object>, Map<String, Object>> function;

        UnitOfRowsCount(List<Map<String, Object>> columns, Function<Map<String, Object>, Map<String, Object>> function) {
            this.columns = columns;
            this.function = function;
        }

        @Override
        protected List<Map<String, Object>> compute() {
            final List<Map<String, Object>> result = Lists.newLinkedList();
            columns.forEach(row -> result.add(function.apply(row)));
            return result;
        }
    }

    @Override
    public List<Map> apply(List<Map<String, Object>> columns) {
        if (CollectionUtils.isEmpty(columns)) {
            return Collections.emptyList();
        }
        final int unitCount = (columns.size() / MAX_BATCH_SIZE) + 1;
        final List<Map> result = Lists.newLinkedList();
        final List<ForkJoinTask<List<Map<String, Object>>>> tasks = Lists.newArrayListWithCapacity(unitCount);
        final Function<Map<String, Object>, Map<String, Object>> tempFunction = row -> {
            final Map<String,Object> localResult = Maps.newLinkedHashMapWithExpectedSize(row.size());
            for (Map.Entry<String, Object> entry: row.entrySet()) {
                localResult.put(entry.getKey().replaceAll("[-_]","").toLowerCase(), entry.getValue());
            }
            return localResult;
        };

        final ForkJoinPool executorService = new ForkJoinPool();

        try {
            for (int idx = 0; idx < unitCount; idx++) {
                tasks.add(executorService.submit(new UnitOfRowsCount(columns.subList(idx * MAX_BATCH_SIZE, idx * MAX_BATCH_SIZE + ((idx + 1) == unitCount ? columns.size() % MAX_BATCH_SIZE : MAX_BATCH_SIZE)), tempFunction)));
            }

            for (ForkJoinTask<List<Map<String, Object>>> task : tasks) {
                result.addAll(task.join());
            }
        } finally {
            executorService.shutdownNow();
        }

        return result;
    }
}