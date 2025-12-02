
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * The type of report - conversion or payment.
 */
public enum ReportRequestReportTypeEnum {
    CONVERSION("conversion"),
    PAYMENT("payment");

    private final String value;

    ReportRequestReportTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


