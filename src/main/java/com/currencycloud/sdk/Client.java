
package com.currencycloud.sdk;

import java.util.function.Supplier;

import com.currencycloud.sdk.core.BaseClient;
import com.currencycloud.sdk.core.Suppliers;
import com.currencycloud.sdk.resources.accounts.AccountsClient;
import com.currencycloud.sdk.resources.auth.AuthClient;
import com.currencycloud.sdk.resources.balances.BalancesClient;
import com.currencycloud.sdk.resources.beneficiaries.BeneficiariesClient;
import com.currencycloud.sdk.resources.collectionsscreening.CollectionsScreeningClient;
import com.currencycloud.sdk.resources.contacts.ContactsClient;
import com.currencycloud.sdk.resources.conversions.ConversionsClient;
import com.currencycloud.sdk.resources.demo.DemoClient;
import com.currencycloud.sdk.resources.funding.FundingClient;
import com.currencycloud.sdk.resources.payers.PayersClient;
import com.currencycloud.sdk.resources.payments.PaymentsClient;
import com.currencycloud.sdk.resources.rates.RatesClient;
import com.currencycloud.sdk.resources.reference.ReferenceClient;
import com.currencycloud.sdk.resources.reports.ReportsClient;
import com.currencycloud.sdk.resources.termsandconditions.TermsAndConditionsClient;
import com.currencycloud.sdk.resources.transactions.TransactionsClient;
import com.currencycloud.sdk.resources.transfers.TransfersClient;
import com.currencycloud.sdk.resources.withdrawalaccounts.WithdrawalAccountsClient;


public class Client {

    protected final BaseClient baseClient;
    protected final Supplier<AccountsClient> accounts;
    protected final Supplier<BalancesClient> balances;
    protected final Supplier<BeneficiariesClient> beneficiaries;
    protected final Supplier<ContactsClient> contacts;
    protected final Supplier<ConversionsClient> conversions;
    protected final Supplier<FundingClient> funding;
    protected final Supplier<PayersClient> payers;
    protected final Supplier<PaymentsClient> payments;
    protected final Supplier<RatesClient> rates;
    protected final Supplier<ReferenceClient> reference;
    protected final Supplier<ReportsClient> reports;
    protected final Supplier<TransactionsClient> transactions;
    protected final Supplier<TransfersClient> transfers;
    protected final Supplier<WithdrawalAccountsClient> withdrawalAccounts;
    protected final Supplier<AuthClient> auth;
    protected final Supplier<DemoClient> demo;
    protected final Supplier<TermsAndConditionsClient> termsAndConditions;
    protected final Supplier<CollectionsScreeningClient> collectionsScreening;

    public Client(BaseClient baseClient) {
        this.baseClient = baseClient;
        this.accounts = Suppliers.memoize(() -> new AccountsClient(baseClient));
        this.balances = Suppliers.memoize(() -> new BalancesClient(baseClient));
        this.beneficiaries = Suppliers.memoize(() -> new BeneficiariesClient(baseClient));
        this.contacts = Suppliers.memoize(() -> new ContactsClient(baseClient));
        this.conversions = Suppliers.memoize(() -> new ConversionsClient(baseClient));
        this.funding = Suppliers.memoize(() -> new FundingClient(baseClient));
        this.payers = Suppliers.memoize(() -> new PayersClient(baseClient));
        this.payments = Suppliers.memoize(() -> new PaymentsClient(baseClient));
        this.rates = Suppliers.memoize(() -> new RatesClient(baseClient));
        this.reference = Suppliers.memoize(() -> new ReferenceClient(baseClient));
        this.reports = Suppliers.memoize(() -> new ReportsClient(baseClient));
        this.transactions = Suppliers.memoize(() -> new TransactionsClient(baseClient));
        this.transfers = Suppliers.memoize(() -> new TransfersClient(baseClient));
        this.withdrawalAccounts = Suppliers.memoize(() -> new WithdrawalAccountsClient(baseClient));
        this.auth = Suppliers.memoize(() -> new AuthClient(baseClient));
        this.demo = Suppliers.memoize(() -> new DemoClient(baseClient));
        this.termsAndConditions = Suppliers.memoize(() -> new TermsAndConditionsClient(baseClient));
        this.collectionsScreening = Suppliers.memoize(() -> new CollectionsScreeningClient(baseClient));
    }

    public AccountsClient accounts() {
        return this.accounts.get();
    }

    public BalancesClient balances() {
        return this.balances.get();
    }

    public BeneficiariesClient beneficiaries() {
        return this.beneficiaries.get();
    }

    public ContactsClient contacts() {
        return this.contacts.get();
    }

    public ConversionsClient conversions() {
        return this.conversions.get();
    }

    public FundingClient funding() {
        return this.funding.get();
    }

    public PayersClient payers() {
        return this.payers.get();
    }

    public PaymentsClient payments() {
        return this.payments.get();
    }

    public RatesClient rates() {
        return this.rates.get();
    }

    public ReferenceClient reference() {
        return this.reference.get();
    }

    public ReportsClient reports() {
        return this.reports.get();
    }

    public TransactionsClient transactions() {
        return this.transactions.get();
    }

    public TransfersClient transfers() {
        return this.transfers.get();
    }

    public WithdrawalAccountsClient withdrawalAccounts() {
        return this.withdrawalAccounts.get();
    }

    public AuthClient auth() {
        return this.auth.get();
    }

    public DemoClient demo() {
        return this.demo.get();
    }

    public TermsAndConditionsClient termsAndConditions() {
        return this.termsAndConditions.get();
    }

    public CollectionsScreeningClient collectionsScreening() {
        return this.collectionsScreening.get();
    }

    public static ClientBuilder builder() {
        return new ClientBuilder();
    }

}
