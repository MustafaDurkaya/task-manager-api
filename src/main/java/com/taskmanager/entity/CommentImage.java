package com.taskmanager.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "comment_image")
public class CommentImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String imageUrl;

    @ManyToOne
    @JoinColumn(name = "comment_id")
    private Comment comment;
}
