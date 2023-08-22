package com.velociraptor.sqlserv.user;

import com.velociraptor.sqlserv.user.User;
import com.velociraptor.sqlserv.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/api/users")
    public String login(
            @RequestParam String username,
            @RequestParam String password) {
        User user = userRepository.findByUsername(username);
        if (user == null || !user.getPassword().equals(password)) {
            return "Login failed";
        }
        return "Login successful";
    }
    @PostMapping("/api/register")
    public ResponseEntity<String> register(
            @RequestParam String username,
            @RequestParam String password,
            @RequestParam String email) {
        User existingUser = userRepository.findByUsername(username);
        if (existingUser != null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Username already exists");
        }

        User newUser = new User(username, password, email);
        userRepository.save(newUser);

        return ResponseEntity.ok("Registration successful");
    }
    @PostMapping("/api/register2")
    public ResponseEntity<String> register2(
            @RequestParam String username,
            @RequestParam String password,
            @RequestParam String email) {
        User existingUser = userRepository.findByUsername(username);
        if (existingUser != null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Username already exists");
        }

        User newUser = new User(username, password, email);
        userRepository.save(newUser);

        return ResponseEntity.ok("Registration successful");
    }
}