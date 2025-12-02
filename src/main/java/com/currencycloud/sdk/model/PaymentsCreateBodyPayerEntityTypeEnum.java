
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Legal entity
 */
public enum PaymentsCreateBodyPayerEntityTypeEnum {
    COMPANY("company"),
    INDIVIDUAL("individual");

    private final String value;

    PaymentsCreateBodyPayerEntityTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


