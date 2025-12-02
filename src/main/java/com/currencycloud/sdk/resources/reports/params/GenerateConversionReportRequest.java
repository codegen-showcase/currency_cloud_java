
package com.currencycloud.sdk.resources.reports.params;

import java.util.Objects;
import java.util.Optional;

import com.currencycloud.sdk.model.ReportsGenerateConversionReportBodyClientStatusEnum;
import com.currencycloud.sdk.model.ReportsGenerateConversionReportBodyScopeEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * GenerateConversionReportRequest
 */
@JsonDeserialize(builder = GenerateConversionReportRequest.Builder.class)
public final class GenerateConversionReportRequest {
    /**
     * Three-letter ISO 4217 currency code.
     */
    private final Optional<String> buyCurrency;

    /**
     * Minimum client buy amount.
     */
    private final Optional<String> clientBuyAmountFrom;

    /**
     * Maximum client buy amount.
     */
    private final Optional<String> clientBuyAmountTo;

    /**
     * Minimum client sell amount.
     */
    private final Optional<String> clientSellAmountFrom;

    /**
     * Maximum client sell amount.
     */
    private final Optional<String> clientSellAmountTo;

    /**
     * The current status of the conversion.
     */
    private final Optional<ReportsGenerateConversionReportBodyClientStatusEnum> clientStatus;

    /**
     * ISO 8601 Date/time for start of range for when buy currency was delivered.
     */
    private final Optional<String> conversionDateFrom;

    /**
     * ISO 8601 Date/time for end of range for when buy currency was delivered.
     */
    private final Optional<String> conversionDateTo;

    /**
     * ISO 8601 Date/time for start of date range for when the conversion was created.
     */
    private final Optional<String> createdAtFrom;

    /**
     * ISO 8601 Date/time for end of date range for when the conversion was created.
     */
    private final Optional<String> createdAtTo;

    /**
     * Description that will be applied to the report.
     */
    private final Optional<String> description;

    /**
     * A contact UUID for the sub-account you're acting on behalf of.
     */
    private final Optional<String> onBehalfOf;

    /**
     * Minimum buy amount (sub-accounts).
     */
    private final Optional<String> partnerBuyAmountFrom;

    /**
     * Maximum buy amount (sub-accounts).
     */
    private final Optional<String> partnerBuyAmountTo;

    /**
     * Minimum sell amount (sub-accounts).
     */
    private final Optional<String> partnerSellAmountFrom;

    /**
     * Maximum sell amount (sub-accounts).
     */
    private final Optional<String> partnerSellAmountTo;

    /**
     * Specify which account level will be used - 'own' is the default.
     */
    private final Optional<ReportsGenerateConversionReportBodyScopeEnum> scope;

    /**
     * Three-letter ISO 4217 currency code.
     */
    private final Optional<String> sellCurrency;

    /**
     * ISO 8601 Date/time for start of date range for when the sell_currency was debited.
     */
    private final Optional<String> settlementDateFrom;

    /**
     * ISO 8601 Date/time for end of date range for when the sell_currency was debited.
     */
    private final Optional<String> settlementDateTo;

    /**
     * Unique request ID of conversion.
     */
    private final Optional<String> uniqueRequestId;

    /**
     * ISO 8601 Date/time for start of date range for when the conversion was updated.
     */
    private final Optional<String> updatedAtFrom;

    /**
     * ISO 8601 Date/time for end of date range for when the conversion was updated.
     */
    private final Optional<String> updatedAtTo;


