package com.taskmanager.service.impl;

import com.taskmanager.dto.request.CreateUserRequest;
import com.taskmanager.entity.User;
import com.taskmanager.repository.UserRepository;
import com.taskmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    //Constructor injection for UserRepository
    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User register(CreateUserRequest req) {
        User user = new User();
        user.setFirstName(req.getFirstName());
        user.setLastName(req.getLastName());
        user.setPassword(req.getPassword());
        user.setEmail(req.getEmail());
        return userRepository.save(user);
    }
    @Override
    public List<CreateUserRequest> getAllUsers() {
        return userRepository.findAll().stream()
                .map(user -> new CreateUserRequest(
                        user.getFirstName(),
                        user.getLastName(),
                        user.getEmail(),
                        user.getPassword()
                ))
                .toList();
    }

    @Override
    public Optional<User> getUserById(Long id) {
        return Optional.ofNullable(userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id: " + id)));
    }

    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }
}