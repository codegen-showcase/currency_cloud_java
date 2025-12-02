
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * The settlement type - bulk or net.
 */
public enum AccountSettlementTypeEnum {
    BULK("bulk"),
    NET("net");

    private final String value;

    AccountSettlementTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


