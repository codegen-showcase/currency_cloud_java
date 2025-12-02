# reports

## Module Functions

### Find Report Requests <a name="find_report_requests"></a>

Searches for report requests made. Returns a JSON structure with details of matching report requests.

**API Endpoint**: `GET /reports/report_requests/find`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `createdAtFrom` | ✗ | Start date (for range), in ISO 8601 format, for when the reports were created. | `"1970-01-01"` |
| `createdAtTo` | ✗ | End date (for range), in ISO 8601 format, for when the reports were created. | `"1970-01-01"` |
| `description` | ✗ | Description that was provided during the report creation process. | `"string"` |
| `expirationDateFrom` | ✗ | Start date (for range), in ISO 8601 format, for when the report will be (was) expired. | `"1970-01-01"` |
| `expirationDateTo` | ✗ | End date (for range), in ISO 8601 format, for when the report will be (was) expired. | `"1970-01-01"` |
| `order` | ✗ | Any field name to change the sort order. | `"string"` |
| `orderAscDesc` | ✗ | Sort records in ascending or descending order. | `ReportsFindReportRequestsOrderAscDescEnum.ASC` |
| `page` | ✗ | Page number. | `123L` |
| `perPage` | ✗ | Number of results per page. | `123L` |
| `reportType` | ✗ | Type of reports, that we expect to receive in search results. | `ReportsFindReportRequestsReportTypeEnum.BENEFICIARY` |
| `scope` | ✗ | Specify which account level will be used; 'own' is the default value. | `ReportsFindReportRequestsScopeEnum.ALL` |
| `shortReference` | ✗ | Your unique short reference. | `"string"` |
| `status` | ✗ | Status of the report. | `ReportsFindReportRequestsStatusEnum.COMPLETED` |
| `updatedAtFrom` | ✗ | Start date (for range), in ISO 8601 format, for when the reports were updated. | `"1970-01-01"` |
| `updatedAtTo` | ✗ | End date (for range), in ISO 8601 format, for when the reports were updated. | `"1970-01-01"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.ReportsFindReportRequestsResponse;
import com.currencycloud.sdk.resources.reports.params.FindReportRequestsRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
ReportsFindReportRequestsResponse res = client.reports().findReportRequests(
        FindReportRequestsRequest
        .builder()
        .build());
```

#### Response

##### Type
[ReportsFindReportRequestsResponse](/src/main/java/com/currencycloud/sdk/model/ReportsFindReportRequestsResponse.java)

##### Example
`ReportsFindReportRequestsResponse
.builder()
.pagination(Pagination
.builder()
.currentPage(1L)
.nextPage(2L)
.order("created_at")
.orderAscDesc(PaginationOrderAscDescEnum.ASC)
.perPage(25L)
.previousPage(-1L)
.totalEntries(1L)
.totalPages(1L)
.build())
.build()`

### Retrieves a Report Request with the given ID <a name="get_report_requests"></a>

Searches for a report by ID. Returns a JSON structure with details of the specified report request.

**API Endpoint**: `GET /reports/report_requests/{id}`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `id` | ✓ | ID of the report. | `"string"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.ReportRequest;
import com.currencycloud.sdk.resources.reports.params.GetReportRequestsRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
ReportRequest res = client.reports().getReportRequests(GetReportRequestsRequest
                    .builder()
                    .id("string")
                    .build());
```

#### Response

##### Type
[ReportRequest](/src/main/java/com/currencycloud/sdk/model/ReportRequest.java)

##### Example
`ReportRequest
.builder()
.accountId("B7DE235A-FF5D-4252-83C2-06A605267FEA")
.contactId("543477161-91de-012f-e284-1e0030c7f352")
.createdAt("2023-03-16T23:59:59.000Z")
.description("Description, which was provided during the report creation process")
.expirationDate("2023-03-23T00:00:00.000Z")
.id("950dac23-c4af-4a6a-ba19-344560abe2a9")
.reportType(ReportRequestReportTypeEnum.PAYMENT)
.reportUrl("https://tcc.s3.amazonaws.com/reports/transaction_reports/000/000/011/transaction_report_23_03_2020.csv?1471682433")
.searchParams(Map.ofEntries(
Map.entry("account_id", "9a7ba866-56d1-39c6-8ca2-12cb4141213a"),
Map.entry("contact_id", "543a7716c-816e-01af-3214-2e0030f6f25a"),
Map.entry("created_at_from", "2014-01-12"),
Map.entry("created_at_to", "2014-01-17"),
Map.entry("description", "Description, which was provided during the report creation process"),
Map.entry("expiration_date_from", "2014-01-12"),
Map.entry("expiration_date_to", "2014-01-17"),
Map.entry("report_type", "Payment"),
Map.entry("short_reference", "RP-30250607-VDTMFA"),
Map.entry("status", "completed")
))
.shortReference("RP-30250607-VDTMFA")
.status(ReportRequestStatusEnum.COMPLETED)
.updatedAt("2023-03-16T23:59:59.000Z")
.build()`

