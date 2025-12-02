
package com.currencycloud.sdk.model;

import com.fasterxml.jackson.annotation.JsonValue;




/**
 * A legal document that verifies the identity of the beneficiary. Required documentation will vary depending on the country in which the beneficiar's bank account is held and on whether "beneficiary_entity_type" is "individual" or "company".
 */
public enum BeneficiariesCreateBodyBeneficiaryIdentificationTypeEnum {
    CITIZENSHIP_PAPERS("citizenship_papers"),
    CREDENTIAL_DE_ELECTOR("credential_de_elector"),
    DRIVERS_LICENSE("drivers_license"),
    DRIVERS_LICENSE_CANADIAN("drivers_license_canadian"),
    EMPLOYER_IDENTIFICATION_NUMBER("employer_identification_number"),
    EXISTING_CREDIT_CARD_DETAILS("existing_credit_card_details"),
    GREEN_CARD("green_card"),
    INCORPORATION_NUMBER("incorporation_number"),
    MATRICULA_CONSULAR("matricula_consular"),
    NATIONAL_ID("national_id"),
    NONE("none"),
    OTHERS("others"),
    PASSPORT("passport"),
    REGISTRO_FEDERAL_DE_CONTRIBUYENTES("registro_federal_de_contribuyentes"),
    SOCIAL_INSURANCE_NUMBER("social_insurance_number"),
    SOCIAL_SECURITY_NUMBER("social_security_number"),
    VISA("visa");

    private final String value;

    BeneficiariesCreateBodyBeneficiaryIdentificationTypeEnum(String value) {
        this.value = value;
    }

    @JsonValue
    @java.lang.Override
    public String toString() {
        return this.value;
    }
}


