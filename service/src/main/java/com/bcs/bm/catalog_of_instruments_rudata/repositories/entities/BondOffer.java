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
@Document(collection = "bond_offers")
@PrimaryKeyId({"idfintool", "idoffer"})
public class BondOffer implements DefaultEntity {

    @Id
    private String id;
    private String clazz;
    private LocalDateTime importtime;
    private Long idfintool;
    private Long idoffer;
    private String begorder;
    private String endorder;
    private String offerdate;
    private String endofferdate;
    private Long daysfromdist;
    private String ratedate;
    private String operationtype;
    private Double buybackprice;
    private Double buybackvol;
    private LocalDateTime updatedate;
    private Long buybacklimitvol;
    private Long buybackbidvol;
    private Double buybackbidratio;

    @PersistenceConstructor
    public BondOffer(String id, String clazz, LocalDateTime importtime) {
        this.id = id;
        this.clazz = clazz;
        this.importtime = importtime;
    }

    @Override
    public String getPrimaryKey() {
        StringBuilder builder = new StringBuilder();
        return builder.append(Objects.nonNull(idfintool) ? idfintool.toString() : "").append('#').append(Objects.nonNull(idoffer) ? idoffer.toString() : "").toString();
    }

    @Override
    public void init() {
        setId(getPrimaryKey());
        setClazz(StringUtils.lowerCase(getClass().getSimpleName()));
    }
}
