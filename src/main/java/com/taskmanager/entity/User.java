package com.taskmanager.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
// Data Annotation'u - @Getter , @Setter , @RequiredArgsConstructor , @ToString , @EqualsAndHashCode
// gibi annotationları zaten sağlıyor.
@Data
@AllArgsConstructor  // Tüm alanları içeren bir constructor oluşturur
@NoArgsConstructor  // Parametresiz boş constructor üretir  #Entity sınıfında boş bir constructor zorunludur.
@Entity
@Table(name = "User" )
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String role;
    @OneToMany(mappedBy = "User", cascade = CascadeType.ALL)
    private List<Task> tasks;
    @OneToMany(mappedBy = "User", cascade = CascadeType.ALL)
    private List<Comment> comments;
}

