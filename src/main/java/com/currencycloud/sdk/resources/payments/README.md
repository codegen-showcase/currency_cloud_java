# payments

## Module Functions

### Find Payments <a name="find"></a>

Searches for payment records.

**API Endpoint**: `GET /payments/find`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `amount` | ✗ | Exact amount | `"string"` |
| `amountFrom` | ✗ | Minimum amount | `"string"` |
| `amountTo` | ✗ | Maximum amount | `"string"` |
| `beneficiaryId` | ✗ | Beneficiary UUID | `"string"` |
| `bulkUploadId` | ✗ | Bulk upload reference code. | `"string"` |
| `chargeType` | ✗ | Payment Charges Setting value (only applicable to Swift payments). Limits the search results to payments of the specified <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430820-Selecting-payment-charges-for-SWIFT-payments-FAQ">charge type</a>. | `PaymentsFindChargeTypeEnum.OURS` |
| `conversionId` | ✗ | Conversion UUID | `"string"` |
| `createdAtFrom` | ✗ | Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00". | `"1970-01-01T00:00:00"` |
| `createdAtTo` | ✗ | Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00". | `"1970-01-01T00:00:00"` |
| `currency` | ✗ | Currency in which payment was made. Three-letter ISO currency code. | `"string"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |
| `order` | ✗ | Any field name to change the sort order. | `"string"` |
| `orderAscDesc` | ✗ | Sort records in ascending or descending order. | `PaymentsFindOrderAscDescEnum.ASC` |
| `page` | ✗ | Page number | `123L` |
| `paymentDateFrom` | ✗ | Earliest instructed payment date. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00". | `"1970-01-01"` |
| `paymentDateTo` | ✗ | Latest instructed payment date. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00". | `"1970-01-01"` |
| `paymentGroupId` | ✗ | Payment group. | `"string"` |
| `perPage` | ✗ | Number of results per page. | `123L` |
| `reason` | ✗ | User-generated reason for payment. Freeform text. | `"string"` |
| `reviewStatus` | ✗ | Compliance review status. | `PaymentsFindReviewStatusEnum.IN_REVIEW` |
| `scope` | ✗ | "Own" account, "clients" sub-accounts, or "all" accounts. | `PaymentsFindScopeEnum.ALL` |
| `shortReference` | ✗ | Short reference code. | `"string"` |
| `status` | ✗ | Payment status | `PaymentsFindStatusEnum.AUTHORISED` |
| `transferredAtFrom` | ✗ | Earliest date of payment processing. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00". | `"1970-01-01T00:00:00"` |
| `transferredAtTo` | ✗ | Latest date of payment processing. Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00". | `"1970-01-01T00:00:00"` |
| `uniqueRequestId` | ✗ | User-generated idempotency key. | `"string"` |
| `updatedAtFrom` | ✗ | Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00". | `"1970-01-01T00:00:00"` |
| `updatedAtTo` | ✗ | Any valid ISO 8601 format, e.g. "2023-12-31T23:59:59+00:00". | `"1970-01-01T00:00:00"` |
| `withDeleted` | ✗ | Include deleted payments. | `true` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.PaymentsFindResponse;
import com.currencycloud.sdk.resources.payments.params.FindRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
PaymentsFindResponse res = client.payments().find(FindRequest
                           .builder()
                           .build());
```

#### Response

##### Type
[PaymentsFindResponse](/src/main/java/com/currencycloud/sdk/model/PaymentsFindResponse.java)

##### Example
`PaymentsFindResponse
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

### Get Payment Delivery Date <a name="get_delivery_date"></a>

Gets payment delivery date.

**API Endpoint**: `GET /payments/payment_delivery_date`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `bankCountry` | ✓ | The two-letter ISO code of the country where the payment is sent. | `"string"` |
| `currency` | ✓ | The three-letter ISO code of the currency of the payment. | `"string"` |
| `paymentDate` | ✓ | The date when the payment will be released. Any valid ISO 8601 format, e.g. "2023-12-31". | `"string"` |
| `paymentType` | ✓ | Currencycloud supports two types of payments: "priority", made using the Swift network; and "regular", made using the local bank network. | `PaymentsGetDeliveryDatePaymentTypeEnum.PRIORITY` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.PaymentDeliveryDate;
import com.currencycloud.sdk.model.PaymentsGetDeliveryDatePaymentTypeEnum;
import com.currencycloud.sdk.resources.payments.params.GetDeliveryDateRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
PaymentDeliveryDate res = client.payments().getDeliveryDate(GetDeliveryDateRequest
                          .builder()
                          .bankCountry("string")
                          .currency("string")
                          .paymentDate("string")
                          .paymentType(PaymentsGetDeliveryDatePaymentTypeEnum.PRIORITY)
                          .build());
```

#### Response

