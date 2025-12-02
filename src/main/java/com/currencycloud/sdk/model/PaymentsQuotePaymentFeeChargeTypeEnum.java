
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Payment Charges type. if no value is provided the account's default value is used.
 */
public enum PaymentsQuotePaymentFeeChargeTypeEnum {
    OURS("ours"),
    SHARED("shared");

    private final String value;

    PaymentsQuotePaymentFeeChargeTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


