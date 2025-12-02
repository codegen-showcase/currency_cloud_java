
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * BeneficiariesValidateBodyPaymentTypesItemEnum
 */
public enum BeneficiariesValidateBodyPaymentTypesItemEnum {
    PRIORITY("priority"),
    REGULAR("regular");

    private final String value;

    BeneficiariesValidateBodyPaymentTypesItemEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


