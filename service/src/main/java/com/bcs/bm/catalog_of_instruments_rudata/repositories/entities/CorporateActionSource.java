/*
 * CorporateActionSources.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */

package com.bcs.bm.catalog_of_instruments_rudata.repositories.entities;

import java.time.LocalDateTime;

import javax.persistence.Id;

import org.apache.commons.lang3.StringUtils;
import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "corporate_action_sources")
@PrimaryKeyId({"code"})
public class CorporateActionSource implements DefaultEntity {

    @Id
    private String id;
    private String clazz;
    private LocalDateTime importtime;
    private String code;
    private String namerus;
    private String nameeng;
    private LocalDateTime updatedate;

    @PersistenceConstructor
    public CorporateActionSource(String id, String clazz, LocalDateTime importtime) {
        this.id = id;
        this.clazz = clazz;
        this.importtime = importtime;
        this.updatedate = this.importtime;
    }

    @Override
    public String getPrimaryKey() {
        return code;
    }

    public void setImporttime(LocalDateTime importtime) {
        this.importtime = importtime;
        this.updatedate = this.importtime;
    }

    @Override
    public void init() {
        setId(code);
        setClazz(StringUtils.lowerCase(getClass().getSimpleName()));
    }
}
