
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Fix the buy or sell currency.
 */
public enum RatesGetDetailedFixedSideEnum {
    BUY("buy"),
    SELL("sell");

    private final String value;

    RatesGetDetailedFixedSideEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


