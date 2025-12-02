# beneficiaries

## Module Functions

### Get Beneficiary <a name="get"></a>

Gets a beneficiary with the given ID.

**API Endpoint**: `GET /beneficiaries/{id}`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `id` | ✓ | Beneficiary UUID | `"string"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.Beneficiary;
import com.currencycloud.sdk.resources.beneficiaries.params.GetRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
Beneficiary res = client.beneficiaries().get(GetRequest
                  .builder()
                  .id("string")
                  .build());
```

#### Response

##### Type
[Beneficiary](/src/main/java/com/currencycloud/sdk/model/Beneficiary.java)

##### Example
`Beneficiary
.builder()
.accountNumber("123456783")
.bankAccountHolderName("Company PLC")
.bankAccountType(BeneficiaryBankAccountTypeEnum.CHECKING)
.bankAddress(List.of(
"Line 1",
"Line 2"
))
.bankCountry("AU")
.bankName("Sample Bank Name")
.beneficiaryAddress(List.of(
"1 My Road",
"London"
))
.beneficiaryCity("")
.beneficiaryCompanyName("Sample Company Name")
.beneficiaryCountry("AU")
.beneficiaryDateOfBirth("")
.beneficiaryEntityType(BeneficiaryBeneficiaryEntityTypeEnum.COMPANY)
.beneficiaryExternalReference("B-5847789")
.beneficiaryFirstName("")
.beneficiaryIdentificationType("none")
.beneficiaryIdentificationValue("")
.beneficiaryLastName("")
.beneficiaryPostcode("")
.beneficiaryStateOrProvince("")
.bicSwift("")
.businessNature("Government agency")
.companyWebsite("https://www.gov.uk/")
.createdAt("2023-12-31T23:59:59.000Z")
.creatorContactId("58e78791-e0e5-012c-2dee-001e52f3c730")
.currency("AUD")
.defaultBeneficiary(BeneficiaryDefaultBeneficiaryEnum.FALSE)
.email("")
.iban("")
.id("a6000ce9-46b8-49a7-9f5b-325ed3f047c2")
.name("Sample name")
.paymentTypes(List.of(
BeneficiaryPaymentTypesItemEnum.REGULAR
))
.routingCodeType1("bsb_code")
.routingCodeType2("")
.routingCodeValue1("123456")
.routingCodeValue2("")
.updatedAt("2023-12-31T23:59:59.000Z")
.build()`

### Verify Beneficiary Account <a name="account_verification"></a>

This service is currently only available to in-scope clients who must provide Confirmation of Payee services to their end-users making local GBP payments in the UK.<br><br> In the UK, Confirmation of Payee is a peer-to-peer name-checking service designed to help reduce misdirected payments and provide greater assurance that payments are being sent, and collected from, the intended account holder for UK domestic payments. <br><br> Currently, access is restricted to UK institutions and in-scope clients.<br><br> We plan to add more market coverage to this API in the future, thereby extending access to additional clients.<br><br> If you're interested in learning more or have received notification that you're in-scope, please contact your Customer Success Manager.

