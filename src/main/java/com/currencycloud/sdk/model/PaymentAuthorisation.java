
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Payment Authorisation.
 */
@JsonDeserialize(builder = PaymentAuthorisation.Builder.class)
public final class PaymentAuthorisation {
    private final Optional<String> authStepsRequired;

    private final Optional<String> authStepsTaken;

    private final Optional<String> error;

    private final Optional<String> paymentId;

    private final Optional<String> paymentStatus;

    private final Optional<String> shortReference;

    private final Optional<String> updated;


    private PaymentAuthorisation(Builder builder) {
        this.authStepsRequired = builder.authStepsRequired;
        this.authStepsTaken = builder.authStepsTaken;
        this.error = builder.error;
        this.paymentId = builder.paymentId;
        this.paymentStatus = builder.paymentStatus;
        this.shortReference = builder.shortReference;
        this.updated = builder.updated;
    }

    /**
     * Retrieves value for `authStepsRequired`
     */
    @JsonProperty("auth_steps_required")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAuthStepsRequired() {
        return authStepsRequired;
    }
    /**
     * Retrieves value for `authStepsTaken`
     */
    @JsonProperty("auth_steps_taken")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAuthStepsTaken() {
        return authStepsTaken;
    }
    /**
     * Retrieves value for `error`
     */
    @JsonProperty("error")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getError() {
        return error;
    }
    /**
     * Retrieves value for `paymentId`
     */
    @JsonProperty("payment_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPaymentId() {
        return paymentId;
    }
    /**
     * Retrieves value for `paymentStatus`
     */
    @JsonProperty("payment_status")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPaymentStatus() {
        return paymentStatus;
    }
    /**
     * Retrieves value for `shortReference`
     */
    @JsonProperty("short_reference")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getShortReference() {
        return shortReference;
    }
    /**
     * Retrieves value for `updated`
     */
    @JsonProperty("updated")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUpdated() {
        return updated;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof PaymentAuthorisation && equalTo((PaymentAuthorisation) other);
    }

    private boolean equalTo(PaymentAuthorisation other) {
        return
            authStepsRequired.equals(other.authStepsRequired) &&

            authStepsTaken.equals(other.authStepsTaken) &&

            error.equals(other.error) &&

            paymentId.equals(other.paymentId) &&

            paymentStatus.equals(other.paymentStatus) &&

            shortReference.equals(other.shortReference) &&

            updated.equals(other.updated)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.authStepsRequired,
                   this.authStepsTaken,
                   this.error,
                   this.paymentId,
                   this.paymentStatus,
                   this.shortReference,
                   this.updated
               );
    }

    @Override
    public String toString() {
        return "PaymentAuthorisation{" +
               "authStepsRequired=" + authStepsRequired + ", " +
               "authStepsTaken=" + authStepsTaken + ", " +
               "error=" + error + ", " +
               "paymentId=" + paymentId + ", " +
               "paymentStatus=" + paymentStatus + ", " +
               "shortReference=" + shortReference + ", " +
               "updated=" + updated +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<String> authStepsRequired = Optional.empty();

        private Optional<String> authStepsTaken = Optional.empty();

        private Optional<String> error = Optional.empty();

        private Optional<String> paymentId = Optional.empty();

        private Optional<String> paymentStatus = Optional.empty();

        private Optional<String> shortReference = Optional.empty();

        private Optional<String> updated = Optional.empty();


        private Builder() {}

        public Builder from(PaymentAuthorisation other) {
            authStepsRequired(other.getAuthStepsRequired());
            authStepsTaken(other.getAuthStepsTaken());
            error(other.getError());
            paymentId(other.getPaymentId());
            paymentStatus(other.getPaymentStatus());
            shortReference(other.getShortReference());
            updated(other.getUpdated());
            return this;
        }

        /**
         * Sets value for `authStepsRequired`
         */
        @JsonSetter("auth_steps_required")
        public Builder authStepsRequired(Optional<String> authStepsRequired) {
            this.authStepsRequired = authStepsRequired;
            return this;
        }

        /**
         * Sets value for `authStepsRequired`
         */
        public Builder authStepsRequired(String authStepsRequired) {
            return this.authStepsRequired(Optional.ofNullable(authStepsRequired));
        }
        /**
         * Sets value for `authStepsTaken`
         */
        @JsonSetter("auth_steps_taken")
        public Builder authStepsTaken(Optional<String> authStepsTaken) {
            this.authStepsTaken = authStepsTaken;
            return this;
        }

        /**
         * Sets value for `authStepsTaken`
         */
        public Builder authStepsTaken(String authStepsTaken) {
            return this.authStepsTaken(Optional.ofNullable(authStepsTaken));
        }
        /**
         * Sets value for `error`
         */
        @JsonSetter("error")
        public Builder error(Optional<String> error) {
            this.error = error;
            return this;
        }

        /**
         * Sets value for `error`
         */
        public Builder error(String error) {
            return this.error(Optional.ofNullable(error));
        }
        /**
         * Sets value for `paymentId`
         */
        @JsonSetter("payment_id")
        public Builder paymentId(Optional<String> paymentId) {
            this.paymentId = paymentId;
            return this;
        }

        /**
         * Sets value for `paymentId`
         */
        public Builder paymentId(String paymentId) {
            return this.paymentId(Optional.ofNullable(paymentId));
        }
        /**
         * Sets value for `paymentStatus`
         */
        @JsonSetter("payment_status")
        public Builder paymentStatus(Optional<String> paymentStatus) {
            this.paymentStatus = paymentStatus;
            return this;
        }

        /**
         * Sets value for `paymentStatus`
         */
        public Builder paymentStatus(String paymentStatus) {
            return this.paymentStatus(Optional.ofNullable(paymentStatus));
        }
        /**
         * Sets value for `shortReference`
         */
        @JsonSetter("short_reference")
        public Builder shortReference(Optional<String> shortReference) {
            this.shortReference = shortReference;
            return this;
        }

        /**
         * Sets value for `shortReference`
         */
        public Builder shortReference(String shortReference) {
            return this.shortReference(Optional.ofNullable(shortReference));
        }
        /**
         * Sets value for `updated`
         */
        @JsonSetter("updated")
        public Builder updated(Optional<String> updated) {
            this.updated = updated;
            return this;
        }

        /**
         * Sets value for `updated`
         */
        public Builder updated(String updated) {
            return this.updated(Optional.ofNullable(updated));
        }



        public PaymentAuthorisation build() {
            return new PaymentAuthorisation(this);
        }
    }

}



