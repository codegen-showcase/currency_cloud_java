
package com.currencycloud.sdk.resources.payments.params;

import java.util.Objects;
import java.util.Optional;

import com.currencycloud.sdk.model.PaymentsGetReviewStatusEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * GetRequest
 */
@JsonDeserialize(builder = GetRequest.Builder.class)
public final class GetRequest {
    /**
     * Payment UUID
     */
    private final String id;

    /**
     * A contact UUID for the sub-account you're acting on behalf of.
     */
    private final Optional<String> onBehalfOf;

    /**
     * Compliance review status.
     */
    private final Optional<PaymentsGetReviewStatusEnum> reviewStatus;

    /**
     * Include deleted payments.
     */
    private final Optional<Boolean> withDeleted;


    private GetRequest(Builder builder) {
        this.id = builder.id;
        this.onBehalfOf = builder.onBehalfOf;
        this.reviewStatus = builder.reviewStatus;
        this.withDeleted = builder.withDeleted;
    }

    /**
     * Retrieves value for `id`
     * Payment UUID
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }
    /**
     * Retrieves value for `onBehalfOf`
     * A contact UUID for the sub-account you're acting on behalf of.
     */
    @JsonProperty("on_behalf_of")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getOnBehalfOf() {
        return onBehalfOf;
    }
    /**
     * Retrieves value for `reviewStatus`
     * Compliance review status.
     */
    @JsonProperty("review_status")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<PaymentsGetReviewStatusEnum> getReviewStatus() {
        return reviewStatus;
    }
    /**
     * Retrieves value for `withDeleted`
     * Include deleted payments.
     */
    @JsonProperty("with_deleted")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Boolean> getWithDeleted() {
        return withDeleted;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof GetRequest && equalTo((GetRequest) other);
    }

    private boolean equalTo(GetRequest other) {
        return
            id.equals(other.id) &&

            onBehalfOf.equals(other.onBehalfOf) &&

            reviewStatus.equals(other.reviewStatus) &&

            withDeleted.equals(other.withDeleted)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.id,
                   this.onBehalfOf,
                   this.reviewStatus,
                   this.withDeleted
               );
    }

    @Override
    public String toString() {
        return "GetRequest{" +
               "id=" + id + ", " +
               "onBehalfOf=" + onBehalfOf + ", " +
               "reviewStatus=" + reviewStatus + ", " +
               "withDeleted=" + withDeleted +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Payment UUID
         */
        private String id = null;

        /**
         * A contact UUID for the sub-account you're acting on behalf of.
         */
        private Optional<String> onBehalfOf = Optional.empty();

        /**
         * Compliance review status.
         */
        private Optional<PaymentsGetReviewStatusEnum> reviewStatus = Optional.empty();

        /**
         * Include deleted payments.
         */
        private Optional<Boolean> withDeleted = Optional.empty();


        private Builder() {}

        public Builder from(GetRequest other) {
            id(other.getId());
            onBehalfOf(other.getOnBehalfOf());
            reviewStatus(other.getReviewStatus());
            withDeleted(other.getWithDeleted());
            return this;
        }

        /**
         * Sets value for `id`
         * Payment UUID
         */
        @JsonSetter("id")
        public Builder id(String id) {
            if (id == null) {
                throw new IllegalArgumentException("id cannot be null");
            }

            this.id = id;
            return this;
        }
        /**
         * Sets value for `onBehalfOf`
         * A contact UUID for the sub-account you're acting on behalf of.
         */
        @JsonSetter("on_behalf_of")
        public Builder onBehalfOf(Optional<String> onBehalfOf) {
            this.onBehalfOf = onBehalfOf;
            return this;
        }

        /**
         * Sets value for `onBehalfOf`
         * A contact UUID for the sub-account you're acting on behalf of.
         */
        public Builder onBehalfOf(String onBehalfOf) {
            return this.onBehalfOf(Optional.ofNullable(onBehalfOf));
        }
        /**
         * Sets value for `reviewStatus`
         * Compliance review status.
         */
        @JsonSetter("review_status")
        public Builder reviewStatus(Optional<PaymentsGetReviewStatusEnum> reviewStatus) {
            this.reviewStatus = reviewStatus;
            return this;
        }

        /**
         * Sets value for `reviewStatus`
         * Compliance review status.
         */
        public Builder reviewStatus(PaymentsGetReviewStatusEnum reviewStatus) {
            return this.reviewStatus(Optional.ofNullable(reviewStatus));
        }
        /**
         * Sets value for `withDeleted`
         * Include deleted payments.
         */
        @JsonSetter("with_deleted")
        public Builder withDeleted(Optional<Boolean> withDeleted) {
            this.withDeleted = withDeleted;
            return this;
        }

        /**
         * Sets value for `withDeleted`
         * Include deleted payments.
         */
        public Builder withDeleted(Boolean withDeleted) {
            return this.withDeleted(Optional.ofNullable(withDeleted));
        }



        public GetRequest build() {
            if (id == null) {
                throw new IllegalStateException("id is required");
            }

            return new GetRequest(this);
        }
    }

}



