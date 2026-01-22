package com.gnaneswar.employeemanagementsystem.controller;

import com.gnaneswar.employeemanagementsystem.security.JwtUtil;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {

    private final JwtUtil jwtUtil;

    // Constructor Injection (IMPORTANT)
    public AuthController(JwtUtil jwtUtil) {
        this.jwtUtil = jwtUtil;
    }

    @PostMapping("/login")
    public Map<String, String> login(
            @RequestParam String username,
            @RequestParam String password) {

        Map<String, String> response = new HashMap<>();

        if (!"admin".equals(username) || !"admin123".equals(password)) {
            response.put("error", "Invalid credentials");
            return response;
        }

        String token = jwtUtil.generateToken(username);
        response.put("token", token);
        return response;
    }
}