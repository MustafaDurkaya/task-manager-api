package com.taskmanager.dto;

import com.taskmanager.enums.Role;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class CreateUserRequest {

    @NotBlank
    @Size(min = 3, max = 16)
    private String firstName;
    @NotBlank
    @Size(min = 3, max = 16)
    private String lastName;
    @NotBlank
    @Size(min = 6, max = 16)
    private String password;
    @Email
    @NotBlank
    private String email;
    private Role role = Role.USER;
}
