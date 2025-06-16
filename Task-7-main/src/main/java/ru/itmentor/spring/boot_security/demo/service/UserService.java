package ru.itmentor.spring.boot_security.demo.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import ru.itmentor.spring.boot_security.demo.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService extends UserDetailsService {
    void saveUser(User user);

    void deleteUser(Long id);

    Optional<User> findById(Long id);

    List<User> findAllUsers();

    void prepareRoles(User user);
}

