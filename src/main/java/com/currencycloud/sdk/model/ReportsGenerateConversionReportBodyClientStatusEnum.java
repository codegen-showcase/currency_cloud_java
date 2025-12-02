
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * The current status of the conversion.
 */
public enum ReportsGenerateConversionReportBodyClientStatusEnum {
    AWAITING_AUTHORISATION("awaiting_authorisation"),
    AWAITING_FUNDS("awaiting_funds"),
    CLOSED("closed"),
    FUNDS_ARRIVED("funds_arrived"),
    FUNDS_BEING_PROCESSED("funds_being_processed"),
    FUNDS_SENT("funds_sent"),
    TRADE_SETTLED("trade_settled"),
    TRADE_SETTLING("trade_settling");

    private final String value;

    ReportsGenerateConversionReportBodyClientStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


