/*
 * DefaultSubscription.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */

package com.bcs.bm.catalog_of_instruments_rudata.services.reactives;

import java.util.Map;

import javax.annotation.PostConstruct;

import org.apache.commons.collections.MapUtils;
import org.apache.commons.lang3.StringUtils;
import org.reactivestreams.Subscription;
import org.springframework.beans.factory.BeanCreationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import lombok.extern.slf4j.Slf4j;

import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.DefaultEntity;
import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.PrimaryKeyId;
import com.bcs.bm.catalog_of_instruments_rudata.services.AbstractRuDataService;

@Service(DefaultSubscription.NAME)
@Slf4j
public class DefaultSubscription implements Subscription {

    public static final String NAME = "defaultSubscription";
    private volatile boolean isCancelled = false;
    private final Map<String, AbstractRuDataService> services;

    @Autowired
    public DefaultSubscription(Map<String, AbstractRuDataService> services) {
        this.services = services;
    }

    @Override
    public void request(long requestNumber) {
        if (CollectionUtils.isEmpty(services) || CollectionUtils.isEmpty(services.values()) || isCancelled) {
            return;
        }
        services.entrySet()/*.parallelStream()*/.forEach(entry -> {
            try {
                entry.getValue().upload(null);
            } catch (Exception ex) {
                log.error("Subscription #{}: error occured with {} {}", requestNumber, entry.getKey(), StringUtils.isEmpty(ex.getLocalizedMessage()) ? ex.getClass().getSimpleName() : ex.getLocalizedMessage());
            }
        });
    }

    @Override
    public void cancel() {
        isCancelled = true;
    }

    @SuppressWarnings("unchecked")
    @PostConstruct
    private void afterPropertiesSet() {
        boolean isCorrect = true;
        if (MapUtils.isEmpty(services)) {
            throw new BeanCreationException("There are no services in application. It doesn't make sense to launch the application");
        }
        for (AbstractRuDataService service : services.values()) {
            final Class<DefaultEntity> entity = service.getClazz();
            final String[] primaryKeyFields = entity.getAnnotation(PrimaryKeyId.class).value();
            for (String primaryKeyField : primaryKeyFields) {
                try {
                    entity.getDeclaredField(primaryKeyField);
                } catch (NoSuchFieldException e) {
                    log.error("Class '{}' doesn't have field '{}' which is taken part in primary key", entity.getSimpleName(), primaryKeyField);
                    isCorrect = false;
                } catch (SecurityException e) {
                    log.error("Class '{}' was loaded but the different class loader. Probably you are trying to get access by insecure way", entity.getSimpleName());
                    isCorrect = false;
                }
            }
        }
        if (!isCorrect) {
            throw new BeanCreationException("Some implementations of " + DefaultEntity.class.getSimpleName() + " are incorrect");
        }
        log.info("All entities are correct");
    }
}
