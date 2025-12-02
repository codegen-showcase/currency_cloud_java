
package com.currencycloud.sdk;

import com.currencycloud.sdk.core.AuthKey;
import com.currencycloud.sdk.core.AuthKeyLocation;
import com.currencycloud.sdk.core.BaseClient;


public final class ClientBuilder {

    private final BaseClient.Builder baseClientBuilder = BaseClient.builder();
    private Environment environment = Environment.PRODUCTION;
    public ClientBuilder environment(Environment environment) {
        this.environment = environment;
        return this;
    }
    public ClientBuilder url(String url) {
        this.environment = Environment.custom(url);
        return this;
    }
    public Client build() {
        baseClientBuilder.baseUrl(this.environment);
        return new Client(baseClientBuilder.build());
    }

    public ClientBuilder withAuthToken(String token) {
        this.baseClientBuilder.addAuth("AuthToken", new AuthKey(AuthKeyLocation.HEADER_KEY, "X-Auth-Token",
                                       token));
        return this;
    }

}
