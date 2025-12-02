
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * DemoSimulateFundingBody
 */
@JsonDeserialize(builder = DemoSimulateFundingBody.Builder.class)
public final class DemoSimulateFundingBody {
    /**
     * Allows you to trigger approval or rejection behaviour.
     */
    private final Optional<DemoSimulateFundingBodyActionEnum> action;

    /**
     * Amount of the emulated transaction.
     */
    private final Double amount;

    /**
     * Three-digit currency code.
     */
    private final String currency;

    /**
     * Unique value in UUID format, user-generated with each request.
     */
    private final String id;

    /**
     * A contact UUID for the sub-account you're acting on behalf of.
     */
    private final Optional<String> onBehalfOf;

    /**
     * A client's virtual account number or its sub-account (as seen in Find Funding Accounts).
     */
    private final String receiverAccountNumber;

    /**
     * A client's virtual account routing code or its sub-account (as seen in Find Funding Accounts).
     */
    private final Optional<String> receiverRoutingCode;

    /**
     * Sender account number.
     */
    private final Optional<String> senderAccountNumber;

    /**
     * Sender's address.
     */
    private final Optional<String> senderAddress;

    /**
     * Two character ISO sender country code.
     */
    private final Optional<String> senderCountry;

    /**
     * Sender's name.
     */
    private final Optional<String> senderName;

    /**
     * Sender reference.
     */
    private final Optional<String> senderReference;

    /**
     * Sender routing code.
     */
    private final Optional<String> senderRoutingCode;


    private DemoSimulateFundingBody(Builder builder) {
        this.action = builder.action;
        this.amount = builder.amount;
        this.currency = builder.currency;
        this.id = builder.id;
        this.onBehalfOf = builder.onBehalfOf;
        this.receiverAccountNumber = builder.receiverAccountNumber;
        this.receiverRoutingCode = builder.receiverRoutingCode;
        this.senderAccountNumber = builder.senderAccountNumber;
        this.senderAddress = builder.senderAddress;
        this.senderCountry = builder.senderCountry;
        this.senderName = builder.senderName;
        this.senderReference = builder.senderReference;
        this.senderRoutingCode = builder.senderRoutingCode;
    }

