
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Local payment routing system. If supplied, routing_code_value_1 should also be supplied.
 */
public enum BeneficiariesValidateBodyRoutingCodeType1Enum {
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

    BeneficiariesValidateBodyRoutingCodeType1Enum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