**API Endpoint**: `POST /beneficiaries/account_verification`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `accountNumber` | ✓ | Bank account number. | `"string"` |
| `bankCountry` | ✓ | Two-letter code for the country in which the beneficiary's bank account is held. | `"string"` |
| `beneficiaryEntityType` | ✓ | Legal entity - 'individual' or 'company'. If 'individual' then "beneficiary_first_name" and "beneficiary_last_name" are required. If 'company' then "beneficiary_company_name" is required. | `BeneficiariesAccountVerificationBodyBeneficiaryEntityTypeEnum.COMPANY` |
| `routingCodeValue1` | ✓ | Routing system value i.e. the account's sort code. | `"string"` |
| `beneficiaryCompanyName` | ✗ | Required if "beneficiary_entity_type" is "company". | `"string"` |
| `beneficiaryFirstName` | ✗ | Required if "beneficiary_entity_type" is "individual". | `"string"` |
| `beneficiaryLastName` | ✗ | Required if "beneficiary_entity_type" is "individual". | `"string"` |
| `bicSwift` | ✗ | BIC/Swift code | `"string"` |
| `currency` | ✗ | Currency in which money will be sent to the beneficiary's bank account. Three-digit currency code. | `"string"` |
| `iban` | ✗ | IBAN code | `"string"` |
| `paymentType` | ✗ | Currencycloud supports two types of payments: "priority", made using the Swift network and "regular", made using the local bank network. | `BeneficiariesAccountVerificationBodyPaymentTypeEnum.PRIORITY` |
| `routingCodeType1` | ✗ | Local payment routing system. Defaults to 'sort_code'. | `"string"` |
| `routingCodeType2` | ✗ | Second local payment routing system. If supplied, routing_code_value_2 should also be supplied. Necessary for when more than one routing code is required. | `"string"` |
| `routingCodeValue2` | ✗ | Routing code for routing_code_type_2. If supplied, routing_code_type_2 should also be supplied. | `"string"` |
| `secondaryReferenceData` | ✗ | For customer accounts that are not uniquely addressable by a sort code and account number, but instead rely on their PSP to credit their account via SRD – i.e. using the reference field in the payment with a further unique identifier. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.BeneficiariesAccountVerificationBodyBeneficiaryEntityTypeEnum;
import com.currencycloud.sdk.model.BeneficiaryAccountVerificationResult;
import com.currencycloud.sdk.resources.beneficiaries.params.AccountVerificationRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
BeneficiaryAccountVerificationResult res = client.beneficiaries().accountVerification(
            AccountVerificationRequest
            .builder()
            .accountNumber("string")
            .bankCountry("string")
            .beneficiaryEntityType(BeneficiariesAccountVerificationBodyBeneficiaryEntityTypeEnum.COMPANY)
            .routingCodeValue1("string")
            .build());
