
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Whether results are sorted in ascending or descending order.
 */
public enum PaginationOrderAscDescEnum {
    ASC("asc"),
    DESC("desc");

    private final String value;

    PaginationOrderAscDescEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


