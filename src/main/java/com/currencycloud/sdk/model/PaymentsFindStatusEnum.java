
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Payment status
 */
public enum PaymentsFindStatusEnum {
    AUTHORISED("authorised"),
    AWAITING_AUTHORISATION("awaiting_authorisation"),
    COMPLETED("completed"),
    DELETED("deleted"),
    FAILED("failed"),
    NEW("new"),
    READY_TO_SEND("ready_to_send"),
    RELEASED("released"),
    SUBMITTED("submitted"),
    SUSPENDED("suspended");

    private final String value;

    PaymentsFindStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


