package com.taskmanager.service.impl;

import com.taskmanager.entity.Task;
import com.taskmanager.enums.TaskStatus;
import com.taskmanager.repository.TaskRepository;
import com.taskmanager.service.TaskService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class TaskServiceImpl implements TaskService {

    private final TaskRepository taskRepository;

    @Autowired
    public TaskServiceImpl(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @Override
    public Task createTask(Task task) {
        return (Task) taskRepository.save(task);
    }

    @Override
    public Task updateTask(Long id, Task updatedTask) {
        return (Task) taskRepository.findById(id)
                .map(existingTask -> {
                    existingTask.setTitle(updatedTask.getTitle());
                    existingTask.setDescription(updatedTask.getDescription());
                    existingTask.setStatus(updatedTask.getStatus());
                    existingTask.setDueDate(updatedTask.getDueDate());
                    return taskRepository.save(existingTask);
                })
                .orElseThrow(() -> new RuntimeException("Task not found with id: " + id));
    }

    @Override
    public List<Task> getAllTasks(String title, TaskStatus status, LocalDate dueDate, LocalDateTime createdDate, Long userId) {
        return List.of();
    }

    @Override
    public List<Task> getAllTasks(String title, String status, String dueDate, String createdDate, Long userId) {
        return taskRepository.findAllByUserId(userId)
                .stream()
                .distinct()
                .toList();
    }

    @Override
    public List<Task> getTasksByUserAndStatus(Long userId, TaskStatus status) {
        return taskRepository.findAllByUserIdAndStatus(userId, status);
    }

    @Override
    public List<Task> searchTasksByTitle(Long userId, String keyword) {
        return taskRepository.findByUserIdAndTitle(userId, keyword);
    }

    @Override
    public Optional<Task> getTaskById(Long id) {
        return taskRepository.findById(id);
    }

    @Override
    public void deleteTask(Long id) {
        if (!taskRepository.existsById(id)) {
            throw new RuntimeException("Task not found with id: " + id);
        }
        taskRepository.deleteById(id);
    }
}
