package com.company.worker;

public class Main {
    public static void main(String[] args) {
        System.out.println("==================================================");
        System.out.println("Task 1.1. Worker");

        OnTaskDoneListener onTaskDoneListener = System.out::println;
        OnTaskErrorListener onTaskErrorListener = System.out::println;

        Worker worker = new Worker(onTaskDoneListener, onTaskErrorListener);
        worker.work();

    }
}
