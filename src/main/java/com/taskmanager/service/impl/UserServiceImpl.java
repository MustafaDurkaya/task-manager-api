package com.taskmanager.service.impl;

import com.taskmanager.dto.request.CreateUserRequest;
import com.taskmanager.entity.User;
import com.taskmanager.repository.UserRepository;
import com.taskmanager.service.UserService;

import java.util.List;
import java.util.Optional;

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository){
        this.userRepository = userRepository;
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
    public User createUser(User user){
        return userRepository.save(user);
    }

    public Optional<User> getUserById(Long id){
        return userRepository.findById(id);
    }
}
