
package com.currencycloud.sdk.resources.withdrawalaccounts;

import java.util.function.Supplier;

import com.currencycloud.sdk.core.BaseClient;
import com.currencycloud.sdk.core.Suppliers;
import com.currencycloud.sdk.resources.withdrawalaccounts.find.FindClient;


public class WithdrawalAccountsClient {
    protected final BaseClient baseClient;
    protected final Supplier<FindClient> find;
    public WithdrawalAccountsClient(BaseClient baseClient) {
        this.baseClient = baseClient;
        this.find = Suppliers.memoize(() -> new FindClient(baseClient));
    }

    public FindClient find() {
        return this.find.get();
    }
}
