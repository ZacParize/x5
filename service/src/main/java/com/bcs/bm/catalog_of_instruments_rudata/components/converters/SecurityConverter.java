/*
 * SecurityBuilder.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */

package com.bcs.bm.catalog_of_instruments_rudata.components.converters;

import java.sql.Timestamp;
import java.text.ParseException;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.time.FastDateFormat;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import lombok.SneakyThrows;

import com.google.protobuf.Int64Value;

@Component(SecurityConverter.NAME)
public class SecurityConverter implements Converter<com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.Security, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security> {

    public static final String NAME = "securityConverter";
    private static final FastDateFormat FORMATTER_MS = FastDateFormat.getInstance("yyyy-MM-dd'T'hh:mm:ss.SSS");
    private static final FastDateFormat FORMATTER_SEC = FastDateFormat.getInstance("yyyy-MM-dd'T'hh:mm:ss");

    @Override
    @SneakyThrows({ParseException.class})
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security convert(com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.Security security) {
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security.Builder securityBuilder = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Security.newBuilder();

        securityBuilder.setFintoolid(security.getFintoolid());
        securityBuilder.setIdFintool(security.getIdfintool());
        securityBuilder.setSubType(security.getSubtype());
        securityBuilder.setType(security.getType());

        if (Objects.nonNull(security.getFininstid())) {
            securityBuilder.setFininstid(Int64Value.newBuilder().setValue(security.getFininstid()).build());
        }

        securityBuilder.setUpdateDate(Timestamp.valueOf(security.getUpdatedate()).getTime());

        if (StringUtils.isNotBlank(security.getEndmtydate())) {
            if (security.getEndmtydate().contains(".")) {
                securityBuilder.setEndmtyDate(Int64Value.newBuilder().setValue(FORMATTER_MS.parse(security.getEndmtydate()).getTime()).build());
            } else {
                securityBuilder.setEndmtyDate(Int64Value.newBuilder().setValue(FORMATTER_SEC.parse(security.getEndmtydate()).getTime()).build());
            }
        }

        if (Objects.nonNull(security.getIdemitent())) {
            securityBuilder.setIdemitent(Int64Value.newBuilder().setValue(security.getIdemitent()).build());
        }

        securityBuilder.setNrdcode(security.getNrdcode());
        securityBuilder.setIdIss(security.getIdiss());

        return securityBuilder.build();
    }
}