##### Type
[PaymentDeliveryDate](/src/main/java/com/currencycloud/sdk/model/PaymentDeliveryDate.java)

##### Example
`PaymentDeliveryDate
.builder()
.bankCountry("MX")
.currency("MXN")
.paymentCutoffTime("2019-02-11T19:00:00+00:00")
.paymentDate("2019-02-11")
.paymentDeliveryDate("2019-02-11T00:00:00+00:00")
.paymentType("priority")
.build()`

### Get Payment Fees <a name="get_payment_fees"></a>

Gets the <a href="https://support.currencycloud.com/hc/en-gb/articles/360017471459-Applying-fees-to-individual-payments-FAQ">payment fee</a> tables for the current authenticated account.

**API Endpoint**: `GET /payments/payment_fees`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `order` | ✗ | Any field name to change the sort order. | `"string"` |
| `orderAscDesc` | ✗ | Sort records in ascending or descending order. | `PaymentsGetPaymentFeesOrderAscDescEnum.ASC` |
| `page` | ✗ | Page number | `123L` |
| `perPage` | ✗ | Number of results per page. | `123L` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.PaymentsGetPaymentFeesResponse;
import com.currencycloud.sdk.resources.payments.params.GetPaymentFeesRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
PaymentsGetPaymentFeesResponse res = client.payments().getPaymentFees(GetPaymentFeesRequest
                                     .builder()
                                     .build());
```

#### Response

##### Type
[PaymentsGetPaymentFeesResponse](/src/main/java/com/currencycloud/sdk/model/PaymentsGetPaymentFeesResponse.java)

##### Example
`PaymentsGetPaymentFeesResponse
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

### Get Quote Payment Fee <a name="quote_payment_fee"></a>

Gets the calculated quote for the fee that will be applied against a payment.

**API Endpoint**: `GET /payments/quote_payment_fee`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `paymentCurrency` | ✓ | Currency of the payment. | `"string"` |
| `paymentDestinationCountry` | ✓ | Destination Country of the payment. | `"string"` |
| `paymentType` | ✓ | Type of payment - priority(Swift) or regular(local). | `PaymentsQuotePaymentFeePaymentTypeEnum.PRIORITY` |
| `accountId` | ✗ | Account UUID. If this is left empty, the account that is making the API call is used. | `"string"` |
| `chargeType` | ✗ | Payment Charges type. if no value is provided the account's default value is used. | `PaymentsQuotePaymentFeeChargeTypeEnum.OURS` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.PaymentsQuotePaymentFeePaymentTypeEnum;
import com.currencycloud.sdk.model.QuotePaymentFee;
import com.currencycloud.sdk.resources.payments.params.QuotePaymentFeeRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
QuotePaymentFee res = client.payments().quotePaymentFee(QuotePaymentFeeRequest
                      .builder()
                      .paymentCurrency("string")
                      .paymentDestinationCountry("string")
                      .paymentType(PaymentsQuotePaymentFeePaymentTypeEnum.PRIORITY)
                      .build());
```

#### Response

##### Type
[QuotePaymentFee](/src/main/java/com/currencycloud/sdk/model/QuotePaymentFee.java)

##### Example
`QuotePaymentFee
.builder()
.accountId("0534aaf2-2egg-0134-2f36-10b11cd33cfb")
.chargeType("fee")
.feeAmount("10.00")
.feeCurrency("EUR")
.paymentCurrency("USD")
.paymentDestinationCountry("US")
.paymentType("regular")
.build()`

### Get Payment <a name="get"></a>

Gets a payment record.

**API Endpoint**: `GET /payments/{id}`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `id` | ✓ | Payment UUID | `"string"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |
| `reviewStatus` | ✗ | Compliance review status. | `PaymentsGetReviewStatusEnum.IN_REVIEW` |
| `withDeleted` | ✗ | Include deleted payments. | `true` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.Payment;
import com.currencycloud.sdk.resources.payments.params.GetRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
Payment res = client.payments().get(GetRequest
                                    .builder()
                                    .id("string")
                                    .build());
