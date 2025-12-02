
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Sort records in ascending or descending order.
 */
public enum FundingFindAccountsOrderAscDescEnum {
    ASC("asc"),
    DESC("desc");

    private final String value;

    FundingFindAccountsOrderAscDescEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


