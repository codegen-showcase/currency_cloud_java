
package com.currencycloud.sdk.model;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Payer requirements.
 */
@JsonDeserialize(builder = PayerRequirements.Builder.class)
public final class PayerRequirements {
    /**
     * Legal entity type - company or individual.
     */
    private final Optional<PayerRequirementsPayerEntityTypeEnum> payerEntityType;

    /**
     * Type of payment - regular (local) or priority (Swift).
     */
    private final Optional<PayerRequirementsPaymentTypeEnum> paymentType;

    /**
     * The required payer fields for the payment.
     */
    private final Optional<List<PayerRequirementsRequiredFieldsItem>> requiredFields;


    private PayerRequirements(Builder builder) {
        this.payerEntityType = builder.payerEntityType;
        this.paymentType = builder.paymentType;
        this.requiredFields = builder.requiredFields;
    }

    /**
     * Retrieves value for `payerEntityType`
     * Legal entity type - company or individual.
     */
    @JsonProperty("payer_entity_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<PayerRequirementsPayerEntityTypeEnum> getPayerEntityType() {
        return payerEntityType;
    }
    /**
     * Retrieves value for `paymentType`
     * Type of payment - regular (local) or priority (Swift).
     */
    @JsonProperty("payment_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<PayerRequirementsPaymentTypeEnum> getPaymentType() {
        return paymentType;
    }
    /**
     * Retrieves value for `requiredFields`
     * The required payer fields for the payment.
     */
    @JsonProperty("required_fields")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<PayerRequirementsRequiredFieldsItem>> getRequiredFields() {
        return requiredFields;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof PayerRequirements && equalTo((PayerRequirements) other);
    }

    private boolean equalTo(PayerRequirements other) {
        return
            payerEntityType.equals(other.payerEntityType) &&

            paymentType.equals(other.paymentType) &&

            requiredFields.equals(other.requiredFields)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.payerEntityType,
                   this.paymentType,
                   this.requiredFields
               );
    }

    @Override
    public String toString() {
        return "PayerRequirements{" +
               "payerEntityType=" + payerEntityType + ", " +
               "paymentType=" + paymentType + ", " +
               "requiredFields=" + requiredFields +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Legal entity type - company or individual.
         */
        private Optional<PayerRequirementsPayerEntityTypeEnum> payerEntityType = Optional.empty();

        /**
         * Type of payment - regular (local) or priority (Swift).
         */
        private Optional<PayerRequirementsPaymentTypeEnum> paymentType = Optional.empty();

        /**
         * The required payer fields for the payment.
         */
        private Optional<List<PayerRequirementsRequiredFieldsItem>> requiredFields = Optional.empty();


        private Builder() {}

        public Builder from(PayerRequirements other) {
            payerEntityType(other.getPayerEntityType());
            paymentType(other.getPaymentType());
            requiredFields(other.getRequiredFields());
            return this;
        }

        /**
         * Sets value for `payerEntityType`
         * Legal entity type - company or individual.
         */
        @JsonSetter("payer_entity_type")
        public Builder payerEntityType(Optional<PayerRequirementsPayerEntityTypeEnum> payerEntityType) {
            this.payerEntityType = payerEntityType;
            return this;
        }

        /**
         * Sets value for `payerEntityType`
         * Legal entity type - company or individual.
         */
        public Builder payerEntityType(PayerRequirementsPayerEntityTypeEnum payerEntityType) {
            return this.payerEntityType(Optional.ofNullable(payerEntityType));
        }
        /**
         * Sets value for `paymentType`
         * Type of payment - regular (local) or priority (Swift).
         */
        @JsonSetter("payment_type")
        public Builder paymentType(Optional<PayerRequirementsPaymentTypeEnum> paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * Sets value for `paymentType`
         * Type of payment - regular (local) or priority (Swift).
         */
        public Builder paymentType(PayerRequirementsPaymentTypeEnum paymentType) {
            return this.paymentType(Optional.ofNullable(paymentType));
        }
        /**
         * Sets value for `requiredFields`
         * The required payer fields for the payment.
         */
        @JsonSetter("required_fields")
        public Builder requiredFields(Optional<List<PayerRequirementsRequiredFieldsItem>> requiredFields) {
            this.requiredFields = requiredFields;
            return this;
        }

        /**
         * Sets value for `requiredFields`
         * The required payer fields for the payment.
         */
        public Builder requiredFields(List<PayerRequirementsRequiredFieldsItem> requiredFields) {
            return this.requiredFields(Optional.ofNullable(requiredFields));
        }



        public PayerRequirements build() {
            return new PayerRequirements(this);
        }
    }

}



