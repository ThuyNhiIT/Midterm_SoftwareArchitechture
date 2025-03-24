package com.designpattern.singleton.Configuration;

// Sử dụng Singleton
public class Main {
    public static void main(String[] args) {
        ConfigManager config1 = ConfigManager.getInstance();
        System.out.println(config1.getConfigData());

        ConfigManager config2 = ConfigManager.getInstance();
        System.out.println(config2.getConfigData());

        System.out.println(config1 == config2); // true
    }
}