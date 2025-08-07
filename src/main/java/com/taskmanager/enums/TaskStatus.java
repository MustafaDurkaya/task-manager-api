package com.taskmanager.enums;

public enum TaskStatus {
    TODO("Task is to be done"),
    IN_PROGRESS("Task is in Progress"),
    DONE("Task is finished");

    private final String description;

    TaskStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}