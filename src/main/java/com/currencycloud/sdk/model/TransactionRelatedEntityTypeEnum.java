
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * The related entity type.
 */
public enum TransactionRelatedEntityTypeEnum {
    BALANCE_TRANSFER("balance_transfer"),
    CONVERSION("conversion"),
    DEPOSIT("deposit"),
    INBOUND_FUNDS("inbound_funds"),
    MARGIN_TRANSACTION("margin_transaction"),
    PAYMENT("payment");

    private final String value;

    TransactionRelatedEntityTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