    private GenerateConversionReportRequest(Builder builder) {
        this.buyCurrency = builder.buyCurrency;
        this.clientBuyAmountFrom = builder.clientBuyAmountFrom;
        this.clientBuyAmountTo = builder.clientBuyAmountTo;
        this.clientSellAmountFrom = builder.clientSellAmountFrom;
        this.clientSellAmountTo = builder.clientSellAmountTo;
        this.clientStatus = builder.clientStatus;
        this.conversionDateFrom = builder.conversionDateFrom;
        this.conversionDateTo = builder.conversionDateTo;
        this.createdAtFrom = builder.createdAtFrom;
        this.createdAtTo = builder.createdAtTo;
        this.description = builder.description;
        this.onBehalfOf = builder.onBehalfOf;
        this.partnerBuyAmountFrom = builder.partnerBuyAmountFrom;
        this.partnerBuyAmountTo = builder.partnerBuyAmountTo;
        this.partnerSellAmountFrom = builder.partnerSellAmountFrom;
        this.partnerSellAmountTo = builder.partnerSellAmountTo;
        this.scope = builder.scope;
        this.sellCurrency = builder.sellCurrency;
        this.settlementDateFrom = builder.settlementDateFrom;
        this.settlementDateTo = builder.settlementDateTo;
        this.uniqueRequestId = builder.uniqueRequestId;
        this.updatedAtFrom = builder.updatedAtFrom;
        this.updatedAtTo = builder.updatedAtTo;
    }

