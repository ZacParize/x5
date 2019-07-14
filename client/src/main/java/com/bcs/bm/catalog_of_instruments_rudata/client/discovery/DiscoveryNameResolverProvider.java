/*
 * DiscoveryNameResolverProvider.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */

package com.bcs.bm.catalog_of_instruments_rudata.client.discovery;

import java.net.URI;

import io.grpc.Attributes;
import io.grpc.NameResolver;
import io.grpc.NameResolverProvider;

import com.netflix.discovery.EurekaClientConfig;

public class DiscoveryNameResolverProvider extends NameResolverProvider {

    public static final String EUREKA = "eureka";
    public static final int PRIORITY = 6;
    private final EurekaClientConfig eurekaClientConfig;
    private final String portMetaData;

    public DiscoveryNameResolverProvider(EurekaClientConfig eurekaClientConfig, String portMetaData) {
        this.eurekaClientConfig = eurekaClientConfig;
        this.portMetaData = portMetaData;
    }

    protected boolean isAvailable() {
        return true;
    }

    protected int priority() {
        return PRIORITY;
    }

    public NameResolver newNameResolver(URI targetUri, Attributes params) {
        return new DiscoveryNameResolver(this.eurekaClientConfig, targetUri, this.portMetaData);
    }

    public String getDefaultScheme() {
        return EUREKA;
    }
}
