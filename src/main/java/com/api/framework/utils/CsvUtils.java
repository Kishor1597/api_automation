package com.api.framework.utils;

import com.api.framework.constants.FrameworkConstants;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class CsvUtils {

    public static List<String[]> readCSV(String fileName) {
        List<String[]> data = new ArrayList<>();
        String line;

        try (BufferedReader br = new BufferedReader(new FileReader(FrameworkConstants.TEST_DATA_PATH + fileName))) {
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                data.add(values);
            }
        } catch (Exception e) {
            throw new RuntimeException("Error reading CSV: " + fileName, e);
        }

        return data;
    }
}
