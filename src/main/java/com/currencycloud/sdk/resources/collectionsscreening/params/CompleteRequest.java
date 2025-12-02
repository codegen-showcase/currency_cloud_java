
package com.currencycloud.sdk.resources.collectionsscreening.params;

import java.util.Objects;

import com.currencycloud.sdk.model.CollectionsScreeningCompleteBodyReasonEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * CompleteRequest
 */
@JsonDeserialize(builder = CompleteRequest.Builder.class)
public final class CompleteRequest {
    /**
     * Should the transaction be accepted - true or false.
     */
    private final Boolean accepted;

    /**
     * Reason for acceptance or rejection. If "accepted" is true, the value should be "accepted". If "accepted" is false, the value should be one of the other values.
     *
     */
    private final CollectionsScreeningCompleteBodyReasonEnum reason;

    /**
     * The related_entity_id from the Cash Manager notification.
     */
    private final String transactionId;


    private CompleteRequest(Builder builder) {
        this.accepted = builder.accepted;
        this.reason = builder.reason;
        this.transactionId = builder.transactionId;
    }

    /**
     * Retrieves value for `accepted`
     * Should the transaction be accepted - true or false.
     */
    @JsonProperty("accepted")
    public Boolean getAccepted() {
        return accepted;
    }
    /**
     * Retrieves value for `reason`
     * Reason for acceptance or rejection. If "accepted" is true, the value should be "accepted". If "accepted" is false, the value should be one of the other values.
     *
     */
    @JsonProperty("reason")
    public CollectionsScreeningCompleteBodyReasonEnum getReason() {
        return reason;
    }
    /**
     * Retrieves value for `transactionId`
     * The related_entity_id from the Cash Manager notification.
     */
    @JsonProperty("transactionId")
    public String getTransactionId() {
        return transactionId;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof CompleteRequest && equalTo((CompleteRequest) other);
    }

    private boolean equalTo(CompleteRequest other) {
        return
            accepted.equals(other.accepted) &&

            reason.equals(other.reason) &&

            transactionId.equals(other.transactionId)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accepted,
                   this.reason,
                   this.transactionId
               );
    }

    @Override
    public String toString() {
        return "CompleteRequest{" +
               "accepted=" + accepted + ", " +
               "reason=" + reason + ", " +
               "transactionId=" + transactionId +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Should the transaction be accepted - true or false.
         */
        private Boolean accepted = null;

        /**
         * Reason for acceptance or rejection. If "accepted" is true, the value should be "accepted". If "accepted" is false, the value should be one of the other values.
         *
         */
        private CollectionsScreeningCompleteBodyReasonEnum reason = null;

        /**
         * The related_entity_id from the Cash Manager notification.
         */
        private String transactionId = null;


        private Builder() {}

        public Builder from(CompleteRequest other) {
            accepted(other.getAccepted());
            reason(other.getReason());
            transactionId(other.getTransactionId());
            return this;
        }

        /**
         * Sets value for `accepted`
         * Should the transaction be accepted - true or false.
         */
        @JsonSetter("accepted")
        public Builder accepted(Boolean accepted) {
            if (accepted == null) {
                throw new IllegalArgumentException("accepted cannot be null");
            }

            this.accepted = accepted;
            return this;
        }
        /**
         * Sets value for `reason`
         * Reason for acceptance or rejection. If "accepted" is true, the value should be "accepted". If "accepted" is false, the value should be one of the other values.
         *
         */
        @JsonSetter("reason")
        public Builder reason(CollectionsScreeningCompleteBodyReasonEnum reason) {
            if (reason == null) {
                throw new IllegalArgumentException("reason cannot be null");
            }

            this.reason = reason;
            return this;
        }
        /**
         * Sets value for `transactionId`
         * The related_entity_id from the Cash Manager notification.
         */
        @JsonSetter("transactionId")
        public Builder transactionId(String transactionId) {
            if (transactionId == null) {
                throw new IllegalArgumentException("transactionId cannot be null");
            }

            this.transactionId = transactionId;
            return this;
        }



        public CompleteRequest build() {
            if (accepted == null) {
                throw new IllegalStateException("accepted is required");
            }

            if (reason == null) {
                throw new IllegalStateException("reason is required");
            }

            if (transactionId == null) {
                throw new IllegalStateException("transactionId is required");
            }

            return new CompleteRequest(this);
        }
    }

}