    /**
     * Retrieves value for `action`
     * Allows you to trigger approval or rejection behaviour.
     */
    @JsonProperty("action")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<DemoSimulateFundingBodyActionEnum> getAction() {
        return action;
    }
    /**
     * Retrieves value for `amount`
     * Amount of the emulated transaction.
     */
    @JsonProperty("amount")
    public Double getAmount() {
        return amount;
    }
    /**
     * Retrieves value for `currency`
     * Three-digit currency code.
     */
    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }
    /**
     * Retrieves value for `id`
     * Unique value in UUID format, user-generated with each request.
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
     * Retrieves value for `receiverAccountNumber`
     * A client's virtual account number or its sub-account (as seen in Find Funding Accounts).
     */
    @JsonProperty("receiver_account_number")
    public String getReceiverAccountNumber() {
        return receiverAccountNumber;
    }
    /**
     * Retrieves value for `receiverRoutingCode`
     * A client's virtual account routing code or its sub-account (as seen in Find Funding Accounts).
     */
    @JsonProperty("receiver_routing_code")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getReceiverRoutingCode() {
        return receiverRoutingCode;
    }
    /**
     * Retrieves value for `senderAccountNumber`
     * Sender account number.
     */
    @JsonProperty("sender_account_number")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSenderAccountNumber() {
        return senderAccountNumber;
    }
    /**
     * Retrieves value for `senderAddress`
     * Sender's address.
     */
    @JsonProperty("sender_address")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSenderAddress() {
        return senderAddress;
    }
    /**
     * Retrieves value for `senderCountry`
     * Two character ISO sender country code.
     */
    @JsonProperty("sender_country")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSenderCountry() {
        return senderCountry;
    }
    /**
     * Retrieves value for `senderName`
     * Sender's name.
     */
    @JsonProperty("sender_name")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSenderName() {
        return senderName;
    }
    /**
     * Retrieves value for `senderReference`
     * Sender reference.
     */
    @JsonProperty("sender_reference")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSenderReference() {
        return senderReference;
    }
    /**
     * Retrieves value for `senderRoutingCode`
     * Sender routing code.
     */
    @JsonProperty("sender_routing_code")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSenderRoutingCode() {
        return senderRoutingCode;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof DemoSimulateFundingBody && equalTo((DemoSimulateFundingBody) other);
    }

    private boolean equalTo(DemoSimulateFundingBody other) {
        return
            action.equals(other.action) &&

            amount.equals(other.amount) &&

            currency.equals(other.currency) &&

            id.equals(other.id) &&

            onBehalfOf.equals(other.onBehalfOf) &&

            receiverAccountNumber.equals(other.receiverAccountNumber) &&

            receiverRoutingCode.equals(other.receiverRoutingCode) &&

            senderAccountNumber.equals(other.senderAccountNumber) &&

            senderAddress.equals(other.senderAddress) &&

            senderCountry.equals(other.senderCountry) &&

            senderName.equals(other.senderName) &&

            senderReference.equals(other.senderReference) &&

            senderRoutingCode.equals(other.senderRoutingCode)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.action,
                   this.amount,
                   this.currency,
                   this.id,
                   this.onBehalfOf,
                   this.receiverAccountNumber,
                   this.receiverRoutingCode,
                   this.senderAccountNumber,
                   this.senderAddress,
                   this.senderCountry,
                   this.senderName,
                   this.senderReference,
                   this.senderRoutingCode
               );
    }

    @Override
    public String toString() {
        return "DemoSimulateFundingBody{" +
               "action=" + action + ", " +
               "amount=" + amount + ", " +
               "currency=" + currency + ", " +
               "id=" + id + ", " +
               "onBehalfOf=" + onBehalfOf + ", " +
               "receiverAccountNumber=" + receiverAccountNumber + ", " +
               "receiverRoutingCode=" + receiverRoutingCode + ", " +
               "senderAccountNumber=" + senderAccountNumber + ", " +
               "senderAddress=" + senderAddress + ", " +
               "senderCountry=" + senderCountry + ", " +
               "senderName=" + senderName + ", " +
               "senderReference=" + senderReference + ", " +
               "senderRoutingCode=" + senderRoutingCode +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Allows you to trigger approval or rejection behaviour.
         */
        private Optional<DemoSimulateFundingBodyActionEnum> action = Optional.empty();

        /**
         * Amount of the emulated transaction.
         */
        private Double amount = null;

        /**
         * Three-digit currency code.
         */
        private String currency = null;

        /**
         * Unique value in UUID format, user-generated with each request.
         */
        private String id = null;

        /**
         * A contact UUID for the sub-account you're acting on behalf of.
         */
        private Optional<String> onBehalfOf = Optional.empty();

        /**
         * A client's virtual account number or its sub-account (as seen in Find Funding Accounts).
         */
        private String receiverAccountNumber = null;

        /**
         * A client's virtual account routing code or its sub-account (as seen in Find Funding Accounts).
         */
        private Optional<String> receiverRoutingCode = Optional.empty();

        /**
         * Sender account number.
         */
        private Optional<String> senderAccountNumber = Optional.empty();

        /**
         * Sender's address.
         */
        private Optional<String> senderAddress = Optional.empty();

        /**
         * Two character ISO sender country code.
         */
        private Optional<String> senderCountry = Optional.empty();

        /**
         * Sender's name.
         */
        private Optional<String> senderName = Optional.empty();

        /**
         * Sender reference.
         */
        private Optional<String> senderReference = Optional.empty();

        /**
         * Sender routing code.
         */
        private Optional<String> senderRoutingCode = Optional.empty();


        private Builder() {}

        public Builder from(DemoSimulateFundingBody other) {
            action(other.getAction());
            amount(other.getAmount());
            currency(other.getCurrency());
            id(other.getId());
            onBehalfOf(other.getOnBehalfOf());
            receiverAccountNumber(other.getReceiverAccountNumber());
            receiverRoutingCode(other.getReceiverRoutingCode());
            senderAccountNumber(other.getSenderAccountNumber());
            senderAddress(other.getSenderAddress());
            senderCountry(other.getSenderCountry());
            senderName(other.getSenderName());
            senderReference(other.getSenderReference());
            senderRoutingCode(other.getSenderRoutingCode());
            return this;
        }

        /**
         * Sets value for `action`
         * Allows you to trigger approval or rejection behaviour.
         */
        @JsonSetter("action")
        public Builder action(Optional<DemoSimulateFundingBodyActionEnum> action) {
            this.action = action;
            return this;
        }

        /**
         * Sets value for `action`
         * Allows you to trigger approval or rejection behaviour.
         */
        public Builder action(DemoSimulateFundingBodyActionEnum action) {
            return this.action(Optional.ofNullable(action));
        }
        /**
         * Sets value for `amount`
         * Amount of the emulated transaction.
         */
        @JsonSetter("amount")
        public Builder amount(Double amount) {
            if (amount == null) {
                throw new IllegalArgumentException("amount cannot be null");
            }

            this.amount = amount;
            return this;
        }
        /**
         * Sets value for `currency`
         * Three-digit currency code.
         */
        @JsonSetter("currency")
        public Builder currency(String currency) {
            if (currency == null) {
                throw new IllegalArgumentException("currency cannot be null");
            }

            this.currency = currency;
            return this;
        }
        /**
         * Sets value for `id`
         * Unique value in UUID format, user-generated with each request.
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
         * Sets value for `receiverAccountNumber`
         * A client's virtual account number or its sub-account (as seen in Find Funding Accounts).
         */
        @JsonSetter("receiver_account_number")
        public Builder receiverAccountNumber(String receiverAccountNumber) {
            if (receiverAccountNumber == null) {
                throw new IllegalArgumentException("receiverAccountNumber cannot be null");
            }

            this.receiverAccountNumber = receiverAccountNumber;
            return this;
        }
        /**
         * Sets value for `receiverRoutingCode`
         * A client's virtual account routing code or its sub-account (as seen in Find Funding Accounts).
         */
        @JsonSetter("receiver_routing_code")
        public Builder receiverRoutingCode(Optional<String> receiverRoutingCode) {
            this.receiverRoutingCode = receiverRoutingCode;
            return this;
        }

        /**
         * Sets value for `receiverRoutingCode`
         * A client's virtual account routing code or its sub-account (as seen in Find Funding Accounts).
         */
        public Builder receiverRoutingCode(String receiverRoutingCode) {
            return this.receiverRoutingCode(Optional.ofNullable(receiverRoutingCode));
        }
        /**
         * Sets value for `senderAccountNumber`
         * Sender account number.
         */
        @JsonSetter("sender_account_number")
        public Builder senderAccountNumber(Optional<String> senderAccountNumber) {
            this.senderAccountNumber = senderAccountNumber;
            return this;
        }

        /**
         * Sets value for `senderAccountNumber`
         * Sender account number.
         */
        public Builder senderAccountNumber(String senderAccountNumber) {
            return this.senderAccountNumber(Optional.ofNullable(senderAccountNumber));
        }
        /**
         * Sets value for `senderAddress`
         * Sender's address.
         */
        @JsonSetter("sender_address")
        public Builder senderAddress(Optional<String> senderAddress) {
            this.senderAddress = senderAddress;
            return this;
        }

        /**
         * Sets value for `senderAddress`
         * Sender's address.
         */
        public Builder senderAddress(String senderAddress) {
            return this.senderAddress(Optional.ofNullable(senderAddress));
        }
        /**
         * Sets value for `senderCountry`
         * Two character ISO sender country code.
         */
        @JsonSetter("sender_country")
        public Builder senderCountry(Optional<String> senderCountry) {
            this.senderCountry = senderCountry;
            return this;
        }

        /**
         * Sets value for `senderCountry`
         * Two character ISO sender country code.
         */
        public Builder senderCountry(String senderCountry) {
            return this.senderCountry(Optional.ofNullable(senderCountry));
        }
        /**
         * Sets value for `senderName`
         * Sender's name.
         */
        @JsonSetter("sender_name")
        public Builder senderName(Optional<String> senderName) {
            this.senderName = senderName;
            return this;
        }

        /**
         * Sets value for `senderName`
         * Sender's name.
         */
        public Builder senderName(String senderName) {
            return this.senderName(Optional.ofNullable(senderName));
        }
        /**
         * Sets value for `senderReference`
         * Sender reference.
         */
        @JsonSetter("sender_reference")
        public Builder senderReference(Optional<String> senderReference) {
            this.senderReference = senderReference;
            return this;
        }

        /**
         * Sets value for `senderReference`
         * Sender reference.
         */
        public Builder senderReference(String senderReference) {
            return this.senderReference(Optional.ofNullable(senderReference));
        }
        /**
         * Sets value for `senderRoutingCode`
         * Sender routing code.
         */
        @JsonSetter("sender_routing_code")
        public Builder senderRoutingCode(Optional<String> senderRoutingCode) {
            this.senderRoutingCode = senderRoutingCode;
            return this;
        }

        /**
         * Sets value for `senderRoutingCode`
         * Sender routing code.
         */
        public Builder senderRoutingCode(String senderRoutingCode) {
            return this.senderRoutingCode(Optional.ofNullable(senderRoutingCode));
        }



        public DemoSimulateFundingBody build() {
            if (amount == null) {
                throw new IllegalStateException("amount is required");
            }

            if (currency == null) {
                throw new IllegalStateException("currency is required");
            }

            if (id == null) {
                throw new IllegalStateException("id is required");
            }

            if (receiverAccountNumber == null) {
                throw new IllegalStateException("receiverAccountNumber is required");
            }

            return new DemoSimulateFundingBody(this);
        }
    }

}



