
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * The type of payment - 'priority' (Swift) or 'regular' (local).
 */
public enum BeneficiaryRequirementsPaymentTypeEnum {
    PRIORITY("priority"),
    REGULAR("regular");

    private final String value;

    BeneficiaryRequirementsPaymentTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


