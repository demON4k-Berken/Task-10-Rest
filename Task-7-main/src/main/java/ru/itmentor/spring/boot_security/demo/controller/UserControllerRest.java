package ru.itmentor.spring.boot_security.demo.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.itmentor.spring.boot_security.demo.dto.UserDTO;
import ru.itmentor.spring.boot_security.demo.mapper.UserMapper;
import ru.itmentor.spring.boot_security.demo.model.User;
import ru.itmentor.spring.boot_security.demo.service.UserService;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/user")
public class UserControllerRest {
    private final UserService userService;

    @GetMapping
    public ResponseEntity<UserDTO> getUser(@AuthenticationPrincipal User principal) {
        User user = userService.findById(principal.getId()).orElseThrow();
        return ResponseEntity.ok(UserMapper.toDTO(user));
    }
}
