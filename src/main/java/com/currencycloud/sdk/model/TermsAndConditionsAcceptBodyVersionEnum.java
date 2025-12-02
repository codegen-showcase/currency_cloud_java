
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * The version of the Terms of Use the user is accepting.
 */
public enum TermsAndConditionsAcceptBodyVersionEnum {
    ENUM_1_0("1.0");

    private final String value;

    TermsAndConditionsAcceptBodyVersionEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