    /**
     * Retrieves value for `buyCurrency`
     * Three-letter ISO 4217 currency code.
     */
    @JsonProperty("buy_currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getBuyCurrency() {
        return buyCurrency;
    }
    /**
     * Retrieves value for `clientBuyAmountFrom`
     * Minimum client buy amount.
     */
    @JsonProperty("client_buy_amount_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getClientBuyAmountFrom() {
        return clientBuyAmountFrom;
    }
    /**
     * Retrieves value for `clientBuyAmountTo`
     * Maximum client buy amount.
     */
    @JsonProperty("client_buy_amount_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getClientBuyAmountTo() {
        return clientBuyAmountTo;
    }
    /**
     * Retrieves value for `clientSellAmountFrom`
     * Minimum client sell amount.
     */
    @JsonProperty("client_sell_amount_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getClientSellAmountFrom() {
        return clientSellAmountFrom;
    }
    /**
     * Retrieves value for `clientSellAmountTo`
     * Maximum client sell amount.
     */
    @JsonProperty("client_sell_amount_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getClientSellAmountTo() {
        return clientSellAmountTo;
    }
    /**
     * Retrieves value for `clientStatus`
     * The current status of the conversion.
     */
    @JsonProperty("client_status")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<ReportsGenerateConversionReportBodyClientStatusEnum> getClientStatus() {
        return clientStatus;
    }
    /**
     * Retrieves value for `conversionDateFrom`
     * ISO 8601 Date/time for start of range for when buy currency was delivered.
     */
    @JsonProperty("conversion_date_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getConversionDateFrom() {
        return conversionDateFrom;
    }
    /**
     * Retrieves value for `conversionDateTo`
     * ISO 8601 Date/time for end of range for when buy currency was delivered.
     */
    @JsonProperty("conversion_date_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getConversionDateTo() {
        return conversionDateTo;
    }
    /**
     * Retrieves value for `createdAtFrom`
     * ISO 8601 Date/time for start of date range for when the conversion was created.
     */
    @JsonProperty("created_at_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatedAtFrom() {
        return createdAtFrom;
    }
    /**
     * Retrieves value for `createdAtTo`
     * ISO 8601 Date/time for end of date range for when the conversion was created.
     */
    @JsonProperty("created_at_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatedAtTo() {
        return createdAtTo;
    }
    /**
     * Retrieves value for `description`
     * Description that will be applied to the report.
     */
    @JsonProperty("description")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getDescription() {
        return description;
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
     * Retrieves value for `partnerBuyAmountFrom`
     * Minimum buy amount (sub-accounts).
     */
    @JsonProperty("partner_buy_amount_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPartnerBuyAmountFrom() {
        return partnerBuyAmountFrom;
    }
    /**
     * Retrieves value for `partnerBuyAmountTo`
     * Maximum buy amount (sub-accounts).
     */
    @JsonProperty("partner_buy_amount_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPartnerBuyAmountTo() {
        return partnerBuyAmountTo;
    }
    /**
     * Retrieves value for `partnerSellAmountFrom`
     * Minimum sell amount (sub-accounts).
     */
    @JsonProperty("partner_sell_amount_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPartnerSellAmountFrom() {
        return partnerSellAmountFrom;
    }
    /**
     * Retrieves value for `partnerSellAmountTo`
     * Maximum sell amount (sub-accounts).
     */
    @JsonProperty("partner_sell_amount_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getPartnerSellAmountTo() {
        return partnerSellAmountTo;
    }
    /**
     * Retrieves value for `scope`
     * Specify which account level will be used - 'own' is the default.
     */
    @JsonProperty("scope")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<ReportsGenerateConversionReportBodyScopeEnum> getScope() {
        return scope;
    }
    /**
     * Retrieves value for `sellCurrency`
     * Three-letter ISO 4217 currency code.
     */
    @JsonProperty("sell_currency")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSellCurrency() {
        return sellCurrency;
    }
    /**
     * Retrieves value for `settlementDateFrom`
     * ISO 8601 Date/time for start of date range for when the sell_currency was debited.
     */
    @JsonProperty("settlement_date_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSettlementDateFrom() {
        return settlementDateFrom;
    }
    /**
     * Retrieves value for `settlementDateTo`
     * ISO 8601 Date/time for end of date range for when the sell_currency was debited.
     */
    @JsonProperty("settlement_date_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getSettlementDateTo() {
        return settlementDateTo;
    }
    /**
     * Retrieves value for `uniqueRequestId`
     * Unique request ID of conversion.
     */
    @JsonProperty("unique_request_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUniqueRequestId() {
        return uniqueRequestId;
    }
    /**
     * Retrieves value for `updatedAtFrom`
     * ISO 8601 Date/time for start of date range for when the conversion was updated.
     */
    @JsonProperty("updated_at_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUpdatedAtFrom() {
        return updatedAtFrom;
    }
    /**
     * Retrieves value for `updatedAtTo`
     * ISO 8601 Date/time for end of date range for when the conversion was updated.
     */
    @JsonProperty("updated_at_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUpdatedAtTo() {
        return updatedAtTo;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof GenerateConversionReportRequest &&
               equalTo((GenerateConversionReportRequest) other);
    }

    private boolean equalTo(GenerateConversionReportRequest other) {
        return
            buyCurrency.equals(other.buyCurrency) &&

            clientBuyAmountFrom.equals(other.clientBuyAmountFrom) &&

            clientBuyAmountTo.equals(other.clientBuyAmountTo) &&

            clientSellAmountFrom.equals(other.clientSellAmountFrom) &&

            clientSellAmountTo.equals(other.clientSellAmountTo) &&

            clientStatus.equals(other.clientStatus) &&

            conversionDateFrom.equals(other.conversionDateFrom) &&

            conversionDateTo.equals(other.conversionDateTo) &&

            createdAtFrom.equals(other.createdAtFrom) &&

            createdAtTo.equals(other.createdAtTo) &&

            description.equals(other.description) &&

            onBehalfOf.equals(other.onBehalfOf) &&

            partnerBuyAmountFrom.equals(other.partnerBuyAmountFrom) &&

            partnerBuyAmountTo.equals(other.partnerBuyAmountTo) &&

            partnerSellAmountFrom.equals(other.partnerSellAmountFrom) &&

            partnerSellAmountTo.equals(other.partnerSellAmountTo) &&

            scope.equals(other.scope) &&

            sellCurrency.equals(other.sellCurrency) &&

            settlementDateFrom.equals(other.settlementDateFrom) &&

            settlementDateTo.equals(other.settlementDateTo) &&

            uniqueRequestId.equals(other.uniqueRequestId) &&

            updatedAtFrom.equals(other.updatedAtFrom) &&

            updatedAtTo.equals(other.updatedAtTo)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.buyCurrency,
                   this.clientBuyAmountFrom,
                   this.clientBuyAmountTo,
                   this.clientSellAmountFrom,
                   this.clientSellAmountTo,
                   this.clientStatus,
                   this.conversionDateFrom,
                   this.conversionDateTo,
                   this.createdAtFrom,
                   this.createdAtTo,
                   this.description,
                   this.onBehalfOf,
                   this.partnerBuyAmountFrom,
                   this.partnerBuyAmountTo,
                   this.partnerSellAmountFrom,
                   this.partnerSellAmountTo,
                   this.scope,
                   this.sellCurrency,
                   this.settlementDateFrom,
                   this.settlementDateTo,
                   this.uniqueRequestId,
                   this.updatedAtFrom,
                   this.updatedAtTo
               );
    }

