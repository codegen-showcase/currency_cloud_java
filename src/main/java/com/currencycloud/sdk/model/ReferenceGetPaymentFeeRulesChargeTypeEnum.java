
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Payment charge value. Limits the search results to payments of the specified <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430820-Selecting-payment-charges-for-SWIFT-payments-FAQ">charge type</a> - 'ours' or 'shared'.
 */
public enum ReferenceGetPaymentFeeRulesChargeTypeEnum {
    OURS("ours"),
    SHARED("shared");

    private final String value;

    ReferenceGetPaymentFeeRulesChargeTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


