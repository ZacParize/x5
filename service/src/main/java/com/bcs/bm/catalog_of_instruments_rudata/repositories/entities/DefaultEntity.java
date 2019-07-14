/*
 * DefaultEntity.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */

package com.bcs.bm.catalog_of_instruments_rudata.repositories.entities;

import java.time.LocalDateTime;

public interface DefaultEntity {
    String getId();
    String getPrimaryKey();
    void setId(String id);
    String getClazz();
    void setClazz(String type);
    LocalDateTime getUpdatedate();
    LocalDateTime getImporttime();
    void setImporttime(LocalDateTime importtime);
    default void init() {}
}
