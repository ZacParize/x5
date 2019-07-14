/*
 * RuDataServer.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */

package com.bcs.bm.catalog_of_instruments_rudata.services.servers;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import io.grpc.stub.StreamObserver;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.MapUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

import com.google.common.collect.Maps;

import com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoEmitentsRequest;
import com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoEmitentsResponse;
import com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoFintoolReferenceDataRequest;
import com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoFintoolReferenceDataResponse;
import com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesRequest;
import com.bcs.bm.catalog_of_instruments_rudata.client.grpc.InfoSecuritiesResponse;
import com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Int64Keys;
import com.bcs.bm.catalog_of_instruments_rudata.client.grpc.RudataServiceGrpc;
import com.bcs.bm.catalog_of_instruments_rudata.client.grpc.StringKeys;
import com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeEmitentsRequest;
import com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeFintoolReferenceDataRequest;
import com.bcs.bm.catalog_of_instruments_rudata.components.converters.EmitentConverter;
import com.bcs.bm.catalog_of_instruments_rudata.components.converters.FintoolReferenceDataConverter;
import com.bcs.bm.catalog_of_instruments_rudata.components.converters.SecurityConverter;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.Emitent;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.FintoolReferenceData;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.Security;
import com.bcs.bm.catalog_of_instruments_rudata.services.AbstractRuDataService;
import com.bcs.bm.catalog_of_instruments_rudata.services.EmitentService;
import com.bcs.bm.catalog_of_instruments_rudata.services.FintoolReferenceDataService;
import com.bcs.bm.catalog_of_instruments_rudata.services.SecurityService;
import com.bcs.bm.common.errors.ErrorGroup;

@Service(RuDataServer.NAME)
@Slf4j
public class RuDataServer extends RudataServiceGrpc.RudataServiceImplBase {

    public static final String NAME = "rudata" + AbstractRuDataService.NAME;
    private final Map<String, AbstractRuDataService> services;
    private final Map<String, Converter> converters;

    @Autowired
    public RuDataServer(Map<String, AbstractRuDataService> services, Map<String, Converter> converters) {
        this.services = services;
        this.converters = converters;
    }

    private List<Map<String, ?>> convert(List<Int64Keys> sourceList) {
        if (CollectionUtils.isEmpty(sourceList)) {
            return Collections.emptyList();
        }
        final List<Map<String, ?>> result = new ArrayList<>(sourceList.size());
        sourceList.forEach(element -> {
            if (MapUtils.isEmpty(element.getKeysMap())) {
                return;
            }
            Map<String, Long> tempMap = Maps.newHashMapWithExpectedSize(element.getKeysMap().size());
            element.getKeysMap().forEach((key, value) -> tempMap.put(key, value.getValue()));
            result.add(tempMap);
        });
        return result;
    }

    //TODO refactor
    private List<Map<String, ?>> convertStringKeys(List<StringKeys> sourceList) {
        if (CollectionUtils.isEmpty(sourceList)) {
            return Collections.emptyList();
        }
        final List<Map<String, ?>> result = new ArrayList<>(sourceList.size());
        sourceList.forEach(element -> {
            if (MapUtils.isEmpty(element.getKeysMap())) {
                return;
            }
            Map<String, String> tempMap = new HashMap<>(element.getKeysMap().size());
            element.getKeysMap().forEach((key, value) -> tempMap.put(key, value));
            result.add(tempMap);
        });
        return result;
    }

    @Override
    public void getInfoEmitents(InfoEmitentsRequest request, StreamObserver<InfoEmitentsResponse> responseObserver) {
        final LocalDateTime updateDate = Objects.nonNull(request.getUpdateDate()) ? LocalDateTime.ofInstant(Instant.ofEpochMilli(request.getUpdateDate()), ZoneId.systemDefault()) : null;
        final List<Int64Keys> grpcKeys = request.getIdFilterList();
        final List<Map<String, ?>> keys = convert(grpcKeys);
        try {
            final List<Emitent> emitents = ((EmitentService) services.get(EmitentService.NAME)).getByKeysAndUpdateDate(keys, updateDate, request.getSkipCount(), request.getPageSize());
            final List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Emitent> grpcEmitents = new ArrayList<>(emitents.size());
            for (Emitent emitent : emitents) {
                grpcEmitents.add(((EmitentConverter) converters.get(EmitentConverter.NAME)).convert(emitent));
            }
            responseObserver.onNext(InfoEmitentsResponse.newBuilder().addAllEmitents(grpcEmitents).build());
        } catch (Exception ex) {
            log.error("Error {} during request processing: {}", ErrorGroup.getErrorGroupByMessage("Object.error.incorrectFieldValue"), ex.getLocalizedMessage());
        } finally {
            responseObserver.onCompleted();
        }
    }

