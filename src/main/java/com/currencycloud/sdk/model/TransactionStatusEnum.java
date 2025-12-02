
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Transaction status
 */
public enum TransactionStatusEnum {
    COMPLETED("completed"),
    DELETED("deleted"),
    DEPENDING("depending");

    private final String value;

    TransactionStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


