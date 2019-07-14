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
@Document(collection = "share_dividends")
@PrimaryKeyId({"fintoolid", "devorgan", "perioddate"})
public class ShareDividend implements DefaultEntity {

    @Id
    private String id;
    private String clazz;
    private LocalDateTime importtime;
    private Long fintoolid;
    private String decisiondate;
    private String declaredpaydate;
    private String declaredpaydatenominee;
    private Double declaredsumdividval;
    private Integer devorgan;
    private String listdate;
    private String listdividenddate;
    private String note;
    private String payed;
    private Double paystock;
    private String periodshortname;
    private String perioddate;
    private String protocoldate;
    private String reportpaydate;
    private Double sumdividval;
    private LocalDateTime updatedate;

    @PersistenceConstructor
    public ShareDividend(String id, String clazz, LocalDateTime importtime) {
        this.id = id;
        this.clazz = clazz;
        this.importtime = importtime;
    }

    @Override
    public String getPrimaryKey() {
        final StringBuilder builder = new StringBuilder();
        return builder.append(Objects.nonNull(fintoolid) ? fintoolid.toString() : "")
                .append('#').append(Objects.nonNull(devorgan) ? devorgan.toString() : "")
                .append('#').append(Objects.nonNull(perioddate) ? perioddate : "").toString();
    }

    @Override
    public void init() {
        setId(getPrimaryKey());
        setClazz(StringUtils.lowerCase(getClass().getSimpleName()));
    }
}
