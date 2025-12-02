
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Allows you to trigger approval or rejection behaviour.
 */
public enum DemoSimulateFundingBodyActionEnum {
    APPROVE("approve"),
    REJECT("reject");

    private final String value;

    DemoSimulateFundingBodyActionEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


