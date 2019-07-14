package com.bcs.bm.catalog_of_instruments_rudata.components.converters;

import java.sql.Timestamp;
import java.util.Objects;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import com.google.protobuf.DoubleValue;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Int64Value;

@Component(FintoolReferenceDataConverter.NAME)
public class FintoolReferenceDataConverter implements Converter<com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.FintoolReferenceData, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.FintoolReferenceData> {

    public static final String NAME = "fintoolreferencedataConverter";

    @Override
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.FintoolReferenceData convert(com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.FintoolReferenceData fintoolReferenceData) {
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.FintoolReferenceData.Builder fintoolBuilder = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.FintoolReferenceData.newBuilder();

        fintoolBuilder.setTimebasis(Int32Value.newBuilder().setValue(fintoolReferenceData.getTimebasis()).build());

        if (Objects.nonNull(fintoolReferenceData.getFintoolid())) {
            fintoolBuilder.setFintoolid(fintoolReferenceData.getFintoolid());
        }

        if (Objects.nonNull(fintoolReferenceData.getIsincode())) {
            fintoolBuilder.setIsincode(fintoolReferenceData.getIsincode());
        }

        if (Objects.nonNull(fintoolReferenceData.getRegcode())) {
            fintoolBuilder.setRegcode(fintoolReferenceData.getRegcode());
        }

        if (Objects.nonNull(fintoolReferenceData.getBondseries())) {
            fintoolBuilder.setBondseries(fintoolReferenceData.getBondseries());
        }

        if (Objects.nonNull(fintoolReferenceData.getHaveoffer())) {
            fintoolBuilder.setHaveoffer(DoubleValue.newBuilder().setValue(fintoolReferenceData.getHaveoffer()).build());
        }

        if (Objects.nonNull(fintoolReferenceData.getIsconvertible())) {
            fintoolBuilder.setIsconvertible(DoubleValue.newBuilder().setValue(fintoolReferenceData.getIsconvertible()).build());
        }

        if (Objects.nonNull(fintoolReferenceData.getIsguaranteed())) {
            fintoolBuilder.setIsguaranteed(Objects.nonNull(fintoolReferenceData.getIsguaranteed()) ? fintoolReferenceData.getIsguaranteed().toString() : "");
        }

        if (Objects.nonNull(fintoolReferenceData.getAccruedintcalctype())) {
            fintoolBuilder.setAccruedintcalctype(DoubleValue.newBuilder().setValue(fintoolReferenceData.getAccruedintcalctype()).build());
        }

        if (Objects.nonNull(fintoolReferenceData.getHavedefault())) {
            fintoolBuilder.setHavedefault(DoubleValue.newBuilder().setValue(fintoolReferenceData.getHavedefault()).build());
        }

        if (Objects.nonNull(fintoolReferenceData.getIslombardcbrnrd())) {
            fintoolBuilder.setIslombardcbrNrd(Int32Value.newBuilder().setValue(fintoolReferenceData.getIslombardcbrnrd()).build());
        }

        if (Objects.nonNull(fintoolReferenceData.getIsqualifiednrd())) {
            fintoolBuilder.setIsqualifiedNrd(Int32Value.newBuilder().setValue(fintoolReferenceData.getIsqualifiednrd()).build());
        }

        if (Objects.nonNull(fintoolReferenceData.getFormarketbondsnrd())) {
            fintoolBuilder.setFormarketbondsNrd(Int32Value.newBuilder().setValue(fintoolReferenceData.getFormarketbondsnrd()).build());
        }

        if (Objects.nonNull(fintoolReferenceData.getFractionnrd())) {
            fintoolBuilder.setFractionNrd(Int32Value.newBuilder().setValue(fintoolReferenceData.getFractionnrd()).build());
        }

        if (Objects.nonNull(fintoolReferenceData.getImporttime())) {
            fintoolBuilder.setImporttime(Int64Value.newBuilder().setValue(Timestamp.valueOf(fintoolReferenceData.getImporttime()).getTime()).build());
        }

        if (Objects.nonNull(fintoolReferenceData.getUpdatedate())) {
            fintoolBuilder.setUpdateDate(Int64Value.newBuilder().setValue(Timestamp.valueOf(fintoolReferenceData.getUpdatedate()).getTime()).build());
        }

        if (Objects.nonNull(fintoolReferenceData.getUpdatetime())) {
            fintoolBuilder.setUpdateTime(Int64Value.newBuilder().setValue(Timestamp.valueOf(fintoolReferenceData.getUpdatetime()).getTime()).build());
        }

        return fintoolBuilder.build();
    }
}
