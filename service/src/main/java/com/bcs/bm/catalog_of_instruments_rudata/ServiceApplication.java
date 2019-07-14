/*
 * ServiceApplication.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */

package com.bcs.bm.catalog_of_instruments_rudata;

import java.util.concurrent.TimeUnit;

import io.grpc.Server;
import io.grpc.ServerBuilder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;

import lombok.extern.slf4j.Slf4j;

import com.bcs.bm.catalog_of_instruments_rudata.configurations.ServiceProperties;
import com.bcs.bm.catalog_of_instruments_rudata.services.servers.RuDataServer;

@SpringCloudApplication
@ComponentScan(basePackages = {"com.bcs"}, excludeFilters = @ComponentScan.Filter(type = FilterType.REGEX, pattern = "com.bcs.bm.catalog_of_instruments_rudata.client.*"))
@Slf4j
public class ServiceApplication implements CommandLineRunner {

    private final ServiceProperties serviceProperties;
    private final RuDataServer server;

    @Autowired
    public ServiceApplication(ServiceProperties serviceProperties, RuDataServer server) {
        this.serviceProperties = serviceProperties;
        this.server = server;
    }

    public static void main(String[] args) {
        System.setProperty("user.country", System.getProperty("user.country", "RU"));
        System.setProperty("user.language", System.getProperty("user.language", "ru_RU"));
        new SpringApplicationBuilder(ServiceApplication.class).build().run(args);
    }

    @Override
    public void run(String... args) throws Exception {
        final Server server = ServerBuilder.forPort(this.serviceProperties.getRuData().getServerPort()).addService(this.server).build();
        log.info("GRPC server is starting...");
        server.start();
        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
            try {
                log.info("GRPC server is shutting down...");
                server.shutdown();
                server.awaitTermination(10, TimeUnit.SECONDS);
                log.info("GRPC server was stopped...");
            } catch (InterruptedException e) {
                log.error("Error while shutting down GRPC server", e);
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }
        }));

    }
}