package com.taskmanager.service;

import com.taskmanager.dto.request.CreateTaskRequest;
import com.taskmanager.dto.request.UpdateTaskRequest;
import com.taskmanager.dto.response.TaskResponse;
import com.taskmanager.entity.Task;
import org.springframework.stereotype.Service;

public interface TaskService {
    TaskResponse createTask(CreateTaskRequest task);

    TaskResponse updateTask(UpdateTaskRequest task);

    void deleteTask(Task task);

}