
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * The account verification result - 'full_match', 'close_match' or 'no_match'.
 */
public enum BeneficiaryAccountVerificationResultAnswerEnum {
    CLOSE_MATCH("close_match"),
    FULL_MATCH("full_match"),
    NO_MATCH("no_match");

    private final String value;

    BeneficiaryAccountVerificationResultAnswerEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


