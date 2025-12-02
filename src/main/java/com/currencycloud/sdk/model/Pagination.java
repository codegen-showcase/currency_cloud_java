
package com.currencycloud.sdk.model;

import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Pagination.
 */
@JsonDeserialize(builder = Pagination.Builder.class)
public final class Pagination {
    private final Optional<Long> currentPage;

    private final Optional<Long> nextPage;

    /**
     * The field name by which the results are sorted.
     */
    private final Optional<String> order;

    /**
     * Whether results are sorted in ascending or descending order.
     */
    private final Optional<PaginationOrderAscDescEnum> orderAscDesc;

    /**
     * Number of results per page.
     */
    private final Optional<Long> perPage;

    private final Optional<Long> previousPage;

    private final Optional<Long> totalEntries;

    private final Optional<Long> totalPages;


    private Pagination(Builder builder) {
        this.currentPage = builder.currentPage;
        this.nextPage = builder.nextPage;
        this.order = builder.order;
        this.orderAscDesc = builder.orderAscDesc;
        this.perPage = builder.perPage;
        this.previousPage = builder.previousPage;
        this.totalEntries = builder.totalEntries;
        this.totalPages = builder.totalPages;
    }

    /**
     * Retrieves value for `currentPage`
     */
    @JsonProperty("current_page")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Long> getCurrentPage() {
        return currentPage;
    }
    /**
     * Retrieves value for `nextPage`
     */
    @JsonProperty("next_page")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Long> getNextPage() {
        return nextPage;
    }
    /**
     * Retrieves value for `order`
     * The field name by which the results are sorted.
     */
    @JsonProperty("order")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getOrder() {
        return order;
    }
    /**
     * Retrieves value for `orderAscDesc`
     * Whether results are sorted in ascending or descending order.
     */
    @JsonProperty("order_asc_desc")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<PaginationOrderAscDescEnum> getOrderAscDesc() {
        return orderAscDesc;
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
    /**
     * Retrieves value for `previousPage`
     */
    @JsonProperty("previous_page")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Long> getPreviousPage() {
        return previousPage;
    }
    /**
     * Retrieves value for `totalEntries`
     */
    @JsonProperty("total_entries")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Long> getTotalEntries() {
        return totalEntries;
    }
    /**
     * Retrieves value for `totalPages`
     */
    @JsonProperty("total_pages")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Long> getTotalPages() {
        return totalPages;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof Pagination && equalTo((Pagination) other);
    }

    private boolean equalTo(Pagination other) {
        return
            currentPage.equals(other.currentPage) &&

            nextPage.equals(other.nextPage) &&

            order.equals(other.order) &&

            orderAscDesc.equals(other.orderAscDesc) &&

            perPage.equals(other.perPage) &&

            previousPage.equals(other.previousPage) &&

            totalEntries.equals(other.totalEntries) &&

            totalPages.equals(other.totalPages)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.currentPage,
                   this.nextPage,
                   this.order,
                   this.orderAscDesc,
                   this.perPage,
                   this.previousPage,
                   this.totalEntries,
                   this.totalPages
               );
    }

    @Override
    public String toString() {
        return "Pagination{" +
               "currentPage=" + currentPage + ", " +
               "nextPage=" + nextPage + ", " +
               "order=" + order + ", " +
               "orderAscDesc=" + orderAscDesc + ", " +
               "perPage=" + perPage + ", " +
               "previousPage=" + previousPage + ", " +
               "totalEntries=" + totalEntries + ", " +
               "totalPages=" + totalPages +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        private Optional<Long> currentPage = Optional.empty();

        private Optional<Long> nextPage = Optional.empty();

        /**
         * The field name by which the results are sorted.
         */
        private Optional<String> order = Optional.empty();

        /**
         * Whether results are sorted in ascending or descending order.
         */
        private Optional<PaginationOrderAscDescEnum> orderAscDesc = Optional.empty();

        /**
         * Number of results per page.
         */
        private Optional<Long> perPage = Optional.empty();

        private Optional<Long> previousPage = Optional.empty();

        private Optional<Long> totalEntries = Optional.empty();

        private Optional<Long> totalPages = Optional.empty();


        private Builder() {}

        public Builder from(Pagination other) {
            currentPage(other.getCurrentPage());
            nextPage(other.getNextPage());
            order(other.getOrder());
            orderAscDesc(other.getOrderAscDesc());
            perPage(other.getPerPage());
            previousPage(other.getPreviousPage());
            totalEntries(other.getTotalEntries());
            totalPages(other.getTotalPages());
            return this;
        }

        /**
         * Sets value for `currentPage`
         */
        @JsonSetter("current_page")
        public Builder currentPage(Optional<Long> currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Sets value for `currentPage`
         */
        public Builder currentPage(Long currentPage) {
            return this.currentPage(Optional.ofNullable(currentPage));
        }
        /**
         * Sets value for `nextPage`
         */
        @JsonSetter("next_page")
        public Builder nextPage(Optional<Long> nextPage) {
            this.nextPage = nextPage;
            return this;
        }

        /**
         * Sets value for `nextPage`
         */
        public Builder nextPage(Long nextPage) {
            return this.nextPage(Optional.ofNullable(nextPage));
        }
        /**
         * Sets value for `order`
         * The field name by which the results are sorted.
         */
        @JsonSetter("order")
        public Builder order(Optional<String> order) {
            this.order = order;
            return this;
        }

        /**
         * Sets value for `order`
         * The field name by which the results are sorted.
         */
        public Builder order(String order) {
            return this.order(Optional.ofNullable(order));
        }
        /**
         * Sets value for `orderAscDesc`
         * Whether results are sorted in ascending or descending order.
         */
        @JsonSetter("order_asc_desc")
        public Builder orderAscDesc(Optional<PaginationOrderAscDescEnum> orderAscDesc) {
            this.orderAscDesc = orderAscDesc;
            return this;
        }

        /**
         * Sets value for `orderAscDesc`
         * Whether results are sorted in ascending or descending order.
         */
        public Builder orderAscDesc(PaginationOrderAscDescEnum orderAscDesc) {
            return this.orderAscDesc(Optional.ofNullable(orderAscDesc));
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
        /**
         * Sets value for `previousPage`
         */
        @JsonSetter("previous_page")
        public Builder previousPage(Optional<Long> previousPage) {
            this.previousPage = previousPage;
            return this;
        }

        /**
         * Sets value for `previousPage`
         */
        public Builder previousPage(Long previousPage) {
            return this.previousPage(Optional.ofNullable(previousPage));
        }
        /**
         * Sets value for `totalEntries`
         */
        @JsonSetter("total_entries")
        public Builder totalEntries(Optional<Long> totalEntries) {
            this.totalEntries = totalEntries;
            return this;
        }

        /**
         * Sets value for `totalEntries`
         */
        public Builder totalEntries(Long totalEntries) {
            return this.totalEntries(Optional.ofNullable(totalEntries));
        }
        /**
         * Sets value for `totalPages`
         */
        @JsonSetter("total_pages")
        public Builder totalPages(Optional<Long> totalPages) {
            this.totalPages = totalPages;
            return this;
        }

        /**
         * Sets value for `totalPages`
         */
        public Builder totalPages(Long totalPages) {
            return this.totalPages(Optional.ofNullable(totalPages));
        }



        public Pagination build() {
            return new Pagination(this);
        }
    }

}



