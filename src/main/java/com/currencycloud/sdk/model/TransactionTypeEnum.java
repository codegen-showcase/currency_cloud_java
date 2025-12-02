
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Type (debit or credit).
 */
public enum TransactionTypeEnum {
    CREDIT("credit"),
    DEBIT("debit");

    private final String value;

    TransactionTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