    @Override
    public String toString() {
        return "GenerateConversionReportRequest{" +
               "buyCurrency=" + buyCurrency + ", " +
               "clientBuyAmountFrom=" + clientBuyAmountFrom + ", " +
               "clientBuyAmountTo=" + clientBuyAmountTo + ", " +
               "clientSellAmountFrom=" + clientSellAmountFrom + ", " +
               "clientSellAmountTo=" + clientSellAmountTo + ", " +
               "clientStatus=" + clientStatus + ", " +
               "conversionDateFrom=" + conversionDateFrom + ", " +
               "conversionDateTo=" + conversionDateTo + ", " +
               "createdAtFrom=" + createdAtFrom + ", " +
               "createdAtTo=" + createdAtTo + ", " +
               "description=" + description + ", " +
               "onBehalfOf=" + onBehalfOf + ", " +
               "partnerBuyAmountFrom=" + partnerBuyAmountFrom + ", " +
               "partnerBuyAmountTo=" + partnerBuyAmountTo + ", " +
               "partnerSellAmountFrom=" + partnerSellAmountFrom + ", " +
               "partnerSellAmountTo=" + partnerSellAmountTo + ", " +
               "scope=" + scope + ", " +
               "sellCurrency=" + sellCurrency + ", " +
               "settlementDateFrom=" + settlementDateFrom + ", " +
               "settlementDateTo=" + settlementDateTo + ", " +
               "uniqueRequestId=" + uniqueRequestId + ", " +
               "updatedAtFrom=" + updatedAtFrom + ", " +
               "updatedAtTo=" + updatedAtTo +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Three-letter ISO 4217 currency code.
         */
        private Optional<String> buyCurrency = Optional.empty();

        /**
         * Minimum client buy amount.
         */
        private Optional<String> clientBuyAmountFrom = Optional.empty();

        /**
         * Maximum client buy amount.
         */
        private Optional<String> clientBuyAmountTo = Optional.empty();

        /**
         * Minimum client sell amount.
         */
        private Optional<String> clientSellAmountFrom = Optional.empty();

        /**
         * Maximum client sell amount.
         */
        private Optional<String> clientSellAmountTo = Optional.empty();

        /**
         * The current status of the conversion.
         */
        private Optional<ReportsGenerateConversionReportBodyClientStatusEnum> clientStatus =
            Optional.empty();

        /**
         * ISO 8601 Date/time for start of range for when buy currency was delivered.
         */
        private Optional<String> conversionDateFrom = Optional.empty();

        /**
         * ISO 8601 Date/time for end of range for when buy currency was delivered.
         */
        private Optional<String> conversionDateTo = Optional.empty();

        /**
         * ISO 8601 Date/time for start of date range for when the conversion was created.
         */
        private Optional<String> createdAtFrom = Optional.empty();

        /**
         * ISO 8601 Date/time for end of date range for when the conversion was created.
         */
        private Optional<String> createdAtTo = Optional.empty();

        /**
         * Description that will be applied to the report.
         */
        private Optional<String> description = Optional.empty();

        /**
         * A contact UUID for the sub-account you're acting on behalf of.
         */
        private Optional<String> onBehalfOf = Optional.empty();

        /**
         * Minimum buy amount (sub-accounts).
         */
        private Optional<String> partnerBuyAmountFrom = Optional.empty();

        /**
         * Maximum buy amount (sub-accounts).
         */
        private Optional<String> partnerBuyAmountTo = Optional.empty();

        /**
         * Minimum sell amount (sub-accounts).
         */
        private Optional<String> partnerSellAmountFrom = Optional.empty();

        /**
         * Maximum sell amount (sub-accounts).
         */
        private Optional<String> partnerSellAmountTo = Optional.empty();

        /**
         * Specify which account level will be used - 'own' is the default.
         */
        private Optional<ReportsGenerateConversionReportBodyScopeEnum> scope = Optional.empty();

        /**
         * Three-letter ISO 4217 currency code.
         */
        private Optional<String> sellCurrency = Optional.empty();

        /**
         * ISO 8601 Date/time for start of date range for when the sell_currency was debited.
         */
        private Optional<String> settlementDateFrom = Optional.empty();

        /**
         * ISO 8601 Date/time for end of date range for when the sell_currency was debited.
         */
        private Optional<String> settlementDateTo = Optional.empty();

        /**
         * Unique request ID of conversion.
         */
        private Optional<String> uniqueRequestId = Optional.empty();

        /**
         * ISO 8601 Date/time for start of date range for when the conversion was updated.
         */
        private Optional<String> updatedAtFrom = Optional.empty();

        /**
         * ISO 8601 Date/time for end of date range for when the conversion was updated.
         */
        private Optional<String> updatedAtTo = Optional.empty();


        private Builder() {}

        public Builder from(GenerateConversionReportRequest other) {
            buyCurrency(other.getBuyCurrency());
            clientBuyAmountFrom(other.getClientBuyAmountFrom());
            clientBuyAmountTo(other.getClientBuyAmountTo());
            clientSellAmountFrom(other.getClientSellAmountFrom());
            clientSellAmountTo(other.getClientSellAmountTo());
            clientStatus(other.getClientStatus());
            conversionDateFrom(other.getConversionDateFrom());
            conversionDateTo(other.getConversionDateTo());
            createdAtFrom(other.getCreatedAtFrom());
            createdAtTo(other.getCreatedAtTo());
            description(other.getDescription());
            onBehalfOf(other.getOnBehalfOf());
            partnerBuyAmountFrom(other.getPartnerBuyAmountFrom());
            partnerBuyAmountTo(other.getPartnerBuyAmountTo());
            partnerSellAmountFrom(other.getPartnerSellAmountFrom());
            partnerSellAmountTo(other.getPartnerSellAmountTo());
            scope(other.getScope());
            sellCurrency(other.getSellCurrency());
            settlementDateFrom(other.getSettlementDateFrom());
            settlementDateTo(other.getSettlementDateTo());
            uniqueRequestId(other.getUniqueRequestId());
            updatedAtFrom(other.getUpdatedAtFrom());
            updatedAtTo(other.getUpdatedAtTo());
            return this;
        }

        /**
         * Sets value for `buyCurrency`
         * Three-letter ISO 4217 currency code.
         */
        @JsonSetter("buy_currency")
        public Builder buyCurrency(Optional<String> buyCurrency) {
            this.buyCurrency = buyCurrency;
            return this;
        }

        /**
         * Sets value for `buyCurrency`
         * Three-letter ISO 4217 currency code.
         */
        public Builder buyCurrency(String buyCurrency) {
            return this.buyCurrency(Optional.ofNullable(buyCurrency));
        }
        /**
         * Sets value for `clientBuyAmountFrom`
         * Minimum client buy amount.
         */
        @JsonSetter("client_buy_amount_from")
        public Builder clientBuyAmountFrom(Optional<String> clientBuyAmountFrom) {
            this.clientBuyAmountFrom = clientBuyAmountFrom;
            return this;
        }

        /**
         * Sets value for `clientBuyAmountFrom`
         * Minimum client buy amount.
         */
        public Builder clientBuyAmountFrom(String clientBuyAmountFrom) {
            return this.clientBuyAmountFrom(Optional.ofNullable(clientBuyAmountFrom));
        }
        /**
         * Sets value for `clientBuyAmountTo`
         * Maximum client buy amount.
         */
        @JsonSetter("client_buy_amount_to")
        public Builder clientBuyAmountTo(Optional<String> clientBuyAmountTo) {
            this.clientBuyAmountTo = clientBuyAmountTo;
            return this;
        }

        /**
         * Sets value for `clientBuyAmountTo`
         * Maximum client buy amount.
         */
        public Builder clientBuyAmountTo(String clientBuyAmountTo) {
            return this.clientBuyAmountTo(Optional.ofNullable(clientBuyAmountTo));
        }
        /**
         * Sets value for `clientSellAmountFrom`
         * Minimum client sell amount.
         */
        @JsonSetter("client_sell_amount_from")
        public Builder clientSellAmountFrom(Optional<String> clientSellAmountFrom) {
            this.clientSellAmountFrom = clientSellAmountFrom;
            return this;
        }

        /**
         * Sets value for `clientSellAmountFrom`
         * Minimum client sell amount.
         */
        public Builder clientSellAmountFrom(String clientSellAmountFrom) {
            return this.clientSellAmountFrom(Optional.ofNullable(clientSellAmountFrom));
        }
        /**
         * Sets value for `clientSellAmountTo`
         * Maximum client sell amount.
         */
        @JsonSetter("client_sell_amount_to")
        public Builder clientSellAmountTo(Optional<String> clientSellAmountTo) {
            this.clientSellAmountTo = clientSellAmountTo;
            return this;
        }

        /**
         * Sets value for `clientSellAmountTo`
         * Maximum client sell amount.
         */
        public Builder clientSellAmountTo(String clientSellAmountTo) {
            return this.clientSellAmountTo(Optional.ofNullable(clientSellAmountTo));
        }
        /**
         * Sets value for `clientStatus`
         * The current status of the conversion.
         */
        @JsonSetter("client_status")
        public Builder clientStatus(Optional<ReportsGenerateConversionReportBodyClientStatusEnum>
                                    clientStatus) {
            this.clientStatus = clientStatus;
            return this;
        }

        /**
         * Sets value for `clientStatus`
         * The current status of the conversion.
         */
        public Builder clientStatus(ReportsGenerateConversionReportBodyClientStatusEnum clientStatus) {
            return this.clientStatus(Optional.ofNullable(clientStatus));
        }
        /**
         * Sets value for `conversionDateFrom`
         * ISO 8601 Date/time for start of range for when buy currency was delivered.
         */
        @JsonSetter("conversion_date_from")
        public Builder conversionDateFrom(Optional<String> conversionDateFrom) {
            this.conversionDateFrom = conversionDateFrom;
            return this;
        }

        /**
         * Sets value for `conversionDateFrom`
         * ISO 8601 Date/time for start of range for when buy currency was delivered.
         */
        public Builder conversionDateFrom(String conversionDateFrom) {
            return this.conversionDateFrom(Optional.ofNullable(conversionDateFrom));
        }
        /**
         * Sets value for `conversionDateTo`
         * ISO 8601 Date/time for end of range for when buy currency was delivered.
         */
        @JsonSetter("conversion_date_to")
        public Builder conversionDateTo(Optional<String> conversionDateTo) {
            this.conversionDateTo = conversionDateTo;
            return this;
        }

        /**
         * Sets value for `conversionDateTo`
         * ISO 8601 Date/time for end of range for when buy currency was delivered.
         */
        public Builder conversionDateTo(String conversionDateTo) {
            return this.conversionDateTo(Optional.ofNullable(conversionDateTo));
        }
        /**
         * Sets value for `createdAtFrom`
         * ISO 8601 Date/time for start of date range for when the conversion was created.
         */
        @JsonSetter("created_at_from")
        public Builder createdAtFrom(Optional<String> createdAtFrom) {
            this.createdAtFrom = createdAtFrom;
            return this;
        }

        /**
         * Sets value for `createdAtFrom`
         * ISO 8601 Date/time for start of date range for when the conversion was created.
         */
        public Builder createdAtFrom(String createdAtFrom) {
            return this.createdAtFrom(Optional.ofNullable(createdAtFrom));
        }
        /**
         * Sets value for `createdAtTo`
         * ISO 8601 Date/time for end of date range for when the conversion was created.
         */
        @JsonSetter("created_at_to")
        public Builder createdAtTo(Optional<String> createdAtTo) {
            this.createdAtTo = createdAtTo;
            return this;
        }

        /**
         * Sets value for `createdAtTo`
         * ISO 8601 Date/time for end of date range for when the conversion was created.
         */
        public Builder createdAtTo(String createdAtTo) {
            return this.createdAtTo(Optional.ofNullable(createdAtTo));
        }
        /**
         * Sets value for `description`
         * Description that will be applied to the report.
         */
        @JsonSetter("description")
        public Builder description(Optional<String> description) {
            this.description = description;
            return this;
        }

        /**
         * Sets value for `description`
         * Description that will be applied to the report.
         */
        public Builder description(String description) {
            return this.description(Optional.ofNullable(description));
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
         * Sets value for `partnerBuyAmountFrom`
         * Minimum buy amount (sub-accounts).
         */
        @JsonSetter("partner_buy_amount_from")
        public Builder partnerBuyAmountFrom(Optional<String> partnerBuyAmountFrom) {
            this.partnerBuyAmountFrom = partnerBuyAmountFrom;
            return this;
        }

        /**
         * Sets value for `partnerBuyAmountFrom`
         * Minimum buy amount (sub-accounts).
         */
        public Builder partnerBuyAmountFrom(String partnerBuyAmountFrom) {
            return this.partnerBuyAmountFrom(Optional.ofNullable(partnerBuyAmountFrom));
        }
        /**
         * Sets value for `partnerBuyAmountTo`
         * Maximum buy amount (sub-accounts).
         */
        @JsonSetter("partner_buy_amount_to")
        public Builder partnerBuyAmountTo(Optional<String> partnerBuyAmountTo) {
            this.partnerBuyAmountTo = partnerBuyAmountTo;
            return this;
        }

        /**
         * Sets value for `partnerBuyAmountTo`
         * Maximum buy amount (sub-accounts).
         */
        public Builder partnerBuyAmountTo(String partnerBuyAmountTo) {
            return this.partnerBuyAmountTo(Optional.ofNullable(partnerBuyAmountTo));
        }
        /**
         * Sets value for `partnerSellAmountFrom`
         * Minimum sell amount (sub-accounts).
         */
        @JsonSetter("partner_sell_amount_from")
        public Builder partnerSellAmountFrom(Optional<String> partnerSellAmountFrom) {
            this.partnerSellAmountFrom = partnerSellAmountFrom;
            return this;
        }

        /**
         * Sets value for `partnerSellAmountFrom`
         * Minimum sell amount (sub-accounts).
         */
        public Builder partnerSellAmountFrom(String partnerSellAmountFrom) {
            return this.partnerSellAmountFrom(Optional.ofNullable(partnerSellAmountFrom));
        }
        /**
         * Sets value for `partnerSellAmountTo`
         * Maximum sell amount (sub-accounts).
         */
        @JsonSetter("partner_sell_amount_to")
        public Builder partnerSellAmountTo(Optional<String> partnerSellAmountTo) {
            this.partnerSellAmountTo = partnerSellAmountTo;
            return this;
        }

        /**
         * Sets value for `partnerSellAmountTo`
         * Maximum sell amount (sub-accounts).
         */
        public Builder partnerSellAmountTo(String partnerSellAmountTo) {
            return this.partnerSellAmountTo(Optional.ofNullable(partnerSellAmountTo));
        }
        /**
         * Sets value for `scope`
         * Specify which account level will be used - 'own' is the default.
         */
        @JsonSetter("scope")
        public Builder scope(Optional<ReportsGenerateConversionReportBodyScopeEnum> scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Sets value for `scope`
         * Specify which account level will be used - 'own' is the default.
         */
        public Builder scope(ReportsGenerateConversionReportBodyScopeEnum scope) {
            return this.scope(Optional.ofNullable(scope));
        }
        /**
         * Sets value for `sellCurrency`
         * Three-letter ISO 4217 currency code.
         */
        @JsonSetter("sell_currency")
        public Builder sellCurrency(Optional<String> sellCurrency) {
            this.sellCurrency = sellCurrency;
            return this;
        }

        /**
         * Sets value for `sellCurrency`
         * Three-letter ISO 4217 currency code.
         */
        public Builder sellCurrency(String sellCurrency) {
            return this.sellCurrency(Optional.ofNullable(sellCurrency));
        }
        /**
         * Sets value for `settlementDateFrom`
         * ISO 8601 Date/time for start of date range for when the sell_currency was debited.
         */
        @JsonSetter("settlement_date_from")
        public Builder settlementDateFrom(Optional<String> settlementDateFrom) {
            this.settlementDateFrom = settlementDateFrom;
            return this;
        }

        /**
         * Sets value for `settlementDateFrom`
         * ISO 8601 Date/time for start of date range for when the sell_currency was debited.
         */
        public Builder settlementDateFrom(String settlementDateFrom) {
            return this.settlementDateFrom(Optional.ofNullable(settlementDateFrom));
        }
        /**
         * Sets value for `settlementDateTo`
         * ISO 8601 Date/time for end of date range for when the sell_currency was debited.
         */
        @JsonSetter("settlement_date_to")
        public Builder settlementDateTo(Optional<String> settlementDateTo) {
            this.settlementDateTo = settlementDateTo;
            return this;
        }

        /**
         * Sets value for `settlementDateTo`
         * ISO 8601 Date/time for end of date range for when the sell_currency was debited.
         */
        public Builder settlementDateTo(String settlementDateTo) {
            return this.settlementDateTo(Optional.ofNullable(settlementDateTo));
        }
        /**
         * Sets value for `uniqueRequestId`
         * Unique request ID of conversion.
         */
        @JsonSetter("unique_request_id")
        public Builder uniqueRequestId(Optional<String> uniqueRequestId) {
            this.uniqueRequestId = uniqueRequestId;
            return this;
        }

        /**
         * Sets value for `uniqueRequestId`
         * Unique request ID of conversion.
         */
        public Builder uniqueRequestId(String uniqueRequestId) {
            return this.uniqueRequestId(Optional.ofNullable(uniqueRequestId));
        }
        /**
         * Sets value for `updatedAtFrom`
         * ISO 8601 Date/time for start of date range for when the conversion was updated.
         */
        @JsonSetter("updated_at_from")
        public Builder updatedAtFrom(Optional<String> updatedAtFrom) {
            this.updatedAtFrom = updatedAtFrom;
            return this;
        }

        /**
         * Sets value for `updatedAtFrom`
         * ISO 8601 Date/time for start of date range for when the conversion was updated.
         */
        public Builder updatedAtFrom(String updatedAtFrom) {
            return this.updatedAtFrom(Optional.ofNullable(updatedAtFrom));
        }
        /**
         * Sets value for `updatedAtTo`
         * ISO 8601 Date/time for end of date range for when the conversion was updated.
         */
        @JsonSetter("updated_at_to")
        public Builder updatedAtTo(Optional<String> updatedAtTo) {
            this.updatedAtTo = updatedAtTo;
            return this;
        }

        /**
         * Sets value for `updatedAtTo`
         * ISO 8601 Date/time for end of date range for when the conversion was updated.
         */
        public Builder updatedAtTo(String updatedAtTo) {
            return this.updatedAtTo(Optional.ofNullable(updatedAtTo));
        }



        public GenerateConversionReportRequest build() {
            return new GenerateConversionReportRequest(this);
        }
    }

}



