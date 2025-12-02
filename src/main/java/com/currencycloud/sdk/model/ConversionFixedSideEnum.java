
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Which currency side is fixed -  the buy or sell one.
 */
public enum ConversionFixedSideEnum {
    BUY("buy"),
    SELL("sell");

    private final String value;

    ConversionFixedSideEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


