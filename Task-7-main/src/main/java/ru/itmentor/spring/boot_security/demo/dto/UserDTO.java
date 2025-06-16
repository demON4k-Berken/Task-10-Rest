package ru.itmentor.spring.boot_security.demo.dto;

import lombok.Data;

import java.util.Set;

@Data
public class UserDTO {
    private Long id;
    private String username;
    private String firstName;
    private String lastName;
    private Integer age;
    private String email;
    private Set<String> roles;
}
