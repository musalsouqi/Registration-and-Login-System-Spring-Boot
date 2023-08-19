package com.velociraptor.sqlserv.subfiles;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        // Implement your business logic here
        // For example, perform validation before saving the user
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        // Implement your business logic here
        // For example, you can add some additional processing
        return userRepository.findAll();
    }

    // Add more service methods as needed
}
