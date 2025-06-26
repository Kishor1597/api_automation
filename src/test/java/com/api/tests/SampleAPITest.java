package com.api.tests;

import com.api.framework.base.BaseTest;
import com.api.framework.client.RequestFactory;
import com.api.framework.reports.ExtentLogger;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SampleAPITest extends BaseTest {

    @Test
    public void getUsersTest() throws IOException {
        test = extent.createTest("GET Users API Test");
        RequestFactory rf = new RequestFactory();

        Response response = rf.get("/api/users?page=2");

        ExtentLogger.info("Status Code: " + response.getStatusCode());
        Assert.assertEquals(response.getStatusCode(), 200);
        ExtentLogger.pass("API responded with status 200");
    }
}
