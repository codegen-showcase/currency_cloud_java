
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * The related entity that created the transaction.<br> For information, the related_entity_type for margin transactions is <b>'margin_transaction'</b>. While it isn't possible to search directly by this value, margin transactions can be filtered using the ‘action’ field and may be included in the response.
 */
public enum TransactionsFindRelatedEntityTypeEnum {
    CONVERSION("conversion"),
    DEPOSIT("deposit"),
    INBOUND_FUNDS("inbound_funds"),
    PAYMENT("payment"),
    TRANSFER("transfer");

    private final String value;

    TransactionsFindRelatedEntityTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


