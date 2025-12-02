
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Account status
 */
public enum AccountStatusEnum {
    DISABLED("disabled"),
    ENABLED("enabled"),
    ENABLED_NO_TRADING("enabled_no_trading");

    private final String value;

    AccountStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


