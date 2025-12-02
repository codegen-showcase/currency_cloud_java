# Currencycloud API - Java

The Currencycloud API is a robust, predictable, easy-to-use API for converting money between currencies and making payments around the world. Dynamically register sub-accounts to provide white labeled money transfer services to your own customers.

## Getting Started

#### Example Client Initialization

```java
import com.currencycloud.sdk.Client;
import com.currencycloud.sdk.model.AuthenticationToken;
import com.currencycloud.sdk.resources.auth.params.LoginRequest;

// use an unauthenticated client to obtain your token via the login method
Client loginClient = Client.builder().build();
AuthenticationToken loginRes = client.auth().login(LoginRequest
                          .builder()
                          .apiKey("string")
                          .loginId("string")
                          .build());
Client client = Client
                .builder()
                .withAuthToken(t.getAuthToken().orElse(""))
                .build();
```

## Module Documentation and Snippets

### [accounts](src/main/java/com/currencycloud/sdk/resources/accounts/README.md)

- [create](src/main/java/com/currencycloud/sdk/resources/accounts/README.md#create) - Create Account
- [find](src/main/java/com/currencycloud/sdk/resources/accounts/README.md#find) - Find Accounts
- [get](src/main/java/com/currencycloud/sdk/resources/accounts/README.md#get) - Get Account
- [get_main](src/main/java/com/currencycloud/sdk/resources/accounts/README.md#get_main) - Get Authenticating Account
- [update](src/main/java/com/currencycloud/sdk/resources/accounts/README.md#update) - Update Account

### [accounts.paymentChargesSettings](src/main/java/com/currencycloud/sdk/resources/accounts/paymentchargessettings/README.md)

- [create](src/main/java/com/currencycloud/sdk/resources/accounts/paymentchargessettings/README.md#create) - Manage Account Payment Charges Settings
- [list](src/main/java/com/currencycloud/sdk/resources/accounts/paymentchargessettings/README.md#list) - Get Payment Charges Settings

### [auth](src/main/java/com/currencycloud/sdk/resources/auth/README.md)

- [login](src/main/java/com/currencycloud/sdk/resources/auth/README.md#login) - Login
- [logout](src/main/java/com/currencycloud/sdk/resources/auth/README.md#logout) - Logout

### [balances](src/main/java/com/currencycloud/sdk/resources/balances/README.md)

- [find](src/main/java/com/currencycloud/sdk/resources/balances/README.md#find) - Find Balances
- [get](src/main/java/com/currencycloud/sdk/resources/balances/README.md#get) - Get Balance
- [top_up_margin](src/main/java/com/currencycloud/sdk/resources/balances/README.md#top_up_margin) - Top Up Margin Balance

### [beneficiaries](src/main/java/com/currencycloud/sdk/resources/beneficiaries/README.md)

- [account_verification](src/main/java/com/currencycloud/sdk/resources/beneficiaries/README.md#account_verification) - Verify Beneficiary Account
- [create](src/main/java/com/currencycloud/sdk/resources/beneficiaries/README.md#create) - Create Beneficiary
- [delete](src/main/java/com/currencycloud/sdk/resources/beneficiaries/README.md#delete) - Delete Beneficiary
- [find](src/main/java/com/currencycloud/sdk/resources/beneficiaries/README.md#find) - Find Beneficiaries
- [get](src/main/java/com/currencycloud/sdk/resources/beneficiaries/README.md#get) - Get Beneficiary
- [update](src/main/java/com/currencycloud/sdk/resources/beneficiaries/README.md#update) - Update Beneficiary
- [validate](src/main/java/com/currencycloud/sdk/resources/beneficiaries/README.md#validate) - Validate Beneficiary

### [collectionsScreening](src/main/java/com/currencycloud/sdk/resources/collectionsscreening/README.md)

- [complete](src/main/java/com/currencycloud/sdk/resources/collectionsscreening/README.md#complete) - Accept or Reject Inbound Transaction

### [contacts](src/main/java/com/currencycloud/sdk/resources/contacts/README.md)

- [create](src/main/java/com/currencycloud/sdk/resources/contacts/README.md#create) - Create Contact
- [find](src/main/java/com/currencycloud/sdk/resources/contacts/README.md#find) - Find Contacts
- [generate_hmac_key](src/main/java/com/currencycloud/sdk/resources/contacts/README.md#generate_hmac_key) - Generate HMAC Key for Contact
- [get](src/main/java/com/currencycloud/sdk/resources/contacts/README.md#get) - Get Contact
- [get_current](src/main/java/com/currencycloud/sdk/resources/contacts/README.md#get_current) - Get Authenticating Contact
- [update](src/main/java/com/currencycloud/sdk/resources/contacts/README.md#update) - Update Contact

### [conversions](src/main/java/com/currencycloud/sdk/resources/conversions/README.md)

- [cancel](src/main/java/com/currencycloud/sdk/resources/conversions/README.md#cancel) - Cancel a Conversion
- [cancellation_quote](src/main/java/com/currencycloud/sdk/resources/conversions/README.md#cancellation_quote) - Quote Conversion Cancellation
- [create](src/main/java/com/currencycloud/sdk/resources/conversions/README.md#create) - Create Conversion
- [date_change](src/main/java/com/currencycloud/sdk/resources/conversions/README.md#date_change) - Conversion Date Change
- [date_change_quote](src/main/java/com/currencycloud/sdk/resources/conversions/README.md#date_change_quote) - Quote Conversion Date Change
- [find](src/main/java/com/currencycloud/sdk/resources/conversions/README.md#find) - Find Conversions
- [get](src/main/java/com/currencycloud/sdk/resources/conversions/README.md#get) - Get Conversion
- [profit_and_loss](src/main/java/com/currencycloud/sdk/resources/conversions/README.md#profit_and_loss) - Retrieve Profit / Loss
- [split](src/main/java/com/currencycloud/sdk/resources/conversions/README.md#split) - Conversion Split
- [split_history](src/main/java/com/currencycloud/sdk/resources/conversions/README.md#split_history) - Conversion Split History
- [split_preview](src/main/java/com/currencycloud/sdk/resources/conversions/README.md#split_preview) - Split Preview

### [demo](src/main/java/com/currencycloud/sdk/resources/demo/README.md)

- [simulate_funding](src/main/java/com/currencycloud/sdk/resources/demo/README.md#simulate_funding) - Emulate inbound funds

### [funding](src/main/java/com/currencycloud/sdk/resources/funding/README.md)

- [find_accounts](src/main/java/com/currencycloud/sdk/resources/funding/README.md#find_accounts) - Find Funding Accounts
- [get_transaction](src/main/java/com/currencycloud/sdk/resources/funding/README.md#get_transaction) - Get Funding Transaction

### [payers](src/main/java/com/currencycloud/sdk/resources/payers/README.md)

- [get](src/main/java/com/currencycloud/sdk/resources/payers/README.md#get) - Get Payer

### [payments](src/main/java/com/currencycloud/sdk/resources/payments/README.md)

- [assign_payment_fee](src/main/java/com/currencycloud/sdk/resources/payments/README.md#assign_payment_fee) - Assign Payment Fee
- [authorise](src/main/java/com/currencycloud/sdk/resources/payments/README.md#authorise) - Authorise Payment
- [confirmation](src/main/java/com/currencycloud/sdk/resources/payments/README.md#confirmation) - Get Payment Confirmation
- [create](src/main/java/com/currencycloud/sdk/resources/payments/README.md#create) - Create Payment
- [delete](src/main/java/com/currencycloud/sdk/resources/payments/README.md#delete) - Delete Payment
- [find](src/main/java/com/currencycloud/sdk/resources/payments/README.md#find) - Find Payments
- [get](src/main/java/com/currencycloud/sdk/resources/payments/README.md#get) - Get Payment
- [get_delivery_date](src/main/java/com/currencycloud/sdk/resources/payments/README.md#get_delivery_date) - Get Payment Delivery Date
- [get_payment_fees](src/main/java/com/currencycloud/sdk/resources/payments/README.md#get_payment_fees) - Get Payment Fees
- [get_submission_info](src/main/java/com/currencycloud/sdk/resources/payments/README.md#get_submission_info) - Get Payment Submission Information
- [get_tracking_info](src/main/java/com/currencycloud/sdk/resources/payments/README.md#get_tracking_info) - Get Payment Tracking Information
- [quote_payment_fee](src/main/java/com/currencycloud/sdk/resources/payments/README.md#quote_payment_fee) - Get Quote Payment Fee
- [retry_notifications](src/main/java/com/currencycloud/sdk/resources/payments/README.md#retry_notifications) - Resend Payment Notification
- [unassign_payment_fee](src/main/java/com/currencycloud/sdk/resources/payments/README.md#unassign_payment_fee) - Unassign Payment Fee
- [update](src/main/java/com/currencycloud/sdk/resources/payments/README.md#update) - Update Payment
- [validate](src/main/java/com/currencycloud/sdk/resources/payments/README.md#validate) - Validate Payment

### [rates](src/main/java/com/currencycloud/sdk/resources/rates/README.md)

- [find](src/main/java/com/currencycloud/sdk/resources/rates/README.md#find) - Get Basic Rates
- [find_bank_details](src/main/java/com/currencycloud/sdk/resources/rates/README.md#find_bank_details) - Find Bank Details
- [get_detailed](src/main/java/com/currencycloud/sdk/resources/rates/README.md#get_detailed) - Get Detailed Rates

### [reference](src/main/java/com/currencycloud/sdk/resources/reference/README.md)

- [get_available_currencies](src/main/java/com/currencycloud/sdk/resources/reference/README.md#get_available_currencies) - Get Available Currencies
- [get_beneficiary_requirements](src/main/java/com/currencycloud/sdk/resources/reference/README.md#get_beneficiary_requirements) - Get Beneficiary Requirements
- [get_conversion_dates](src/main/java/com/currencycloud/sdk/resources/reference/README.md#get_conversion_dates) - Get Conversion Dates
- [get_payer_required_details](src/main/java/com/currencycloud/sdk/resources/reference/README.md#get_payer_required_details) - Get Payer Requirements
- [get_payment_dates](src/main/java/com/currencycloud/sdk/resources/reference/README.md#get_payment_dates) - Get Payment Dates
- [get_payment_fee_rules](src/main/java/com/currencycloud/sdk/resources/reference/README.md#get_payment_fee_rules) - Get Payment Fee Rules
- [get_payment_purpose_codes](src/main/java/com/currencycloud/sdk/resources/reference/README.md#get_payment_purpose_codes) - Get Payment Purpose Codes
- [get_settlement_accounts](src/main/java/com/currencycloud/sdk/resources/reference/README.md#get_settlement_accounts) - Get Settlement Accounts

### [reports](src/main/java/com/currencycloud/sdk/resources/reports/README.md)

- [find_report_requests](src/main/java/com/currencycloud/sdk/resources/reports/README.md#find_report_requests) - Find Report Requests
- [generate_conversion_report](src/main/java/com/currencycloud/sdk/resources/reports/README.md#generate_conversion_report) - Generate Conversion Report
- [generate_payment_report](src/main/java/com/currencycloud/sdk/resources/reports/README.md#generate_payment_report) - Generate Payment Report
- [get_report_requests](src/main/java/com/currencycloud/sdk/resources/reports/README.md#get_report_requests) - Retrieves a Report Request with the given ID

### [termsAndConditions](src/main/java/com/currencycloud/sdk/resources/termsandconditions/README.md)

- [accept](src/main/java/com/currencycloud/sdk/resources/termsandconditions/README.md#accept) - Accept Terms of Use

### [transactions](src/main/java/com/currencycloud/sdk/resources/transactions/README.md)

- [find](src/main/java/com/currencycloud/sdk/resources/transactions/README.md#find) - Find Transactions
- [get](src/main/java/com/currencycloud/sdk/resources/transactions/README.md#get) - Get Transaction
- [get_sender_details](src/main/java/com/currencycloud/sdk/resources/transactions/README.md#get_sender_details) - Get Sender Details

### [transfers](src/main/java/com/currencycloud/sdk/resources/transfers/README.md)

- [cancel](src/main/java/com/currencycloud/sdk/resources/transfers/README.md#cancel) - Cancel Transfer
- [create](src/main/java/com/currencycloud/sdk/resources/transfers/README.md#create) - Create Transfer
- [find](src/main/java/com/currencycloud/sdk/resources/transfers/README.md#find) - Find Transfers
- [get](src/main/java/com/currencycloud/sdk/resources/transfers/README.md#get) - Get Transfer

### [withdrawalAccounts.find](src/main/java/com/currencycloud/sdk/resources/withdrawalaccounts/find/README.md)

- [find](src/main/java/com/currencycloud/sdk/resources/withdrawalaccounts/find/README.md#find) - Find Withdrawal Account
- [pull_funds](src/main/java/com/currencycloud/sdk/resources/withdrawalaccounts/find/README.md#pull_funds) - Pull Funds From Withdrawal Account
<!-- MODULE DOCS END -->
