
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * "Own" account, "clients" sub-accounts, or "all" accounts.
 */
public enum BalancesFindScopeEnum {
    ALL("all"),
    CLIENTS("clients"),
    OWN("own");

    private final String value;

    BalancesFindScopeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


