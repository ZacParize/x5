package com.bcs.bm.catalog_of_instruments_rudata.components.converters;

import java.sql.Timestamp;

import org.springframework.core.convert.converter.Converter;

import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.BondConvertation;


public class BondConvertationConverter implements Converter<BondConvertation, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation> {

    public static final String NAME = "bondconvertationConverter";

    @Override
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation convert(BondConvertation source) {
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation.Builder bondConvertationBuilder =
                com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondConvertation.newBuilder();

        bondConvertationBuilder.setUpdateDate(Timestamp.valueOf(source.getUpdatedate()).getTime());
        return bondConvertationBuilder.build();
    }
}
