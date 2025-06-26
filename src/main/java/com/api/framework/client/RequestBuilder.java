package com.api.framework.client;

import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.given;

public class RequestBuilder {
    public static RequestSpecification getRequestSpec() {
        return given()
                .log().all()
                .header("Content-Type", "application/json");
    }
}
