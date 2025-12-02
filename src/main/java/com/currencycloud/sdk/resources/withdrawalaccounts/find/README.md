# withdrawalaccounts.find

## Module Functions

### Find Withdrawal Account <a name="find"></a>

Lists all withdrawal accounts assigned to an account.

**API Endpoint**: `GET /withdrawal_accounts/find`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `accountId` | ✗ | The UUID of a sub-account you want to see the withdrawal accounts for. If omitted the withdrawal accounts for the house account and all sub-accounts are returned. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.WithdrawalAccountsFindFindResponse;
import com.currencycloud.sdk.resources.withdrawalaccounts.find.params.FindRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
WithdrawalAccountsFindFindResponse res = client.withdrawalAccounts().find().find(FindRequest
        .builder()
        .build());
```

#### Response

##### Type
[WithdrawalAccountsFindFindResponse](/src/main/java/com/currencycloud/sdk/model/WithdrawalAccountsFindFindResponse.java)

##### Example
`WithdrawalAccountsFindFindResponse
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

### Pull Funds From Withdrawal Account <a name="pull_funds"></a>

Submits an ACH pull request from a specific withdrawal account. The funds will be pulled into the account the specified withdrawal account is related to.

**API Endpoint**: `POST /withdrawal_accounts/{withdrawal_account_id}/pull_funds`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `amount` | ✓ | The amount of funds to pull in USD. | `123.0` |
| `reference` | ✓ | The reference you want on the statement. | `"string"` |
| `withdrawalAccountId` | ✓ | The withdrawal account ID you want to pull the funds from. The funds will be pulled into the account ID related to this withdrawal account. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.WithdrawalPullFundsRequestDetails;
import com.currencycloud.sdk.resources.withdrawalaccounts.find.params.PullFundsRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
WithdrawalPullFundsRequestDetails res = client.withdrawalAccounts().find().pullFunds(
        PullFundsRequest
        .builder()
        .amount(123.45)
        .reference("string")
        .withdrawalAccountId("string")
        .build());
```

#### Response

##### Type
[WithdrawalPullFundsRequestDetails](/src/main/java/com/currencycloud/sdk/model/WithdrawalPullFundsRequestDetails.java)

##### Example
`WithdrawalPullFundsRequestDetails
.builder()
.amount("1000.0")
.createdAt("2019-04-18T08:17:22+00:00")
.id("82214b7e-9192-4d9e-82cf-e2c4b1670f23")
.reference("Reference")
.withdrawalAccountId("ffb9fdea-312b-4bc8-beb9-5e44ee2d2a8c")
.build()`

