/*
 * DiscoveryNameResolver.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */

package com.bcs.bm.catalog_of_instruments_rudata.client.discovery;

import java.net.InetSocketAddress;
import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import javax.validation.constraints.NotNull;

import io.grpc.Attributes;
import io.grpc.EquivalentAddressGroup;
import io.grpc.NameResolver;

import com.netflix.appinfo.ApplicationInfoManager;
import com.netflix.appinfo.EurekaInstanceConfig;
import com.netflix.appinfo.MyDataCenterInstanceConfig;
import com.netflix.appinfo.providers.EurekaConfigBasedInstanceInfoProvider;
import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.EurekaClientConfig;
import com.netflix.discovery.shared.Application;

public class DiscoveryNameResolver extends NameResolver {

    private final String serviceName;
    private final String portMetaData;
    private final EurekaClient eurekaClient;

    public DiscoveryNameResolver(EurekaClientConfig clientConfig, URI targetUri, String portMetaData) {
        this.portMetaData = portMetaData;
        this.serviceName = targetUri.getAuthority();
        MyDataCenterInstanceConfig instanceConfig = new MyDataCenterInstanceConfig();
        ApplicationInfoManager applicationInfoManager = initializeApplicationInfoManager(instanceConfig);
        this.eurekaClient = new DiscoveryClient(applicationInfoManager, clientConfig);
    }

    @NotNull
    private static ApplicationInfoManager initializeApplicationInfoManager(EurekaInstanceConfig instanceConfig) {
        return new ApplicationInfoManager(instanceConfig, (new EurekaConfigBasedInstanceInfoProvider(instanceConfig)).get());
    }

    public String getServiceAuthority() {
        return this.serviceName;
    }

    public void start(Listener listener) {
        this.update(listener);
    }

    private void update(Listener listener) {
        Application application = this.eurekaClient.getApplication(this.serviceName);
        List<EquivalentAddressGroup> resolvedServerInfos = application.getInstances().stream().map((instanceInfo) -> {
            int port;
            if (this.portMetaData != null) {
                port = Integer.parseInt(instanceInfo.getMetadata().get(this.portMetaData));
            } else {
                port = instanceInfo.getPort();
            }
            return new EquivalentAddressGroup(new InetSocketAddress(instanceInfo.getHostName(), port), Attributes.EMPTY);
        }).collect(Collectors.toList());
        listener.onAddresses(resolvedServerInfos, Attributes.EMPTY);
    }

    public void shutdown() {
    }
}
