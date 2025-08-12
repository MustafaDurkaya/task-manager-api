package com.taskmanager.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI api() {
        return new OpenAPI().
                info(new Info()
                        .title("Task Manager API")
                        .version("v1")
                        .description("Kullanıcıların kayıt olup giriş yapabileceği, görev oluşturabileceği, yorum \n" +
                                "yazabileceği ve görev/yorumlara fotoğraf ekleyebileceği bir REST API projesi"));
    }
}
