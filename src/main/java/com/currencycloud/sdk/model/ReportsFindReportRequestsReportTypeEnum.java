
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Type of reports, that we expect to receive in search results.
 */
public enum ReportsFindReportRequestsReportTypeEnum {
    BENEFICIARY("beneficiary"),
    CONVERSION("conversion"),
    PAYMENT("payment"),
    TRANSACTION("transaction");

    private final String value;

    ReportsFindReportRequestsReportTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


