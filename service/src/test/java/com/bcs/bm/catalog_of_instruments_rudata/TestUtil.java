/*
 * TestUtil.java
 *
 * Copyright 2017-2018 BCS-Technologies. All Rights Reserved.
 *
 * This software is the proprietary information of BCS-Technologies.
 * Use is subject to license terms.
 */

package com.bcs.bm.catalog_of_instruments_rudata;

import java.time.Duration;

import com.bcs.bm.catalog_of_instruments_rudata.configurations.RuDataInfo;
import com.bcs.bm.catalog_of_instruments_rudata.configurations.ServiceProperties;
import com.bcs.bm.catalog_of_instruments_rudata.configurations.SubscriptionInfo;

public class TestUtil {

    public static ServiceProperties getDefaultProperties() {
        return new ServiceProperties(new RuDataInfo("localhost", "login", "password", Duration.ofMinutes(5L), 8010), new SubscriptionInfo(false));
    }

}
