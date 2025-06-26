package com.api.framework.base;

import com.api.framework.reports.ExtentManager;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.IOException;

public class BaseTest {
    protected ExtentReports extent;
    protected ExtentTest test;

    @BeforeMethod
    public void setUp() throws IOException {
        extent = ExtentManager.getInstance();
    }

    @AfterMethod
    public void tearDown() {
        extent.flush();
    }
}
