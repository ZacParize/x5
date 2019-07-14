/*
 * Token.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */

package com.bcs.bm.catalog_of_instruments_rudata.aspects;

import java.time.LocalDateTime;
import java.time.temporal.TemporalAmount;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import org.apache.commons.lang3.StringUtils;
import org.springframework.validation.annotation.Validated;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@EqualsAndHashCode
@Validated
public class Token {

    public static final Token DEFAULT_TOKEN = new Token(null, null, null ,null);

    @NotBlank
    private final String name;
    @NotBlank
    private final String value;
    @NotNull
    private final LocalDateTime obtainTime;
    @NotNull
    private final TemporalAmount lifetime;

    public Token(String name, String value, LocalDateTime obtainTime, TemporalAmount lifetime) {
        this.name = StringUtils.lowerCase(name);
        this.value = value;
        this.obtainTime = obtainTime;
        this.lifetime = lifetime;
    }

    public boolean isValid() {
        return obtainTime.plus(lifetime).isAfter(LocalDateTime.now());
    }
}
