
package com.currencycloud.sdk.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * CollectionsScreeningCompleteBody
 */
@JsonDeserialize(builder = CollectionsScreeningCompleteBody.Builder.class)
public final class CollectionsScreeningCompleteBody {
    /**
     * Should the transaction be accepted - true or false.
     */
    private final Boolean accepted;

    /**
     * Reason for acceptance or rejection. If "accepted" is true, the value should be "accepted". If "accepted" is false, the value should be one of the other values.
     *
     */
    private final CollectionsScreeningCompleteBodyReasonEnum reason;


    private CollectionsScreeningCompleteBody(Builder builder) {
        this.accepted = builder.accepted;
        this.reason = builder.reason;
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

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof CollectionsScreeningCompleteBody &&
               equalTo((CollectionsScreeningCompleteBody) other);
    }

    private boolean equalTo(CollectionsScreeningCompleteBody other) {
        return
            accepted.equals(other.accepted) &&

            reason.equals(other.reason)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accepted,
                   this.reason
               );
    }

    @Override
    public String toString() {
        return "CollectionsScreeningCompleteBody{" +
               "accepted=" + accepted + ", " +
               "reason=" + reason +
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


        private Builder() {}

        public Builder from(CollectionsScreeningCompleteBody other) {
            accepted(other.getAccepted());
            reason(other.getReason());
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



        public CollectionsScreeningCompleteBody build() {
            if (accepted == null) {
                throw new IllegalStateException("accepted is required");
            }

            if (reason == null) {
                throw new IllegalStateException("reason is required");
            }

            return new CollectionsScreeningCompleteBody(this);
        }
    }

}



