package com.api.framework.reports;

import com.aventstack.extentreports.Status;

import java.io.IOException;

public class ExtentLogger {
    public static void info(String message) throws IOException {
        ExtentManager.getInstance().createTest("INFO").log(Status.INFO, message);
    }

    public static void pass(String message) throws IOException {
        ExtentManager.getInstance().createTest("PASS").log(Status.PASS, message);
    }

    public static void fail(String message) throws IOException {
        ExtentManager.getInstance().createTest("FAIL").log(Status.FAIL, message);
    }
}
