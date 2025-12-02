
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * The type of SSI to be returned, priority (Swift) or regular (local). A null value returns all payment types.
 */
public enum FundingFindAccountsPaymentTypeEnum {
    PRIORITY("priority"),
    REGULAR("regular");

    private final String value;

    FundingFindAccountsPaymentTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


