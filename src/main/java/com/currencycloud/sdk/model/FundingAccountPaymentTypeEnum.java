
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * The type of payment that can be made into the account details provided. Regular - a local scheme such as Faster Payments in the UK. Priority - a priority payment e.g. FEDwire or Swift.
 */
public enum FundingAccountPaymentTypeEnum {
    ANY("any"),
    PRIORITY("priority"),
    REGULAR("regular");

    private final String value;

    FundingAccountPaymentTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


