
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Payment confirmation.
 */
@JsonDeserialize(builder = PaymentConfirmation.Builder.class)
public final class PaymentConfirmation {
    /**
     * Account ID
     */
    private final Optional<String> accountId;

    /**
     * URL to download Payment Confirmation file.
     */
    private final Optional<String> confirmationUrl;

    /**
     * Date and time of when the Payment Confirmation was created.
     */
    private final Optional<String> createdAt;

    /**
     * Date and time of when the Payment Confirmation will expire.
     */
    private final Optional<String> expiresAt;

    /**
     * Unique ID of the Payment Confirmation.
     */
    private final Optional<String> id;

    /**
     * Unique ID for the payment the confirmation relates to.
     */
    private final Optional<String> paymentId;

    /**
     * Short reference for the Payment Confirmation.
     */
    private final Optional<String> shortReference;

    /**
     * Status of the Payment Confirmation processing.
     */
    private final Optional<String> status;

    /**
     * Date and time of when the Payment Confirmation was last updated.
     */
    private final Optional<String> updatedAt;


    private PaymentConfirmation(Builder builder) {
        this.accountId = builder.accountId;
        this.confirmationUrl = builder.confirmationUrl;
        this.createdAt = builder.createdAt;
        this.expiresAt = builder.expiresAt;
        this.id = builder.id;
        this.paymentId = builder.paymentId;
        this.shortReference = builder.shortReference;
        this.status = builder.status;
        this.updatedAt = builder.updatedAt;
    }

    /**
     * Retrieves value for `accountId`
     * Account ID
     */
    @JsonProperty("account_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAccountId() {
        return accountId;
    }
    /**
     * Retrieves value for `confirmationUrl`
     * URL to download Payment Confirmation file.
     */
    @JsonProperty("confirmation_url")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getConfirmationUrl() {
        return confirmationUrl;
    }
    /**
     * Retrieves value for `createdAt`
     * Date and time of when the Payment Confirmation was created.
     */
    @JsonProperty("created_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatedAt() {
        return createdAt;
    }
    /**
     * Retrieves value for `expiresAt`
     * Date and time of when the Payment Confirmation will expire.
     */
    @JsonProperty("expires_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getExpiresAt() {
        return expiresAt;
    }
    /**
     * Retrieves value for `id`
     * Unique ID of the Payment Confirmation.
     */
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getId() {
        return id;
    }
    /**
     * Retrieves value for `paymentId`
     * Unique ID for the payment the confirmation relates to.
     */
    @JsonProperty("payment_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPaymentId() {
        return paymentId;
    }
    /**
     * Retrieves value for `shortReference`
     * Short reference for the Payment Confirmation.
     */
    @JsonProperty("short_reference")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getShortReference() {
        return shortReference;
    }
    /**
     * Retrieves value for `status`
     * Status of the Payment Confirmation processing.
     */
    @JsonProperty("status")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getStatus() {
        return status;
    }
    /**
     * Retrieves value for `updatedAt`
     * Date and time of when the Payment Confirmation was last updated.
     */
    @JsonProperty("updated_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof PaymentConfirmation && equalTo((PaymentConfirmation) other);
    }

