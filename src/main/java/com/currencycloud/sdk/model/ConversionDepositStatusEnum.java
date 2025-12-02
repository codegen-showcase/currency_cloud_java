
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Deposit status
 */
public enum ConversionDepositStatusEnum {
    AWAITING_DEPOSIT("awaiting_deposit"),
    DEPOSIT_RECEIVED("deposit_received"),
    NOT_REQUIRED("not_required");

    private final String value;

    ConversionDepositStatusEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


