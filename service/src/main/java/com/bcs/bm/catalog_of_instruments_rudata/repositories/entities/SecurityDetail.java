package com.bcs.bm.catalog_of_instruments_rudata.repositories.entities;

import java.time.LocalDateTime;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "security_detail")
@PrimaryKeyId("isin")
public class SecurityDetail implements DefaultEntity {

    @Id
    private String id;
    private String isin;
    private String clazz;
    private LocalDateTime importtime;
    private LocalDateTime updatedate;
    private Security security;
    private FintoolReferenceData fintoolReferenceData;
    private Emitent emitent;
    private List<ShareDividend> shareDividends;
    private List<BondAmortization> bondAmortizations;
    private List<BondConvertation> bondConvertations;
    private List<BondCoupon> bondCoupons;
    private BondMaturity bondMaturity;
    private List<BondOffer> bondOffers;
    private List<CorporateActionActions> corporateActionActions;

    @PersistenceConstructor
    public SecurityDetail(String id, String clazz, LocalDateTime importtime) {
        this.id = id;
        this.isin = this.id;
        this.clazz = clazz;
        this.importtime = importtime;
        this.updatedate = this.importtime;
    }

    @Override
    public String getPrimaryKey() {
        return isin;
    }

    @Override
    public void init() {
        setId(getPrimaryKey());
        setClazz(StringUtils.lowerCase(getClass().getSimpleName()));
    }
}
