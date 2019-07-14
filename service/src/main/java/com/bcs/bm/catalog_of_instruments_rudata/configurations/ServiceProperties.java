/*
 * ServiceProperties.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */
package com.bcs.bm.catalog_of_instruments_rudata.configurations;

import javax.validation.constraints.NotNull;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.validation.annotation.Validated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@ConfigurationProperties(prefix = "app")
@Data
@Validated
@RefreshScope
@AllArgsConstructor
@NoArgsConstructor
public class ServiceProperties {

    @NotNull
    private RuDataInfo ruData;

    @NotNull
    private SubscriptionInfo schedule;

}
