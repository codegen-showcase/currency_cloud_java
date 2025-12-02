
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Status of the report.
 */
public enum ReportsFindReportRequestsStatusEnum {
    COMPLETED("completed"),
    EXPIRED("expired"),
    FAILED("failed"),
    PROCESSING("processing");

    private final String value;

    ReportsFindReportRequestsStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


