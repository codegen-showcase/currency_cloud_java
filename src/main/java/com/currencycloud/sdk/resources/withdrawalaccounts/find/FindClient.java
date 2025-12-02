
package com.currencycloud.sdk.resources.withdrawalaccounts.find;

import java.io.IOException;
import java.util.Map;

import com.currencycloud.sdk.core.ApiException;
import com.currencycloud.sdk.core.BaseClient;
import com.currencycloud.sdk.core.HttpRequestBuilder;
import com.currencycloud.sdk.core.RequestOptions;
import com.currencycloud.sdk.core.ResponseHandler;
import com.currencycloud.sdk.model.WithdrawalAccountsFindFindResponse;
import com.currencycloud.sdk.model.WithdrawalAccountsFindPullFundsBody;
import com.currencycloud.sdk.model.WithdrawalPullFundsRequestDetails;
import com.currencycloud.sdk.resources.withdrawalaccounts.find.params.FindRequest;
import com.currencycloud.sdk.resources.withdrawalaccounts.find.params.PullFundsRequest;


public class FindClient {
    protected final BaseClient baseClient;

    public FindClient(BaseClient baseClient) {
        this.baseClient = baseClient;

    }

    /**
    * Find Withdrawal Account
    *
    * Lists all withdrawal accounts assigned to an account.
    *
    * GET /withdrawal_accounts/find
    */
    public WithdrawalAccountsFindFindResponse find() {
        return find(FindRequest.builder().build(), null);
    }


    /**
    * Find Withdrawal Account
    *
    * Lists all withdrawal accounts assigned to an account.
    *
    * GET /withdrawal_accounts/find
    */
    public WithdrawalAccountsFindFindResponse find(FindRequest request) {
        return find(request, null);
    }


    /**
    * Find Withdrawal Account
    *
    * Lists all withdrawal accounts assigned to an account.
    *
    * GET /withdrawal_accounts/find
    */
    public WithdrawalAccountsFindFindResponse find(FindRequest request, RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/withdrawal_accounts/find")
            .addQueryParam("account_id", request.getAccountId(), "form", true)
            .method("GET")
            .addAuth(baseClient.getAuth("AuthToken"))
            .execute();
            return ResponseHandler.processJsonResponse(response, WithdrawalAccountsFindFindResponse.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }

    /**
    * Pull Funds From Withdrawal Account
    *
    * Submits an ACH pull request from a specific withdrawal account. The funds will be pulled into the account the specified withdrawal account is related to.
    *
    * POST /withdrawal_accounts/{withdrawal_account_id}/pull_funds
    */
    public WithdrawalPullFundsRequestDetails pullFunds(PullFundsRequest request) {
        return pullFunds(request, null);
    }


    /**
    * Pull Funds From Withdrawal Account
    *
    * Submits an ACH pull request from a specific withdrawal account. The funds will be pulled into the account the specified withdrawal account is related to.
    *
    * POST /withdrawal_accounts/{withdrawal_account_id}/pull_funds
    */
    public WithdrawalPullFundsRequestDetails pullFunds(PullFundsRequest request,
            RequestOptions requestOptions) {

        try {
            okhttp3.Response response = new HttpRequestBuilder()
            .baseUrl(this.baseClient.baseUrl())
            .path("/withdrawal_accounts/{withdrawal_account_id}/pull_funds")
            .addPathParam("withdrawal_account_id", request.getWithdrawalAccountId())
            .method("POST")
            .addAuth(baseClient.getAuth("AuthToken"))
            .setFormUrlEncodedBody(WithdrawalAccountsFindPullFundsBody.builder().amount(
                                       request.getAmount()).reference(request.getReference()).build(), Map.ofEntries(Map.entry("amount",
                                               "form"), Map.entry("reference", "form")), Map.ofEntries(Map.entry("amount", true),
                                                       Map.entry("reference", true)))
            .execute();
            return ResponseHandler.processJsonResponse(response, WithdrawalPullFundsRequestDetails.class);
        } catch (IOException e) {
            throw new ApiException("Error executing HTTP request", e);
        }
    }



}
