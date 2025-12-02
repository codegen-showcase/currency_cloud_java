
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Whether the order is ascending (asc) or descending (desc).
 */
public enum ConversionsProfitAndLossOrderAscDescEnum {
    ASC("asc"),
    DESC("desc");

    private final String value;

    ConversionsProfitAndLossOrderAscDescEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


