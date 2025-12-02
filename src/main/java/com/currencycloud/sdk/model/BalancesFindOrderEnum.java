
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * A field name to change the sort order - "created_at", "amount", "updated_at" or "currency".
 */
public enum BalancesFindOrderEnum {
    AMOUNT("amount"),
    CREATED_AT("created_at"),
    CURRENCY("currency"),
    UPDATED_AT("updated_at");

    private final String value;

    BalancesFindOrderEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


