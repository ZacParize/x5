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
@Document(collection = "bond_maturities")
@PrimaryKeyId("fintoolid")
public class BondMaturity implements DefaultEntity {

    @Id
    private String id;
    private String clazz;
    private LocalDateTime importtime;
    /**
     * Идентификатор облигации
     */
    private Long fintoolid;
    /**
     * ISIN код
     */
    private String isin;
    /**
     * Дата погашения номинала
     */
    private String mtydate;
    /**
     * Выплата на одну облигацию
     */
    private Double payperbond;
    /**
     * Дата/время последнего изменения записи
     */
    private LocalDateTime updatedate;

    @PersistenceConstructor
    public BondMaturity(String id, String clazz, LocalDateTime importtime) {
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
    }
}
