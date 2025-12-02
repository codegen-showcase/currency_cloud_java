
package com.currencycloud.sdk.resources.reports.params;

import java.util.Objects;
import java.util.Optional;

import com.currencycloud.sdk.model.ReportsFindReportRequestsOrderAscDescEnum;
import com.currencycloud.sdk.model.ReportsFindReportRequestsReportTypeEnum;
import com.currencycloud.sdk.model.ReportsFindReportRequestsScopeEnum;
import com.currencycloud.sdk.model.ReportsFindReportRequestsStatusEnum;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * FindReportRequestsRequest
 */
@JsonDeserialize(builder = FindReportRequestsRequest.Builder.class)
public final class FindReportRequestsRequest {
    /**
     * Start date (for range), in ISO 8601 format, for when the reports were created.
     */
    private final Optional<String> createdAtFrom;

    /**
     * End date (for range), in ISO 8601 format, for when the reports were created.
     */
    private final Optional<String> createdAtTo;

    /**
     * Description that was provided during the report creation process.
     */
    private final Optional<String> description;

    /**
     * Start date (for range), in ISO 8601 format, for when the report will be (was) expired.
     */
    private final Optional<String> expirationDateFrom;

    /**
     * End date (for range), in ISO 8601 format, for when the report will be (was) expired.
     */
    private final Optional<String> expirationDateTo;

    /**
     * Any field name to change the sort order.
     */
    private final Optional<String> order;

    /**
     * Sort records in ascending or descending order.
     */
    private final Optional<ReportsFindReportRequestsOrderAscDescEnum> orderAscDesc;

    /**
     * Page number.
     */
    private final Optional<Long> page;

    /**
     * Number of results per page.
     */
    private final Optional<Long> perPage;

    /**
     * Type of reports, that we expect to receive in search results.
     */
    private final Optional<ReportsFindReportRequestsReportTypeEnum> reportType;

    /**
     * Specify which account level will be used; 'own' is the default value.
     */
    private final Optional<ReportsFindReportRequestsScopeEnum> scope;

    /**
     * Your unique short reference.
     */
    private final Optional<String> shortReference;

    /**
     * Status of the report.
     */
    private final Optional<ReportsFindReportRequestsStatusEnum> status;

    /**
     * Start date (for range), in ISO 8601 format, for when the reports were updated.
     */
    private final Optional<String> updatedAtFrom;

    /**
     * End date (for range), in ISO 8601 format, for when the reports were updated.
     */
    private final Optional<String> updatedAtTo;


    private FindReportRequestsRequest(Builder builder) {
        this.createdAtFrom = builder.createdAtFrom;
        this.createdAtTo = builder.createdAtTo;
        this.description = builder.description;
        this.expirationDateFrom = builder.expirationDateFrom;
        this.expirationDateTo = builder.expirationDateTo;
        this.order = builder.order;
        this.orderAscDesc = builder.orderAscDesc;
        this.page = builder.page;
        this.perPage = builder.perPage;
        this.reportType = builder.reportType;
        this.scope = builder.scope;
        this.shortReference = builder.shortReference;
        this.status = builder.status;
        this.updatedAtFrom = builder.updatedAtFrom;
        this.updatedAtTo = builder.updatedAtTo;
    }

