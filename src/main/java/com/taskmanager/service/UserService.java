package com.taskmanager.service;

import com.taskmanager.dto.request.CreateUserRequest;
import com.taskmanager.dto.response.UserResponse;

import java.util.List;
import java.util.Optional;

public interface UserService {
    UserResponse createUser(CreateUserRequest req);

    List<UserResponse> getAllUsers();

    Optional<UserResponse> getUserById(Long id);
}
