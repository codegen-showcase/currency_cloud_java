
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Routing system for regular (local) payments.
 */
public enum SettlementAccountRoutingCodeType1Enum {
    ABA("aba"),
    BANK_CODE("bank_code"),
    BRANCH_CODE("branch_code"),
    BSB_CODE("bsb_code"),
    CLABE("clabe"),
    CNAPS("cnaps"),
    IFSC("ifsc"),
    INSTITUTION_NO("institution_no"),
    SORT_CODE("sort_code");

    private final String value;

    SettlementAccountRoutingCodeType1Enum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


