
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * The type of account number provided (e.g. account number of IBAN).
 */
public enum FundingAccountAccountNumberTypeEnum {
    ACCOUNT_NUMBER("account_number"),
    IBAN("iban");

    private final String value;

    FundingAccountAccountNumberTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


