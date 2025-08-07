package com.taskmanager.enums;

public enum TaskStatus {
    NEW("Newly created task"),
    IN_PROGRESS("Task is being worked on"),
    COMPLETED("Task is finished"),
    CANCELLED("Task was cancelled"),
    ON_HOLD("Task is paused");

    private final String description;

    TaskStatus(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}