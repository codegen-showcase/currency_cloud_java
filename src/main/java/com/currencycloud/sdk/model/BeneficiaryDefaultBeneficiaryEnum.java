
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Payments are made automatically to default beneficiaries when a beneficiary is not specified.
 */
public enum BeneficiaryDefaultBeneficiaryEnum {
    FALSE("false"),
    TRUE("true");

    private final String value;

    BeneficiaryDefaultBeneficiaryEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


