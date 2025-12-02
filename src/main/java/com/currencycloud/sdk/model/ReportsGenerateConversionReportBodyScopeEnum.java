
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Specify which account level will be used - 'own' is the default.
 */
public enum ReportsGenerateConversionReportBodyScopeEnum {
    ALL("all"),
    CLIENTS("clients"),
    OWN("own");

    private final String value;

    ReportsGenerateConversionReportBodyScopeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


