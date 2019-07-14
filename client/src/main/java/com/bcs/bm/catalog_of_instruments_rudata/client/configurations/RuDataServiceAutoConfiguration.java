/*
 * RuDataServiceAutoConfiguration.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */

package com.bcs.bm.catalog_of_instruments_rudata.client.configurations;

import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.boot.autoconfigure.amqp.RabbitAutoConfiguration;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.kafka.KafkaAutoConfiguration;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.discovery.EurekaClientConfig;

import com.bcs.bm.catalog_of_instruments_rudata.client.RuDataClient;
import com.bcs.bm.catalog_of_instruments_rudata.client.RuDataFactory;

@Configuration
@ConditionalOnClass({RuDataClient.class})
@AutoConfigureBefore({RabbitAutoConfiguration.class, KafkaAutoConfiguration.class})
@AutoConfigureAfter({WebMvcAutoConfiguration.class})
public class RuDataServiceAutoConfiguration {

    @Configuration
    protected static class RuDataFactoryCreator {

        private final EurekaClientConfig eurekaClientConfig;

        public RuDataFactoryCreator(EurekaClientConfig eurekaClientConfig) {
            this.eurekaClientConfig = eurekaClientConfig;
        }

        @Bean
        @ConditionalOnMissingBean(RuDataFactory.class)
        public RuDataFactory ruDataFactory() {
            return new RuDataFactory(eurekaClientConfig);
        }

    }

}