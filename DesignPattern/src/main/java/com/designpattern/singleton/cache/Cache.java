package com.designpattern.singleton.cache;

import java.util.HashMap;
import java.util.Map;

public class Cache {
    private static Cache instance;
    private Map<String, String> data;

    private Cache() {
        data = new HashMap<>();
    }

    public static Cache getInstance() {
        if (instance == null) {
            instance = new Cache();
        }
        return instance;
    }

    public void put(String key, String value) {
        data.put(key, value);
    }

    public String get(String key) {
        return data.get(key);
    }
}
