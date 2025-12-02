
package com.currencycloud.sdk;



public final class Environment {

    private final String url;
    public static final Environment PRODUCTION = new Environment("https://devapi.currencycloud.com/v2");
    public static final Environment MOCK_SERVER = new
    Environment("https://api.sideko.dev/v1/mock/public/currency-cloud/0.1.0");

    private Environment(String url) {
        this.url = url;
    }

    public String getUrl() {
        return this.url;
    }

    public static Environment custom(String url) {
        return new Environment(url);
    }
}
