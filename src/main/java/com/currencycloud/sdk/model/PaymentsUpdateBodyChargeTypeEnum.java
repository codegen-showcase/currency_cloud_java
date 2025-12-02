
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Payment Charges Setting value (only applicable to Swift payments). If empty, the account's default value is used. Do not specify for regular (local) payments.
 */
public enum PaymentsUpdateBodyChargeTypeEnum {
    OURS("ours"),
    SHARED("shared");

    private final String value;

    PaymentsUpdateBodyChargeTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


