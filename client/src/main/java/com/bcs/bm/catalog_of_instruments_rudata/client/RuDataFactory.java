/*
 * RuDataClientFactory.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */

package com.bcs.bm.catalog_of_instruments_rudata.client;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.util.RoundRobinLoadBalancerFactory;

import com.netflix.discovery.EurekaClientConfig;

import com.bcs.bm.catalog_of_instruments_rudata.client.discovery.DiscoveryNameResolverProvider;

public class RuDataFactory {

    private final EurekaClientConfig eurekaClientConfig;

    public RuDataFactory(EurekaClientConfig eurekaClientConfig) {
        this.eurekaClientConfig = eurekaClientConfig;
    }

    private ManagedChannel createChannel() {
        return ManagedChannelBuilder//.forAddress(clientServiceProperties.getHost(), clientServiceProperties.getPort())
                                    .forTarget(DiscoveryNameResolverProvider.EUREKA + "://bm-proxy-rudata-server")
                                    .nameResolverFactory(new DiscoveryNameResolverProvider(eurekaClientConfig, "grpc.port"))
                                    .loadBalancerFactory(RoundRobinLoadBalancerFactory.getInstance())
                                    .maxInboundMessageSize(21_000_000)
                                    .usePlaintext()
                                    .build();
    }

    public RuDataClient getClient() {
        return new RuDataClient(createChannel());
    }

    public RuDataSubscriber getSubscriber() {
        return new RuDataSubscriber(createChannel());
    }

}
