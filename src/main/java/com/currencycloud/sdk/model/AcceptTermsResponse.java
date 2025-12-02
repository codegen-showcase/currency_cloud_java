
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Accept Terms of Use response.
 */
@JsonDeserialize(builder = AcceptTermsResponse.Builder.class)
public final class AcceptTermsResponse {
    /**
     * The ID of the acceptance.
     */
    private final Optional<String> acceptanceId;

    /**
     * The date and time that the Terms of Use were accepted.
     */
    private final Optional<String> acceptedAt;


    private AcceptTermsResponse(Builder builder) {
        this.acceptanceId = builder.acceptanceId;
        this.acceptedAt = builder.acceptedAt;
    }

    /**
     * Retrieves value for `acceptanceId`
     * The ID of the acceptance.
     */
    @JsonProperty("acceptance_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAcceptanceId() {
        return acceptanceId;
    }
    /**
     * Retrieves value for `acceptedAt`
     * The date and time that the Terms of Use were accepted.
     */
    @JsonProperty("accepted_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAcceptedAt() {
        return acceptedAt;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof AcceptTermsResponse && equalTo((AcceptTermsResponse) other);
    }

    private boolean equalTo(AcceptTermsResponse other) {
        return
            acceptanceId.equals(other.acceptanceId) &&

            acceptedAt.equals(other.acceptedAt)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.acceptanceId,
                   this.acceptedAt
               );
    }

    @Override
    public String toString() {
        return "AcceptTermsResponse{" +
               "acceptanceId=" + acceptanceId + ", " +
               "acceptedAt=" + acceptedAt +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * The ID of the acceptance.
         */
        private Optional<String> acceptanceId = Optional.empty();

        /**
         * The date and time that the Terms of Use were accepted.
         */
        private Optional<String> acceptedAt = Optional.empty();


        private Builder() {}

        public Builder from(AcceptTermsResponse other) {
            acceptanceId(other.getAcceptanceId());
            acceptedAt(other.getAcceptedAt());
            return this;
        }

        /**
         * Sets value for `acceptanceId`
         * The ID of the acceptance.
         */
        @JsonSetter("acceptance_id")
        public Builder acceptanceId(Optional<String> acceptanceId) {
            this.acceptanceId = acceptanceId;
            return this;
        }

        /**
         * Sets value for `acceptanceId`
         * The ID of the acceptance.
         */
        public Builder acceptanceId(String acceptanceId) {
            return this.acceptanceId(Optional.ofNullable(acceptanceId));
        }
        /**
         * Sets value for `acceptedAt`
         * The date and time that the Terms of Use were accepted.
         */
        @JsonSetter("accepted_at")
        public Builder acceptedAt(Optional<String> acceptedAt) {
            this.acceptedAt = acceptedAt;
            return this;
        }

        /**
         * Sets value for `acceptedAt`
         * The date and time that the Terms of Use were accepted.
         */
        public Builder acceptedAt(String acceptedAt) {
            return this.acceptedAt(Optional.ofNullable(acceptedAt));
        }



        public AcceptTermsResponse build() {
            return new AcceptTermsResponse(this);
        }
    }

}



