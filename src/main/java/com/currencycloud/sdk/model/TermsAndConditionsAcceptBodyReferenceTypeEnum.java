
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * The type of reference accepting the Terms of Use.
 */
public enum TermsAndConditionsAcceptBodyReferenceTypeEnum {
    ACCOUNT("ACCOUNT");

    private final String value;

    TermsAndConditionsAcceptBodyReferenceTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


