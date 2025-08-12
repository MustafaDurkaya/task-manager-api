package com.taskmanager.service;

import com.taskmanager.entity.Task;
import com.taskmanager.enums.TaskStatus;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface TaskService {

    Task createTask(Task task);

    Task updateTask(Long id, Task updatedTask);

    /**
     * Opsiyonel filtreler: null gönderirsen o kritere göre filtre uygulanmaz.
     */
    List<Task> getAllTasks(
            String title,
            TaskStatus status,
            LocalDate dueDate,
            LocalDateTime createdDate,
            Long userId
    );

    Optional<Task> getTaskById(Long id);

    void deleteTask(Long id);

    List<Task> getAllTasks(String title, String status, String dueDate, String createdDate, Long userId);

    List<Task> getTasksByUserAndStatus(Long userId, TaskStatus status);

    List<Task> searchTasksByTitle(Long userId, String keyword);
}

