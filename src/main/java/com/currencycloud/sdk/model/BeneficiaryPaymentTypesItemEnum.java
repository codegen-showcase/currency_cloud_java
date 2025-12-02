
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * The payment type - regular (local) or priority (Swift).
 */
public enum BeneficiaryPaymentTypesItemEnum {
    PRIORITY("priority"),
    REGULAR("regular");

    private final String value;

    BeneficiaryPaymentTypesItemEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


