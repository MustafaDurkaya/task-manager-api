package com.taskmanager.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import jakarta.validation.constraints.Size;
import jakarta.validation.constraints.Email;

import com.taskmanager.enums.Role;

// Data Annotation'u - @Getter , @Setter , @RequiredArgsConstructor , @ToString , @EqualsAndHashCode
// gibi annotationları zaten sağlıyor.
@Data
@AllArgsConstructor  // Tüm alanları içeren bir constructor oluşturur
@NoArgsConstructor  // Parametresiz boş constructor üretir  #Entity sınıfında boş bir constructor zorunludur.
@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false, unique = true, length = 16)
    @Size(min = 3, max = 16)
    private String firstName;

    @Column(nullable = false, unique = true, length = 16)
    @Size(min = 3, max = 16)
    private String lastName;

    @Email
    @Column(nullable = false, unique = true)
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)  // Enum değeri veritabanına string olarak yazılıyo ("USER", "ADMIN")
    @Column(nullable = false)
    private Role role;                              // sınırlı ve sabit bir değer kümesini temsil etmek için kullanılır

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Task> tasks = new ArrayList<>();
    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
    private List<Comment> comments = new ArrayList<>();
}
    // FetchType.LAZY ==> Liste, çağrılana kadar yüklenmez, zaten default değer ama öğrenmek için yazdım

