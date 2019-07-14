package com.bcs.bm.catalog_of_instruments_rudata.repositories.entities;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Id;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "bond_coupons")
@PrimaryKeyId({"idfintool", "idcoupon"})
public class BondCoupon implements DefaultEntity {

    @Id
    private String id;
    private String clazz;
    private LocalDateTime importtime;
    private Long idfintool;
    private Long idcoupon;
    private String beginperiod;
    private String endperiod;
    private Long couponperiod;
    private Long daysfromdist;
    private Double couponrate;
    private Double payperbond;
    private Double couponval;
    private String stoptradedate;
    private String paydate;
    private String couponratedate;
    private String fixdate;
    private LocalDateTime updatedate;
    private Double payperbondfrac;

    @PersistenceConstructor
    public BondCoupon(String id, String clazz, LocalDateTime importtime) {
        this.id = id;
        this.clazz = clazz;
        this.importtime = importtime;
    }

    @Override
    public String getPrimaryKey() {
        final StringBuilder builder = new StringBuilder();
        return builder.append(Objects.nonNull(idfintool) ? idfintool.toString() : "").append('#').append(Objects.nonNull(idcoupon) ? idcoupon.toString() : "").toString();
    }

    @Override
    public void init() {
        setId(getPrimaryKey());
        setClazz(StringUtils.lowerCase(getClass().getSimpleName()));
    }
}
