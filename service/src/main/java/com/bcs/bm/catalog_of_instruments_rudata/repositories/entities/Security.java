/*
 * Security.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */

package com.bcs.bm.catalog_of_instruments_rudata.repositories.entities;

import java.time.LocalDateTime;
import java.util.Objects;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "securities")
@PrimaryKeyId("fintoolid")
public class Security implements DefaultEntity {

    @Id
    private String id;
    private String clazz;
    private Long fintoolid;
    private Long idfintool;
    private Long fininstid;
    private Long idemitent;
    private LocalDateTime updatedate;
    private LocalDateTime importtime;
    private String borrowerinn;
    private String borrowername;
    private String borrowersector;
    private Long borroweruid;
    private String cfi;
    private String couponrate;
    private Double couponsperyear;
    private String emitentshortnamerus;
    private String endmtydate;
    private Double facevalue;
    private String facevaluecurrency;
    private String fintooltype;
    private String fullnamerus;
    private String inn;
    private String isin;
    private Double issuevol;
    private String nsdservice;
    private String ogrn;
    private String okpo;
    private Double onquatro;
    private String quatroid;
    private String regcode;
    private String sector;
    private String securitykind;
    private String securitytype;
    private String shortnamerus;
    private String statusname;
    private int subtype;
    private int type;
    private String nrdcode;
    private String idiss;

    @PersistenceConstructor
    public Security(String id, String clazz, LocalDateTime importtime) {
        this.id = id;
        this.clazz = clazz;
        this.importtime = importtime;
    }

    public String getPrimaryKey() {
        return fintoolid.toString();
    }

    @Override
    public void init() {
        setId(getPrimaryKey());
        setClazz(StringUtils.lowerCase(getClass().getSimpleName()));

        setSubtype(0);
        setType(0);

        if (Objects.isNull(getFintooltype())) {
            return;
        }

        final String tempFintooltype = StringUtils.lowerCase(getFintooltype());
        switch (tempFintooltype) {
            case "облигация":
                if (StringUtils.equalsIgnoreCase(getSecuritytype(), "Гос")
                        && StringUtils.equalsIgnoreCase(getSecuritykind(), "Классические")
                        && StringUtils.startsWithAny(getShortnamerus(), "ОФЗ", "ГСО")) {
                    setSubtype(3);
                } else if (StringUtils.equalsIgnoreCase(getSecuritytype(), "Гос")
                        && StringUtils.equalsIgnoreCase(getSecuritykind(), "Классические")
                        && StringUtils.startsWithAny(getShortnamerus(), "ГКО")) {
                    setSubtype(4);
                } else if (StringUtils.equalsIgnoreCase(getSecuritytype(), "Гос")
                        && StringUtils.equalsIgnoreCase(getSecuritykind(), "Классические")
                        && StringUtils.startsWithAny(getShortnamerus(), "ОБР", "ОГСЗ")) {
                    setSubtype(5);
                } else if (StringUtils.equalsIgnoreCase(getSecuritytype(), "Корп")
                        && StringUtils.equalsAnyIgnoreCase(getSecuritykind(), "Классические", "Биржевые")) {
                    setSubtype(5);
                } else if (StringUtils.equalsIgnoreCase(getSecuritytype(), "ЕвроГос")
                        && StringUtils.equalsIgnoreCase(getSecuritykind(), "Классические")
                        && StringUtils.startsWithIgnoreCase(getSecuritykind(), "ОВВЗ")) {
                    setSubtype(5);
                } else if (StringUtils.equalsIgnoreCase(getSecuritytype(), "Муни")) {
                    setSubtype(7);
                } else if (StringUtils.equalsIgnoreCase(getSecuritytype(), "ЕвроМуни")) {
                    setSubtype(10);
                } else if (StringUtils.equalsIgnoreCase(getSecuritytype(), "ЕвроГос")
                            && StringUtils.equalsIgnoreCase(getSecuritykind(), "Классические")) {
                    if (StringUtils.equalsAnyIgnoreCase(getEmitentshortnamerus(), "Правительство РФ")) {
                        setSubtype(10);
                    } else {
                        setSubtype(20);
                    }
                } else if (StringUtils.equalsIgnoreCase(getSecuritytype(), "ЕвроКорп")) {
                    setSubtype(11);
                }
                break;

            case "акция":
                if (!StringUtils.startsWithAny(getIsin(), "RU")
                        || StringUtils.isBlank(getFacevaluecurrency())
                        || StringUtils.equalsIgnoreCase(getFacevaluecurrency(), "null")
                        || !StringUtils.equalsIgnoreCase(getFacevaluecurrency(), "RUB")) {
                    setSubtype(17);
                } else if (StringUtils.equalsIgnoreCase(getSecuritytype(), "Обыкн-ая")) {
                    setSubtype(1);
                } else if (!StringUtils.equalsIgnoreCase(getSecuritytype(), "Обыкн-ая")) {
                    setSubtype(2);
                }
                break;

            case "депозитарная расписка":
                if (StringUtils.equalsIgnoreCase(getSecuritytype(), "ADR")) {
                    setSubtype(8);
                } else if (StringUtils.equalsIgnoreCase(getSecuritytype(), "GDR")) {
                    setSubtype(9);
                } else if (StringUtils.equalsIgnoreCase(getSecuritytype(), "RDR")) {
                    setSubtype(19);
                }
                break;

            case "фонд":
            case "ипотечный сертификат":
                if (StringUtils.equalsAnyIgnoreCase(getSecuritytype(), "Интервальный", "Закрытый", "Открытый")) {
                    setSubtype(13);
                } else if (StringUtils.equalsIgnoreCase(getSecuritytype(), "ETF")) {
                    setSubtype(18);
                } else if (StringUtils.equalsAnyIgnoreCase(getSecuritytype(), "КСУ", "ИСУ")) {
                    setSubtype(21);
                }
                break;
        }

        switch (tempFintooltype) {
            case "облигация":
                if (getSubtype() == 3 || getSubtype() == 4 || getSubtype() == 5 || getSubtype() == 7) {
                    setType(2);
                } else if (getSubtype() == 10 || getSubtype() == 11 || getSubtype() == 20) {
                    setType(4);
                }
                break;

            case "акция":
                if (getSubtype() != 0) {
                    setType(1);
                }
                break;

            case "депозитарная расписка":
                if (StringUtils.equalsAnyIgnoreCase(getSecuritytype(), "ADR", "GDR", "RDR") && (getSubtype() != 0)) {
                    setType(3);
                }
                break;

            case "фонд":
            case "ипотечный сертификат":
                if (StringUtils.equalsAnyIgnoreCase(getSecuritytype(), "Интервальный", "Закрытый", "Открытый", "ETF", "КСУ", "ИСУ")) {
                    if (getSubtype() == 13 || getSubtype() == 18) {
                        setType(5);
                    } else if (getSubtype() == 21) {
                        setType(8);
                    }
                }
                break;
        }
    }
}
