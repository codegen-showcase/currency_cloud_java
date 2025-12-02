
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Currencycloud supports two types of payments: "priority" (Swift), made using the Swift network; and "regular" (local), made using the local bank network.
 */
public enum ReferenceGetPayerRequiredDetailsPaymentTypeEnum {
    PRIORITY("priority"),
    REGULAR("regular");

    private final String value;

    ReferenceGetPayerRequiredDetailsPaymentTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