    /**
     * Retrieves value for `createdAtFrom`
     * Start date (for range), in ISO 8601 format, for when the reports were created.
     */
    @JsonProperty("created_at_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatedAtFrom() {
        return createdAtFrom;
    }
    /**
     * Retrieves value for `createdAtTo`
     * End date (for range), in ISO 8601 format, for when the reports were created.
     */
    @JsonProperty("created_at_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatedAtTo() {
        return createdAtTo;
    }
    /**
     * Retrieves value for `description`
     * Description that was provided during the report creation process.
     */
    @JsonProperty("description")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getDescription() {
        return description;
    }
    /**
     * Retrieves value for `expirationDateFrom`
     * Start date (for range), in ISO 8601 format, for when the report will be (was) expired.
     */
    @JsonProperty("expiration_date_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getExpirationDateFrom() {
        return expirationDateFrom;
    }
    /**
     * Retrieves value for `expirationDateTo`
     * End date (for range), in ISO 8601 format, for when the report will be (was) expired.
     */
    @JsonProperty("expiration_date_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getExpirationDateTo() {
        return expirationDateTo;
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
    public Optional<ReportsFindReportRequestsOrderAscDescEnum> getOrderAscDesc() {
        return orderAscDesc;
    }
    /**
     * Retrieves value for `page`
     * Page number.
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
    /**
     * Retrieves value for `reportType`
     * Type of reports, that we expect to receive in search results.
     */
    @JsonProperty("report_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<ReportsFindReportRequestsReportTypeEnum> getReportType() {
        return reportType;
    }
    /**
     * Retrieves value for `scope`
     * Specify which account level will be used; 'own' is the default value.
     */
    @JsonProperty("scope")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<ReportsFindReportRequestsScopeEnum> getScope() {
        return scope;
    }
    /**
     * Retrieves value for `shortReference`
     * Your unique short reference.
     */
    @JsonProperty("short_reference")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getShortReference() {
        return shortReference;
    }
    /**
     * Retrieves value for `status`
     * Status of the report.
     */
    @JsonProperty("status")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<ReportsFindReportRequestsStatusEnum> getStatus() {
        return status;
    }
    /**
     * Retrieves value for `updatedAtFrom`
     * Start date (for range), in ISO 8601 format, for when the reports were updated.
     */
    @JsonProperty("updated_at_from")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUpdatedAtFrom() {
        return updatedAtFrom;
    }
    /**
     * Retrieves value for `updatedAtTo`
     * End date (for range), in ISO 8601 format, for when the reports were updated.
     */
    @JsonProperty("updated_at_to")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUpdatedAtTo() {
        return updatedAtTo;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof FindReportRequestsRequest && equalTo((FindReportRequestsRequest) other);
    }

    private boolean equalTo(FindReportRequestsRequest other) {
        return
            createdAtFrom.equals(other.createdAtFrom) &&

            createdAtTo.equals(other.createdAtTo) &&

            description.equals(other.description) &&

            expirationDateFrom.equals(other.expirationDateFrom) &&

            expirationDateTo.equals(other.expirationDateTo) &&

            order.equals(other.order) &&

            orderAscDesc.equals(other.orderAscDesc) &&

            page.equals(other.page) &&

            perPage.equals(other.perPage) &&

            reportType.equals(other.reportType) &&

            scope.equals(other.scope) &&

            shortReference.equals(other.shortReference) &&

            status.equals(other.status) &&

            updatedAtFrom.equals(other.updatedAtFrom) &&

            updatedAtTo.equals(other.updatedAtTo)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.createdAtFrom,
                   this.createdAtTo,
                   this.description,
                   this.expirationDateFrom,
                   this.expirationDateTo,
                   this.order,
                   this.orderAscDesc,
                   this.page,
                   this.perPage,
                   this.reportType,
                   this.scope,
                   this.shortReference,
                   this.status,
                   this.updatedAtFrom,
                   this.updatedAtTo
               );
    }

