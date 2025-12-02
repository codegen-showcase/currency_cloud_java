
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Sort results in ascending or descending order.
 */
public enum TransactionsFindOrderAscDescEnum {
    ASC("asc"),
    DESC("desc");

    private final String value;

    TransactionsFindOrderAscDescEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


