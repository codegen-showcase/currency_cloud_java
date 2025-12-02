
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Which currency is fixed -  the buy or sell one.
 */
public enum RateDetailedFixedSideEnum {
    BUY("buy"),
    SELL("sell");

    private final String value;

    RateDetailedFixedSideEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


