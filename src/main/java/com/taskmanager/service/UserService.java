package com.taskmanager.service;

import com.taskmanager.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User createUser(User user);
}
