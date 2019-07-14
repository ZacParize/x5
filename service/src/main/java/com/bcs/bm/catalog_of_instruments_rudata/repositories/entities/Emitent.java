/*
 * Emitent.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */

package com.bcs.bm.catalog_of_instruments_rudata.repositories.entities;

import java.time.LocalDateTime;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "emitents")
@PrimaryKeyId("fininstid")
public class Emitent implements DefaultEntity {

    @Id
    private String id;
    private String clazz;
    private Long idemitent;
    private Long fininstid;
    private String inn;
    private String okpo;
    private String ogrn;
    private String code;
    private String sector;
    private String legaladdress;
    private String phone;
    private String www;
    private LocalDateTime updatedate;
    private LocalDateTime importtime;
    private String shortnamerus;
    private String shortnameeng;
    private String fullnamerus;
    private String fullnamerusnrd;
    private String fullnameengnrd;
    private String shortnamerusnrd;
    private String shortnameengnrd;
    private String companytypeshortname;
    private String stateregnum;
    private String stateregdate;
    private String stateregname;
    private String egruldate;
    private String egrulorganname;
    private String country;
    private String leicode;
    private String bik;
    private String fax;
    private String email;
    private String creditcmp;
    private String isbank4nonresident;
    private String kpp;
    private String okved;
    private String okopf;
    private String oktmo;
    private String okato;
    private String okogu;
    private String swift;
    private Integer countryoksm;
    private String countrynamerus;
    private String countrynameeng;
    private String regioninn;
    private String regionsoato;
    private String regionname;
    private Long sparkid;
    private String brfcsmregcode;
    private Double capital;
    private String capitalunit;
    private String oecdlvl;
    private String postaddress;
    private Integer haverating;
    private Integer haverisk;
    private Integer isfinorg;
    private Integer iscontrolbyfinorg;
    private Integer isgovorcb;
    private Integer onbehalfofstate;
    private Integer issubjectrf;
    private Integer iscisreg;
    private String issuernrd;
    private String tin;
    private String stateregnumber;
    private Long marketidnrd;
    private String marketnamerusnrd;
    private String marketnameengnrd;
    private String sprxentityid;
    private String spshortname;
    private String mdsshortname;
    private String mdsorgid;
    private String fchid;
    private String fchshortname;
    private Integer ismonopoly;
    private Integer isstrategic;
    private String ifolist;
    private Double isregion;
    private String sic;
    private String sector4212u;
    private String sna2008;

    @PersistenceConstructor
    public Emitent(String id, String clazz, LocalDateTime importtime) {
        this.id = id;
        this.clazz = clazz;
        this.importtime = importtime;
    }

    public String getPrimaryKey() {
        return fininstid.toString();
    }

    @Override
    public void init() {
        setId(getPrimaryKey());
        setClazz(StringUtils.lowerCase(getClass().getSimpleName()));
    }
}
