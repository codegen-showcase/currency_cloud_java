# contacts

## Module Functions

### Get Authenticating Contact <a name="get_current"></a>

Gets the contact record for the authenticated user.

**API Endpoint**: `GET /contacts/current`

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.Contact;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
Contact res = client.contacts().getCurrent();
```

#### Response

##### Type
[Contact](/src/main/java/com/currencycloud/sdk/model/Contact.java)

##### Example
`Contact
.builder()
.accountId("87077161-91de-012f-e284-1e0030c7f352")
.accountName("Company PLC")
.createdAt("2023-12-31T23:59:59.000Z")
.dateOfBirth("1980-01-22T00:00:00.000Z")
.emailAddress("john.smith@company.com")
.firstName("John")
.id("543477161-91de-012f-e284-1e0030c7f352")
.lastName("Smith")
.locale("en-US")
.loginId("john.smith")
.mobilePhoneNumber("07564 534 54")
.phoneNumber("06554 87845")
.status("enabled")
.timezone("Europe/London")
.updatedAt("2023-12-31T23:59:59.000Z")
.yourReference("ACME12345")
.build()`

### Get Contact <a name="get"></a>

Gets the contact for the given ID.

**API Endpoint**: `GET /contacts/{id}`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `id` | ✓ | Contact UUID | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.Contact;
import com.currencycloud.sdk.resources.contacts.params.GetRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
Contact res = client.contacts().get(GetRequest
                                    .builder()
                                    .id("string")
                                    .build());
```

#### Response

##### Type
[Contact](/src/main/java/com/currencycloud/sdk/model/Contact.java)

##### Example
`Contact
.builder()
.accountId("87077161-91de-012f-e284-1e0030c7f352")
.accountName("Company PLC")
.createdAt("2023-12-31T23:59:59.000Z")
.dateOfBirth("1980-01-22T00:00:00.000Z")
.emailAddress("john.smith@company.com")
.firstName("John")
.id("543477161-91de-012f-e284-1e0030c7f352")
.lastName("Smith")
.locale("en-US")
.loginId("john.smith")
.mobilePhoneNumber("07564 534 54")
.phoneNumber("06554 87845")
.status("enabled")
.timezone("Europe/London")
.updatedAt("2023-12-31T23:59:59.000Z")
.yourReference("ACME12345")
.build()`

### Create Contact <a name="create"></a>

Creates a new contact and attaches it to a sub-account. Returns the new contact entity on success.

**API Endpoint**: `POST /contacts/create`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `accountId` | ✓ | Account UUID | `"string"` |
| `emailAddress` | ✓ | The contact's email address. | `"string"` |
| `firstName` | ✓ | The contact's first name. | `"string"` |
| `lastName` | ✓ | The contact's last name. | `"string"` |
| `phoneNumber` | ✓ | The contact's phone number. | `"string"` |
| `dateOfBirth` | ✗ | The contact's date of birth. ISO 8601 format YYYY-MM-DD. <b>Required if account type is individual</b>. | `"string"` |
| `locale` | ✗ | Locale code ("en", "en-US", "fr-FR"). | `"string"` |
| `loginId` | ✗ | The contact's Currencycloud login ID, allows the contact to login and conduct activity on the sub-account. | `"string"` |
| `mobilePhoneNumber` | ✗ | The contact's mobile phone number. | `"string"` |
| `status` | ✗ | Contact status - "enabled" allows the contact to conduct activity on the sub-account, "not_enabled" disables the contact. | `ContactsCreateBodyStatusEnum.ENABLED` |
| `timezone` | ✗ | Timezone ("Europe/London", "America/New_York"). | `"string"` |
| `yourReference` | ✗ | User-generated reference code. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.Contact;
import com.currencycloud.sdk.resources.contacts.params.CreateRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
Contact res = client.contacts().create(CreateRequest
                                       .builder()
                                       .accountId("string")
                                       .emailAddress("string")
                                       .firstName("string")
                                       .lastName("string")
                                       .phoneNumber("string")
                                       .build());
