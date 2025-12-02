
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Currencycloud supports two types of payments: "priority", made using the Swift network; and "regular", made using the local bank network.
 */
public enum PaymentsUpdateBodyPaymentTypeEnum {
    PRIORITY("priority"),
    REGULAR("regular");

    private final String value;

    PaymentsUpdateBodyPaymentTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


