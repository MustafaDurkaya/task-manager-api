package com.taskmanager.service;

import com.taskmanager.dto.CreateUserRequest;
import com.taskmanager.entity.User;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    User createUser(User user);

    CreateUserRequest register(CreateUserRequest req);
    List<CreateUserRequest> getAllUsers();
    Optional<User> getUserById(Long id);
}
