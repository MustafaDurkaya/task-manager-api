package com.taskmanager.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateTaskRequest {
    private String title;
    private String description;

    //@NotBlank(message = "Yorum içeriği boş olamaz.")
    //@Size(max = 500, message = "Yorum 500 karakterden uzun olamaz.")
    private String comment;
}