```

#### Response

##### Type
[BeneficiaryAccountVerificationResult](/src/main/java/com/currencycloud/sdk/model/BeneficiaryAccountVerificationResult.java)

##### Example
`BeneficiaryAccountVerificationResult
.builder()
.actualName("Joe Bloggs")
.answer(BeneficiaryAccountVerificationResultAnswerEnum.FULL_MATCH)
.reason("Full match")
.reasonCode("AV100")
.reasonType("okay")
.build()`

### Create Beneficiary <a name="create"></a>

Creates a new beneficiary. Returns the new beneficiary entity on success.

**API Endpoint**: `POST /beneficiaries/create`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `bankAccountHolderName` | ✓ | Bank account holder's name. | `"string"` |
| `bankCountry` | ✓ | Two-letter code for the country in which the beneficiary's bank account is held. | `"string"` |
| `currency` | ✓ | Currency in which money is held in the beneficiary's bank account. Three-letter IDO currency code. | `"string"` |
| `name` | ✓ | A nickname for the beneficiary. | `"string"` |
| `accountNumber` | ✗ | Bank account number. | `"string"` |
| `bankAccountType` | ✗ | Bank account type. | `BeneficiariesCreateBodyBankAccountTypeEnum.CHECKING` |
| `bankAddress` | ✗ | First line of address. | `"string"` |
| `bankName` | ✗ | Bank name | `"string"` |
| `beneficiaryAddress` | ✗ | First line of address. | `"string"` |
| `beneficiaryCity` | ✗ | City name, should not consists of only numbers. | `"string"` |
| `beneficiaryCompanyName` | ✗ | Required if "beneficiary_entity_type" is "company". Company names cannot consist entirely of numbers. | `"string"` |
| `beneficiaryCountry` | ✗ | Two-letter ISO country code. If the beneficiary is a company, this is the country in which the company is registered. If the beneficiary is an individual, this is the country in which the beneficiary is based. | `"string"` |
| `beneficiaryDateOfBirth` | ✗ | If "beneficiary_entity_type" is "company", date of registration.<br> If "beneficiary_entity_type" is "individual", date of birth. The date of birth for the individual should not exceed 125 years and cannot be a date in the future.<br> ISO 8601 format YYYY-MM-DD. | `"string"` |
| `beneficiaryEntityType` | ✗ | Legal entity | `BeneficiariesCreateBodyBeneficiaryEntityTypeEnum.COMPANY` |
| `beneficiaryExternalReference` | ✗ | Beneficiary external reference. | `"string"` |
| `beneficiaryFirstName` | ✗ | Required if "beneficiary_entity_type" is "individual". Individual names cannot contain any numbers. | `"string"` |
| `beneficiaryIdentificationType` | ✗ | A legal document that verifies the identity of the beneficiary. Required documentation will vary depending on the country in which the beneficiar's bank account is held and on whether "beneficiary_entity_type" is "individual" or "company". | `BeneficiariesCreateBodyBeneficiaryIdentificationTypeEnum.CITIZENSHIP_PAPERS` |
| `beneficiaryIdentificationValue` | ✗ | A unique reference code for the identification document, such as a passport number. | `"string"` |
| `beneficiaryLastName` | ✗ | Required if "beneficiary_entity_type" is "individual". Individual names cannot contain any numbers or company signifiers. | `"string"` |
| `beneficiaryPostcode` | ✗ | Postal code | `"string"` |
| `beneficiaryStateOrProvince` | ✗ | State or province. | `"string"` |
| `bicSwift` | ✗ | BIC/Swift code | `"string"` |
| `businessNature` | ✗ | Beneficiary nature of business. | `"string"` |
| `companyWebsite` | ✗ | Beneficiary company website. | `"string"` |
| `defaultBeneficiary` | ✗ | Payments are made automatically to default beneficiaries when a beneficiary is not specified. | `true` |
| `email` | ✗ | Email address | `"string"` |
| `iban` | ✗ | IBAN code | `"string"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |
| `paymentTypes` | ✗ | Currencycloud supports two types of payments: "priority", made using the Swift network; and "regular", made using the local bank network. | `List.of(BeneficiariesCreateBodyPaymentTypesItemEnum.PRIORITY)` |
| `routingCodeType1` | ✗ | Local payment routing system. If supplied, routing_code_value_1 should also be supplied. | `BeneficiariesCreateBodyRoutingCodeType1Enum.ABA` |
| `routingCodeType2` | ✗ | Local payment routing system. If supplied, routing_code_value_2 should also be supplied. | `BeneficiariesCreateBodyRoutingCodeType2Enum.ABA` |
| `routingCodeValue1` | ✗ | Routing code for routing_code_type_1. If supplied, routing_code_type_1 should also be supplied. | `"string"` |
| `routingCodeValue2` | ✗ | Routing code for routing_code_type_2. If supplied, routing_code_type_2 should also be supplied. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.Beneficiary;
import com.currencycloud.sdk.resources.beneficiaries.params.CreateRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
Beneficiary res = client.beneficiaries().create(CreateRequest
                  .builder()
                  .bankAccountHolderName("string")
                  .bankCountry("string")
                  .currency("string")
                  .name("string")
                  .build());
