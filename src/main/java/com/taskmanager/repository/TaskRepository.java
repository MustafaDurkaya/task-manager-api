package com.taskmanager.repository;

import com.taskmanager.entity.Task;
import com.taskmanager.enums.TaskStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

    // User entity'sinin id'sine göre Task listesi getirir
    List<Task> findAllByUserId(Long userId);

    // Opsiyonel ek filtre örnekleri (kullanmak istersen)
    List<Task> findAllByUserIdAndStatus(Long userId, TaskStatus status);

    List<Task> findByUserIdAndTitle(Long userId, String title);
}

