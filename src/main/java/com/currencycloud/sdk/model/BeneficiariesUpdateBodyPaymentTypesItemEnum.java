
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * BeneficiariesUpdateBodyPaymentTypesItemEnum
 */
public enum BeneficiariesUpdateBodyPaymentTypesItemEnum {
    PRIORITY("priority"),
    REGULAR("regular");

    private final String value;

    BeneficiariesUpdateBodyPaymentTypesItemEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


