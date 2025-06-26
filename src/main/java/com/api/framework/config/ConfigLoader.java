package com.api.framework.config;

import com.api.framework.constants.FrameworkConstants;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class ConfigLoader {
    private static Properties prop;

    public static String getProperty(String key) {
        if (prop == null) {
            prop = new Properties();
            try (FileInputStream fis = new FileInputStream(FrameworkConstants.CONFIG_PATH)) {
                prop.load(fis);
            } catch (IOException e) {
                throw new RuntimeException("Failed to load config file: " + e.getMessage());
            }
        }
        return prop.getProperty(key);
    }
}
