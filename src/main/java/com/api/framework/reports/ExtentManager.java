package com.api.framework.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.api.framework.constants.FrameworkConstants;

import java.io.IOException;

public class ExtentManager {
    private static ExtentReports extent;

    public static ExtentReports getInstance() throws IOException {
        if (extent == null) {
            ExtentSparkReporter spark = new ExtentSparkReporter(FrameworkConstants.EXTENT_REPORT_PATH);
            spark.loadXMLConfig(FrameworkConstants.EXTENT_CONFIG_PATH);
            extent = new ExtentReports();
            extent.attachReporter(spark);
        }
        return extent;
    }
}
