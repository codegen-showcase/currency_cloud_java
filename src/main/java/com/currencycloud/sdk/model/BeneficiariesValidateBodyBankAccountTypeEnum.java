
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Bank account type.
 */
public enum BeneficiariesValidateBodyBankAccountTypeEnum {
    CHECKING("checking"),
    SAVINGS("savings");

    private final String value;

    BeneficiariesValidateBodyBankAccountTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


