package com.api.tests;

import com.api.framework.base.BaseTest;
import com.api.framework.client.RequestFactory;
import com.api.framework.reports.ExtentLogger;
import com.api.framework.utils.DataProviderUtils;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class SampleAPITest extends BaseTest {

    @Test(dataProvider = "userCSVData", dataProviderClass = DataProviderUtils.class)
    public void createUserTest(String name, String job) throws IOException {
        test = extent.createTest("Create User: " + name);

        String jsonBody = String.format("{\"name\": \"%s\", \"job\": \"%s\"}", name, job);
        Response response = new RequestFactory().post("/api/users", jsonBody);

        Assert.assertEquals(response.getStatusCode(), 201);
        ExtentLogger.pass("User created with status code 201");
    }
}
