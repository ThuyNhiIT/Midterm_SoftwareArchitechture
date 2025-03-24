package com.designpattern.singleton.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    private static ThreadPool instance;
    private ExecutorService executor;

    private ThreadPool() {
        executor = Executors.newFixedThreadPool(5);
    }

    public static ThreadPool getInstance() {
        if (instance == null) {
            instance = new ThreadPool();
        }
        return instance;
    }

    public void executeTask(Runnable task) {
        executor.execute(task);
    }
}