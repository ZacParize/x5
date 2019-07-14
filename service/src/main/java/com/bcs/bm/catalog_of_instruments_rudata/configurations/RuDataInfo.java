/*
 * RuDataInfo.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */

package com.bcs.bm.catalog_of_instruments_rudata.configurations;

import java.time.Duration;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;

import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.validation.annotation.Validated;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Validated
@RefreshScope
@AllArgsConstructor
@NoArgsConstructor
public class RuDataInfo {

    @NotBlank
    private String url;

    @NotBlank
    private String login;

    @NotBlank
    private String password;

    @NotNull
    private Duration tokenLifetime;

    @Positive
    private int serverPort;

}
