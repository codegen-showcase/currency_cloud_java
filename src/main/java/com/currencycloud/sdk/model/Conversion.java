
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
 * Conversion.
 */
@JsonDeserialize(builder = Conversion.Builder.class)
public final class Conversion {
    /**
     * UUID of the Account that the Conversion belongs to.
     */
    private final Optional<String> accountId;

    /**
     * Three character ISO code for the currency being bought.
     */
    private final Optional<String> buyCurrency;

    /**
     * The amount of buy currency for a client.
     */
    private final Optional<String> clientBuyAmount;

    /**
     * The rate that will be returned to your customer after all spread has been applied.
     */
    private final Optional<String> clientRate;

    /**
     * The amount of sell currency for a client.
     */
    private final Optional<String> clientSellAmount;

    /**
     * The date the conversion will be made.
     */
    private final Optional<String> conversionDate;

    /**
     * The market rate.
     */
    private final Optional<String> coreRate;

    /**
     * Date the conversion was created.
     */
    private final Optional<String> createdAt;

    /**
     * UUID of the Contact that requested the conversion.
     */
    private final Optional<String> creatorContactId;

    /**
     * Concatenated string of the two currencies traded, eg. "USDEUR".
     */
    private final Optional<String> currencyPair;

    /**
     * The amount of a deposit required.
     */
    private final Optional<String> depositAmount;

    /**
     * Three-letter ISO currency code for the currency the deposit is shown in.
     */
    private final Optional<String> depositCurrency;

    /**
     * Is a deposit required for the conversion?
     */
    private final Optional<Boolean> depositRequired;

    /**
     * Date by which deposit is required, format YYYY-MM-DDThh:mm:ss.SSSZ.
     */
    private final Optional<String> depositRequiredAt;

    /**
     * Deposit status
     */
    private final Optional<ConversionDepositStatusEnum> depositStatus;

    /**
     * Which currency side is fixed -  the buy or sell one.
     */
    private final Optional<ConversionFixedSideEnum> fixedSide;

    /**
     * Conversion UUID
     */
    private final Optional<String> id;

    /**
     * The midpoint between the buy and sell rates.
     */
    private final Optional<String> midMarketRate;

    /**
     * The amount of buy currency for a partner.
     */
    private final Optional<String> partnerBuyAmount;

    /**
     * The market rate + Currencycloud commission (if applicable).
     */
    private final Optional<String> partnerRate;

    /**
     * The amount of sell currency for a partner.
     */
    private final Optional<String> partnerSellAmount;

    /**
     * The id of payments linked with this conversion - these payments won’t be processed until the conversion settles.
     */
    private final Optional<List<String>> paymentIds;

    /**
     * Three character ISO code for the currency being sold.
     */
    private final Optional<String> sellCurrency;

    /**
     * The date and time by which funds need to be available to settle the trade.
     */
    private final Optional<String> settlementDate;

    /**
     * A human readable unique trade indentifier, in the format YYYYMMDD-XXXXXX.
     */
    private final Optional<String> shortReference;

    /**
     * Current conversion status.
     */
    private final Optional<ConversionStatusEnum> status;

    /**
     * The buy amount from the trade, that has not been allocated towards funding a payment.
     */
    private final Optional<String> unallocatedFunds;

    /**
     * User-generated idempotency key. Beneficial for request tracking / management.
     */
    private final Optional<String> uniqueRequestId;

    /**
     * Date the conversion was last updated.
     */
    private final Optional<String> updatedAt;


    private Conversion(Builder builder) {
        this.accountId = builder.accountId;
        this.buyCurrency = builder.buyCurrency;
        this.clientBuyAmount = builder.clientBuyAmount;
        this.clientRate = builder.clientRate;
        this.clientSellAmount = builder.clientSellAmount;
        this.conversionDate = builder.conversionDate;
        this.coreRate = builder.coreRate;
        this.createdAt = builder.createdAt;
        this.creatorContactId = builder.creatorContactId;
        this.currencyPair = builder.currencyPair;
        this.depositAmount = builder.depositAmount;
        this.depositCurrency = builder.depositCurrency;
        this.depositRequired = builder.depositRequired;
        this.depositRequiredAt = builder.depositRequiredAt;
        this.depositStatus = builder.depositStatus;
        this.fixedSide = builder.fixedSide;
        this.id = builder.id;
        this.midMarketRate = builder.midMarketRate;
        this.partnerBuyAmount = builder.partnerBuyAmount;
        this.partnerRate = builder.partnerRate;
        this.partnerSellAmount = builder.partnerSellAmount;
        this.paymentIds = builder.paymentIds;
        this.sellCurrency = builder.sellCurrency;
        this.settlementDate = builder.settlementDate;
        this.shortReference = builder.shortReference;
        this.status = builder.status;
        this.unallocatedFunds = builder.unallocatedFunds;
        this.uniqueRequestId = builder.uniqueRequestId;
        this.updatedAt = builder.updatedAt;
    }