```

#### Response

##### Type
[Payment](/src/main/java/com/currencycloud/sdk/model/Payment.java)

##### Example
`Payment
.builder()
.amount("1250000.00")
.authorisationStepsRequired("0")
.beneficiaryId("543477161-91de-012f-e284-1e0030c7f352")
.conversionId("049bab6d-fe2a-42e1-be0f-531c59f838ea")
.createdAt("2023-12-31T23:59:59.000Z")
.creatorContactId("ab3477161-91de-012f-e284-1e0030c7f35c")
.currency("GBP")
.estimatedArrival("2023-12-31T00:00:00.000Z")
.failureReason("")
.failureReturnedAmount("")
.feeAmount("10.00")
.feeCurrency("EUR")
.id("543477161-91de-012f-e284-1e0030c7f3123")
.invoiceDate("2023-07-03")
.invoiceNumber("INV01")
.lastUpdaterContactId("ab3477161-91de-012f-e284-1e0030c7f35c")
.payerId("")
.paymentDate("2023-12-31T23:59:59.000Z")
.paymentGroupId("20140428-CJRRJM")
.paymentType("regular")
.purposeCode("")
.reason("Salary for March")
.reference("INVOICE 9876")
.reviewStatus(PaymentReviewStatusEnum.IN_REVIEW)
.shortReference("140416-GGJBNQ001")
.status("ready_to_send")
.transferredAt("2023-12-31T23:59:59.000Z")
.ultimateBeneficiaryName("Some beneficiary name")
.uniqueRequestId("1234567890abc")
.updatedAt("2023-12-31T23:59:59.000Z")
.build()`

### Get Payment Confirmation <a name="confirmation"></a>

Gets confirmation for a given payment.

**API Endpoint**: `GET /payments/{id}/confirmation`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `id` | ✓ | Payment UUID | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.PaymentConfirmation;
import com.currencycloud.sdk.resources.payments.params.ConfirmationRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
PaymentConfirmation res = client.payments().confirmation(ConfirmationRequest
                          .builder()
                          .id("string")
                          .build());
```

#### Response

##### Type
[PaymentConfirmation](/src/main/java/com/currencycloud/sdk/model/PaymentConfirmation.java)

##### Example
`PaymentConfirmation
.builder()
.accountId("543477161-91de-012f-e284-1e0030c7f352")
.confirmationUrl("https://s3.com/140416-GGJBNQ001.pdf")
.createdAt("2014-01-12T00:00:00Z")
.expiresAt("2014-02-12T00:00:00Z")
.id("123123121-91de-012f-e284-1e0030c7f3111")
.paymentId("543477161-91de-012f-e284-1e0030c7f3123")
.shortReference("140416-GGJBNQ001")
.status("completed")
.updatedAt("2014-01-12T00:00:00Z")
.build()`

### Get Payment Submission Information <a name="get_submission_info"></a>

Gets the pacs.008 or MT103 information for a Swift payment.

**API Endpoint**: `GET /payments/{id}/submission_info`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `id` | ✓ | Payment UUID | `"string"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.PaymentSubmissionInformation;
import com.currencycloud.sdk.resources.payments.params.GetSubmissionInfoRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
PaymentSubmissionInformation res = client.payments().getSubmissionInfo(GetSubmissionInfoRequest
                                   .builder()
                                   .id("string")
                                   .build());
```

#### Response

##### Type
[PaymentSubmissionInformation](/src/main/java/com/currencycloud/sdk/model/PaymentSubmissionInformation.java)

##### Example
`PaymentSubmissionInformation
.builder()
.format("PACS008")
.message("<AppHdr xmlns=\"urn:iso:std:iso:20022:tech:xsd:head.001.001.02\"> ...")
.status(PaymentSubmissionInformationStatusEnum.PENDING)
.submissionRef("MXGGYAGJULIIQKDV")
.build()`

### Get Payment Tracking Information <a name="get_tracking_info"></a>

Gets the tracking information for a payment.

**API Endpoint**: `GET /payments/{id}/tracking_info`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `id` | ✓ | Payment UUID | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.PaymentTrackingInfo;
import com.currencycloud.sdk.resources.payments.params.GetTrackingInfoRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
PaymentTrackingInfo res = client.payments().getTrackingInfo(GetTrackingInfoRequest
                          .builder()
                          .id("string")
                          .build());