    @Override
    public void getInfoSecurities(InfoSecuritiesRequest request, StreamObserver<InfoSecuritiesResponse> responseObserver) {
        final LocalDateTime updateDate = Objects.nonNull(request.getUpdateDate()) ? LocalDateTime.ofInstant(Instant.ofEpochMilli(request.getUpdateDate()), ZoneId.systemDefault()) : null;
        final List<Int64Keys> grpcKeys = request.getIdFilterList();
        final List<Map<String, ?>> keys = convert(grpcKeys);
        try {
            final List<Security> securities = ((SecurityService) services.get(SecurityService.NAME)).getByKeysAndUpdateDate(keys, updateDate, request.getSkipCount(), request.getPageSize());
            final List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security> grpcSecurities = new ArrayList<>(securities.size());
            for (Security security : securities) {
                grpcSecurities.add(((SecurityConverter) converters.get(SecurityConverter.NAME)).convert(security));
            }
            responseObserver.onNext(InfoSecuritiesResponse.newBuilder().addAllSecurities(grpcSecurities).build());
        } catch (Exception ex) {
            log.error("Error {} during request processing: {}", ErrorGroup.getErrorGroupByMessage("Object.error.incorrectFieldValue"), ex.getLocalizedMessage());
        } finally {
            responseObserver.onCompleted();
        }
    }

    @Override
    public void getInfoFintoolReferenceData(InfoFintoolReferenceDataRequest request, StreamObserver<InfoFintoolReferenceDataResponse> responseObserver) {
        final LocalDateTime updateDate = Objects.nonNull(request.getUpdateDate()) ? LocalDateTime.ofInstant(Instant.ofEpochMilli(request.getUpdateDate()), ZoneId.systemDefault()) : null;
        final List<StringKeys> grpcKeys = request.getIdFilterList();
        final List<Map<String, ?>> keys = convertStringKeys(grpcKeys);
        try {
            final List<FintoolReferenceData> fintoolReferenceDataList = ((FintoolReferenceDataService) services.get(FintoolReferenceDataService.NAME)).getByKeysAndUpdateDate(keys, updateDate, null, null);
            final List<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.FintoolReferenceData> grpcfintoolReferenceDataList = new ArrayList<>(fintoolReferenceDataList.size());
            for (FintoolReferenceData fintoolReferenceData : fintoolReferenceDataList) {
                grpcfintoolReferenceDataList.add(((FintoolReferenceDataConverter) converters.get(FintoolReferenceDataConverter.NAME)).convert(fintoolReferenceData));
            }
            responseObserver.onNext(InfoFintoolReferenceDataResponse.newBuilder().addAllFintoolReferenceData(grpcfintoolReferenceDataList).build());
        } catch (Exception ex) {
            log.error("Error {} during request processing: {}", ErrorGroup.getErrorGroupByMessage("Object.error.incorrectFieldValue"), ex.getLocalizedMessage());
        } finally {
            responseObserver.onCompleted();
        }
    }

    @Override
    public void subscribeEmitents(SubscribeEmitentsRequest request, StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Emitent> responseObserver) {
        LocalDateTime updateDate = Objects.nonNull(request.getUpdateDate()) ? LocalDateTime.ofInstant(Instant.ofEpochMilli(request.getUpdateDate()), ZoneId.systemDefault()) : null;
        List<Emitent> emitents;
        try {
            while ((emitents = ((EmitentService) services.get(EmitentService.NAME)).getByUpdateDate(updateDate, null, null)).size() != 0) {
                for (Emitent emitent : emitents) {
                    responseObserver.onNext(((EmitentConverter) converters.get(EmitentConverter.NAME)).convert(emitent));
                }
                // need it in case of constant subscription
                updateDate = LocalDateTime.now();
            }
        } catch (Exception ex) {
            log.error("Error {} during request processing: {}", ErrorGroup.getErrorGroupByMessage("Object.error.incorrectFieldValue"), ex.getLocalizedMessage());
        } finally {
            responseObserver.onCompleted();
        }
    }

    @Override
    public void subscribeFintoolReferenceData(SubscribeFintoolReferenceDataRequest request, StreamObserver<com.bcs.bm.catalog_of_instruments_rudata.client.grpc.FintoolReferenceData> responseObserver) {
        LocalDateTime updateDate = Objects.nonNull(request.getUpdateDate()) ? LocalDateTime.ofInstant(Instant.ofEpochMilli(request.getUpdateDate()), ZoneId.systemDefault()) : null;
        List<FintoolReferenceData> fintoolReferenceDataList;
        try {
            Integer pageSize = 30000;
            Integer skipCount = 0;
            while ((fintoolReferenceDataList = ((FintoolReferenceDataService) services.get(FintoolReferenceDataService.NAME)).getAll(skipCount, pageSize)).size() != 0) {
                for (FintoolReferenceData fintoolReferenceData : fintoolReferenceDataList) {
                    responseObserver.onNext(((FintoolReferenceDataConverter) converters.get(FintoolReferenceDataConverter.NAME)).convert(fintoolReferenceData));
                }
                // need it in case of constant subscription
                updateDate = LocalDateTime.now();

                skipCount += pageSize;
            }
        } catch (Exception e) {
            log.error("Error {} during request processing: {}", ErrorGroup.getErrorGroupByMessage("system.error.unknownError"), e.getLocalizedMessage());
        } finally {
            responseObserver.onCompleted();
        }
    }
}
