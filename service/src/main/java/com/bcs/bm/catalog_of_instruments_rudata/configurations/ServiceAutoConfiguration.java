/*
 * ServiceAutoConfiguration.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */

package com.bcs.bm.catalog_of_instruments_rudata.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.client.RestTemplate;

import lombok.Getter;

@Configuration
@EnableScheduling
@EnableAutoConfiguration
@EnableMongoRepositories
@EnableConfigurationProperties(ServiceProperties.class)
@Getter
public class ServiceAutoConfiguration {

    private final ServiceProperties serviceProperties;

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Autowired
    public ServiceAutoConfiguration(ServiceProperties serviceProperties) {
        this.serviceProperties = serviceProperties;
    }
}