```

#### Response

##### Type
[Beneficiary](/src/main/java/com/currencycloud/sdk/model/Beneficiary.java)

##### Example
`Beneficiary
.builder()
.accountNumber("123456783")
.bankAccountHolderName("Company PLC")
.bankAccountType(BeneficiaryBankAccountTypeEnum.CHECKING)
.bankAddress(List.of(
"Line 1",
"Line 2"
))
.bankCountry("AU")
.bankName("Sample Bank Name")
.beneficiaryAddress(List.of(
"1 My Road",
"London"
))
.beneficiaryCity("")
.beneficiaryCompanyName("Sample Company Name")
.beneficiaryCountry("AU")
.beneficiaryDateOfBirth("")
.beneficiaryEntityType(BeneficiaryBeneficiaryEntityTypeEnum.COMPANY)
.beneficiaryExternalReference("B-5847789")
.beneficiaryFirstName("")
.beneficiaryIdentificationType("none")
.beneficiaryIdentificationValue("")
.beneficiaryLastName("")
.beneficiaryPostcode("")
.beneficiaryStateOrProvince("")
.bicSwift("")
.businessNature("Government agency")
.companyWebsite("https://www.gov.uk/")
.createdAt("2023-12-31T23:59:59.000Z")
.creatorContactId("58e78791-e0e5-012c-2dee-001e52f3c730")
.currency("AUD")
.defaultBeneficiary(BeneficiaryDefaultBeneficiaryEnum.FALSE)
.email("")
.iban("")
.id("a6000ce9-46b8-49a7-9f5b-325ed3f047c2")
.name("Sample name")
.paymentTypes(List.of(
BeneficiaryPaymentTypesItemEnum.REGULAR
))
.routingCodeType1("bsb_code")
.routingCodeType2("")
.routingCodeValue1("123456")
.routingCodeValue2("")
.updatedAt("2023-12-31T23:59:59.000Z")
.build()`

### Find Beneficiaries <a name="find"></a>

Returns beneficiaries attached to the account or any sub-account owned by the authenticated user.

**API Endpoint**: `POST /beneficiaries/find`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `accountNumber` | ✗ | Bank account number. | `"string"` |
| `bankAccountHolderName` | ✗ | Bank account holder's name. | `"string"` |
| `bankAccountType` | ✗ | Bank account type. | `BeneficiariesFindBodyBankAccountTypeEnum.CHECKING` |
| `bankName` | ✗ | Bank name | `"string"` |
| `beneficiaryCity` | ✗ | City | `"string"` |
| `beneficiaryCompanyName` | ✗ | Required if "beneficiary_entity_type" is "company". | `"string"` |
| `beneficiaryCountry` | ✗ | Two-letter ISO country code. If the beneficiary is a company, this is the country in which the company is registered. If the beneficiary is an individual, this is the country in which the beneficiary is based. | `"string"` |
| `beneficiaryDateOfBirth` | ✗ | If "beneficiary_entity_type" is "company", date of registration. If "beneficiary_entity_type" is "individual", date of birth. ISO 8601 format YYYY-MM-DD. | `"1970-01-01"` |
| `beneficiaryEntityType` | ✗ | Beneficiary's legal entity type - individual or company. | `BeneficiariesFindBodyBeneficiaryEntityTypeEnum.COMPANY` |
| `beneficiaryExternalReference` | ✗ | Beneficiary external reference. | `"string"` |
| `beneficiaryFirstName` | ✗ | Required if "beneficiary_entity_type" is "individual". | `"string"` |
| `beneficiaryLastName` | ✗ | Required if "beneficiary_entity_type" is "individual". | `"string"` |
| `beneficiaryPostcode` | ✗ | Post code | `"string"` |
| `beneficiaryStateOrProvince` | ✗ | State or province. | `"string"` |
| `bicSwift` | ✗ | BIC/Swift code | `"string"` |
| `currency` | ✗ | Currency in which money is held in the beneficiary's bank account. Three-letter currency code. | `"string"` |
| `defaultBeneficiary` | ✗ | Payments are made automatically to default beneficiaries when a beneficiary is not specified. | `true` |
| `iban` | ✗ | IBAN code | `"string"` |
| `name` | ✗ | Beneficiary's name. | `"string"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |
| `order` | ✗ | Any field name to change the sort order. | `"string"` |
| `orderAscDesc` | ✗ | Sort records in ascending or descending order. | `BeneficiariesFindBodyOrderAscDescEnum.ASC` |
| `page` | ✗ | Page number | `123L` |
| `perPage` | ✗ | Number of results per page. | `123L` |
| `routingCodeType0` | ✗ | Local payment routing system. If supplied, a value for routing_code_value[0] must also be supplied. | `BeneficiariesFindBodyRoutingCodeType0Enum.ABA` |
| `routingCodeValue0` | ✗ | The value for any routing system specified in routing_code_type[0]. If supplied, a value for routing_code_type[0] must also be supplied. | `"string"` |
| `scope` | ✗ | Search "own" account, "clients" sub-accounts, or "all" accounts. | `BeneficiariesFindBodyScopeEnum.ALL` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.BeneficiariesFindResponse;
import com.currencycloud.sdk.resources.beneficiaries.params.FindRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
BeneficiariesFindResponse res = client.beneficiaries().find(FindRequest
                                .builder()
                                .build());
