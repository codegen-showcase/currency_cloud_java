
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * Legal entity - 'individual' or 'company'. If 'individual' then "beneficiary_first_name" and "beneficiary_last_name" are required. If 'company' then "beneficiary_company_name" is required.
 */
public enum BeneficiariesAccountVerificationBodyBeneficiaryEntityTypeEnum {
    COMPANY("company"),
    INDIVIDUAL("individual");

    private final String value;

    BeneficiariesAccountVerificationBodyBeneficiaryEntityTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


