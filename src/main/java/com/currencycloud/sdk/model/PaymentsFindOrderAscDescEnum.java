
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Sort records in ascending or descending order.
 */
public enum PaymentsFindOrderAscDescEnum {
    ASC("asc"),
    DESC("desc");

    private final String value;

    PaymentsFindOrderAscDescEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


