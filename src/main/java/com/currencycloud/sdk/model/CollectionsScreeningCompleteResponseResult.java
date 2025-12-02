
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * CollectionsScreeningCompleteResponseResult
 */
@JsonDeserialize(builder = CollectionsScreeningCompleteResponseResult.Builder.class)
public final class CollectionsScreeningCompleteResponseResult {
    /**
     * Was the transaction accepted? True or false.
     */
    private final Optional<Boolean> accepted;

    /**
     * The reason why the transaction was accepted or rejected.
     */
    private final Optional<String> reason;


    private CollectionsScreeningCompleteResponseResult(Builder builder) {
        this.accepted = builder.accepted;
        this.reason = builder.reason;
    }

    /**
     * Retrieves value for `accepted`
     * Was the transaction accepted? True or false.
     */
    @JsonProperty("accepted")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Boolean> getAccepted() {
        return accepted;
    }
    /**
     * Retrieves value for `reason`
     * The reason why the transaction was accepted or rejected.
     */
    @JsonProperty("reason")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getReason() {
        return reason;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof CollectionsScreeningCompleteResponseResult &&
               equalTo((CollectionsScreeningCompleteResponseResult) other);
    }

    private boolean equalTo(CollectionsScreeningCompleteResponseResult other) {
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
        return "CollectionsScreeningCompleteResponseResult{" +
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
         * Was the transaction accepted? True or false.
         */
        private Optional<Boolean> accepted = Optional.empty();

        /**
         * The reason why the transaction was accepted or rejected.
         */
        private Optional<String> reason = Optional.empty();


        private Builder() {}

        public Builder from(CollectionsScreeningCompleteResponseResult other) {
            accepted(other.getAccepted());
            reason(other.getReason());
            return this;
        }

        /**
         * Sets value for `accepted`
         * Was the transaction accepted? True or false.
         */
        @JsonSetter("accepted")
        public Builder accepted(Optional<Boolean> accepted) {
            this.accepted = accepted;
            return this;
        }

        /**
         * Sets value for `accepted`
         * Was the transaction accepted? True or false.
         */
        public Builder accepted(Boolean accepted) {
            return this.accepted(Optional.ofNullable(accepted));
        }
        /**
         * Sets value for `reason`
         * The reason why the transaction was accepted or rejected.
         */
        @JsonSetter("reason")
        public Builder reason(Optional<String> reason) {
            this.reason = reason;
            return this;
        }

        /**
         * Sets value for `reason`
         * The reason why the transaction was accepted or rejected.
         */
        public Builder reason(String reason) {
            return this.reason(Optional.ofNullable(reason));
        }



        public CollectionsScreeningCompleteResponseResult build() {
            return new CollectionsScreeningCompleteResponseResult(this);
        }
    }

}



