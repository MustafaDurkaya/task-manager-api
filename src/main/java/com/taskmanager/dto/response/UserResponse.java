package com.taskmanager.dto.response;

import com.taskmanager.enums.Role;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserResponse {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private Role role;

    public UserResponse(Long id, String firstName, String lastName, String email,  Role role) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.role = Role.USER;
    }
}
