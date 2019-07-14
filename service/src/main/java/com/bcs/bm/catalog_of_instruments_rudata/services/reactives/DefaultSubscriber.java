/*
 * DefaultSubscriber.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */

package com.bcs.bm.catalog_of_instruments_rudata.services.reactives;

import java.util.concurrent.atomic.AtomicLong;

import org.reactivestreams.Subscriber;
import org.reactivestreams.Subscription;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

import com.bcs.bm.catalog_of_instruments_rudata.configurations.ServiceProperties;
import com.bcs.bm.common.errors.ErrorGroup;

@Service(DefaultSubscriber.NAME)
@Slf4j
public class DefaultSubscriber implements Subscriber<Void> {

    public static final String NAME = "defaultSubscriber";
    private static final AtomicLong COUNTER = new AtomicLong(0);
    private Subscription subscription;
    private final ServiceProperties serviceProperties;

    @Autowired
    public DefaultSubscriber(Subscription subscription, ServiceProperties serviceProperties) {
        this.serviceProperties = serviceProperties;
        this.subscription = subscription;
    }

    @Override
    public void onSubscribe(Subscription subscription) {
        this.subscription = subscription;
    }

    @Override
    public void onNext(Void empty) {
        if (!serviceProperties.getSchedule().isEnabled()) {
            return;
        }
        log.info("Subscription #{} started", COUNTER.incrementAndGet());
        this.subscription.request(COUNTER.get());
    }

    @Override
    public void onError(Throwable t) {
        log.error("Subscription process error {}: {}", ErrorGroup.getErrorGroupByMessage("system.error.incorrectRequest"), t.getLocalizedMessage());
    }

    @Override
    public void onComplete() {
        log.info("Subscription #{} finished", COUNTER.get());
    }

    public static long getSubscriptionCount() {
        return COUNTER.get();
    }

    @Scheduled(fixedDelayString = "${app.schedule.delay}")
    public void execute() {
        try {
            this.onNext(null);
        } catch (Exception e) {
            this.onError(e);
        } finally {
            this.onComplete();
        }
    }

}
