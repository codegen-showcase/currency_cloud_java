# funding

## Module Functions

### Find Funding Accounts <a name="find_accounts"></a>

Gets details of the Standard Settlement Instructions (SSIs) that can be used to settle and collect funds in each available currency.

**API Endpoint**: `GET /funding_accounts/find`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `currency` | ✓ | The currency of the account details required, ISO 4217 standard. | `"string"` |
| `accountId` | ✗ | UUID of a specific sub-account you want to see the SSIs for. | `"string"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |
| `order` | ✗ | Any field name to change the sort order. | `"string"` |
| `orderAscDesc` | ✗ | Sort records in ascending or descending order. | `FundingFindAccountsOrderAscDescEnum.ASC` |
| `page` | ✗ | Page number | `123L` |
| `paymentType` | ✗ | The type of SSI to be returned, priority (Swift) or regular (local). A null value returns all payment types. | `FundingFindAccountsPaymentTypeEnum.PRIORITY` |
| `perPage` | ✗ | Number of results per page. | `123L` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.FundingFindAccountsResponse;
import com.currencycloud.sdk.resources.funding.params.FindAccountsRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
FundingFindAccountsResponse res = client.funding().findAccounts(FindAccountsRequest
                                  .builder()
                                  .currency("string")
                                  .build());
```

#### Response

##### Type
[FundingFindAccountsResponse](/src/main/java/com/currencycloud/sdk/model/FundingFindAccountsResponse.java)

##### Example
`FundingFindAccountsResponse
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

### Get Funding Transaction <a name="get_transaction"></a>

Gets the details of an approved funding transaction with the given ID.

**API Endpoint**: `GET /funding_transactions/{id}`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `id` | ✓ | The Related Entity UUID (related_entity_id) for the transaction. | `"string"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.FundingTransaction;
import com.currencycloud.sdk.resources.funding.params.GetTransactionRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
FundingTransaction res = client.funding().getTransaction(GetTransactionRequest
                         .builder()
                         .id("string")
                         .build());
```

#### Response

##### Type
[FundingTransaction](/src/main/java/com/currencycloud/sdk/model/FundingTransaction.java)

##### Example
`FundingTransaction
.builder()
.additionalInformation("ABCD20231016143117")
.amount("1.11")
.completedAt("2022-12-03T10:15:30+00:00")
.createdAt("2022-12-03T10:15:30+00:00")
.currency("USD")
.id("4924919a-6c28-11ee-a3e3-63774946bad2")
.rail("SEPA")
.receivingAccountNumber("32847346")
.receivingAccountRoutingCode("123456789")
.sender(SenderInformation
.builder()
.senderAccountNumber("8119645406")
.senderAddress("Some street")
.senderCountry("GB")
.senderId("5c675fa4-fdf0-4ee6-b5bb-156b36765433")
.senderName("Test sender")
.build())
.updatedAt("2022-12-03T10:15:30+00:00")
.valueDate("2022-12-03T10:00:00+00:00")
.build()`

