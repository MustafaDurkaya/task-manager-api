package com.taskmanager.service;

import com.taskmanager.dto.CreateUserRequest;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public interface UserService {
    CreateUserRequest register(CreateUserRequest req);
    List<CreateUserRequest> getAllUsers();
    CreateUserRequest getUserById(Long id);
}
