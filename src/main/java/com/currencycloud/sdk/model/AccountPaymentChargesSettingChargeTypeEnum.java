
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * The charge type - shared or ours.
 */
public enum AccountPaymentChargesSettingChargeTypeEnum {
    OURS("ours"),
    SHARED("shared");

    private final String value;

    AccountPaymentChargesSettingChargeTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


