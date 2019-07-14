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
@Document(collection = "info_currencies")
@PrimaryKeyId("id")
public class InfoCurrencies implements DefaultEntity {

    @Id
    private String id;
    private String clazz;
    private LocalDateTime importtime;
    private String code;
    private Integer isonumber;
    private String namerus;
    private String fullnamerus;
    private String begdate;
    private String enddate;
    private LocalDateTime updatedate;

    @PersistenceConstructor
    public InfoCurrencies(String id, String clazz, LocalDateTime importtime) {
        this.id = id;
        this.clazz = clazz;
        this.importtime = importtime;
    }

    @Override
    public String getPrimaryKey() {
        return id;
    }

    @Override
    public void init() {
        setClazz(StringUtils.lowerCase(getClass().getSimpleName()));
    }
}
