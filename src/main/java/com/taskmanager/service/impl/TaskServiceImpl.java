package com.taskmanager.service.impl;

import com.taskmanager.dto.request.CreateTaskRequest;
import com.taskmanager.dto.request.UpdateTaskRequest;
import com.taskmanager.dto.response.TaskResponse;
import com.taskmanager.entity.Task;
import com.taskmanager.service.TaskService;
import org.springframework.stereotype.Service;

@Service
public class TaskServiceImpl implements TaskService {

    @Override
    public TaskResponse createTask(CreateTaskRequest task) {
        return null;
    }

    @Override
    public TaskResponse updateTask(UpdateTaskRequest task) {
        return null;
    }

    @Override
    public void deleteTask(Task task) {

    }
}
