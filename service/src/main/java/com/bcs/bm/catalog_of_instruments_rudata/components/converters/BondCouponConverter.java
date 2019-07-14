package com.bcs.bm.catalog_of_instruments_rudata.components.converters;

import java.sql.Timestamp;

import org.springframework.core.convert.converter.Converter;

import com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.BondCoupon;

public class BondCouponConverter implements Converter<BondCoupon, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons> {
    public static final String NAME = "bondcouponConverter";

    @Override
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons convert(BondCoupon source) {
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons.Builder bondCouponsBuilder = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.BondCoupons.newBuilder();

        bondCouponsBuilder.setUpdateDate(Timestamp.valueOf(source.getUpdatedate()).getTime());
        return bondCouponsBuilder.build();
    }
}
