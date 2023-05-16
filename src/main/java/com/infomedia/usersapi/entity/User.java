package com.infomedia.usersapi.entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Schema(
        description = "UserDto Model Information"
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Schema(
            description = "User First Name"
    )
    @Column(nullable = false)
    private String firstName;
    @Schema(
            description = "User Last Name"
    )
    @Column(nullable = false)
    private String lastName;
    @Schema(
            description = "User Email Address"
    )
    @Column(nullable = false, unique = true)
    private String email;
}