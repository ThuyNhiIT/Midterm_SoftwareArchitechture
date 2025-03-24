package com.designpattern.singleton.threadPool;

public class Main {
    public static void main(String[] args) {
        ThreadPool pool = ThreadPool.getInstance();

        pool.executeTask(() -> System.out.println("Chạy tác vụ 1"));
        pool.executeTask(() -> System.out.println("Chạy tác vụ 2"));
    }
}