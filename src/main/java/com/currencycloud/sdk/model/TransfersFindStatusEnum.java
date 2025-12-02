
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Transfer status
 */
public enum TransfersFindStatusEnum {
    CANCELLED("cancelled"),
    COMPLETED("completed"),
    PENDING("pending");

    private final String value;

    TransfersFindStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


