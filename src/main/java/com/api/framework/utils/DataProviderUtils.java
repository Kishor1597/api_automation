package com.api.framework.utils;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {

    @DataProvider(name = "userData")
    public Object[][] userDataProvider() {
        return new Object[][] {
                {"Jha", "Leader"},
                {"Kishor", "QA"}
        };
    }
}
