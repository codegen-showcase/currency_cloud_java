
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Has the bank account been verified?
 */
public enum AccountsFindBodyBankAccountVerifiedEnum {
    FALSE("false"),
    NOT_REQUIRED("not required"),
    TRUE("true");

    private final String value;

    AccountsFindBodyBankAccountVerifiedEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


