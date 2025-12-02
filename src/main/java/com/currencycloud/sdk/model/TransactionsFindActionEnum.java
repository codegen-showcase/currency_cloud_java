
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * The action that triggered the transaction.
 */
public enum TransactionsFindActionEnum {
    CONVERSION("conversion"),
    CONVERSION_DEPOSIT("conversion_deposit"),
    DEPOSIT_REFUND("deposit_refund"),
    FUNDING("funding"),
    MANUAL_INTERVENTION("manual_intervention"),
    MANUAL_TRANSACTION("manual_transaction"),
    MARGIN("margin"),
    PAYMENT("payment"),
    PAYMENT_FAILURE("payment_failure"),
    PAYMENT_FEE("payment_fee"),
    PAYMENT_UNRELEASE("payment_unrelease"),
    TOP_UP_FEE("top_up_fee"),
    TRANSFER("transfer");

    private final String value;

    TransactionsFindActionEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


