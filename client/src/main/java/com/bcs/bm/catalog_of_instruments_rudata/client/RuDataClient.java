/*
 * RuDataClient.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */

package com.bcs.bm.catalog_of_instruments_rudata.client;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

import io.grpc.ManagedChannel;

import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import lombok.extern.slf4j.Slf4j;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.protobuf.Int64Value;

import com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Emitent;
import com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoEmitentsRequest;
import com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoEmitentsResponse;
import com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys;
import com.bcs.bm.catalog_of_instruments_rudata.client.grpc.RudataServiceGrpc;

@Slf4j
public class RuDataClient {

    private final ManagedChannel channel;

    private final RudataServiceGrpc.RudataServiceBlockingStub blockingStub;

    public RuDataClient(ManagedChannel channel) {
        this.channel = channel;
        this.blockingStub = RudataServiceGrpc.newBlockingStub(this.channel);
    }

    public void shutdown() throws InterruptedException {
        channel.shutdown().awaitTermination(5, TimeUnit.SECONDS);
    }

    public void shutdownNow() {
        channel.shutdownNow();
    }

    public List<Emitent> getEmitents(String reqId, Integer skipCount, Integer pageSize) {
        return getEmitentsByKeysAndUpdateDate(reqId, null, null, skipCount, pageSize);
    }

    public List<Emitent> getEmitentsByKeys(String reqId, List<Map<String, Long>> keys, Integer skipCount, Integer pageSize) {
        return getEmitentsByKeysAndUpdateDate(reqId, keys, null, skipCount, pageSize);
    }

    public List<Emitent> getEmitentsByKeysAndUpdateDate(String reqId, List<Map<String, Long>> keys, Long updateDate, Integer skipCount, Integer pageSize) {
        log.info("Getting emitents");
        InfoEmitentsRequest.Builder builder = InfoEmitentsRequest.newBuilder();

        if (!StringUtils.isEmpty(reqId)) {
            builder.setReqId(reqId);
        }

        if (!CollectionUtils.isEmpty(keys)) {
            final List<Int64Keys> grpcKeys = Lists.newArrayListWithCapacity(keys.size());
            keys.forEach(key -> {
                Map<String, Int64Value> tempMap = Maps.newHashMapWithExpectedSize(key.size());
                key.entrySet().forEach(e -> tempMap.put(e.getKey(), Int64Value.newBuilder().setValue(e.getValue()).build()));
                grpcKeys.add(Int64Keys.newBuilder().putAllKeys(tempMap).build());
            });
            builder.addAllIdFilter(grpcKeys);
        }

        if (Objects.nonNull(updateDate)) {
            builder.setUpdateDate(updateDate);
        }

        if (Objects.nonNull(skipCount)) {
            builder.setSkipCount(skipCount);
        }

        if (Objects.nonNull(pageSize)) {
            builder.setPageSize(pageSize);
        }

        InfoEmitentsResponse response = blockingStub.getInfoEmitents(builder.build());
        log.info("Emitents: {}", response.getEmitentsList());
        return response.getEmitentsList();
    }

}
