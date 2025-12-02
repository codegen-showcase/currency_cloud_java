# auth

## Module Functions

### Login <a name="login"></a>

Authenticates and authorizes a user to the Currencycloud API.<br><br>
Submit a login ID and API key for a Currencycloud account, you can register for and API key <a href="https://developer.currencycloud.com/register-for-an-api-key/">here</a>. A temporary authentication token is returned following a succesful login.<br><br>
The authentication token is required to make requests to all other endpoints in the Currencycloud API. Tokens expire after 30 minutes of inactivity.<br><br>
Token requests are limited to 60 calls per minute.<br><br>
For security, Currencycloud accounts are disabled when four unsuccessful login attempts are made within a short period. In these circumstances, account holders must <a href="mailto:support@currencycloud.com">contact support</a> to reactivate their account.

**API Endpoint**: `POST /authenticate/api`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `apiKey` | ✓ | The unique API key for the Currencycloud account. | `"string"` |
| `loginId` | ✓ | The login ID for a Currencycloud account, this is usually an email address. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.AuthenticationToken;
import com.currencycloud.sdk.resources.auth.params.LoginRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
AuthenticationToken res = client.auth().login(LoginRequest
                          .builder()
                          .apiKey("string")
                          .loginId("string")
                          .build());
```

#### Response

##### Type
[AuthenticationToken](/src/main/java/com/currencycloud/sdk/model/AuthenticationToken.java)

##### Example
`AuthenticationToken
.builder()
.authToken("043cc6069f5e32757647641460d1d5ed")
.build()`

### Logout <a name="logout"></a>

Authentication tokens expire automatically after 30 minutes of inactivity. If a session is no longer required, it is good security practice to retire its authentication token early rather than leave it to time out.

**API Endpoint**: `POST /authenticate/close_session`

#### Example Snippet

```java
import com.currencycloud.sdk.Client;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
okhttp3.Response res = client.auth().logout();
```

