package com.taskmanager.service.impl;

import com.taskmanager.dto.request.CreateUserRequest;
import com.taskmanager.entity.User;
import com.taskmanager.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User createUser(User user) {
        return null;
    }

    @Override
    public CreateUserRequest register(CreateUserRequest req) {
        return null;
    }

    @Override
    public List<CreateUserRequest> getAllUsers() {
        return List.of();
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return Optional.empty();
    }
}