```

#### Response

##### Type
[PaymentTrackingInfo](/src/main/java/com/currencycloud/sdk/model/PaymentTrackingInfo.java)

##### Example
`PaymentTrackingInfo
.builder()
.completionTime("2019-07-10T15:39:08.690Z")
.initiationTime("2019-07-09T13:20:30.000Z")
.lastUpdateTime("2019-07-10T15:39:08.690Z")
.paymentEvents(List.of(
Map.ofEntries(
Map.entry("from", "BANABEBBXXX"),
Map.entry("interbank_settlement_amount", Map.ofEntries(
Map.entry("amount", 745437.57),
Map.entry("currency", "USD")
)),
Map.entry("interbank_settlement_date", "2019-07-09"),
Map.entry("last_update_time", "2019-07-10T14:22:41.273Z"),
Map.entry("originator", "BANABEBBXXX"),
Map.entry("sender_acknowledgement_receipt", "2019-07-10T14:22:41.273Z"),
Map.entry("to", "BANAUS33XXX"),
Map.entry("tracker_event_type", "credit_transfer_payment_cancellation_request"),
Map.entry("valid", true)
),
Map.ofEntries(
Map.entry("charge_type", "shared"),
Map.entry("from", "BANABEBBXXX"),
Map.entry("instructed_amount", Map.ofEntries(
Map.entry("amount", 745437.57),
Map.entry("currency", "USD")
)),
Map.entry("interbank_settlement_amount", Map.ofEntries(
Map.entry("amount", 745437.57),
Map.entry("currency", "USD")
)),
Map.entry("interbank_settlement_date", "2019-07-09"),
Map.entry("last_update_time", "2019-07-09T13:20:50.633Z"),
Map.entry("originator", "BANABEBBXXX"),
Map.entry("sender_acknowledgement_receipt", "2019-07-09T13:20:30.000Z"),
Map.entry("serial_parties", Map.ofEntries(
Map.entry("creditor_agent", "GPMRQAJ0"),
Map.entry("debtor_agent", "GPMRCH30")
)),
Map.entry("to", "BANAUS33XXX"),
Map.entry("tracker_event_type", "customer_credit_transfer_payment"),
Map.entry("transaction_status", Map.ofEntries(
Map.entry("reason", "transferred_and_tracked"),
Map.entry("status", "processing")
)),
Map.entry("valid", true)
)
))
.transactionStatus(PaymentTrackingInfoTransactionStatus
.builder()
.reason("transferred_and_tracked")
.status("processing")
.build())
.uetr("46ed4827-7b6f-4491-a06f-b548d5a7512d")
.build()`

### Assign Payment Fee <a name="assign_payment_fee"></a>

Assigns a <a href="https://support.currencycloud.com/hc/en-gb/articles/360017471459-Applying-fees-to-individual-payments-FAQ">payment fee</a> table to a specific sub-account.

**API Endpoint**: `POST /payments/assign_payment_fee`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `accountId` | ✓ | ID of the account to which the payment fee will be assigned. | `"3e4666bf-d5e5-4aa7-b8ce-cefe41c7568a"` |
| `paymentFeeId` | ✓ | ID of the payment fee entity that will be assigned to the account. | `"3e4666bf-d5e5-4aa7-b8ce-cefe41c7568a"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.PaymentFeeAssignment;
import com.currencycloud.sdk.resources.payments.params.AssignPaymentFeeRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
PaymentFeeAssignment res = client.payments().assignPaymentFee(AssignPaymentFeeRequest
                           .builder()
                           .accountId("3e4666bf-d5e5-4aa7-b8ce-cefe41c7568a")
                           .paymentFeeId("3e4666bf-d5e5-4aa7-b8ce-cefe41c7568a")
                           .build());
```

#### Response

##### Type
[PaymentFeeAssignment](/src/main/java/com/currencycloud/sdk/model/PaymentFeeAssignment.java)

##### Example
`PaymentFeeAssignment
.builder()
.accountId("0178a7ba-9a77-4c74-af71-a5f650f00e09")
.id("a6c4a482-1a56-49ea-be55-b9b0bb92a9b2")
.build()`

### Authorise Payment <a name="authorise"></a>

Authorises a payment pending authorisation.

**API Endpoint**: `POST /payments/authorise`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `paymentIds` | ✓ | One or more payment UUID identifiers to be authorised. | `List.of("string")` |

#### Example Snippet

```java
import java.util.List;

import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.PaymentAuthorisations;
import com.currencycloud.sdk.resources.payments.params.AuthoriseRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
PaymentAuthorisations res = client.payments().authorise(AuthoriseRequest
                            .builder()
                            .paymentIds(List.of(
                                    "string"
                                        ))
                            .build());
