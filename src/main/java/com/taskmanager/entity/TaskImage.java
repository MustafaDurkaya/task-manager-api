package com.taskmanager.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "task_image")
public class TaskImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "task_id")
    private Task task;
}
