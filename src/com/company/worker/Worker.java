package com.company.worker;

public class Worker {
    private OnTaskDoneListener onTaskDoneCallback;
    private OnTaskErrorListener onTaskErrorCallback;

    public Worker(OnTaskDoneListener onTaskDoneCallback, OnTaskErrorListener onTaskErrorCallback) {
        this.onTaskDoneCallback = onTaskDoneCallback;
        this.onTaskErrorCallback = onTaskErrorCallback;
    }


    public void work() {
        for (int i = 0; i < 100; i++) {
            if (i != 33) onTaskDoneCallback.onDone("Task " + i + " is done");
            else onTaskErrorCallback.onError("Task " + i + " produces an error.");
        }
    }
}
