
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * The field name to sort by - "created_at", "updated_at" or "completed_at". Defaults to "created_at" if not specified..<br>
 */
public enum TransfersFindOrderEnum {
    COMPLETED_AT("completed_at"),
    CREATED_AT("created_at"),
    UPDATED_AT("updated_at");

    private final String value;

    TransfersFindOrderEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


