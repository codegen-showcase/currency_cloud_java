
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Compliance review status - 'passed', 'in_review' or 'rejected'.
 */
public enum PaymentReviewStatusEnum {
    IN_REVIEW("in_review"),
    PASSED("passed"),
    REJECTED("rejected");

    private final String value;

    PaymentReviewStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