    private boolean equalTo(PaymentConfirmation other) {
        return
            accountId.equals(other.accountId) &&

            confirmationUrl.equals(other.confirmationUrl) &&

            createdAt.equals(other.createdAt) &&

            expiresAt.equals(other.expiresAt) &&

            id.equals(other.id) &&

            paymentId.equals(other.paymentId) &&

            shortReference.equals(other.shortReference) &&

            status.equals(other.status) &&

            updatedAt.equals(other.updatedAt)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accountId,
                   this.confirmationUrl,
                   this.createdAt,
                   this.expiresAt,
                   this.id,
                   this.paymentId,
                   this.shortReference,
                   this.status,
                   this.updatedAt
               );
    }

    @Override
    public String toString() {
        return "PaymentConfirmation{" +
               "accountId=" + accountId + ", " +
               "confirmationUrl=" + confirmationUrl + ", " +
               "createdAt=" + createdAt + ", " +
               "expiresAt=" + expiresAt + ", " +
               "id=" + id + ", " +
               "paymentId=" + paymentId + ", " +
               "shortReference=" + shortReference + ", " +
               "status=" + status + ", " +
               "updatedAt=" + updatedAt +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Account ID
         */
        private Optional<String> accountId = Optional.empty();

        /**
         * URL to download Payment Confirmation file.
         */
        private Optional<String> confirmationUrl = Optional.empty();

        /**
         * Date and time of when the Payment Confirmation was created.
         */
        private Optional<String> createdAt = Optional.empty();

        /**
         * Date and time of when the Payment Confirmation will expire.
         */
        private Optional<String> expiresAt = Optional.empty();

        /**
         * Unique ID of the Payment Confirmation.
         */
        private Optional<String> id = Optional.empty();

        /**
         * Unique ID for the payment the confirmation relates to.
         */
        private Optional<String> paymentId = Optional.empty();

        /**
         * Short reference for the Payment Confirmation.
         */
        private Optional<String> shortReference = Optional.empty();

        /**
         * Status of the Payment Confirmation processing.
         */
        private Optional<String> status = Optional.empty();

        /**
         * Date and time of when the Payment Confirmation was last updated.
         */
        private Optional<String> updatedAt = Optional.empty();


        private Builder() {}

        public Builder from(PaymentConfirmation other) {
            accountId(other.getAccountId());
            confirmationUrl(other.getConfirmationUrl());
            createdAt(other.getCreatedAt());
            expiresAt(other.getExpiresAt());
            id(other.getId());
            paymentId(other.getPaymentId());
            shortReference(other.getShortReference());
            status(other.getStatus());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        /**
         * Sets value for `accountId`
         * Account ID
         */
        @JsonSetter("account_id")
        public Builder accountId(Optional<String> accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Sets value for `accountId`
         * Account ID
         */
        public Builder accountId(String accountId) {
            return this.accountId(Optional.ofNullable(accountId));
        }
        /**
         * Sets value for `confirmationUrl`
         * URL to download Payment Confirmation file.
         */
        @JsonSetter("confirmation_url")
        public Builder confirmationUrl(Optional<String> confirmationUrl) {
            this.confirmationUrl = confirmationUrl;
            return this;
        }

        /**
         * Sets value for `confirmationUrl`
         * URL to download Payment Confirmation file.
         */
        public Builder confirmationUrl(String confirmationUrl) {
            return this.confirmationUrl(Optional.ofNullable(confirmationUrl));
        }
        /**
         * Sets value for `createdAt`
         * Date and time of when the Payment Confirmation was created.
         */
        @JsonSetter("created_at")
        public Builder createdAt(Optional<String> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Sets value for `createdAt`
         * Date and time of when the Payment Confirmation was created.
         */
        public Builder createdAt(String createdAt) {
            return this.createdAt(Optional.ofNullable(createdAt));
        }
        /**
         * Sets value for `expiresAt`
         * Date and time of when the Payment Confirmation will expire.
         */
        @JsonSetter("expires_at")
        public Builder expiresAt(Optional<String> expiresAt) {
            this.expiresAt = expiresAt;
            return this;
        }

        /**
         * Sets value for `expiresAt`
         * Date and time of when the Payment Confirmation will expire.
         */
        public Builder expiresAt(String expiresAt) {
            return this.expiresAt(Optional.ofNullable(expiresAt));
        }
        /**
         * Sets value for `id`
         * Unique ID of the Payment Confirmation.
         */
        @JsonSetter("id")
        public Builder id(Optional<String> id) {
            this.id = id;
            return this;
        }

        /**
         * Sets value for `id`
         * Unique ID of the Payment Confirmation.
         */
        public Builder id(String id) {
            return this.id(Optional.ofNullable(id));
        }
        /**
         * Sets value for `paymentId`
         * Unique ID for the payment the confirmation relates to.
         */
        @JsonSetter("payment_id")
        public Builder paymentId(Optional<String> paymentId) {
            this.paymentId = paymentId;
            return this;
        }

        /**
         * Sets value for `paymentId`
         * Unique ID for the payment the confirmation relates to.
         */
        public Builder paymentId(String paymentId) {
            return this.paymentId(Optional.ofNullable(paymentId));
        }
        /**
         * Sets value for `shortReference`
         * Short reference for the Payment Confirmation.
         */
        @JsonSetter("short_reference")
        public Builder shortReference(Optional<String> shortReference) {
            this.shortReference = shortReference;
            return this;
        }

        /**
         * Sets value for `shortReference`
         * Short reference for the Payment Confirmation.
         */
        public Builder shortReference(String shortReference) {
            return this.shortReference(Optional.ofNullable(shortReference));
        }
        /**
         * Sets value for `status`
         * Status of the Payment Confirmation processing.
         */
        @JsonSetter("status")
        public Builder status(Optional<String> status) {
            this.status = status;
            return this;
        }

        /**
         * Sets value for `status`
         * Status of the Payment Confirmation processing.
         */
        public Builder status(String status) {
            return this.status(Optional.ofNullable(status));
        }
        /**
         * Sets value for `updatedAt`
         * Date and time of when the Payment Confirmation was last updated.
         */
        @JsonSetter("updated_at")
        public Builder updatedAt(Optional<String> updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Sets value for `updatedAt`
         * Date and time of when the Payment Confirmation was last updated.
         */
        public Builder updatedAt(String updatedAt) {
            return this.updatedAt(Optional.ofNullable(updatedAt));
        }



        public PaymentConfirmation build() {
            return new PaymentConfirmation(this);
        }
    }

}