```

#### Response

##### Type
[PaymentAuthorisations](/src/main/java/com/currencycloud/sdk/model/PaymentAuthorisations.java)

##### Example
`PaymentAuthorisations
.builder()
.build()`

### Create Payment <a name="create"></a>

Submits a payment. On success, returns the new payment record. Use the <a href="/api-reference/#get-payer-requirements">Get Payer Requirements</a> endpoint to find out what payer information needs to be provided.<br><br> Clients who are implementing Strong Customer Authentication (SCA) for payments should refer to our <a href="../guides/integration-guides/sca_sponsored_api_payments">integration guide</a>.

**API Endpoint**: `POST /payments/create`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `amount` | ✓ | Amount | `"string"` |
| `beneficiaryId` | ✓ | Beneficiary UUID | `"string"` |
| `currency` | ✓ | Currency in which payment is made. Three-letter ISO currency code. | `"string"` |
| `reason` | ✓ | User-generated reason for payment - freeform text. | `"string"` |
| `reference` | ✓ | User-generated reference code. | `"string"` |
| `uniqueRequestId` | ✓ | User-generated idempotency key. | `"string"` |
| `chargeType` | ✗ | Payment Charges Setting value (only applicable to Swift payments). If this is left empty, the account's default value is used. Do not specify for regular (local) payments. | `PaymentsCreateBodyChargeTypeEnum.OURS` |
| `conversionId` | ✗ | Conversion UUID | `"string"` |
| `feeAmount` | ✗ | Fee amount | `"string"` |
| `feeCurrency` | ✗ | Currency fee is paid in. | `"string"` |
| `invoiceDate` | ✗ | The date of the invoice related to the payment. Necessary when making business-related INR payments, check our <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430000-Payment-Purpose-Codes">support article</a> to see if this applies to your purpose code. ISO 8601 format YYYY-MM-DD. Mandatory if supplying `invoice_number`. | `"string"` |
| `invoiceNumber` | ✗ | The invoice number related to the payment. Necessary when making business-related INR payments, check our <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430000-Payment-Purpose-Codes">support article</a> to see if this applies to your purpose code. Can be up to 30 characters. Mandatory if supplying `invoice_date`. | `"string"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. Payer details parameters should not be sent if using on_behalf_of, they will be populated using the details from the sub-account. | `"string"` |
| `payerAddress` | ✗ | First line of address. | `"string"` |
| `payerCity` | ✗ | City name, should not consist of only numbers. | `"string"` |
| `payerCompanyName` | ✗ | Required if "payer_entity_type" is "company". | `"string"` |
| `payerCountry` | ✗ | Two-letter ISO country code. | `"string"` |
| `payerDateOfBirth` | ✗ | If "payer_entity_type" is "company", this is the company registration date. If "payer_entity_type" is "individual", this is date of birth. ISO 8601 format YYYY-MM-DD. | `"string"` |
| `payerEntityType` | ✗ | Legal entity | `PaymentsCreateBodyPayerEntityTypeEnum.COMPANY` |
| `payerFirstName` | ✗ | Required if "payer_entity_type" is "individual". | `"string"` |
| `payerIdentificationType` | ✗ | A legal document that verifies the identity of the payer. Required documentation will vary depending on the nationality or registered address of the payer. | `PaymentsCreateBodyPayerIdentificationTypeEnum.CITIZENSHIP_PAPERS` |
| `payerIdentificationValue` | ✗ | A unique reference code for the identification document, such as a passport number. | `"string"` |
| `payerLastName` | ✗ | Required if "payer_entity_type" is "individual". Cannot contain any numbers or company signifiers. | `"string"` |
| `payerPostcode` | ✗ | Postal code | `"string"` |
| `payerStateOrProvince` | ✗ | State or province. | `"string"` |
| `paymentDate` | ✗ | Instructed date of payment - on this date we will attempt to debit funds on the account and submit the payment to the scheme. If the payment cannot be submitted before the cut-off (i.e. due to lack of funding), we will re-attempt on the next working day. Defaults to the earliest possible date if not passed as parameter. Any valid ISO 8601 format, e.g. "2023-12-31. | `"string"` |
| `paymentType` | ✗ | Currencycloud supports two types of payments: "priority", made using the Swift network; and "regular", made using the local bank network. | `PaymentsCreateBodyPaymentTypeEnum.PRIORITY` |
| `purposeCode` | ✗ | <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430000-Payment-Purpose-Codes">Payment Purpose Code</a> (Mandatory for all local INR and MYR payments, Swift CNY payments, and Swift payments in any currency to banks in Bahrain or the United Arab Emirates). | `"string"` |
| `ultimateBeneficiaryName` | ✗ | The name of the ultimate beneficiary if different. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.Payment;
import com.currencycloud.sdk.resources.payments.params.CreateRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
Payment res = client.payments().create(CreateRequest
                                       .builder()
                                       .amount("string")
                                       .beneficiaryId("string")
                                       .currency("string")
                                       .reason("string")
                                       .reference("string")
                                       .uniqueRequestId("string")
                                       .build());