### Generate Conversion Report <a name="generate_conversion_report"></a>

Returns a JSON structure with details of the conversion report requested.

**API Endpoint**: `POST /reports/conversions/create`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `buyCurrency` | ✗ | Three-letter ISO 4217 currency code. | `"string"` |
| `clientBuyAmountFrom` | ✗ | Minimum client buy amount. | `"string"` |
| `clientBuyAmountTo` | ✗ | Maximum client buy amount. | `"string"` |
| `clientSellAmountFrom` | ✗ | Minimum client sell amount. | `"string"` |
| `clientSellAmountTo` | ✗ | Maximum client sell amount. | `"string"` |
| `clientStatus` | ✗ | The current status of the conversion. | `ReportsGenerateConversionReportBodyClientStatusEnum.AWAITING_AUTHORISATION` |
| `conversionDateFrom` | ✗ | ISO 8601 Date/time for start of range for when buy currency was delivered. | `"1970-01-01"` |
| `conversionDateTo` | ✗ | ISO 8601 Date/time for end of range for when buy currency was delivered. | `"1970-01-01"` |
| `createdAtFrom` | ✗ | ISO 8601 Date/time for start of date range for when the conversion was created. | `"1970-01-01"` |
| `createdAtTo` | ✗ | ISO 8601 Date/time for end of date range for when the conversion was created. | `"1970-01-01"` |
| `description` | ✗ | Description that will be applied to the report. | `"string"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |
| `partnerBuyAmountFrom` | ✗ | Minimum buy amount (sub-accounts). | `"string"` |
| `partnerBuyAmountTo` | ✗ | Maximum buy amount (sub-accounts). | `"string"` |
| `partnerSellAmountFrom` | ✗ | Minimum sell amount (sub-accounts). | `"string"` |
| `partnerSellAmountTo` | ✗ | Maximum sell amount (sub-accounts). | `"string"` |
| `scope` | ✗ | Specify which account level will be used - 'own' is the default. | `ReportsGenerateConversionReportBodyScopeEnum.ALL` |
| `sellCurrency` | ✗ | Three-letter ISO 4217 currency code. | `"string"` |
| `settlementDateFrom` | ✗ | ISO 8601 Date/time for start of date range for when the sell_currency was debited. | `"1970-01-01"` |
| `settlementDateTo` | ✗ | ISO 8601 Date/time for end of date range for when the sell_currency was debited. | `"1970-01-01"` |
| `uniqueRequestId` | ✗ | Unique request ID of conversion. | `"string"` |
| `updatedAtFrom` | ✗ | ISO 8601 Date/time for start of date range for when the conversion was updated. | `"1970-01-01"` |
| `updatedAtTo` | ✗ | ISO 8601 Date/time for end of date range for when the conversion was updated. | `"1970-01-01"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.ReportRequest;
import com.currencycloud.sdk.resources.reports.params.GenerateConversionReportRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
ReportRequest res = client.reports().generateConversionReport(GenerateConversionReportRequest
                    .builder()
                    .build());
