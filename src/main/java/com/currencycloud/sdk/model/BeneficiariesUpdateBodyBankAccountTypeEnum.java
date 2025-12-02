
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Bank account type.
 */
public enum BeneficiariesUpdateBodyBankAccountTypeEnum {
    CHECKING("checking"),
    SAVINGS("savings");

    private final String value;

    BeneficiariesUpdateBodyBankAccountTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


