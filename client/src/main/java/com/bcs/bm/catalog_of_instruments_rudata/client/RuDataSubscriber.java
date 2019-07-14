/*
 * RuDataSubscriber.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */

package com.bcs.bm.catalog_of_instruments_rudata.client;

import java.util.Iterator;
import java.util.Objects;

import io.grpc.ManagedChannel;
import io.grpc.StatusRuntimeException;
import io.grpc.stub.StreamObserver;

import lombok.extern.slf4j.Slf4j;

import com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Emitent;
import com.bcs.bm.catalog_of_instruments_rudata.client.grpc.FintoolReferenceData;
import com.bcs.bm.catalog_of_instruments_rudata.client.grpc.RudataServiceGrpc;
import com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeEmitentsRequest;
import com.bcs.bm.catalog_of_instruments_rudata.client.grpc.SubscribeFintoolReferenceDataRequest;
import com.bcs.bm.common.logging.LogMessageMarker;

@Slf4j
public class RuDataSubscriber {

    private final RudataServiceGrpc.RudataServiceBlockingStub stub;

    public RuDataSubscriber(ManagedChannel channel) {
        this.stub = RudataServiceGrpc.newBlockingStub(channel);
    }

    public void subscribeEmitents(StreamObserver<Emitent> observer, Long updateDate) {
        SubscribeEmitentsRequest.Builder builder = SubscribeEmitentsRequest.newBuilder();

        if (Objects.nonNull(updateDate)) {
            builder.setUpdateDate(updateDate);
        }

        try {
            Iterator<Emitent> iterator = stub.subscribeEmitents(builder.build());
            Emitent emitent;
            while (iterator.hasNext()) {
                emitent = iterator.next();
                observer.onNext(emitent);
                log.info("Emitent {} has successfully processed", emitent);
            }
            observer.onCompleted();
        } catch (StatusRuntimeException e) {
            observer.onError(e);
            log.error("Error occured", e);
        }
    }

    public void subscribeInfoFintoolReferenceDataResponse(StreamObserver<FintoolReferenceData> observer) {
        SubscribeFintoolReferenceDataRequest.Builder builder = SubscribeFintoolReferenceDataRequest.newBuilder();
        try {
            Iterator<FintoolReferenceData> iterator = stub.subscribeFintoolReferenceData(builder.build());
            FintoolReferenceData fintoolReferenceData;
            while (iterator.hasNext()) {
                fintoolReferenceData = iterator.next();
                observer.onNext(fintoolReferenceData);
                log.trace(LogMessageMarker.LOG_TYPE_O, "InfoFintoolReferenceDataResponse {} has successfully processed", fintoolReferenceData);
            }
            observer.onCompleted();
        } catch (StatusRuntimeException e) {
            observer.onError(e);
            log.error("Error occured", e);
        }
    }
}