```

#### Response

##### Type
[Payment](/src/main/java/com/currencycloud/sdk/model/Payment.java)

##### Example
`Payment
.builder()
.amount("1250000.00")
.authorisationStepsRequired("0")
.beneficiaryId("543477161-91de-012f-e284-1e0030c7f352")
.conversionId("049bab6d-fe2a-42e1-be0f-531c59f838ea")
.createdAt("2023-12-31T23:59:59.000Z")
.creatorContactId("ab3477161-91de-012f-e284-1e0030c7f35c")
.currency("GBP")
.estimatedArrival("2023-12-31T00:00:00.000Z")
.failureReason("")
.failureReturnedAmount("")
.feeAmount("10.00")
.feeCurrency("EUR")
.id("543477161-91de-012f-e284-1e0030c7f3123")
.invoiceDate("2023-07-03")
.invoiceNumber("INV01")
.lastUpdaterContactId("ab3477161-91de-012f-e284-1e0030c7f35c")
.payerId("")
.paymentDate("2023-12-31T23:59:59.000Z")
.paymentGroupId("20140428-CJRRJM")
.paymentType("regular")
.purposeCode("")
.reason("Salary for March")
.reference("INVOICE 9876")
.reviewStatus(PaymentReviewStatusEnum.IN_REVIEW)
.shortReference("140416-GGJBNQ001")
.status("ready_to_send")
.transferredAt("2023-12-31T23:59:59.000Z")
.ultimateBeneficiaryName("Some beneficiary name")
.uniqueRequestId("1234567890abc")
.updatedAt("2023-12-31T23:59:59.000Z")
.build()`

### Unassign Payment Fee <a name="unassign_payment_fee"></a>

Unassigns the <a href="https://support.currencycloud.com/hc/en-gb/articles/360017471459-Applying-fees-to-individual-payments-FAQ">payment fee</a> tables for a specific sub-account.

**API Endpoint**: `POST /payments/unassign_payment_fee`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `accountId` | ✓ | Sub-account UUID for which the payment level fee will be un-assigned. | `"3e4666bf-d5e5-4aa7-b8ce-cefe41c7568a"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.PaymentFeeUnassignment;
import com.currencycloud.sdk.resources.payments.params.UnassignPaymentFeeRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
PaymentFeeUnassignment res = client.payments().unassignPaymentFee(UnassignPaymentFeeRequest
                             .builder()
                             .accountId("3e4666bf-d5e5-4aa7-b8ce-cefe41c7568a")
                             .build());
```

#### Response

##### Type
[PaymentFeeUnassignment](/src/main/java/com/currencycloud/sdk/model/PaymentFeeUnassignment.java)

##### Example
`PaymentFeeUnassignment
.builder()
.accountId("0178a7ba-9a77-4c74-af71-a5f650f00e09")
.build()`

### Validate Payment <a name="validate"></a>

Validates the details of a new payment without creating a record of the payment. On success, returns an object containing a string validation_result with value "success".<br><br>
Clients who are implementing Strong Customer Authentication (SCA) for payments should refer to our <strong><a href="../guides/integration-guides/sca_sponsored_api_payments">SCA for payments integration guide</a></strong>.

**API Endpoint**: `POST /payments/validate`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `amount` | ✓ | Amount | `"string"` |
| `beneficiaryId` | ✓ | Beneficiary UUID | `"string"` |
| `currency` | ✓ | Currency in which payment is made. Three-digit currency code. | `"string"` |
| `reason` | ✓ | User-generated reason for payment - freeform text. | `"string"` |
| `reference` | ✓ | User-generated reference code. | `"string"` |
| `chargeType` | ✗ | Payment Charges Setting value (only applicable to Swift payments). If empty - then account's default value is used. Do not specify for regular (local) payments. | `PaymentsValidateBodyChargeTypeEnum.OURS` |
| `conversionId` | ✗ | Conversion UUID | `"string"` |
| `feeAmount` | ✗ | Fee amount | `"string"` |
| `feeCurrency` | ✗ | Currency fee is paid in. | `"string"` |
| `id` | ✗ | Payment UUID | `"string"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |
| `payerAddress` | ✗ | First line of address. | `"string"` |
| `payerCity` | ✗ | City | `"string"` |
| `payerCompanyName` | ✗ | Required if "payer_entity_type" is "company". | `"string"` |
| `payerCountry` | ✗ | Two-letter ISO country code. | `"string"` |
| `payerDateOfBirth` | ✗ | If "payer_entity_type" is "company", this is the company registration date. If "payer_entity_type" is "individual", this is the individual's date of birth. ISO 8601 format YYYY-MM-DD. | `"string"` |
| `payerEntityType` | ✗ | Legal entity | `PaymentsValidateBodyPayerEntityTypeEnum.COMPANY` |
| `payerFirstName` | ✗ | Required if "payer_entity_type" is "individual". | `"string"` |
| `payerIdentificationType` | ✗ | A legal document that verifies the identity of the payer. Required documentation will vary depending on the nationality or registered address of the payer. | `PaymentsValidateBodyPayerIdentificationTypeEnum.CITIZENSHIP_PAPERS` |
| `payerIdentificationValue` | ✗ | A unique reference code for the identification document, such as a passport number. | `"string"` |
| `payerLastName` | ✗ | Required if "payer_entity_type" is "individual". | `"string"` |
| `payerPostcode` | ✗ | Postal code | `"string"` |
| `payerStateOrProvince` | ✗ | State or province. | `"string"` |
| `paymentDate` | ✗ | Instructed date of payment. Any valid ISO 8601 format, e.g. "2023-12-31". | `"string"` |
| `paymentType` | ✗ | Currencycloud supports two types of payments: "priority", made using the Swift network; and "regular", made using the local bank network. | `PaymentsValidateBodyPaymentTypeEnum.PRIORITY` |
| `purposeCode` | ✗ | Payment Purpose Code (Mandatory for all INR payments). | `"string"` |
| `ultimateBeneficiaryName` | ✗ | The name of the ultimate beneficiary if different. | `"string"` |
| `uniqueRequestId` | ✗ | User-generated idempotency key. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.PaymentsValidateResponse;
import com.currencycloud.sdk.resources.payments.params.ValidateRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
PaymentsValidateResponse res = client.payments().validate(ValidateRequest
                               .builder()
                               .amount("string")
                               .beneficiaryId("string")
                               .currency("string")
                               .reason("string")
                               .reference("string")
                               .build());
