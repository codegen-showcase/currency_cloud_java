
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * The type of routing number.
 */
public enum FundingAccountRoutingCodeTypeEnum {
    ACH_ROUTING_NUMBER("ach_routing_number"),
    BIC_SWIFT("bic_swift"),
    FAST_ROUTING_CODE("fast_routing_code"),
    GIRO_ROUTING_CODE("giro_routing_code"),
    MEPS_ROUTING_CODE("meps_routing_code"),
    ROUTING_CODE("routing_code"),
    SORT_CODE("sort_code"),
    WIRE_ROUTING_NUMBER("wire_routing_number");

    private final String value;

    FundingAccountRoutingCodeTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


