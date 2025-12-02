
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Has the bank account been verified?
 */
public enum AccountBankAccountVerifiedEnum {
    NOT_REQUIRED("not required");

    private final String value;

    AccountBankAccountVerifiedEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


