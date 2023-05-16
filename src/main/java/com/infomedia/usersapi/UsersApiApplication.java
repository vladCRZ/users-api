package com.infomedia.usersapi;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Spring Boot REST API Documentation B",
                description = "Spring Boot REST API Documentation B",
                version = "v1.0",
                contact = @Contact(
                        name = "Sergio",
                        email = "sergio@gmail.com",
                        url = "https://www.vlad.net"
                ),
                license = @License(
                        name = "Apache 2.0",
                        url = "https://www.vlad.net/license"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Spring Boot User Management Documentation A",
                url = "https://www.vlad.net/user_management.html"
        )
)
public class UsersApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(UsersApiApplication.class, args);
    }

}