```

#### Response

##### Type
[BeneficiariesFindResponse](/src/main/java/com/currencycloud/sdk/model/BeneficiariesFindResponse.java)

##### Example
`BeneficiariesFindResponse
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

### Validate Beneficiary <a name="validate"></a>

Validates a new beneficiary's bank details, without actually creating a record of the beneficiary. On success, returns an object that represents the entity that would be created if the beneficiary was saved.

**API Endpoint**: `POST /beneficiaries/validate`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `bankCountry` | ✓ | Two-letter code for the country in which the beneficiary's bank account is held. | `"string"` |
| `currency` | ✓ | Currency in which money is held in the beneficiary's bank account. Three-digit currency code. | `"string"` |
| `accountNumber` | ✗ | Bank account number. | `"string"` |
| `bankAccountType` | ✗ | Bank account type. | `BeneficiariesValidateBodyBankAccountTypeEnum.CHECKING` |
| `bankAddress` | ✗ | First line of address. | `"string"` |
| `bankName` | ✗ | Bank name | `"string"` |
| `beneficiaryAddress` | ✗ | First line of address. | `"string"` |
| `beneficiaryCity` | ✗ | City | `"string"` |
| `beneficiaryCompanyName` | ✗ | Required if "beneficiary_entity_type" is "company". Company names cannot consist entirely of numbers. | `"string"` |
| `beneficiaryCountry` | ✗ | Two-letter ISO country code. If the beneficiary is a company, this is the country in which the company is registered. If the beneficiary is an individual, this is the country in which the beneficiary is based. | `"string"` |
| `beneficiaryDateOfBirth` | ✗ | If "beneficiary_entity_type" is "company", date of registration. If "beneficiary_entity_type" is "individual", date of birth. ISO 8601 format YYYY-MM-DD. | `"string"` |
| `beneficiaryEntityType` | ✗ | Legal entity | `BeneficiariesValidateBodyBeneficiaryEntityTypeEnum.COMPANY` |
| `beneficiaryFirstName` | ✗ | Required if "beneficiary_entity_type" is "individual". Individual names cannot contain any numbers. | `"string"` |
| `beneficiaryIdentificationType` | ✗ | A legal document that verifies the identity of the beneficiary. Required documentation will vary depending on the country in which the beneficiary's bank account is held. | `BeneficiariesValidateBodyBeneficiaryIdentificationTypeEnum.CITIZENSHIP_PAPERS` |
| `beneficiaryIdentificationValue` | ✗ | A unique reference code for the identification document, such as a passport number. | `"string"` |
| `beneficiaryLastName` | ✗ | Required if "beneficiary_entity_type" is "individual". Individual names cannot contain any numbers. | `"string"` |
| `beneficiaryPostcode` | ✗ | Postal code | `"string"` |
| `beneficiaryStateOrProvince` | ✗ | State or province. | `"string"` |
| `bicSwift` | ✗ | BIC/Swift code | `"string"` |
| `iban` | ✗ | IBAN code | `"string"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |
| `paymentTypes` | ✗ | Currencycloud supports two types of payments: "priority", made using the Swift network; and "regular", made using the local bank network. | `List.of(BeneficiariesValidateBodyPaymentTypesItemEnum.PRIORITY)` |
| `routingCodeType1` | ✗ | Local payment routing system. If supplied, routing_code_value_1 should also be supplied. | `BeneficiariesValidateBodyRoutingCodeType1Enum.ABA` |
| `routingCodeType2` | ✗ | Local payment routing system. If supplied, routing_code_value_2 should also be supplied. | `BeneficiariesValidateBodyRoutingCodeType2Enum.ABA` |
| `routingCodeValue1` | ✗ | Routing code for routing_code_type_1. If supplied, routing_code_type_1 should also be supplied. | `"string"` |
| `routingCodeValue2` | ✗ | Routing code for routing_code_type_2. If supplied, routing_code_type_2 should also be supplied. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.Beneficiary;
import com.currencycloud.sdk.resources.beneficiaries.params.ValidateRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
Beneficiary res = client.beneficiaries().validate(ValidateRequest
                  .builder()
                  .bankCountry("string")
                  .currency("string")
                  .build());
```

