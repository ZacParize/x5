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
@Document(collection = "corporate_action_kindgroups")
@PrimaryKeyId({"code"})
public class CorporateActionKindGroups implements DefaultEntity {

    @Id
    private String id;
    private String clazz;
    private LocalDateTime importtime;
    private String code;
    private String namerus;
    private String nameeng;
    private Long ordergroup;
    private LocalDateTime updatedate;

    @PersistenceConstructor
    public CorporateActionKindGroups(String id, String clazz, LocalDateTime importtime) {
        this.id = id;
        this.clazz = clazz;
        this.importtime = importtime;
    }

    @Override
    public String getPrimaryKey() {
        return code;
    }

    @Override
    public void init() {
        setId(getPrimaryKey());
        setClazz(StringUtils.lowerCase(getClass().getSimpleName()));
    }
}
