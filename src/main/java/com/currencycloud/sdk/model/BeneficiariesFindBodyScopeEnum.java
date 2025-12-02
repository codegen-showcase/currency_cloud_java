
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Search "own" account, "clients" sub-accounts, or "all" accounts.
 */
public enum BeneficiariesFindBodyScopeEnum {
    ALL("all"),
    CLIENTS("clients"),
    OWN("own");

    private final String value;

    BeneficiariesFindBodyScopeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


