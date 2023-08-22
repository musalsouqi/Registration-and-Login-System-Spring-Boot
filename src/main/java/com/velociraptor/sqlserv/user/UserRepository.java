package com.velociraptor.sqlserv.user;


import com.velociraptor.sqlserv.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    // You can add custom query methods here if needed
}