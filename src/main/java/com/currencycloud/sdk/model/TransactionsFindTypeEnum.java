
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Whether the transaction debits or credits the account balance.
 */
public enum TransactionsFindTypeEnum {
    CREDIT("credit"),
    DEBIT("debit");

    private final String value;

    TransactionsFindTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