#### Response

##### Type
[Beneficiary](/src/main/java/com/currencycloud/sdk/model/Beneficiary.java)

##### Example
`Beneficiary
.builder()
.accountNumber("123456783")
.bankAccountHolderName("Company PLC")
.bankAccountType(BeneficiaryBankAccountTypeEnum.CHECKING)
.bankAddress(List.of(
"Line 1",
"Line 2"
))
.bankCountry("AU")
.bankName("Sample Bank Name")
.beneficiaryAddress(List.of(
"1 My Road",
"London"
))
.beneficiaryCity("")
.beneficiaryCompanyName("Sample Company Name")
.beneficiaryCountry("AU")
.beneficiaryDateOfBirth("")
.beneficiaryEntityType(BeneficiaryBeneficiaryEntityTypeEnum.COMPANY)
.beneficiaryExternalReference("B-5847789")
.beneficiaryFirstName("")
.beneficiaryIdentificationType("none")
.beneficiaryIdentificationValue("")
.beneficiaryLastName("")
.beneficiaryPostcode("")
.beneficiaryStateOrProvince("")
.bicSwift("")
.businessNature("Government agency")
.companyWebsite("https://www.gov.uk/")
.createdAt("2023-12-31T23:59:59.000Z")
.creatorContactId("58e78791-e0e5-012c-2dee-001e52f3c730")
.currency("AUD")
.defaultBeneficiary(BeneficiaryDefaultBeneficiaryEnum.FALSE)
.email("")
.iban("")
.id("a6000ce9-46b8-49a7-9f5b-325ed3f047c2")
.name("Sample name")
.paymentTypes(List.of(
BeneficiaryPaymentTypesItemEnum.REGULAR
))
.routingCodeType1("bsb_code")
.routingCodeType2("")
.routingCodeValue1("123456")
.routingCodeValue2("")
.updatedAt("2023-12-31T23:59:59.000Z")
.build()`

### Update Beneficiary <a name="update"></a>

Updates an existing beneficiary. Returns the updated beneficiary entity on success. <br> Please note that it's not possible to change a beneficiary's entity type (company or individual) by an update. To achieve this, you should create a new beneficiary.

