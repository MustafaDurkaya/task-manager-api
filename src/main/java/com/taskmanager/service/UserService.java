package com.taskmanager.service;

import com.taskmanager.dto.request.CreateUserRequest;
import com.taskmanager.entity.User;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public interface UserService {
    CreateUserRequest register(CreateUserRequest req);
    List<CreateUserRequest> getAllUsers();

    User createUser(User user);

    Optional<User> getUserById(Long id);
}
