package com.bcs.bm.catalog_of_instruments_rudata.repositories.entities;

import java.time.LocalDateTime;
import java.util.Objects;

import javax.persistence.Id;

import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "bond_convertation")
@PrimaryKeyId({"idfintool", "idfintoolalter"})
public class BondConvertation implements DefaultEntity {

    @Id
    private String id;
    private String clazz;
    private LocalDateTime importtime;
    private Long idfintool;
    private Long idfintoolalter;
    private String begconvdate;
    private String endconvdate;
    private Double coefficient;
    private LocalDateTime updatedate;

    @PersistenceConstructor
    public BondConvertation(String id, String clazz, LocalDateTime importtime) {
        this.id = id;
        this.clazz = clazz;
        this.importtime = importtime;
    }

    @Override
    public String getPrimaryKey() {
        final StringBuilder builder = new StringBuilder();
        return builder.append(Objects.nonNull(idfintool) ? idfintool.toString() : "").append('#')
                .append(Objects.nonNull(idfintoolalter) ? idfintoolalter.toString() : "").toString();
    }

    @Override
    public void init() {
        setId(getPrimaryKey());
        setClazz(getClass().getSimpleName().toLowerCase());
    }
}
