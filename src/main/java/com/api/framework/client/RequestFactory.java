package com.api.framework.client;

import io.restassured.response.Response;

public class RequestFactory {
    public Response get(String endpoint) {
        return RequestBuilder.getRequestSpec().get(endpoint);
    }

    public Response post(String endpoint, Object body) {
        return RequestBuilder.getRequestSpec().body(body).post(endpoint);
    }

    public Response put(String endpoint, Object body) {
        return RequestBuilder.getRequestSpec().body(body).put(endpoint);
    }

    public Response delete(String endpoint) {
        return RequestBuilder.getRequestSpec().delete(endpoint);
    }
}
