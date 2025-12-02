
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Conversion status.
 */
public enum ConversionsFindStatusEnum {
    AWAITING_FUNDS("awaiting_funds"),
    CLOSED("closed"),
    FUNDS_ARRIVED("funds_arrived"),
    FUNDS_SENT("funds_sent"),
    TRADE_SETTLED("trade_settled");

    private final String value;

    ConversionsFindStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


