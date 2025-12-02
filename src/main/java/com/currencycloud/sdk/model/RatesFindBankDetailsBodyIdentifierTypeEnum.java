
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * The type of code used to identify the account (e.g. IBAN).
 */
public enum RatesFindBankDetailsBodyIdentifierTypeEnum {
    ABA("aba"),
    BIC_SWIFT("bic_swift"),
    BSB_CODE("bsb_code"),
    CNAPS("cnaps"),
    IBAN("iban"),
    IFSC("ifsc"),
    ROUTING_NUMBER("routing_number"),
    SORT_CODE("sort_code");

    private final String value;

    RatesFindBankDetailsBodyIdentifierTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


