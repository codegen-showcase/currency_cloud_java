
package com.currencycloud.sdk.resources.payments.params;

import java.util.Objects;
import java.util.Optional;

import com.currencycloud.sdk.model.PaymentsGetPaymentFeesOrderAscDescEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * GetPaymentFeesRequest
 */
@JsonDeserialize(builder = GetPaymentFeesRequest.Builder.class)
public final class GetPaymentFeesRequest {
    /**
     * Any field name to change the sort order.
     */
    private final Optional<String> order;

    /**
     * Sort records in ascending or descending order.
     */
    private final Optional<PaymentsGetPaymentFeesOrderAscDescEnum> orderAscDesc;

    /**
     * Page number
     */
    private final Optional<Long> page;

    /**
     * Number of results per page.
     */
    private final Optional<Long> perPage;


    private GetPaymentFeesRequest(Builder builder) {
        this.order = builder.order;
        this.orderAscDesc = builder.orderAscDesc;
        this.page = builder.page;
        this.perPage = builder.perPage;
    }

    /**
     * Retrieves value for `order`
     * Any field name to change the sort order.
     */
    @JsonProperty("order")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getOrder() {
        return order;
    }
    /**
     * Retrieves value for `orderAscDesc`
     * Sort records in ascending or descending order.
     */
    @JsonProperty("order_asc_desc")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<PaymentsGetPaymentFeesOrderAscDescEnum> getOrderAscDesc() {
        return orderAscDesc;
    }
    /**
     * Retrieves value for `page`
     * Page number
     */
    @JsonProperty("page")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Long> getPage() {
        return page;
    }
    /**
     * Retrieves value for `perPage`
     * Number of results per page.
     */
    @JsonProperty("per_page")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Long> getPerPage() {
        return perPage;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof GetPaymentFeesRequest && equalTo((GetPaymentFeesRequest) other);
    }

    private boolean equalTo(GetPaymentFeesRequest other) {
        return
            order.equals(other.order) &&

            orderAscDesc.equals(other.orderAscDesc) &&

            page.equals(other.page) &&

            perPage.equals(other.perPage)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.order,
                   this.orderAscDesc,
                   this.page,
                   this.perPage
               );
    }

    @Override
    public String toString() {
        return "GetPaymentFeesRequest{" +
               "order=" + order + ", " +
               "orderAscDesc=" + orderAscDesc + ", " +
               "page=" + page + ", " +
               "perPage=" + perPage +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Any field name to change the sort order.
         */
        private Optional<String> order = Optional.empty();

        /**
         * Sort records in ascending or descending order.
         */
        private Optional<PaymentsGetPaymentFeesOrderAscDescEnum> orderAscDesc = Optional.empty();

        /**
         * Page number
         */
        private Optional<Long> page = Optional.empty();

        /**
         * Number of results per page.
         */
        private Optional<Long> perPage = Optional.empty();


        private Builder() {}

        public Builder from(GetPaymentFeesRequest other) {
            order(other.getOrder());
            orderAscDesc(other.getOrderAscDesc());
            page(other.getPage());
            perPage(other.getPerPage());
            return this;
        }

        /**
         * Sets value for `order`
         * Any field name to change the sort order.
         */
        @JsonSetter("order")
        public Builder order(Optional<String> order) {
            this.order = order;
            return this;
        }

        /**
         * Sets value for `order`
         * Any field name to change the sort order.
         */
        public Builder order(String order) {
            return this.order(Optional.ofNullable(order));
        }
        /**
         * Sets value for `orderAscDesc`
         * Sort records in ascending or descending order.
         */
        @JsonSetter("order_asc_desc")
        public Builder orderAscDesc(Optional<PaymentsGetPaymentFeesOrderAscDescEnum> orderAscDesc) {
            this.orderAscDesc = orderAscDesc;
            return this;
        }

        /**
         * Sets value for `orderAscDesc`
         * Sort records in ascending or descending order.
         */
        public Builder orderAscDesc(PaymentsGetPaymentFeesOrderAscDescEnum orderAscDesc) {
            return this.orderAscDesc(Optional.ofNullable(orderAscDesc));
        }
        /**
         * Sets value for `page`
         * Page number
         */
        @JsonSetter("page")
        public Builder page(Optional<Long> page) {
            this.page = page;
            return this;
        }

        /**
         * Sets value for `page`
         * Page number
         */
        public Builder page(Long page) {
            return this.page(Optional.ofNullable(page));
        }
        /**
         * Sets value for `perPage`
         * Number of results per page.
         */
        @JsonSetter("per_page")
        public Builder perPage(Optional<Long> perPage) {
            this.perPage = perPage;
            return this;
        }

        /**
         * Sets value for `perPage`
         * Number of results per page.
         */
        public Builder perPage(Long perPage) {
            return this.perPage(Optional.ofNullable(perPage));
        }



        public GetPaymentFeesRequest build() {
            return new GetPaymentFeesRequest(this);
        }
    }

}