    /**
     * Retrieves value for `accountId`
     * UUID of the Account that the Conversion belongs to.
     */
    @JsonProperty("account_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAccountId() {
        return accountId;
    }
    /**
     * Retrieves value for `buyCurrency`
     * Three character ISO code for the currency being bought.
     */
    @JsonProperty("buy_currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBuyCurrency() {
        return buyCurrency;
    }
    /**
     * Retrieves value for `clientBuyAmount`
     * The amount of buy currency for a client.
     */
    @JsonProperty("client_buy_amount")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getClientBuyAmount() {
        return clientBuyAmount;
    }
    /**
     * Retrieves value for `clientRate`
     * The rate that will be returned to your customer after all spread has been applied.
     */
    @JsonProperty("client_rate")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getClientRate() {
        return clientRate;
    }
    /**
     * Retrieves value for `clientSellAmount`
     * The amount of sell currency for a client.
     */
    @JsonProperty("client_sell_amount")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getClientSellAmount() {
        return clientSellAmount;
    }
    /**
     * Retrieves value for `conversionDate`
     * The date the conversion will be made.
     */
    @JsonProperty("conversion_date")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getConversionDate() {
        return conversionDate;
    }
    /**
     * Retrieves value for `coreRate`
     * The market rate.
     */
    @JsonProperty("core_rate")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCoreRate() {
        return coreRate;
    }
    /**
     * Retrieves value for `createdAt`
     * Date the conversion was created.
     */
    @JsonProperty("created_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatedAt() {
        return createdAt;
    }
    /**
     * Retrieves value for `creatorContactId`
     * UUID of the Contact that requested the conversion.
     */
    @JsonProperty("creator_contact_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatorContactId() {
        return creatorContactId;
    }
    /**
     * Retrieves value for `currencyPair`
     * Concatenated string of the two currencies traded, eg. "USDEUR".
     */
    @JsonProperty("currency_pair")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCurrencyPair() {
        return currencyPair;
    }
    /**
     * Retrieves value for `depositAmount`
     * The amount of a deposit required.
     */
    @JsonProperty("deposit_amount")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getDepositAmount() {
        return depositAmount;
    }
    /**
     * Retrieves value for `depositCurrency`
     * Three-letter ISO currency code for the currency the deposit is shown in.
     */
    @JsonProperty("deposit_currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getDepositCurrency() {
        return depositCurrency;
    }
    /**
     * Retrieves value for `depositRequired`
     * Is a deposit required for the conversion?
     */
    @JsonProperty("deposit_required")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Boolean> getDepositRequired() {
        return depositRequired;
    }
    /**
     * Retrieves value for `depositRequiredAt`
     * Date by which deposit is required, format YYYY-MM-DDThh:mm:ss.SSSZ.
     */
    @JsonProperty("deposit_required_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getDepositRequiredAt() {
        return depositRequiredAt;
    }
    /**
     * Retrieves value for `depositStatus`
     * Deposit status
     */
    @JsonProperty("deposit_status")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<ConversionDepositStatusEnum> getDepositStatus() {
        return depositStatus;
    }
    /**
     * Retrieves value for `fixedSide`
     * Which currency side is fixed -  the buy or sell one.
     */
    @JsonProperty("fixed_side")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<ConversionFixedSideEnum> getFixedSide() {
        return fixedSide;
    }
    /**
     * Retrieves value for `id`
     * Conversion UUID
     */
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getId() {
        return id;
    }
    /**
     * Retrieves value for `midMarketRate`
     * The midpoint between the buy and sell rates.
     */
    @JsonProperty("mid_market_rate")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getMidMarketRate() {
        return midMarketRate;
    }
    /**
     * Retrieves value for `partnerBuyAmount`
     * The amount of buy currency for a partner.
     */
    @JsonProperty("partner_buy_amount")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPartnerBuyAmount() {
        return partnerBuyAmount;
    }
    /**
     * Retrieves value for `partnerRate`
     * The market rate + Currencycloud commission (if applicable).
     */
    @JsonProperty("partner_rate")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPartnerRate() {
        return partnerRate;
    }
    /**
     * Retrieves value for `partnerSellAmount`
     * The amount of sell currency for a partner.
     */
    @JsonProperty("partner_sell_amount")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPartnerSellAmount() {
        return partnerSellAmount;
    }
    /**
     * Retrieves value for `paymentIds`
     * The id of payments linked with this conversion - these payments won’t be processed until the conversion settles.
     */
    @JsonProperty("payment_ids")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<String>> getPaymentIds() {
        return paymentIds;
    }
    /**
     * Retrieves value for `sellCurrency`
     * Three character ISO code for the currency being sold.
     */
    @JsonProperty("sell_currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSellCurrency() {
        return sellCurrency;
    }
    /**
     * Retrieves value for `settlementDate`
     * The date and time by which funds need to be available to settle the trade.
     */
    @JsonProperty("settlement_date")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSettlementDate() {
        return settlementDate;
    }
    /**
     * Retrieves value for `shortReference`
     * A human readable unique trade indentifier, in the format YYYYMMDD-XXXXXX.
     */
    @JsonProperty("short_reference")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getShortReference() {
        return shortReference;
    }
    /**
     * Retrieves value for `status`
     * Current conversion status.
     */
    @JsonProperty("status")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<ConversionStatusEnum> getStatus() {
        return status;
    }
    /**
     * Retrieves value for `unallocatedFunds`
     * The buy amount from the trade, that has not been allocated towards funding a payment.
     */
    @JsonProperty("unallocated_funds")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUnallocatedFunds() {
        return unallocatedFunds;
    }
    /**
     * Retrieves value for `uniqueRequestId`
     * User-generated idempotency key. Beneficial for request tracking / management.
     */
    @JsonProperty("unique_request_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUniqueRequestId() {
        return uniqueRequestId;
    }
    /**
     * Retrieves value for `updatedAt`
     * Date the conversion was last updated.
     */
    @JsonProperty("updated_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof Conversion && equalTo((Conversion) other);
    }

