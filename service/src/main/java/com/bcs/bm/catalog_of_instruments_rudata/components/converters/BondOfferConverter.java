package com.bcs.bm.catalog_of_instruments_rudata.components.converters;

import java.sql.Timestamp;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.BondOffer;


@Component(BondOfferConverter.NAME)
public class BondOfferConverter implements Converter<BondOffer, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffers> {
    public static final String NAME = "bondofferConverter";

    @Override
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffers convert(BondOffer source) {
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffers.Builder bondofferBuilder = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondOffers.newBuilder();

        bondofferBuilder.setUpdateDate(Timestamp.valueOf(source.getUpdatedate()).getTime());
        return bondofferBuilder.build();
    }
}
