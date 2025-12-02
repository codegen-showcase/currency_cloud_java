
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * BeneficiariesCreateBodyPaymentTypesItemEnum
 */
public enum BeneficiariesCreateBodyPaymentTypesItemEnum {
    PRIORITY("priority"),
    REGULAR("regular");

    private final String value;

    BeneficiariesCreateBodyPaymentTypesItemEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


