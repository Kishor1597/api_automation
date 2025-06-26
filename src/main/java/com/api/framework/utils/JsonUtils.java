package com.api.framework.utils;

import com.api.framework.constants.FrameworkConstants;
import java.nio.file.Files;
import java.nio.file.Paths;

public class JsonUtils {
    public static String readJsonFromFile(String fileName) {
        try {
            return new String(Files.readAllBytes(Paths.get(FrameworkConstants.TEST_DATA_PATH + fileName)));
        } catch (Exception e) {
            throw new RuntimeException("Could not read JSON file: " + fileName);
        }
    }
}
