/*
 * EmitentBuilder.java
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

import com.google.protobuf.DoubleValue;
import com.google.protobuf.Int32Value;
import com.google.protobuf.Int64Value;

@Component(EmitentConverter.NAME)
public class EmitentConverter implements Converter<com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.Emitent, com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Emitent> {

    public static final String NAME = "emitentConverter";
    private static final FastDateFormat FORMATTER_MS = FastDateFormat.getInstance("yyyy-MM-dd'T'hh:mm:ss.SSS");
    private static final FastDateFormat FORMATTER_SEC = FastDateFormat.getInstance("yyyy-MM-dd'T'hh:mm:ss");

    @Override
    @SneakyThrows({ParseException.class})
    public com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Emitent convert(com.bcs.bm.catalog_of_instruments_rudata.repositories.entities.Emitent emitent) {
        com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Emitent.Builder emitentBuilder = com.bcs.bm.catalog_of_instruments_rudata.client.grpc.Emitent.newBuilder();

        emitentBuilder.setFininstid(emitent.getFininstid());
        emitentBuilder.setInn(StringUtils.isNotBlank(emitent.getInn()) ? emitent.getInn() : "");
        emitentBuilder.setOkpo(StringUtils.isNotBlank(emitent.getOkpo()) ? emitent.getOkpo() : "");
        emitentBuilder.setOgrn(StringUtils.isNotBlank(emitent.getOgrn()) ? emitent.getOgrn() : "");
        emitentBuilder.setCode(StringUtils.isNotBlank(emitent.getCode()) ? emitent.getCode() : "");
        emitentBuilder.setSector(StringUtils.isNotBlank(emitent.getSector()) ? emitent.getSector() : "");
        emitentBuilder.setLegalAddress(StringUtils.isNotBlank(emitent.getLegaladdress()) ? emitent.getLegaladdress() : "");
        emitentBuilder.setPhone(StringUtils.isNotBlank(emitent.getPhone()) ? emitent.getPhone() : "");
        emitentBuilder.setWww(StringUtils.isNotBlank(emitent.getWww()) ? emitent.getWww() : "");
        emitentBuilder.setUpdateDate(Timestamp.valueOf(emitent.getUpdatedate()).getTime());
        emitentBuilder.setShortnameRus(StringUtils.isNotBlank(emitent.getShortnamerus()) ? emitent.getShortnamerus() : "");
        emitentBuilder.setShortnameEng(StringUtils.isNotBlank(emitent.getShortnameeng()) ? emitent.getShortnameeng() : "");
        emitentBuilder.setFullnameRus(StringUtils.isNotBlank(emitent.getFullnamerus()) ? emitent.getFullnamerus() : "");
        emitentBuilder.setFullnameRusNrd(StringUtils.isNotBlank(emitent.getFullnamerusnrd()) ? emitent.getFullnamerusnrd() : "");
        emitentBuilder.setFullnameEngNrd(StringUtils.isNotBlank(emitent.getFullnameengnrd()) ? emitent.getFullnameengnrd() : "");
        emitentBuilder.setShortnameRusNrd(StringUtils.isNotBlank(emitent.getShortnamerusnrd()) ? emitent.getShortnamerusnrd() : "");
        emitentBuilder.setShortnameEngNrd(StringUtils.isNotBlank(emitent.getShortnameengnrd()) ? emitent.getShortnameengnrd() : "");
        emitentBuilder.setCompanyTypeShortName(StringUtils.isNotBlank(emitent.getCompanytypeshortname()) ? emitent.getCompanytypeshortname() : "");
        emitentBuilder.setStateRegNum(StringUtils.isNotBlank(emitent.getStateregnum()) ? emitent.getStateregnum() : "");

        if (StringUtils.isNotBlank(emitent.getStateregdate())) {
            if (emitent.getStateregdate().contains(".")) {
                emitentBuilder.setStateRegDate(Int64Value.newBuilder().setValue(FORMATTER_MS.parse(emitent.getStateregdate()).getTime()).build());
            } else {
                emitentBuilder.setStateRegDate(Int64Value.newBuilder().setValue(FORMATTER_SEC.parse(emitent.getStateregdate()).getTime()).build());
            }
        }

        emitentBuilder.setStateRegName(StringUtils.isNotBlank(emitent.getStateregname()) ? emitent.getStateregname() : "");
        emitentBuilder.setEgrulOrganName(StringUtils.isNotBlank(emitent.getEgrulorganname()) ? emitent.getEgrulorganname() : "");

        if (StringUtils.isNotBlank(emitent.getEgruldate())) {
            if (emitent.getEgruldate().contains(".")) {
                emitentBuilder.setEgrulDate(Int64Value.newBuilder().setValue(FORMATTER_MS.parse(emitent.getEgruldate()).getTime()).build());
            } else {
                emitentBuilder.setEgrulDate(Int64Value.newBuilder().setValue(FORMATTER_SEC.parse(emitent.getEgruldate()).getTime()).build());
            }
        }

        emitentBuilder.setCountry(StringUtils.isNotBlank(emitent.getCountry()) ? emitent.getCountry() : "");
        emitentBuilder.setLeiCode(StringUtils.isNotBlank(emitent.getLeicode()) ? emitent.getLeicode() : "");
        emitentBuilder.setBik(StringUtils.isNotBlank(emitent.getBik()) ? emitent.getBik() : "");
        emitentBuilder.setFax(StringUtils.isNotBlank(emitent.getFax()) ? emitent.getFax() : "");
        emitentBuilder.setEMail(StringUtils.isNotBlank(emitent.getEmail()) ? emitent.getEmail() : "");
        emitentBuilder.setCreditCmp(StringUtils.isNotBlank(emitent.getCreditcmp()) ? emitent.getCreditcmp() : "");
        emitentBuilder.setIsBank4NonResident(StringUtils.isNotBlank(emitent.getIsbank4nonresident()) ? emitent.getIsbank4nonresident() : "");
        emitentBuilder.setKpp(StringUtils.isNotBlank(emitent.getKpp()) ? emitent.getKpp() : "");
        emitentBuilder.setOkved(StringUtils.isNotBlank(emitent.getOkved()) ? emitent.getOkved() : "");
        emitentBuilder.setOkopf(StringUtils.isNotBlank(emitent.getOkopf()) ? emitent.getOkopf() : "");
        emitentBuilder.setOktmo(StringUtils.isNotBlank(emitent.getOktmo()) ? emitent.getOktmo() : "");
        emitentBuilder.setOkato(StringUtils.isNotBlank(emitent.getOkato()) ? emitent.getOkato() : "");
        emitentBuilder.setOkogu(StringUtils.isNotBlank(emitent.getOkogu()) ? emitent.getOkogu() : "");
        emitentBuilder.setSwift(StringUtils.isNotBlank(emitent.getSwift()) ? emitent.getSwift() : "");

        if (Objects.nonNull(emitent.getCountryoksm())) {
            emitentBuilder.setCountryOksm(Int32Value.newBuilder().setValue(emitent.getCountryoksm()).build());
        }

        emitentBuilder.setCountryNameRus(StringUtils.isNotBlank(emitent.getCountrynamerus()) ? emitent.getCountrynamerus() : "");
        emitentBuilder.setCountryNameEng(StringUtils.isNotBlank(emitent.getCountrynameeng()) ? emitent.getCountrynameeng() : "");
        emitentBuilder.setRegionInn(StringUtils.isNotBlank(emitent.getRegioninn()) ? emitent.getRegioninn() : "");
        emitentBuilder.setRegionSoato(StringUtils.isNotBlank(emitent.getRegionsoato()) ? emitent.getRegionsoato() : "");
        emitentBuilder.setRegionName(StringUtils.isNotBlank(emitent.getRegionname()) ? emitent.getRegionname() : "");

        if (Objects.nonNull(emitent.getSparkid())) {
            emitentBuilder.setSparkid(Int64Value.newBuilder().setValue(emitent.getSparkid()).build());
        }

        emitentBuilder.setBrFcsmRegCode(StringUtils.isNotBlank(emitent.getBrfcsmregcode()) ? emitent.getBrfcsmregcode() : "");

        if (Objects.nonNull(emitent.getCapital())) {
            emitentBuilder.setCapital(DoubleValue.newBuilder().setValue(emitent.getCapital()).build());
        }

        emitentBuilder.setCapitalUnit(StringUtils.isNotBlank(emitent.getCapitalunit()) ? emitent.getCapitalunit() : "");
        emitentBuilder.setOecdLvl(StringUtils.isNotBlank(emitent.getOecdlvl()) ? emitent.getOecdlvl() : "");
        emitentBuilder.setPostAddress(StringUtils.isNotBlank(emitent.getPostaddress()) ? emitent.getPostaddress() : "");

        if (Objects.nonNull(emitent.getHaverating())) {
            emitentBuilder.setHaveRating(Int32Value.newBuilder().setValue(emitent.getHaverating()).build());
        }

        if (Objects.nonNull(emitent.getHaverisk())) {
            emitentBuilder.setHaveRisk(Int32Value.newBuilder().setValue(emitent.getHaverisk()).build());
        }

        if (Objects.nonNull(emitent.getIsfinorg())) {
            emitentBuilder.setIsFinorg(Int32Value.newBuilder().setValue(emitent.getIsfinorg()).build());
        }

        if (Objects.nonNull(emitent.getIscontrolbyfinorg())) {
            emitentBuilder.setIsControlByFinorg(Int32Value.newBuilder().setValue(emitent.getIscontrolbyfinorg()).build());
        }

        if (Objects.nonNull(emitent.getIsgovorcb())) {
            emitentBuilder.setIsGovOrCb(Int32Value.newBuilder().setValue(emitent.getIsgovorcb()).build());
        }

        if (Objects.nonNull(emitent.getOnbehalfofstate())) {
            emitentBuilder.setOnBehalfOfState(Int32Value.newBuilder().setValue(emitent.getOnbehalfofstate()).build());
        }

        if (Objects.nonNull(emitent.getIssubjectrf())) {
            emitentBuilder.setIsSubjectrf(Int32Value.newBuilder().setValue(emitent.getIssubjectrf()).build());
        }

        if (Objects.nonNull(emitent.getIscisreg())) {
            emitentBuilder.setIsCisReg(Int32Value.newBuilder().setValue(emitent.getIscisreg()).build());
        }

        emitentBuilder.setIssuerNrd(StringUtils.isNotBlank(emitent.getIssuernrd()) ? emitent.getIssuernrd() : "");
        emitentBuilder.setTin(StringUtils.isNotBlank(emitent.getTin()) ? emitent.getTin() : "");
        emitentBuilder.setStateRegNumber(StringUtils.isNotBlank(emitent.getStateregnumber()) ? emitent.getStateregnumber() : "");

        if (Objects.nonNull(emitent.getMarketidnrd())) {
            emitentBuilder.setMarketIdNrd(Int64Value.newBuilder().setValue(emitent.getMarketidnrd()).build());
        }

        emitentBuilder.setMarketNameRusNrd(StringUtils.isNotBlank(emitent.getMarketnamerusnrd()) ? emitent.getMarketnamerusnrd() : "");
        emitentBuilder.setMarketNameEngNrd(StringUtils.isNotBlank(emitent.getMarketnameengnrd()) ? emitent.getMarketnameengnrd() : "");
        emitentBuilder.setSpRxEntityId(StringUtils.isNotBlank(emitent.getSprxentityid()) ? emitent.getSprxentityid() : "");
        emitentBuilder.setSpShortname(StringUtils.isNotBlank(emitent.getSpshortname()) ? emitent.getSpshortname() : "");
        emitentBuilder.setMdsOrgId(StringUtils.isNotBlank(emitent.getMdsorgid()) ? emitent.getMdsorgid() : "");
        emitentBuilder.setFchId(StringUtils.isNotBlank(emitent.getFchid()) ? emitent.getFchid() : "");
        emitentBuilder.setFchShortname(StringUtils.isNotBlank(emitent.getFchshortname()) ? emitent.getFchshortname() : "");

        if (Objects.nonNull(emitent.getIsmonopoly())) {
            emitentBuilder.setIsMonopoly(Int32Value.newBuilder().setValue(emitent.getIsmonopoly()).build());
        }

        if (Objects.nonNull(emitent.getIsstrategic())) {
            emitentBuilder.setIsStrategic(Int32Value.newBuilder().setValue(emitent.getIsstrategic()).build());
        }

        emitentBuilder.setIfoList(StringUtils.isNotBlank(emitent.getIfolist()) ? emitent.getIfolist() : "");

        if (Objects.nonNull(emitent.getIsregion())) {
            emitentBuilder.setIsregion(DoubleValue.newBuilder().setValue(emitent.getIsregion()).build());
        }

        if (Objects.nonNull(emitent.getIdemitent())) {
            emitentBuilder.setIdEmitent(Int64Value.newBuilder().setValue(emitent.getIdemitent()).build());
        }

        emitentBuilder.setSic(StringUtils.isNotBlank(emitent.getSic()) ? emitent.getSic() : "");
        emitentBuilder.setSector4212U(StringUtils.isNotBlank(emitent.getSector4212u()) ? emitent.getSector4212u() : "");
        emitentBuilder.setSna2008(StringUtils.isNotBlank(emitent.getSna2008()) ? emitent.getSna2008() : "");

        return emitentBuilder.build();
    }
}