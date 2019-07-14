/*
 * Column.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */

package com.bcs.bm.catalog_of_instruments_rudata.components;


import javax.validation.constraints.NotBlank;

import org.springframework.validation.annotation.Validated;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import com.google.common.base.CaseFormat;

@Getter
@ToString
@EqualsAndHashCode
@Validated
public class RuDataColumn {

    @NotBlank
    private final String name;

    @NotBlank
    private final String type;

    public RuDataColumn(String name, String type) {
        this.name = CaseFormat.UPPER_UNDERSCORE.to(CaseFormat.LOWER_CAMEL, name);
        this.type = type;
    }

}
