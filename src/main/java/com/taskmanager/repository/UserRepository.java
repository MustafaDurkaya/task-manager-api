package com.taskmanager.repository;

import com.taskmanager.dto.response.UserResponse;
import com.taskmanager.entity.User;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    boolean existbyEmail(@Email @NotBlank String email);

    Optional<User> findByEmail(@Email @NotBlank String email);

    Optional<UserResponse> getUsersById(long id);

    List<User> id(long id);
}
