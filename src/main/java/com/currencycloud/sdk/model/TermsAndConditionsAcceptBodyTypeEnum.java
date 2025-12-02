
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * The type of Terms of Use the user is accepting.
 */
public enum TermsAndConditionsAcceptBodyTypeEnum {
    VGSI("VGSI");

    private final String value;

    TermsAndConditionsAcceptBodyTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


