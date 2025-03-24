package com.designpattern.singleton.Configuration;

public class ConfigManager {
    private static ConfigManager instance;
    private String configData;

    private ConfigManager() {
        // Giả lập tải dữ liệu cấu hình từ file
        this.configData = "Cấu hình hệ thống...";
    }

    public static ConfigManager getInstance() {
        if (instance == null) {
            instance = new ConfigManager();
        }
        return instance;
    }

    public String getConfigData() {
        return configData;
    }
}
