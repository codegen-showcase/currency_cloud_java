
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Status of the account.
 */
public enum AccountsUpdateBodyStatusEnum {
    DISABLED("disabled"),
    ENABLED("enabled"),
    ENABLED_NO_TRADING("enabled_no_trading");

    private final String value;

    AccountsUpdateBodyStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