```

#### Response

##### Type
[PaymentsValidateResponse](/src/main/java/com/currencycloud/sdk/model/PaymentsValidateResponse.java)

##### Example
`PaymentsValidateResponse
.builder()
.build()`

### Update Payment <a name="update"></a>

Updates a payment. On success, returns the updated payment entity.

**API Endpoint**: `POST /payments/{id}`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `id` | ✓ | Payment UUID | `"string"` |
| `amount` | ✗ | Payment amount | `"string"` |
| `beneficiaryId` | ✗ | Beneficiary UUID | `"string"` |
| `chargeType` | ✗ | Payment Charges Setting value (only applicable to Swift payments). If empty, the account's default value is used. Do not specify for regular (local) payments. | `PaymentsUpdateBodyChargeTypeEnum.OURS` |
| `conversionId` | ✗ | Conversion UUID | `"string"` |
| `currency` | ✗ | Currency in which the payment is being made. Three-letter ISO currency code. | `"string"` |
| `feeAmount` | ✗ | Fee amount | `"string"` |
| `feeCurrency` | ✗ | The currency the fee is paid in. | `"string"` |
| `invoiceDate` | ✗ | The date of the invoice related to the payment. Necessary when making business-related INR payments, check our <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430000-Payment-Purpose-Codes">support article</a> to see if this applies to your purpose code. ISO 8601 format YYYY-MM-DD. Mandatory if `invoice_number` is supplied. | `"string"` |
| `invoiceNumber` | ✗ | The invoice number related to the payment. Necessary when making business-related INR payments, check our <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430000-Payment-Purpose-Codes">support article</a> to see if this applies to your purpose code. Can be up to 30 characters. Mandatory if `invoice_date` is supplied. | `"string"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |
| `payerAddress` | ✗ | First line of address. | `"string"` |
| `payerCity` | ✗ | City | `"string"` |
| `payerCompanyName` | ✗ | Required if "payer_entity_type" is "company". | `"string"` |
| `payerCountry` | ✗ | Two-letter ISO country code. | `"string"` |
| `payerDateOfBirth` | ✗ | If the "payer_entity_type" is "company", this is the company registration date. If the "payer_entity_type" is "individual", this is the payer's date of birth. ISO 8601 format YYYY-MM-DD. | `"string"` |
| `payerEntityType` | ✗ | Legal entity | `PaymentsUpdateBodyPayerEntityTypeEnum.COMPANY` |
| `payerFirstName` | ✗ | Required if "payer_entity_type" is "individual". | `"string"` |
| `payerIdentificationType` | ✗ | A legal document that verifies the identity of the payer. Required documentation will vary depending on the nationality or registered address of the payer. | `PaymentsUpdateBodyPayerIdentificationTypeEnum.CITIZENSHIP_PAPERS` |
| `payerIdentificationValue` | ✗ | A unique reference code for the identification document, such as a passport number. | `"string"` |
| `payerLastName` | ✗ | Required if payer_entity_type is "individual". | `"string"` |
| `payerPostcode` | ✗ | Postal code | `"string"` |
| `payerStateOrProvince` | ✗ | State or province. | `"string"` |
| `paymentDate` | ✗ | Instructed date of payment. Any valid ISO 8601 format, e.g. "2023-12-31". | `"string"` |
| `paymentType` | ✗ | Currencycloud supports two types of payments: "priority", made using the Swift network; and "regular", made using the local bank network. | `PaymentsUpdateBodyPaymentTypeEnum.PRIORITY` |
| `purposeCode` | ✗ | Payment Purpose Code (Mandatory for all INR payments). See our <a href="https://support.currencycloud.com/hc/en-gb/articles/360017430000-Payment-Purpose-Codes">support article</a> for more information. | `"string"` |
| `reason` | ✗ | User-generated reason for payment - freeform text. | `"string"` |
| `reference` | ✗ | User-generated reference code. | `"string"` |
| `ultimateBeneficiaryName` | ✗ | The name of the ultimate beneficiary if different. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.Payment;
import com.currencycloud.sdk.resources.payments.params.UpdateRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
Payment res = client.payments().update(UpdateRequest
                                       .builder()
                                       .id("string")
                                       .build());
