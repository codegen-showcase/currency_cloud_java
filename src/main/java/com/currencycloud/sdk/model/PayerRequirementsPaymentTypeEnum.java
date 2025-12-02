
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Type of payment - regular (local) or priority (Swift).
 */
public enum PayerRequirementsPaymentTypeEnum {
    PRIORITY("priority"),
    REGULAR("regular");

    private final String value;

    PayerRequirementsPaymentTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