    @Override
    public String toString() {
        return "FindReportRequestsRequest{" +
               "createdAtFrom=" + createdAtFrom + ", " +
               "createdAtTo=" + createdAtTo + ", " +
               "description=" + description + ", " +
               "expirationDateFrom=" + expirationDateFrom + ", " +
               "expirationDateTo=" + expirationDateTo + ", " +
               "order=" + order + ", " +
               "orderAscDesc=" + orderAscDesc + ", " +
               "page=" + page + ", " +
               "perPage=" + perPage + ", " +
               "reportType=" + reportType + ", " +
               "scope=" + scope + ", " +
               "shortReference=" + shortReference + ", " +
               "status=" + status + ", " +
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
         * Start date (for range), in ISO 8601 format, for when the reports were created.
         */
        private Optional<String> createdAtFrom = Optional.empty();

        /**
         * End date (for range), in ISO 8601 format, for when the reports were created.
         */
        private Optional<String> createdAtTo = Optional.empty();

        /**
         * Description that was provided during the report creation process.
         */
        private Optional<String> description = Optional.empty();

        /**
         * Start date (for range), in ISO 8601 format, for when the report will be (was) expired.
         */
        private Optional<String> expirationDateFrom = Optional.empty();

        /**
         * End date (for range), in ISO 8601 format, for when the report will be (was) expired.
         */
        private Optional<String> expirationDateTo = Optional.empty();

        /**
         * Any field name to change the sort order.
         */
        private Optional<String> order = Optional.empty();

        /**
         * Sort records in ascending or descending order.
         */
        private Optional<ReportsFindReportRequestsOrderAscDescEnum> orderAscDesc = Optional.empty();

        /**
         * Page number.
         */
        private Optional<Long> page = Optional.empty();

        /**
         * Number of results per page.
         */
        private Optional<Long> perPage = Optional.empty();

        /**
         * Type of reports, that we expect to receive in search results.
         */
        private Optional<ReportsFindReportRequestsReportTypeEnum> reportType = Optional.empty();

        /**
         * Specify which account level will be used; 'own' is the default value.
         */
        private Optional<ReportsFindReportRequestsScopeEnum> scope = Optional.empty();

        /**
         * Your unique short reference.
         */
        private Optional<String> shortReference = Optional.empty();

        /**
         * Status of the report.
         */
        private Optional<ReportsFindReportRequestsStatusEnum> status = Optional.empty();

        /**
         * Start date (for range), in ISO 8601 format, for when the reports were updated.
         */
        private Optional<String> updatedAtFrom = Optional.empty();

        /**
         * End date (for range), in ISO 8601 format, for when the reports were updated.
         */
        private Optional<String> updatedAtTo = Optional.empty();


        private Builder() {}

        public Builder from(FindReportRequestsRequest other) {
            createdAtFrom(other.getCreatedAtFrom());
            createdAtTo(other.getCreatedAtTo());
            description(other.getDescription());
            expirationDateFrom(other.getExpirationDateFrom());
            expirationDateTo(other.getExpirationDateTo());
            order(other.getOrder());
            orderAscDesc(other.getOrderAscDesc());
            page(other.getPage());
            perPage(other.getPerPage());
            reportType(other.getReportType());
            scope(other.getScope());
            shortReference(other.getShortReference());
            status(other.getStatus());
            updatedAtFrom(other.getUpdatedAtFrom());
            updatedAtTo(other.getUpdatedAtTo());
            return this;
        }

        /**
         * Sets value for `createdAtFrom`
         * Start date (for range), in ISO 8601 format, for when the reports were created.
         */
        @JsonSetter("created_at_from")
        public Builder createdAtFrom(Optional<String> createdAtFrom) {
            this.createdAtFrom = createdAtFrom;
            return this;
        }

        /**
         * Sets value for `createdAtFrom`
         * Start date (for range), in ISO 8601 format, for when the reports were created.
         */
        public Builder createdAtFrom(String createdAtFrom) {
            return this.createdAtFrom(Optional.ofNullable(createdAtFrom));
        }
        /**
         * Sets value for `createdAtTo`
         * End date (for range), in ISO 8601 format, for when the reports were created.
         */
        @JsonSetter("created_at_to")
        public Builder createdAtTo(Optional<String> createdAtTo) {
            this.createdAtTo = createdAtTo;
            return this;
        }

        /**
         * Sets value for `createdAtTo`
         * End date (for range), in ISO 8601 format, for when the reports were created.
         */
        public Builder createdAtTo(String createdAtTo) {
            return this.createdAtTo(Optional.ofNullable(createdAtTo));
        }
        /**
         * Sets value for `description`
         * Description that was provided during the report creation process.
         */
        @JsonSetter("description")
        public Builder description(Optional<String> description) {
            this.description = description;
            return this;
        }

        /**
         * Sets value for `description`
         * Description that was provided during the report creation process.
         */
        public Builder description(String description) {
            return this.description(Optional.ofNullable(description));
        }
        /**
         * Sets value for `expirationDateFrom`
         * Start date (for range), in ISO 8601 format, for when the report will be (was) expired.
         */
        @JsonSetter("expiration_date_from")
        public Builder expirationDateFrom(Optional<String> expirationDateFrom) {
            this.expirationDateFrom = expirationDateFrom;
            return this;
        }

        /**
         * Sets value for `expirationDateFrom`
         * Start date (for range), in ISO 8601 format, for when the report will be (was) expired.
         */
        public Builder expirationDateFrom(String expirationDateFrom) {
            return this.expirationDateFrom(Optional.ofNullable(expirationDateFrom));
        }
        /**
         * Sets value for `expirationDateTo`
         * End date (for range), in ISO 8601 format, for when the report will be (was) expired.
         */
        @JsonSetter("expiration_date_to")
        public Builder expirationDateTo(Optional<String> expirationDateTo) {
            this.expirationDateTo = expirationDateTo;
            return this;
        }

        /**
         * Sets value for `expirationDateTo`
         * End date (for range), in ISO 8601 format, for when the report will be (was) expired.
         */
        public Builder expirationDateTo(String expirationDateTo) {
            return this.expirationDateTo(Optional.ofNullable(expirationDateTo));
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
        public Builder orderAscDesc(Optional<ReportsFindReportRequestsOrderAscDescEnum> orderAscDesc) {
            this.orderAscDesc = orderAscDesc;
            return this;
        }

        /**
         * Sets value for `orderAscDesc`
         * Sort records in ascending or descending order.
         */
        public Builder orderAscDesc(ReportsFindReportRequestsOrderAscDescEnum orderAscDesc) {
            return this.orderAscDesc(Optional.ofNullable(orderAscDesc));
        }
        /**
         * Sets value for `page`
         * Page number.
         */
        @JsonSetter("page")
        public Builder page(Optional<Long> page) {
            this.page = page;
            return this;
        }

        /**
         * Sets value for `page`
         * Page number.
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
        /**
         * Sets value for `reportType`
         * Type of reports, that we expect to receive in search results.
         */
        @JsonSetter("report_type")
        public Builder reportType(Optional<ReportsFindReportRequestsReportTypeEnum> reportType) {
            this.reportType = reportType;
            return this;
        }

        /**
         * Sets value for `reportType`
         * Type of reports, that we expect to receive in search results.
         */
        public Builder reportType(ReportsFindReportRequestsReportTypeEnum reportType) {
            return this.reportType(Optional.ofNullable(reportType));
        }
        /**
         * Sets value for `scope`
         * Specify which account level will be used; 'own' is the default value.
         */
        @JsonSetter("scope")
        public Builder scope(Optional<ReportsFindReportRequestsScopeEnum> scope) {
            this.scope = scope;
            return this;
        }

        /**
         * Sets value for `scope`
         * Specify which account level will be used; 'own' is the default value.
         */
        public Builder scope(ReportsFindReportRequestsScopeEnum scope) {
            return this.scope(Optional.ofNullable(scope));
        }
        /**
         * Sets value for `shortReference`
         * Your unique short reference.
         */
        @JsonSetter("short_reference")
        public Builder shortReference(Optional<String> shortReference) {
            this.shortReference = shortReference;
            return this;
        }

        /**
         * Sets value for `shortReference`
         * Your unique short reference.
         */
        public Builder shortReference(String shortReference) {
            return this.shortReference(Optional.ofNullable(shortReference));
        }
        /**
         * Sets value for `status`
         * Status of the report.
         */
        @JsonSetter("status")
        public Builder status(Optional<ReportsFindReportRequestsStatusEnum> status) {
            this.status = status;
            return this;
        }

        /**
         * Sets value for `status`
         * Status of the report.
         */
        public Builder status(ReportsFindReportRequestsStatusEnum status) {
            return this.status(Optional.ofNullable(status));
        }
        /**
         * Sets value for `updatedAtFrom`
         * Start date (for range), in ISO 8601 format, for when the reports were updated.
         */
        @JsonSetter("updated_at_from")
        public Builder updatedAtFrom(Optional<String> updatedAtFrom) {
            this.updatedAtFrom = updatedAtFrom;
            return this;
        }

        /**
         * Sets value for `updatedAtFrom`
         * Start date (for range), in ISO 8601 format, for when the reports were updated.
         */
        public Builder updatedAtFrom(String updatedAtFrom) {
            return this.updatedAtFrom(Optional.ofNullable(updatedAtFrom));
        }
        /**
         * Sets value for `updatedAtTo`
         * End date (for range), in ISO 8601 format, for when the reports were updated.
         */
        @JsonSetter("updated_at_to")
        public Builder updatedAtTo(Optional<String> updatedAtTo) {
            this.updatedAtTo = updatedAtTo;
            return this;
        }

        /**
         * Sets value for `updatedAtTo`
         * End date (for range), in ISO 8601 format, for when the reports were updated.
         */
        public Builder updatedAtTo(String updatedAtTo) {
            return this.updatedAtTo(Optional.ofNullable(updatedAtTo));
        }



        public FindReportRequestsRequest build() {
            return new FindReportRequestsRequest(this);
        }
    }

}



