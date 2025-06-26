package com.api.framework.utils;

import org.testng.annotations.DataProvider;

import java.util.List;

public class DataProviderUtils {

    @DataProvider(name = "userCSVData")
    public Object[][] getUserDataFromCSV() {
        List<String[]> data = CsvUtils.readCSV("users.csv");
        Object[][] testData = new Object[data.size()][2];

        for (int i = 0; i < data.size(); i++) {
            testData[i][0] = data.get(i)[0]; // name
            testData[i][1] = data.get(i)[1]; // job
        }

        return testData;
    }
}
