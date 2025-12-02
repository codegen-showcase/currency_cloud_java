
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Payment Charges Setting value (only applicable to Swift payments). Limits the search results to payments of the specified <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430820-Selecting-payment-charges-for-SWIFT-payments-FAQ">charge type</a>.
 */
public enum PaymentsFindChargeTypeEnum {
    OURS("ours"),
    SHARED("shared");

    private final String value;

    PaymentsFindChargeTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