```

#### Response

##### Type
[Payment](/src/main/java/com/currencycloud/sdk/model/Payment.java)

##### Example
`Payment
.builder()
.amount("1250000.00")
.authorisationStepsRequired("0")
.beneficiaryId("543477161-91de-012f-e284-1e0030c7f352")
.conversionId("049bab6d-fe2a-42e1-be0f-531c59f838ea")
.createdAt("2023-12-31T23:59:59.000Z")
.creatorContactId("ab3477161-91de-012f-e284-1e0030c7f35c")
.currency("GBP")
.estimatedArrival("2023-12-31T00:00:00.000Z")
.failureReason("")
.failureReturnedAmount("")
.feeAmount("10.00")
.feeCurrency("EUR")
.id("543477161-91de-012f-e284-1e0030c7f3123")
.invoiceDate("2023-07-03")
.invoiceNumber("INV01")
.lastUpdaterContactId("ab3477161-91de-012f-e284-1e0030c7f35c")
.payerId("")
.paymentDate("2023-12-31T23:59:59.000Z")
.paymentGroupId("20140428-CJRRJM")
.paymentType("regular")
.purposeCode("")
.reason("Salary for March")
.reference("INVOICE 9876")
.reviewStatus(PaymentReviewStatusEnum.IN_REVIEW)
.shortReference("140416-GGJBNQ001")
.status("ready_to_send")
.transferredAt("2023-12-31T23:59:59.000Z")
.ultimateBeneficiaryName("Some beneficiary name")
.uniqueRequestId("1234567890abc")
.updatedAt("2023-12-31T23:59:59.000Z")
.build()`

### Delete Payment <a name="delete"></a>

Delete a payment. On success, returns the final payment record state.

**API Endpoint**: `POST /payments/{id}/delete`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `id` | ✓ | Payment UUID. | `"string"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.Payment;
import com.currencycloud.sdk.resources.payments.params.DeleteRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
Payment res = client.payments().delete(DeleteRequest
                                       .builder()
                                       .id("string")
                                       .build());
```

#### Response

##### Type
[Payment](/src/main/java/com/currencycloud/sdk/model/Payment.java)

##### Example
`Payment
.builder()
.amount("1250000.00")
.authorisationStepsRequired("0")
.beneficiaryId("543477161-91de-012f-e284-1e0030c7f352")
.conversionId("049bab6d-fe2a-42e1-be0f-531c59f838ea")
.createdAt("2023-12-31T23:59:59.000Z")
.creatorContactId("ab3477161-91de-012f-e284-1e0030c7f35c")
.currency("GBP")
.estimatedArrival("2023-12-31T00:00:00.000Z")
.failureReason("")
.failureReturnedAmount("")
.feeAmount("10.00")
.feeCurrency("EUR")
.id("543477161-91de-012f-e284-1e0030c7f3123")
.invoiceDate("2023-07-03")
.invoiceNumber("INV01")
.lastUpdaterContactId("ab3477161-91de-012f-e284-1e0030c7f35c")
.payerId("")
.paymentDate("2023-12-31T23:59:59.000Z")
.paymentGroupId("20140428-CJRRJM")
.paymentType("regular")
.purposeCode("")
.reason("Salary for March")
.reference("INVOICE 9876")
.reviewStatus(PaymentReviewStatusEnum.IN_REVIEW)
.shortReference("140416-GGJBNQ001")
.status("ready_to_send")
.transferredAt("2023-12-31T23:59:59.000Z")
.ultimateBeneficiaryName("Some beneficiary name")
.uniqueRequestId("1234567890abc")
.updatedAt("2023-12-31T23:59:59.000Z")
.build()`

### Resend Payment Notification <a name="retry_notifications"></a>

Resends a payment notification for the specified payment ID.

**API Endpoint**: `POST /payments/{id}/notifications/retry`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `id` | ✓ | Payment UUID | `"string"` |
| `notificationType` | ✓ | The notification to be resent. | `PaymentsRetryNotificationsNotificationTypeEnum.PAYMENT_FAILED_NOTIFICATION` |

#### Example Snippet

```java
import java.util.Map;

import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.PaymentsRetryNotificationsNotificationTypeEnum;
import com.currencycloud.sdk.resources.payments.params.RetryNotificationsRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
Map<String, Object> res = client.payments().retryNotifications(RetryNotificationsRequest
                          .builder()
                          .id("string")
                          .notificationType(PaymentsRetryNotificationsNotificationTypeEnum.PAYMENT_FAILED_NOTIFICATION)
                          .build());
```

