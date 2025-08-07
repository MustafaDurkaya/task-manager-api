package com.taskmanager.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import com.taskmanager.enums.TaskStatus;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
@Table(name = "task")
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(columnDefinition = "TEXT")  //açıklama alanı
    private String description;

    @Enumerated(EnumType.STRING)
    private TaskStatus status;

    @Column(nullable = false)
    private LocalDateTime createdDate;

    @Column(nullable = false)
    private LocalDate dueDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<TaskImage> taskImages;

    @OneToMany(mappedBy = "task", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<Comment> comments;
}

// CascadeType.ALL ==> Tüm işlemleri uygular
// CascadeType.PERSIST ==>Save işlemi - Ana entity kaydedildiğinde, ilişkili child entity'ler de otomatik olarak kaydedilir
// CascadeType.MERGE ==>Güncelleme (merge) sırasında - Ana entity güncellenirse, ilişkili child entity’ler de güncellenir
// CascadeType.REMOVE ==>Silme işlemi - Ana entity silinirse, bağlı tüm child entity’ler de otomatik silinir
// CascadeType.REFRESH ==>Veri yenileme - Ana entity, veritabanındaki haliyle yeniden yüklenirse, ilişkili varlıklar da güncellenir
// CascadeType.DETACH ==>Kalıcı nesneden ayırma(detach) işlemi - Ana entity, kalıcı bağlamdan (EntityManager) çıkarıldığında, ilişkili entity'ler de çıkarılır
