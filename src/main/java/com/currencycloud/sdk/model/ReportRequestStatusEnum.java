
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * The status of the report
 */
public enum ReportRequestStatusEnum {
    COMPLETED("completed"),
    EXPIRED("expired"),
    FAILED("failed"),
    PROCESSING("processing");

    private final String value;

    ReportRequestStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


