package com.designpattern.singleton.logger;

// Sử dụng Singleton
public class Main {
    public static void main(String[] args) {
        Logger logger1 = Logger.getInstance();
        logger1.log("Ứng dụng khởi động...");

        Logger logger2 = Logger.getInstance();
        logger2.log("Tải dữ liệu người dùng...");

        System.out.println(logger1 == logger2); // true
    }
}