```

#### Response

##### Type
[ReportRequest](/src/main/java/com/currencycloud/sdk/model/ReportRequest.java)

##### Example
`ReportRequest
.builder()
.accountId("B7DE235A-FF5D-4252-83C2-06A605267FEA")
.contactId("543477161-91de-012f-e284-1e0030c7f352")
.createdAt("2023-03-16T23:59:59.000Z")
.description("Description, which was provided during the report creation process")
.expirationDate("2023-03-23T00:00:00.000Z")
.id("950dac23-c4af-4a6a-ba19-344560abe2a9")
.reportType(ReportRequestReportTypeEnum.PAYMENT)
.reportUrl("https://tcc.s3.amazonaws.com/reports/transaction_reports/000/000/011/transaction_report_23_03_2020.csv?1471682433")
.searchParams(Map.ofEntries(
Map.entry("account_id", "9a7ba866-56d1-39c6-8ca2-12cb4141213a"),
Map.entry("contact_id", "543a7716c-816e-01af-3214-2e0030f6f25a"),
Map.entry("created_at_from", "2014-01-12"),
Map.entry("created_at_to", "2014-01-17"),
Map.entry("description", "Description, which was provided during the report creation process"),
Map.entry("expiration_date_from", "2014-01-12"),
Map.entry("expiration_date_to", "2014-01-17"),
Map.entry("report_type", "Payment"),
Map.entry("short_reference", "RP-30250607-VDTMFA"),
Map.entry("status", "completed")
))
.shortReference("RP-30250607-VDTMFA")
.status(ReportRequestStatusEnum.COMPLETED)
.updatedAt("2023-03-16T23:59:59.000Z")
.build()`

### Generate Payment Report <a name="generate_payment_report"></a>

Returns a JSON structure with details of the payments report requested.

**API Endpoint**: `POST /reports/payments/create`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `amountFrom` | ✗ | Minimum payment amount to 2 decimal places. | `123.0` |
| `amountTo` | ✗ | Maximum payment amount to 2 decimal places. | `123.0` |
| `beneficiaryId` | ✗ | ID of the beneficiary. | `"string"` |
| `bulkUploadReference` | ✗ | Reference to Bulk Upload. | `"string"` |
| `conversionId` | ✗ | Conversion unique ID. | `"string"` |
| `createdAtFrom` | ✗ | ISO 8601 format date/time for earliest payment creation to include. | `"1970-01-01"` |
| `createdAtTo` | ✗ | ISO 8601 format date/time for latest payment creation to include. | `"1970-01-01"` |
| `currency` | ✗ | Three-letter ISO 4217 currency code. | `"string"` |
| `description` | ✗ | Description that will be applied to report. | `"string"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |
| `paymentDateFrom` | ✗ | ISO 8601 format date for earliest payment date to include. | `"1970-01-01"` |
| `paymentDateTo` | ✗ | ISO 8601 format date for latest payment date to include. | `"1970-01-01"` |
| `paymentGroupId` | ✗ | ID of the payment group. | `"string"` |
| `scope` | ✗ | Specify which account level will be used - 'own' is the default value. | `"string"` |
| `status` | ✗ | Status of the payment. | `"string"` |
| `transferredAtFrom` | ✗ | ISO 8601 format date/time for earliest payment transfer date. | `"1970-01-01"` |
| `transferredAtTo` | ✗ | ISO 8601 format date/time for latest payment transfer date. | `"1970-01-01"` |
| `uniqueRequestId` | ✗ | Unique request ID of payment. | `"string"` |
| `updatedAtFrom` | ✗ | ISO 8601 format date/time for earliest payment updated to include. | `"1970-01-01"` |
| `updatedAtTo` | ✗ | ISO 8601 format date/time for latest payment updated to include. | `"1970-01-01"` |
| `withDeleted` | ✗ | Include deleted payments? | `true` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.ReportRequest;
import com.currencycloud.sdk.resources.reports.params.GeneratePaymentReportRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
ReportRequest res = client.reports().generatePaymentReport(GeneratePaymentReportRequest
                    .builder()
                    .build());
```

#### Response

##### Type
[ReportRequest](/src/main/java/com/currencycloud/sdk/model/ReportRequest.java)

##### Example
`ReportRequest
.builder()
.accountId("B7DE235A-FF5D-4252-83C2-06A605267FEA")
.contactId("543477161-91de-012f-e284-1e0030c7f352")
.createdAt("2023-03-16T23:59:59.000Z")
.description("Description, which was provided during the report creation process")
.expirationDate("2023-03-23T00:00:00.000Z")
.id("950dac23-c4af-4a6a-ba19-344560abe2a9")
.reportType(ReportRequestReportTypeEnum.PAYMENT)
.reportUrl("https://tcc.s3.amazonaws.com/reports/transaction_reports/000/000/011/transaction_report_23_03_2020.csv?1471682433")
.searchParams(Map.ofEntries(
Map.entry("account_id", "9a7ba866-56d1-39c6-8ca2-12cb4141213a"),
Map.entry("contact_id", "543a7716c-816e-01af-3214-2e0030f6f25a"),
Map.entry("created_at_from", "2014-01-12"),
Map.entry("created_at_to", "2014-01-17"),
Map.entry("description", "Description, which was provided during the report creation process"),
Map.entry("expiration_date_from", "2014-01-12"),
Map.entry("expiration_date_to", "2014-01-17"),
Map.entry("report_type", "Payment"),
Map.entry("short_reference", "RP-30250607-VDTMFA"),
Map.entry("status", "completed")
))
.shortReference("RP-30250607-VDTMFA")
.status(ReportRequestStatusEnum.COMPLETED)
.updatedAt("2023-03-16T23:59:59.000Z")
.build()`

