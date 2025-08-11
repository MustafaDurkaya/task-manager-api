package com.taskmanager.service;

import com.taskmanager.dto.request.CreateUserRequest;
import com.taskmanager.entity.User;

import java.util.List;
import java.util.Optional;

public interface UserService {

    User createUser(User user);

    User register(CreateUserRequest req);

    List<CreateUserRequest> getAllUsers();

    Optional<User> getUserById(Long id);

    void deleteUser(Long id);
}