```

#### Response

##### Type
[Contact](/src/main/java/com/currencycloud/sdk/model/Contact.java)

##### Example
`Contact
.builder()
.accountId("87077161-91de-012f-e284-1e0030c7f352")
.accountName("Company PLC")
.createdAt("2023-12-31T23:59:59.000Z")
.dateOfBirth("1980-01-22T00:00:00.000Z")
.emailAddress("john.smith@company.com")
.firstName("John")
.id("543477161-91de-012f-e284-1e0030c7f352")
.lastName("Smith")
.locale("en-US")
.loginId("john.smith")
.mobilePhoneNumber("07564 534 54")
.phoneNumber("06554 87845")
.status("enabled")
.timezone("Europe/London")
.updatedAt("2023-12-31T23:59:59.000Z")
.yourReference("ACME12345")
.build()`

### Find Contacts <a name="find"></a>

Returns contacts that match the parameters.

**API Endpoint**: `POST /contacts/find`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `accountId` | ✗ | Sub-Account UUID | `"string"` |
| `accountName` | ✗ | Account name | `"string"` |
| `emailAddress` | ✗ | The contact's email address. | `"string"` |
| `firstName` | ✗ | The contact's first name. | `"string"` |
| `lastName` | ✗ | The contact's last name. | `"string"` |
| `locale` | ✗ | Locale code ("en", "en-US", "fr-FR"). | `"string"` |
| `loginId` | ✗ | The contact's Currencycloud login ID. | `"string"` |
| `order` | ✗ | Any field name to change the sort order. | `"string"` |
| `orderAscDesc` | ✗ | Sort records in ascending or descending order. | `ContactsFindBodyOrderAscDescEnum.ASC` |
| `page` | ✗ | Page number | `"string"` |
| `perPage` | ✗ | Number of results per page. | `"string"` |
| `phoneNumber` | ✗ | The contact's phone number. | `"string"` |
| `status` | ✗ | Contact status - "enabled" allows the contact to conduct activity on the sub-account, "not_enabled" disables the contact. | `ContactsFindBodyStatusEnum.ENABLED` |
| `timezone` | ✗ | Timezone ("Europe/London", "America/New_York"). | `"string"` |
| `yourReference` | ✗ | User-generated reference code. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.ContactsFindResponse;
import com.currencycloud.sdk.resources.contacts.params.FindRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
ContactsFindResponse res = client.contacts().find(FindRequest
                           .builder()
                           .build());
```

#### Response

##### Type
[ContactsFindResponse](/src/main/java/com/currencycloud/sdk/model/ContactsFindResponse.java)

##### Example
`ContactsFindResponse
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

### Generate HMAC Key for Contact <a name="generate_hmac_key"></a>

Generates a new account HMAC key for the current contact.

**API Endpoint**: `POST /contacts/generate_hmac_key`

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.HmacKey;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
HmacKey res = client.contacts().generateHmacKey();
```

#### Response

##### Type
[HmacKey](/src/main/java/com/currencycloud/sdk/model/HmacKey.java)

##### Example
`HmacKey
.builder()
.hmacKey("9562c7c1094dfe8f46125aa3f3c0d141471fadd443828bb0")
.build()`

### Update Contact <a name="update"></a>

Updates an existing contact. Returns the updated contact entity on success.

**API Endpoint**: `POST /contacts/{id}`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `id` | ✓ | Contact UUID | `"string"` |
| `dateOfBirth` | ✗ | Contact's date of birth. ISO 8601 format YYYY-MM-DD. Required if account type is individual. | `"1970-01-01"` |
| `emailAddress` | ✗ | The contact's email address. A request to update a contact's email address does not immediately update the value. Instead, an email change request flow is initiated, sending notifications to both the old and new email addresses. The value will be updated when the change is confirmed via a link sent to the new email address. | `"string"` |
| `firstName` | ✗ | The contact's first name. | `"string"` |
| `lastName` | ✗ | The contact's last name. | `"string"` |
| `locale` | ✗ | Locale code ("en", "en-US", "fr-FR"). | `"string"` |
| `loginId` | ✗ | The contact's Currencycloud login ID. | `"string"` |
| `mobilePhoneNumber` | ✗ | The contact's mobile phone number. | `"string"` |
| `phoneNumber` | ✗ | The contact's phone number. | `"string"` |
| `status` | ✗ | Contact status - "enabled" allows the contact to conduct activity on the sub-account, "not_enabled" disables the contact. | `ContactsUpdateStatusEnum.ENABLED` |
| `timezone` | ✗ | Timezone ("Europe/London", "America/New_York"). | `"string"` |
| `yourReference` | ✗ | User-generated reference code. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.Contact;
import com.currencycloud.sdk.resources.contacts.params.UpdateRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
Contact res = client.contacts().update(UpdateRequest
                                       .builder()
                                       .id("string")
                                       .build());
```

#### Response

##### Type
[Contact](/src/main/java/com/currencycloud/sdk/model/Contact.java)

##### Example
`Contact
.builder()
.accountId("87077161-91de-012f-e284-1e0030c7f352")
.accountName("Company PLC")
.createdAt("2023-12-31T23:59:59.000Z")
.dateOfBirth("1980-01-22T00:00:00.000Z")
.emailAddress("john.smith@company.com")
.firstName("John")
.id("543477161-91de-012f-e284-1e0030c7f352")
.lastName("Smith")
.locale("en-US")
.loginId("john.smith")
.mobilePhoneNumber("07564 534 54")
.phoneNumber("06554 87845")
.status("enabled")
.timezone("Europe/London")
.updatedAt("2023-12-31T23:59:59.000Z")
.yourReference("ACME12345")
.build()`

