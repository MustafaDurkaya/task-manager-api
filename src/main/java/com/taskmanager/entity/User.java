package com.taskmanager.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
import com.taskmanager.enums.Role;

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

    @Enumerated(EnumType.STRING)  // Enum değeri veritabanına string olarak yazılıyo ("USER", "ADMIN")
    private Role role;                              // sınırlı ve sabit bir değer kümesini temsil etmek için kullanılır

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Task> tasks;
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Comment> comments;
}