**API Endpoint**: `POST /beneficiaries/{id}`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `id` | ✓ | Beneficiary UUID | `"string"` |
| `accountNumber` | ✗ | Bank account number. | `"string"` |
| `bankAccountHolderName` | ✗ | Bank account holder's name. | `"string"` |
| `bankAccountType` | ✗ | Bank account type. | `BeneficiariesUpdateBodyBankAccountTypeEnum.CHECKING` |
| `bankAddress` | ✗ | First line of address. | `"string"` |
| `bankCountry` | ✗ | Country in which the beneficiary's bank account is held. Two-letter ISO country code. | `"string"` |
| `bankName` | ✗ | Bank name | `"string"` |
| `beneficiaryAddress` | ✗ | First line of address. | `"string"` |
| `beneficiaryCity` | ✗ | City name, should not consist of only numbers. | `"string"` |
| `beneficiaryCompanyName` | ✗ | Required if "beneficiary_entity_type" is "company". Company names cannot consist entirely of numbers. | `"string"` |
| `beneficiaryCountry` | ✗ | Two-letter ISO country code. If the beneficiary is a company, this is the country in which the company is registered. If the beneficiary is an individual, this is the country in which the beneficiary is based. | `"string"` |
| `beneficiaryDateOfBirth` | ✗ | If "beneficiary_entity_type" is "company", date of registration.<br> If "beneficiary_entity_type" is "individual", date of birth. The date of birth for the individual should not exceed 125 years and cannot be a date in the future.<br> ISO 8601 format YYYY-MM-DD. | `"string"` |
| `beneficiaryEntityType` | ✗ | Legal entity | `BeneficiariesUpdateBodyBeneficiaryEntityTypeEnum.COMPANY` |
| `beneficiaryExternalReference` | ✗ | Beneficiary external reference. | `"string"` |
| `beneficiaryFirstName` | ✗ | Required if "beneficiary_entity_type" is "individual". Individual names cannot contain any numbers. | `"string"` |
| `beneficiaryIdentificationType` | ✗ | A legal document that verifies the identity of the beneficiary. Required documentation will vary depending on the country in which the beneficiary's bank account is held. | `BeneficiariesUpdateBodyBeneficiaryIdentificationTypeEnum.CITIZENSHIP_PAPERS` |
| `beneficiaryIdentificationValue` | ✗ | A unique reference code for the identification document, such as a passport number. | `"string"` |
| `beneficiaryLastName` | ✗ | Required if "beneficiary_entity_type" is "individual". Individual names cannot contain any numbers or company signifiers. | `"string"` |
| `beneficiaryPostcode` | ✗ | Postal code | `"string"` |
| `beneficiaryStateOrProvince` | ✗ | State or province. | `"1970-01-01"` |
| `bicSwift` | ✗ | BIC/Swift code | `"string"` |
| `businessNature` | ✗ | Beneficiary nature of business. | `"string"` |
| `companyWebsite` | ✗ | Beneficiary company website. | `"string"` |
| `currency` | ✗ | Currency in which money is held in the beneficiary's bank account. Three-letter ISO currency code. | `"string"` |
| `defaultBeneficiary` | ✗ | Payments are made automatically to default beneficiaries when a beneficiary is not specified. | `true` |
| `email` | ✗ | Beneficiary's email address. | `"string"` |
| `iban` | ✗ | IBAN code | `"string"` |
| `name` | ✗ | A nickname for the beneficiary. | `"string"` |
| `onBehalfOf` | ✗ | Contact UUID. | `"string"` |
| `paymentTypes` | ✗ | Currencycloud supports two types of payment - "priority" (Swift) made using the Swift network, and "regular" (local) made using the local bank network. | `List.of(BeneficiariesUpdateBodyPaymentTypesItemEnum.PRIORITY)` |
| `routingCodeType1` | ✗ | Local payment routing system. | `BeneficiariesUpdateBodyRoutingCodeType1Enum.ABA` |
| `routingCodeType2` | ✗ | Local payment routing system. | `BeneficiariesUpdateBodyRoutingCodeType2Enum.ABA` |
| `routingCodeValue1` | ✗ | Routing code for "routing_code_type_1". | `"string"` |
| `routingCodeValue2` | ✗ | Routing code for "routing_code_type_2". | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.Beneficiary;
import com.currencycloud.sdk.resources.beneficiaries.params.UpdateRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
Beneficiary res = client.beneficiaries().update(UpdateRequest
                  .builder()
                  .id("string")
                  .build());
