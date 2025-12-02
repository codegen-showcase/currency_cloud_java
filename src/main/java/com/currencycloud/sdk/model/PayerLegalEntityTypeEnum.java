
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Payer's entity type - company or individual.
 */
public enum PayerLegalEntityTypeEnum {
    COMPANY("company"),
    INDIVIDUAL("individual");

    private final String value;

    PayerLegalEntityTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


