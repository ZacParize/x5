package com.bcs.bm.catalog_of_instruments_rudata.repositories.entities;

import java.time.LocalDateTime;

import javax.persistence.Id;

import org.springframework.data.annotation.PersistenceConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Document(collection = "corporate_action_actions")
@PrimaryKeyId({"msgid"})
public class CorporateActionActions implements DefaultEntity {

    @Id
    private String id;
    private String clazz;
    private LocalDateTime importtime;
    private LocalDateTime updatedate;
    private Long msgid;
    private String actdate;
    private String msgtype;
    private String actid;
    private String actcode;
    private Long fintoolid;
    private String isin;
    private String regcode;
    private String nrdcode;
    private String nickname;
    private Long fininstid;
    private String issuername;
    private String issuerinn;
    private String issuerogrn;
    private String issuerokpo;
    private String issuerefircode;
    private String issuershortname;
    private String issuersector;
    private String eventeffdate;
    private String meetingdate;
    private String meetingform;
    private String voitingenddate;
    private String paydateplan;
    private String eventfixdate;
    private String eventddlndate;
    private String paydatefact;
    private String eventperbeg;
    private String eventperend;
    private String divsource;
    private Integer divyear;
    private String appperbeg;
    private String appperend;
    private String cancelperbeg;
    private String cancelperend;
    private String paymentperbeg;
    private String paymentperend;
    private Double divpaysumval;
    private Double divrecptsumval;
    private String pricetype;
    private Double pay1sec;
    private String сurrency;
    private Double value;
    private Double qtyaddsec;
    private Double qtyexsec;
    private Double qtynewsec;
    private String note;
    private String discagencycode;
    private Long disceventid;
    private Long disceventtypeid;
    private String disceventtype;
    private String disceventpublishdate;
    private String disceventtext;
    private String dealside1name;
    private String dealside1inn;
    private String dealside2name;
    private String dealside2inn;
    private String dealtype;
    private String dealcategory;
    private Double sharebefore;
    private Double shareafter;
    private String fio;
    private String position;
    private Double shareordbefore;
    private Double shareordafter;
    
    @PersistenceConstructor
    public CorporateActionActions(String id, String clazz, LocalDateTime importtime) {
        this.id = id;
        this.clazz = clazz;
        this.importtime = importtime;
    }

    @Override
    public String getPrimaryKey() {
        return msgid.toString();
    }

    @Override
    public void init() {
        setId(getPrimaryKey());
        setClazz(getClass().getSimpleName().toLowerCase());
    }
}
