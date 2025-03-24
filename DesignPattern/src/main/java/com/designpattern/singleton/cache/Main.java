package com.designpattern.singleton.cache;

// Sử dụng Singleton
public class Main {
    public static void main(String[] args) {
        Cache cache = Cache.getInstance();
        cache.put("user_1", "Phạm Thị Thúy Nhi");

        Cache cache2 = Cache.getInstance();
        System.out.println(cache2.get("user_1")); // Phạm Thị Thúy Nhi
    }
}