```

#### Response

##### Type
[Beneficiary](/src/main/java/com/currencycloud/sdk/model/Beneficiary.java)

##### Example
`Beneficiary
.builder()
.accountNumber("123456783")
.bankAccountHolderName("Company PLC")
.bankAccountType(BeneficiaryBankAccountTypeEnum.CHECKING)
.bankAddress(List.of(
"Line 1",
"Line 2"
))
.bankCountry("AU")
.bankName("Sample Bank Name")
.beneficiaryAddress(List.of(
"1 My Road",
"London"
))
.beneficiaryCity("")
.beneficiaryCompanyName("Sample Company Name")
.beneficiaryCountry("AU")
.beneficiaryDateOfBirth("")
.beneficiaryEntityType(BeneficiaryBeneficiaryEntityTypeEnum.COMPANY)
.beneficiaryExternalReference("B-5847789")
.beneficiaryFirstName("")
.beneficiaryIdentificationType("none")
.beneficiaryIdentificationValue("")
.beneficiaryLastName("")
.beneficiaryPostcode("")
.beneficiaryStateOrProvince("")
.bicSwift("")
.businessNature("Government agency")
.companyWebsite("https://www.gov.uk/")
.createdAt("2023-12-31T23:59:59.000Z")
.creatorContactId("58e78791-e0e5-012c-2dee-001e52f3c730")
.currency("AUD")
.defaultBeneficiary(BeneficiaryDefaultBeneficiaryEnum.FALSE)
.email("")
.iban("")
.id("a6000ce9-46b8-49a7-9f5b-325ed3f047c2")
.name("Sample name")
.paymentTypes(List.of(
BeneficiaryPaymentTypesItemEnum.REGULAR
))
.routingCodeType1("bsb_code")
.routingCodeType2("")
.routingCodeValue1("123456")
.routingCodeValue2("")
.updatedAt("2023-12-31T23:59:59.000Z")
.build()`

### Delete Beneficiary <a name="delete"></a>

Delete a beneficiary associated with a sub-account. If the deletion is successful, the beneficiary's final state is returned.

**API Endpoint**: `POST /beneficiaries/{id}/delete`

#### Parameters

| Parameter | Required | Description | Example |
|-----------|:--------:|-------------|--------|
| `id` | ✓ | Beneficiary UUID | `"string"` |
| `onBehalfOf` | ✗ | A contact UUID for the sub-account you're acting on behalf of. | `"string"` |

#### Example Snippet

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.Beneficiary;
import com.currencycloud.sdk.resources.beneficiaries.params.DeleteRequest;

Client client = Client
                .builder()
                .withAuthToken(System.getenv("API_KEY"))
                .build();
Beneficiary res = client.beneficiaries().delete(DeleteRequest
                  .builder()
                  .id("string")
                  .build());
```

#### Response

##### Type
[Beneficiary](/src/main/java/com/currencycloud/sdk/model/Beneficiary.java)

##### Example
`Beneficiary
.builder()
.accountNumber("123456783")
.bankAccountHolderName("Company PLC")
.bankAccountType(BeneficiaryBankAccountTypeEnum.CHECKING)
.bankAddress(List.of(
"Line 1",
"Line 2"
))
.bankCountry("AU")
.bankName("Sample Bank Name")
.beneficiaryAddress(List.of(
"1 My Road",
"London"
))
.beneficiaryCity("")
.beneficiaryCompanyName("Sample Company Name")
.beneficiaryCountry("AU")
.beneficiaryDateOfBirth("")
.beneficiaryEntityType(BeneficiaryBeneficiaryEntityTypeEnum.COMPANY)
.beneficiaryExternalReference("B-5847789")
.beneficiaryFirstName("")
.beneficiaryIdentificationType("none")
.beneficiaryIdentificationValue("")
.beneficiaryLastName("")
.beneficiaryPostcode("")
.beneficiaryStateOrProvince("")
.bicSwift("")
.businessNature("Government agency")
.companyWebsite("https://www.gov.uk/")
.createdAt("2023-12-31T23:59:59.000Z")
.creatorContactId("58e78791-e0e5-012c-2dee-001e52f3c730")
.currency("AUD")
.defaultBeneficiary(BeneficiaryDefaultBeneficiaryEnum.FALSE)
.email("")
.iban("")
.id("a6000ce9-46b8-49a7-9f5b-325ed3f047c2")
.name("Sample name")
.paymentTypes(List.of(
BeneficiaryPaymentTypesItemEnum.REGULAR
))
.routingCodeType1("bsb_code")
.routingCodeType2("")
.routingCodeValue1("123456")
.routingCodeValue2("")
.updatedAt("2023-12-31T23:59:59.000Z")
.build()`

