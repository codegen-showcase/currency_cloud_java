
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Transaction status.
 */
public enum TransactionsFindStatusEnum {
    COMPLETED("completed"),
    DELETED("deleted"),
    PENDING("pending");

    private final String value;

    TransactionsFindStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


