
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Beneficiary's legal entity type - individual or company.
 */
public enum BeneficiariesFindBodyBeneficiaryEntityTypeEnum {
    COMPANY("company"),
    INDIVIDUAL("individual");

    private final String value;

    BeneficiariesFindBodyBeneficiaryEntityTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