    private boolean equalTo(Conversion other) {
        return
            accountId.equals(other.accountId) &&

            buyCurrency.equals(other.buyCurrency) &&

            clientBuyAmount.equals(other.clientBuyAmount) &&

            clientRate.equals(other.clientRate) &&

            clientSellAmount.equals(other.clientSellAmount) &&

            conversionDate.equals(other.conversionDate) &&

            coreRate.equals(other.coreRate) &&

            createdAt.equals(other.createdAt) &&

            creatorContactId.equals(other.creatorContactId) &&

            currencyPair.equals(other.currencyPair) &&

            depositAmount.equals(other.depositAmount) &&

            depositCurrency.equals(other.depositCurrency) &&

            depositRequired.equals(other.depositRequired) &&

            depositRequiredAt.equals(other.depositRequiredAt) &&

            depositStatus.equals(other.depositStatus) &&

            fixedSide.equals(other.fixedSide) &&

            id.equals(other.id) &&

            midMarketRate.equals(other.midMarketRate) &&

            partnerBuyAmount.equals(other.partnerBuyAmount) &&

            partnerRate.equals(other.partnerRate) &&

            partnerSellAmount.equals(other.partnerSellAmount) &&

            paymentIds.equals(other.paymentIds) &&

            sellCurrency.equals(other.sellCurrency) &&

            settlementDate.equals(other.settlementDate) &&

            shortReference.equals(other.shortReference) &&

            status.equals(other.status) &&

            unallocatedFunds.equals(other.unallocatedFunds) &&

            uniqueRequestId.equals(other.uniqueRequestId) &&

            updatedAt.equals(other.updatedAt)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accountId,
                   this.buyCurrency,
                   this.clientBuyAmount,
                   this.clientRate,
                   this.clientSellAmount,
                   this.conversionDate,
                   this.coreRate,
                   this.createdAt,
                   this.creatorContactId,
                   this.currencyPair,
                   this.depositAmount,
                   this.depositCurrency,
                   this.depositRequired,
                   this.depositRequiredAt,
                   this.depositStatus,
                   this.fixedSide,
                   this.id,
                   this.midMarketRate,
                   this.partnerBuyAmount,
                   this.partnerRate,
                   this.partnerSellAmount,
                   this.paymentIds,
                   this.sellCurrency,
                   this.settlementDate,
                   this.shortReference,
                   this.status,
                   this.unallocatedFunds,
                   this.uniqueRequestId,
                   this.updatedAt
               );
    }

    @Override
    public String toString() {
        return "Conversion{" +
               "accountId=" + accountId + ", " +
               "buyCurrency=" + buyCurrency + ", " +
               "clientBuyAmount=" + clientBuyAmount + ", " +
               "clientRate=" + clientRate + ", " +
               "clientSellAmount=" + clientSellAmount + ", " +
               "conversionDate=" + conversionDate + ", " +
               "coreRate=" + coreRate + ", " +
               "createdAt=" + createdAt + ", " +
               "creatorContactId=" + creatorContactId + ", " +
               "currencyPair=" + currencyPair + ", " +
               "depositAmount=" + depositAmount + ", " +
               "depositCurrency=" + depositCurrency + ", " +
               "depositRequired=" + depositRequired + ", " +
               "depositRequiredAt=" + depositRequiredAt + ", " +
               "depositStatus=" + depositStatus + ", " +
               "fixedSide=" + fixedSide + ", " +
               "id=" + id + ", " +
               "midMarketRate=" + midMarketRate + ", " +
               "partnerBuyAmount=" + partnerBuyAmount + ", " +
               "partnerRate=" + partnerRate + ", " +
               "partnerSellAmount=" + partnerSellAmount + ", " +
               "paymentIds=" + paymentIds + ", " +
               "sellCurrency=" + sellCurrency + ", " +
               "settlementDate=" + settlementDate + ", " +
               "shortReference=" + shortReference + ", " +
               "status=" + status + ", " +
               "unallocatedFunds=" + unallocatedFunds + ", " +
               "uniqueRequestId=" + uniqueRequestId + ", " +
               "updatedAt=" + updatedAt +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * UUID of the Account that the Conversion belongs to.
         */
        private Optional<String> accountId = Optional.empty();

        /**
         * Three character ISO code for the currency being bought.
         */
        private Optional<String> buyCurrency = Optional.empty();

        /**
         * The amount of buy currency for a client.
         */
        private Optional<String> clientBuyAmount = Optional.empty();

        /**
         * The rate that will be returned to your customer after all spread has been applied.
         */
        private Optional<String> clientRate = Optional.empty();

        /**
         * The amount of sell currency for a client.
         */
        private Optional<String> clientSellAmount = Optional.empty();

        /**
         * The date the conversion will be made.
         */
        private Optional<String> conversionDate = Optional.empty();

        /**
         * The market rate.
         */
        private Optional<String> coreRate = Optional.empty();

        /**
         * Date the conversion was created.
         */
        private Optional<String> createdAt = Optional.empty();

        /**
         * UUID of the Contact that requested the conversion.
         */
        private Optional<String> creatorContactId = Optional.empty();

        /**
         * Concatenated string of the two currencies traded, eg. "USDEUR".
         */
        private Optional<String> currencyPair = Optional.empty();

        /**
         * The amount of a deposit required.
         */
        private Optional<String> depositAmount = Optional.empty();

        /**
         * Three-letter ISO currency code for the currency the deposit is shown in.
         */
        private Optional<String> depositCurrency = Optional.empty();

        /**
         * Is a deposit required for the conversion?
         */
        private Optional<Boolean> depositRequired = Optional.empty();

        /**
         * Date by which deposit is required, format YYYY-MM-DDThh:mm:ss.SSSZ.
         */
        private Optional<String> depositRequiredAt = Optional.empty();

        /**
         * Deposit status
         */
        private Optional<ConversionDepositStatusEnum> depositStatus = Optional.empty();

        /**
         * Which currency side is fixed -  the buy or sell one.
         */
        private Optional<ConversionFixedSideEnum> fixedSide = Optional.empty();

        /**
         * Conversion UUID
         */
        private Optional<String> id = Optional.empty();

        /**
         * The midpoint between the buy and sell rates.
         */
        private Optional<String> midMarketRate = Optional.empty();

        /**
         * The amount of buy currency for a partner.
         */
        private Optional<String> partnerBuyAmount = Optional.empty();

        /**
         * The market rate + Currencycloud commission (if applicable).
         */
        private Optional<String> partnerRate = Optional.empty();

        /**
         * The amount of sell currency for a partner.
         */
        private Optional<String> partnerSellAmount = Optional.empty();

        /**
         * The id of payments linked with this conversion - these payments won’t be processed until the conversion settles.
         */
        private Optional<List<String>> paymentIds = Optional.empty();

        /**
         * Three character ISO code for the currency being sold.
         */
        private Optional<String> sellCurrency = Optional.empty();

        /**
         * The date and time by which funds need to be available to settle the trade.
         */
        private Optional<String> settlementDate = Optional.empty();

        /**
         * A human readable unique trade indentifier, in the format YYYYMMDD-XXXXXX.
         */
        private Optional<String> shortReference = Optional.empty();

        /**
         * Current conversion status.
         */
        private Optional<ConversionStatusEnum> status = Optional.empty();

        /**
         * The buy amount from the trade, that has not been allocated towards funding a payment.
         */
        private Optional<String> unallocatedFunds = Optional.empty();

        /**
         * User-generated idempotency key. Beneficial for request tracking / management.
         */
        private Optional<String> uniqueRequestId = Optional.empty();

        /**
         * Date the conversion was last updated.
         */
        private Optional<String> updatedAt = Optional.empty();


        private Builder() {}

        public Builder from(Conversion other) {
            accountId(other.getAccountId());
            buyCurrency(other.getBuyCurrency());
            clientBuyAmount(other.getClientBuyAmount());
            clientRate(other.getClientRate());
            clientSellAmount(other.getClientSellAmount());
            conversionDate(other.getConversionDate());
            coreRate(other.getCoreRate());
            createdAt(other.getCreatedAt());
            creatorContactId(other.getCreatorContactId());
            currencyPair(other.getCurrencyPair());
            depositAmount(other.getDepositAmount());
            depositCurrency(other.getDepositCurrency());
            depositRequired(other.getDepositRequired());
            depositRequiredAt(other.getDepositRequiredAt());
            depositStatus(other.getDepositStatus());
            fixedSide(other.getFixedSide());
            id(other.getId());
            midMarketRate(other.getMidMarketRate());
            partnerBuyAmount(other.getPartnerBuyAmount());
            partnerRate(other.getPartnerRate());
            partnerSellAmount(other.getPartnerSellAmount());
            paymentIds(other.getPaymentIds());
            sellCurrency(other.getSellCurrency());
            settlementDate(other.getSettlementDate());
            shortReference(other.getShortReference());
            status(other.getStatus());
            unallocatedFunds(other.getUnallocatedFunds());
            uniqueRequestId(other.getUniqueRequestId());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        /**
         * Sets value for `accountId`
         * UUID of the Account that the Conversion belongs to.
         */
        @JsonSetter("account_id")
        public Builder accountId(Optional<String> accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Sets value for `accountId`
         * UUID of the Account that the Conversion belongs to.
         */
        public Builder accountId(String accountId) {
            return this.accountId(Optional.ofNullable(accountId));
        }
        /**
         * Sets value for `buyCurrency`
         * Three character ISO code for the currency being bought.
         */
        @JsonSetter("buy_currency")
        public Builder buyCurrency(Optional<String> buyCurrency) {
            this.buyCurrency = buyCurrency;
            return this;
        }

        /**
         * Sets value for `buyCurrency`
         * Three character ISO code for the currency being bought.
         */
        public Builder buyCurrency(String buyCurrency) {
            return this.buyCurrency(Optional.ofNullable(buyCurrency));
        }
        /**
         * Sets value for `clientBuyAmount`
         * The amount of buy currency for a client.
         */
        @JsonSetter("client_buy_amount")
        public Builder clientBuyAmount(Optional<String> clientBuyAmount) {
            this.clientBuyAmount = clientBuyAmount;
            return this;
        }

        /**
         * Sets value for `clientBuyAmount`
         * The amount of buy currency for a client.
         */
        public Builder clientBuyAmount(String clientBuyAmount) {
            return this.clientBuyAmount(Optional.ofNullable(clientBuyAmount));
        }
        /**
         * Sets value for `clientRate`
         * The rate that will be returned to your customer after all spread has been applied.
         */
        @JsonSetter("client_rate")
        public Builder clientRate(Optional<String> clientRate) {
            this.clientRate = clientRate;
            return this;
        }

        /**
         * Sets value for `clientRate`
         * The rate that will be returned to your customer after all spread has been applied.
         */
        public Builder clientRate(String clientRate) {
            return this.clientRate(Optional.ofNullable(clientRate));
        }
        /**
         * Sets value for `clientSellAmount`
         * The amount of sell currency for a client.
         */
        @JsonSetter("client_sell_amount")
        public Builder clientSellAmount(Optional<String> clientSellAmount) {
            this.clientSellAmount = clientSellAmount;
            return this;
        }

        /**
         * Sets value for `clientSellAmount`
         * The amount of sell currency for a client.
         */
        public Builder clientSellAmount(String clientSellAmount) {
            return this.clientSellAmount(Optional.ofNullable(clientSellAmount));
        }
        /**
         * Sets value for `conversionDate`
         * The date the conversion will be made.
         */
        @JsonSetter("conversion_date")
        public Builder conversionDate(Optional<String> conversionDate) {
            this.conversionDate = conversionDate;
            return this;
        }

        /**
         * Sets value for `conversionDate`
         * The date the conversion will be made.
         */
        public Builder conversionDate(String conversionDate) {
            return this.conversionDate(Optional.ofNullable(conversionDate));
        }
        /**
         * Sets value for `coreRate`
         * The market rate.
         */
        @JsonSetter("core_rate")
        public Builder coreRate(Optional<String> coreRate) {
            this.coreRate = coreRate;
            return this;
        }

        /**
         * Sets value for `coreRate`
         * The market rate.
         */
        public Builder coreRate(String coreRate) {
            return this.coreRate(Optional.ofNullable(coreRate));
        }
        /**
         * Sets value for `createdAt`
         * Date the conversion was created.
         */
        @JsonSetter("created_at")
        public Builder createdAt(Optional<String> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Sets value for `createdAt`
         * Date the conversion was created.
         */
        public Builder createdAt(String createdAt) {
            return this.createdAt(Optional.ofNullable(createdAt));
        }
        /**
         * Sets value for `creatorContactId`
         * UUID of the Contact that requested the conversion.
         */
        @JsonSetter("creator_contact_id")
        public Builder creatorContactId(Optional<String> creatorContactId) {
            this.creatorContactId = creatorContactId;
            return this;
        }

        /**
         * Sets value for `creatorContactId`
         * UUID of the Contact that requested the conversion.
         */
        public Builder creatorContactId(String creatorContactId) {
            return this.creatorContactId(Optional.ofNullable(creatorContactId));
        }
        /**
         * Sets value for `currencyPair`
         * Concatenated string of the two currencies traded, eg. "USDEUR".
         */
        @JsonSetter("currency_pair")
        public Builder currencyPair(Optional<String> currencyPair) {
            this.currencyPair = currencyPair;
            return this;
        }

        /**
         * Sets value for `currencyPair`
         * Concatenated string of the two currencies traded, eg. "USDEUR".
         */
        public Builder currencyPair(String currencyPair) {
            return this.currencyPair(Optional.ofNullable(currencyPair));
        }
        /**
         * Sets value for `depositAmount`
         * The amount of a deposit required.
         */
        @JsonSetter("deposit_amount")
        public Builder depositAmount(Optional<String> depositAmount) {
            this.depositAmount = depositAmount;
            return this;
        }

        /**
         * Sets value for `depositAmount`
         * The amount of a deposit required.
         */
        public Builder depositAmount(String depositAmount) {
            return this.depositAmount(Optional.ofNullable(depositAmount));
        }
        /**
         * Sets value for `depositCurrency`
         * Three-letter ISO currency code for the currency the deposit is shown in.
         */
        @JsonSetter("deposit_currency")
        public Builder depositCurrency(Optional<String> depositCurrency) {
            this.depositCurrency = depositCurrency;
            return this;
        }

        /**
         * Sets value for `depositCurrency`
         * Three-letter ISO currency code for the currency the deposit is shown in.
         */
        public Builder depositCurrency(String depositCurrency) {
            return this.depositCurrency(Optional.ofNullable(depositCurrency));
        }
        /**
         * Sets value for `depositRequired`
         * Is a deposit required for the conversion?
         */
        @JsonSetter("deposit_required")
        public Builder depositRequired(Optional<Boolean> depositRequired) {
            this.depositRequired = depositRequired;
            return this;
        }

        /**
         * Sets value for `depositRequired`
         * Is a deposit required for the conversion?
         */
        public Builder depositRequired(Boolean depositRequired) {
            return this.depositRequired(Optional.ofNullable(depositRequired));
        }
        /**
         * Sets value for `depositRequiredAt`
         * Date by which deposit is required, format YYYY-MM-DDThh:mm:ss.SSSZ.
         */
        @JsonSetter("deposit_required_at")
        public Builder depositRequiredAt(Optional<String> depositRequiredAt) {
            this.depositRequiredAt = depositRequiredAt;
            return this;
        }

        /**
         * Sets value for `depositRequiredAt`
         * Date by which deposit is required, format YYYY-MM-DDThh:mm:ss.SSSZ.
         */
        public Builder depositRequiredAt(String depositRequiredAt) {
            return this.depositRequiredAt(Optional.ofNullable(depositRequiredAt));
        }
        /**
         * Sets value for `depositStatus`
         * Deposit status
         */
        @JsonSetter("deposit_status")
        public Builder depositStatus(Optional<ConversionDepositStatusEnum> depositStatus) {
            this.depositStatus = depositStatus;
            return this;
        }

        /**
         * Sets value for `depositStatus`
         * Deposit status
         */
        public Builder depositStatus(ConversionDepositStatusEnum depositStatus) {
            return this.depositStatus(Optional.ofNullable(depositStatus));
        }
        /**
         * Sets value for `fixedSide`
         * Which currency side is fixed -  the buy or sell one.
         */
        @JsonSetter("fixed_side")
        public Builder fixedSide(Optional<ConversionFixedSideEnum> fixedSide) {
            this.fixedSide = fixedSide;
            return this;
        }

        /**
         * Sets value for `fixedSide`
         * Which currency side is fixed -  the buy or sell one.
         */
        public Builder fixedSide(ConversionFixedSideEnum fixedSide) {
            return this.fixedSide(Optional.ofNullable(fixedSide));
        }
        /**
         * Sets value for `id`
         * Conversion UUID
         */
        @JsonSetter("id")
        public Builder id(Optional<String> id) {
            this.id = id;
            return this;
        }

        /**
         * Sets value for `id`
         * Conversion UUID
         */
        public Builder id(String id) {
            return this.id(Optional.ofNullable(id));
        }
        /**
         * Sets value for `midMarketRate`
         * The midpoint between the buy and sell rates.
         */
        @JsonSetter("mid_market_rate")
        public Builder midMarketRate(Optional<String> midMarketRate) {
            this.midMarketRate = midMarketRate;
            return this;
        }

        /**
         * Sets value for `midMarketRate`
         * The midpoint between the buy and sell rates.
         */
        public Builder midMarketRate(String midMarketRate) {
            return this.midMarketRate(Optional.ofNullable(midMarketRate));
        }
        /**
         * Sets value for `partnerBuyAmount`
         * The amount of buy currency for a partner.
         */
        @JsonSetter("partner_buy_amount")
        public Builder partnerBuyAmount(Optional<String> partnerBuyAmount) {
            this.partnerBuyAmount = partnerBuyAmount;
            return this;
        }

        /**
         * Sets value for `partnerBuyAmount`
         * The amount of buy currency for a partner.
         */
        public Builder partnerBuyAmount(String partnerBuyAmount) {
            return this.partnerBuyAmount(Optional.ofNullable(partnerBuyAmount));
        }
        /**
         * Sets value for `partnerRate`
         * The market rate + Currencycloud commission (if applicable).
         */
        @JsonSetter("partner_rate")
        public Builder partnerRate(Optional<String> partnerRate) {
            this.partnerRate = partnerRate;
            return this;
        }

        /**
         * Sets value for `partnerRate`
         * The market rate + Currencycloud commission (if applicable).
         */
        public Builder partnerRate(String partnerRate) {
            return this.partnerRate(Optional.ofNullable(partnerRate));
        }
        /**
         * Sets value for `partnerSellAmount`
         * The amount of sell currency for a partner.
         */
        @JsonSetter("partner_sell_amount")
        public Builder partnerSellAmount(Optional<String> partnerSellAmount) {
            this.partnerSellAmount = partnerSellAmount;
            return this;
        }

        /**
         * Sets value for `partnerSellAmount`
         * The amount of sell currency for a partner.
         */
        public Builder partnerSellAmount(String partnerSellAmount) {
            return this.partnerSellAmount(Optional.ofNullable(partnerSellAmount));
        }
        /**
         * Sets value for `paymentIds`
         * The id of payments linked with this conversion - these payments won’t be processed until the conversion settles.
         */
        @JsonSetter("payment_ids")
        public Builder paymentIds(Optional<List<String>> paymentIds) {
            this.paymentIds = paymentIds;
            return this;
        }

        /**
         * Sets value for `paymentIds`
         * The id of payments linked with this conversion - these payments won’t be processed until the conversion settles.
         */
        public Builder paymentIds(List<String> paymentIds) {
            return this.paymentIds(Optional.ofNullable(paymentIds));
        }
        /**
         * Sets value for `sellCurrency`
         * Three character ISO code for the currency being sold.
         */
        @JsonSetter("sell_currency")
        public Builder sellCurrency(Optional<String> sellCurrency) {
            this.sellCurrency = sellCurrency;
            return this;
        }

        /**
         * Sets value for `sellCurrency`
         * Three character ISO code for the currency being sold.
         */
        public Builder sellCurrency(String sellCurrency) {
            return this.sellCurrency(Optional.ofNullable(sellCurrency));
        }
        /**
         * Sets value for `settlementDate`
         * The date and time by which funds need to be available to settle the trade.
         */
        @JsonSetter("settlement_date")
        public Builder settlementDate(Optional<String> settlementDate) {
            this.settlementDate = settlementDate;
            return this;
        }

        /**
         * Sets value for `settlementDate`
         * The date and time by which funds need to be available to settle the trade.
         */
        public Builder settlementDate(String settlementDate) {
            return this.settlementDate(Optional.ofNullable(settlementDate));
        }
        /**
         * Sets value for `shortReference`
         * A human readable unique trade indentifier, in the format YYYYMMDD-XXXXXX.
         */
        @JsonSetter("short_reference")
        public Builder shortReference(Optional<String> shortReference) {
            this.shortReference = shortReference;
            return this;
        }

        /**
         * Sets value for `shortReference`
         * A human readable unique trade indentifier, in the format YYYYMMDD-XXXXXX.
         */
        public Builder shortReference(String shortReference) {
            return this.shortReference(Optional.ofNullable(shortReference));
        }
        /**
         * Sets value for `status`
         * Current conversion status.
         */
        @JsonSetter("status")
        public Builder status(Optional<ConversionStatusEnum> status) {
            this.status = status;
            return this;
        }

        /**
         * Sets value for `status`
         * Current conversion status.
         */
        public Builder status(ConversionStatusEnum status) {
            return this.status(Optional.ofNullable(status));
        }
        /**
         * Sets value for `unallocatedFunds`
         * The buy amount from the trade, that has not been allocated towards funding a payment.
         */
        @JsonSetter("unallocated_funds")
        public Builder unallocatedFunds(Optional<String> unallocatedFunds) {
            this.unallocatedFunds = unallocatedFunds;
            return this;
        }

        /**
         * Sets value for `unallocatedFunds`
         * The buy amount from the trade, that has not been allocated towards funding a payment.
         */
        public Builder unallocatedFunds(String unallocatedFunds) {
            return this.unallocatedFunds(Optional.ofNullable(unallocatedFunds));
        }
        /**
         * Sets value for `uniqueRequestId`
         * User-generated idempotency key. Beneficial for request tracking / management.
         */
        @JsonSetter("unique_request_id")
        public Builder uniqueRequestId(Optional<String> uniqueRequestId) {
            this.uniqueRequestId = uniqueRequestId;
            return this;
        }

        /**
         * Sets value for `uniqueRequestId`
         * User-generated idempotency key. Beneficial for request tracking / management.
         */
        public Builder uniqueRequestId(String uniqueRequestId) {
            return this.uniqueRequestId(Optional.ofNullable(uniqueRequestId));
        }
        /**
         * Sets value for `updatedAt`
         * Date the conversion was last updated.
         */
        @JsonSetter("updated_at")
        public Builder updatedAt(Optional<String> updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Sets value for `updatedAt`
         * Date the conversion was last updated.
         */
        public Builder updatedAt(String updatedAt) {
            return this.updatedAt(Optional.ofNullable(updatedAt));
        }



        public Conversion build() {
            return new Conversion(this);
        }
    }

}



