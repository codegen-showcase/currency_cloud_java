package com.currencycloud.sdk.core;

public interface AuthProvider {

    public void setValue(String val);

    public HttpRequestBuilder addAuth(HttpRequestBuilder builder);

}
