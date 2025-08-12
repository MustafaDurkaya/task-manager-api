package com.taskmanager.dto.response;

public class TaskResponse {
    private final String taskId;
    private String taskName;
    private String taskDescription;
    private String taskStatus;  // bunu enumdan taskStatus ile birlikte çekeceğiz

    public TaskResponse(String taskId, String taskName, String taskDescription, String taskStatus) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
    }

}
