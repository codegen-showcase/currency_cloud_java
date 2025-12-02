
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
 * ReportsFindReportRequestsResponse
 */
@JsonDeserialize(builder = ReportsFindReportRequestsResponse.Builder.class)
public final class ReportsFindReportRequestsResponse {
    /**
     * Pagination.
     */
    private final Optional<Pagination> pagination;

    private final Optional<List<ReportRequest>> reportRequests;


    private ReportsFindReportRequestsResponse(Builder builder) {
        this.pagination = builder.pagination;
        this.reportRequests = builder.reportRequests;
    }

    /**
     * Retrieves value for `pagination`
     * Pagination.
     */
    @JsonProperty("pagination")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<Pagination> getPagination() {
        return pagination;
    }
    /**
     * Retrieves value for `reportRequests`
     */
    @JsonProperty("report_requests")
    @JsonInclude(JsonInclude.Include.NON_ABSENT)
    public Optional<List<ReportRequest>> getReportRequests() {
        return reportRequests;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) { return true; }

        return other instanceof ReportsFindReportRequestsResponse &&
               equalTo((ReportsFindReportRequestsResponse) other);
    }

    private boolean equalTo(ReportsFindReportRequestsResponse other) {
        return
            pagination.equals(other.pagination) &&

            reportRequests.equals(other.reportRequests)
            ;
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                   this.pagination,
                   this.reportRequests
               );
    }

    @Override
    public String toString() {
        return "ReportsFindReportRequestsResponse{" +
               "pagination=" + pagination + ", " +
               "reportRequests=" + reportRequests +
               '}';
    }

    public static Builder builder() {
        return new Builder();
    }

    @JsonIgnoreProperties(ignoreUnknown = true)
    public static final class Builder {
        /**
         * Pagination.
         */
        private Optional<Pagination> pagination = Optional.empty();

        private Optional<List<ReportRequest>> reportRequests = Optional.empty();


        private Builder() {}

        public Builder from(ReportsFindReportRequestsResponse other) {
            pagination(other.getPagination());
            reportRequests(other.getReportRequests());
            return this;
        }

        /**
         * Sets value for `pagination`
         * Pagination.
         */
        @JsonSetter("pagination")
        public Builder pagination(Optional<Pagination> pagination) {
            this.pagination = pagination;
            return this;
        }

        /**
         * Sets value for `pagination`
         * Pagination.
         */
        public Builder pagination(Pagination pagination) {
            return this.pagination(Optional.ofNullable(pagination));
        }
        /**
         * Sets value for `reportRequests`
         */
        @JsonSetter("report_requests")
        public Builder reportRequests(Optional<List<ReportRequest>> reportRequests) {
            this.reportRequests = reportRequests;
            return this;
        }

        /**
         * Sets value for `reportRequests`
         */
        public Builder reportRequests(List<ReportRequest> reportRequests) {
            return this.reportRequests(Optional.ofNullable(reportRequests));
        }



        public ReportsFindReportRequestsResponse build() {
            return new ReportsFindReportRequestsResponse(this);
        }
    }

}



