
package com.currencycloud.sdk.model;

import java.util.Map;
import java.util.Objects;
import java.util.Optional;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;


/**
 * Report record
 */
@JsonDeserialize(builder = ReportRequest.Builder.class)
public final class ReportRequest {
    /**
     * ID of the account.
     */
    private final Optional<String> accountId;

    /**
     * ID of the contact.
     */
    private final Optional<String> contactId;

    /**
     * ISO 8601 date when the report was created.
     */
    private final Optional<String> createdAt;

    /**
     * Description provided when the report was created.
     */
    private final Optional<String> description;

    /**
     * ISO 8601 Date of report expiration.
     */
    private final Optional<String> expirationDate;

    /**
     * Unique ID for the report.
     */
    private final Optional<String> id;

    /**
     * The type of report - conversion or payment.
     */
    private final Optional<ReportRequestReportTypeEnum> reportType;

    /**
     * URL to use to download the CSV report.
     */
    private final Optional<String> reportUrl;

    /**
     * Parameters to select specific range of items that we want to see in the report.
     */
    private final Optional<Map<String, Object>> searchParams;

    /**
     * Human readable unique ID.
     */
    private final Optional<String> shortReference;

    /**
     * The status of the report
     */
    private final Optional<ReportRequestStatusEnum> status;

    /**
     * ISO 8601 date when the report was last updated.
     */
    private final Optional<String> updatedAt;


    private ReportRequest(Builder builder) {
        this.accountId = builder.accountId;
        this.contactId = builder.contactId;
        this.createdAt = builder.createdAt;
        this.description = builder.description;
        this.expirationDate = builder.expirationDate;
        this.id = builder.id;
        this.reportType = builder.reportType;
        this.reportUrl = builder.reportUrl;
        this.searchParams = builder.searchParams;
        this.shortReference = builder.shortReference;
        this.status = builder.status;
        this.updatedAt = builder.updatedAt;
    }

    /**
     * Retrieves value for `accountId`
     * ID of the account.
     */
    @JsonProperty("account_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getAccountId() {
        return accountId;
    }
    /**
     * Retrieves value for `contactId`
     * ID of the contact.
     */
    @JsonProperty("contact_id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getContactId() {
        return contactId;
    }
    /**
     * Retrieves value for `createdAt`
     * ISO 8601 date when the report was created.
     */
    @JsonProperty("created_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getCreatedAt() {
        return createdAt;
    }
    /**
     * Retrieves value for `description`
     * Description provided when the report was created.
     */
    @JsonProperty("description")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getDescription() {
        return description;
    }
    /**
     * Retrieves value for `expirationDate`
     * ISO 8601 Date of report expiration.
     */
    @JsonProperty("expiration_date")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getExpirationDate() {
        return expirationDate;
    }
    /**
     * Retrieves value for `id`
     * Unique ID for the report.
     */
    @JsonProperty("id")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getId() {
        return id;
    }
    /**
     * Retrieves value for `reportType`
     * The type of report - conversion or payment.
     */
    @JsonProperty("report_type")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<ReportRequestReportTypeEnum> getReportType() {
        return reportType;
    }
    /**
     * Retrieves value for `reportUrl`
     * URL to use to download the CSV report.
     */
    @JsonProperty("report_url")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getReportUrl() {
        return reportUrl;
    }
    /**
     * Retrieves value for `searchParams`
     * Parameters to select specific range of items that we want to see in the report.
     */
    @JsonProperty("search_params")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Map<String, Object>> getSearchParams() {
        return searchParams;
    }
    /**
     * Retrieves value for `shortReference`
     * Human readable unique ID.
     */
    @JsonProperty("short_reference")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getShortReference() {
        return shortReference;
    }
    /**
     * Retrieves value for `status`
     * The status of the report
     */
    @JsonProperty("status")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<ReportRequestStatusEnum> getStatus() {
        return status;
    }
    /**
     * Retrieves value for `updatedAt`
     * ISO 8601 date when the report was last updated.
     */
    @JsonProperty("updated_at")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<String> getUpdatedAt() {
        return updatedAt;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof ReportRequest && equalTo((ReportRequest) other);
    }

