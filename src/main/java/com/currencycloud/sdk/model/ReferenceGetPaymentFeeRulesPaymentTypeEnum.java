
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Payment type value. Limits the search results to payments of the specified payment type - 'priority'(Swift) or 'regular'(local).
 */
public enum ReferenceGetPaymentFeeRulesPaymentTypeEnum {
    PRIORITY("priority"),
    REGULAR("regular");

    private final String value;

    ReferenceGetPaymentFeeRulesPaymentTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