    private boolean equalTo(ReportRequest other) {
        return
            accountId.equals(other.accountId) &&

            contactId.equals(other.contactId) &&

            createdAt.equals(other.createdAt) &&

            description.equals(other.description) &&

            expirationDate.equals(other.expirationDate) &&

            id.equals(other.id) &&

            reportType.equals(other.reportType) &&

            reportUrl.equals(other.reportUrl) &&

            searchParams.equals(other.searchParams) &&

            shortReference.equals(other.shortReference) &&

            status.equals(other.status) &&

            updatedAt.equals(other.updatedAt)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.accountId,
                   this.contactId,
                   this.createdAt,
                   this.description,
                   this.expirationDate,
                   this.id,
                   this.reportType,
                   this.reportUrl,
                   this.searchParams,
                   this.shortReference,
                   this.status,
                   this.updatedAt
               );
    }

    @Override
    public String toString() {
        return "ReportRequest{" +
               "accountId=" + accountId + ", " +
               "contactId=" + contactId + ", " +
               "createdAt=" + createdAt + ", " +
               "description=" + description + ", " +
               "expirationDate=" + expirationDate + ", " +
               "id=" + id + ", " +
               "reportType=" + reportType + ", " +
               "reportUrl=" + reportUrl + ", " +
               "searchParams=" + searchParams + ", " +
               "shortReference=" + shortReference + ", " +
               "status=" + status + ", " +
               "updatedAt=" + updatedAt +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * ID of the account.
         */
        private Optional<String> accountId = Optional.empty();

        /**
         * ID of the contact.
         */
        private Optional<String> contactId = Optional.empty();

        /**
         * ISO 8601 date when the report was created.
         */
        private Optional<String> createdAt = Optional.empty();

        /**
         * Description provided when the report was created.
         */
        private Optional<String> description = Optional.empty();

        /**
         * ISO 8601 Date of report expiration.
         */
        private Optional<String> expirationDate = Optional.empty();

        /**
         * Unique ID for the report.
         */
        private Optional<String> id = Optional.empty();

        /**
         * The type of report - conversion or payment.
         */
        private Optional<ReportRequestReportTypeEnum> reportType = Optional.empty();

        /**
         * URL to use to download the CSV report.
         */
        private Optional<String> reportUrl = Optional.empty();

        /**
         * Parameters to select specific range of items that we want to see in the report.
         */
        private Optional<Map<String, Object>> searchParams = Optional.empty();

        /**
         * Human readable unique ID.
         */
        private Optional<String> shortReference = Optional.empty();

        /**
         * The status of the report
         */
        private Optional<ReportRequestStatusEnum> status = Optional.empty();

        /**
         * ISO 8601 date when the report was last updated.
         */
        private Optional<String> updatedAt = Optional.empty();


        private Builder() {}

        public Builder from(ReportRequest other) {
            accountId(other.getAccountId());
            contactId(other.getContactId());
            createdAt(other.getCreatedAt());
            description(other.getDescription());
            expirationDate(other.getExpirationDate());
            id(other.getId());
            reportType(other.getReportType());
            reportUrl(other.getReportUrl());
            searchParams(other.getSearchParams());
            shortReference(other.getShortReference());
            status(other.getStatus());
            updatedAt(other.getUpdatedAt());
            return this;
        }

        /**
         * Sets value for `accountId`
         * ID of the account.
         */
        @JsonSetter("account_id")
        public Builder accountId(Optional<String> accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * Sets value for `accountId`
         * ID of the account.
         */
        public Builder accountId(String accountId) {
            return this.accountId(Optional.ofNullable(accountId));
        }
        /**
         * Sets value for `contactId`
         * ID of the contact.
         */
        @JsonSetter("contact_id")
        public Builder contactId(Optional<String> contactId) {
            this.contactId = contactId;
            return this;
        }

        /**
         * Sets value for `contactId`
         * ID of the contact.
         */
        public Builder contactId(String contactId) {
            return this.contactId(Optional.ofNullable(contactId));
        }
        /**
         * Sets value for `createdAt`
         * ISO 8601 date when the report was created.
         */
        @JsonSetter("created_at")
        public Builder createdAt(Optional<String> createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * Sets value for `createdAt`
         * ISO 8601 date when the report was created.
         */
        public Builder createdAt(String createdAt) {
            return this.createdAt(Optional.ofNullable(createdAt));
        }
        /**
         * Sets value for `description`
         * Description provided when the report was created.
         */
        @JsonSetter("description")
        public Builder description(Optional<String> description) {
            this.description = description;
            return this;
        }

        /**
         * Sets value for `description`
         * Description provided when the report was created.
         */
        public Builder description(String description) {
            return this.description(Optional.ofNullable(description));
        }
        /**
         * Sets value for `expirationDate`
         * ISO 8601 Date of report expiration.
         */
        @JsonSetter("expiration_date")
        public Builder expirationDate(Optional<String> expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }

        /**
         * Sets value for `expirationDate`
         * ISO 8601 Date of report expiration.
         */
        public Builder expirationDate(String expirationDate) {
            return this.expirationDate(Optional.ofNullable(expirationDate));
        }
        /**
         * Sets value for `id`
         * Unique ID for the report.
         */
        @JsonSetter("id")
        public Builder id(Optional<String> id) {
            this.id = id;
            return this;
        }

        /**
         * Sets value for `id`
         * Unique ID for the report.
         */
        public Builder id(String id) {
            return this.id(Optional.ofNullable(id));
        }
        /**
         * Sets value for `reportType`
         * The type of report - conversion or payment.
         */
        @JsonSetter("report_type")
        public Builder reportType(Optional<ReportRequestReportTypeEnum> reportType) {
            this.reportType = reportType;
            return this;
        }

        /**
         * Sets value for `reportType`
         * The type of report - conversion or payment.
         */
        public Builder reportType(ReportRequestReportTypeEnum reportType) {
            return this.reportType(Optional.ofNullable(reportType));
        }
        /**
         * Sets value for `reportUrl`
         * URL to use to download the CSV report.
         */
        @JsonSetter("report_url")
        public Builder reportUrl(Optional<String> reportUrl) {
            this.reportUrl = reportUrl;
            return this;
        }

        /**
         * Sets value for `reportUrl`
         * URL to use to download the CSV report.
         */
        public Builder reportUrl(String reportUrl) {
            return this.reportUrl(Optional.ofNullable(reportUrl));
        }
        /**
         * Sets value for `searchParams`
         * Parameters to select specific range of items that we want to see in the report.
         */
        @JsonSetter("search_params")
        public Builder searchParams(Optional<Map<String, Object>> searchParams) {
            this.searchParams = searchParams;
            return this;
        }

        /**
         * Sets value for `searchParams`
         * Parameters to select specific range of items that we want to see in the report.
         */
        public Builder searchParams(Map<String, Object> searchParams) {
            return this.searchParams(Optional.ofNullable(searchParams));
        }
        /**
         * Sets value for `shortReference`
         * Human readable unique ID.
         */
        @JsonSetter("short_reference")
        public Builder shortReference(Optional<String> shortReference) {
            this.shortReference = shortReference;
            return this;
        }

        /**
         * Sets value for `shortReference`
         * Human readable unique ID.
         */
        public Builder shortReference(String shortReference) {
            return this.shortReference(Optional.ofNullable(shortReference));
        }
        /**
         * Sets value for `status`
         * The status of the report
         */
        @JsonSetter("status")
        public Builder status(Optional<ReportRequestStatusEnum> status) {
            this.status = status;
            return this;
        }

        /**
         * Sets value for `status`
         * The status of the report
         */
        public Builder status(ReportRequestStatusEnum status) {
            return this.status(Optional.ofNullable(status));
        }
        /**
         * Sets value for `updatedAt`
         * ISO 8601 date when the report was last updated.
         */
        @JsonSetter("updated_at")
        public Builder updatedAt(Optional<String> updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * Sets value for `updatedAt`
         * ISO 8601 date when the report was last updated.
         */
        public Builder updatedAt(String updatedAt) {
            return this.updatedAt(Optional.ofNullable(updatedAt));
        }



        public ReportRequest build() {
            return new ReportRequest(this);
        }
    }

}



