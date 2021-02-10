package com.fridaynext.cp2077companion.repository;


import com.fridaynext.cp2077companion.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Custom CRUD functionality for User objects can go here

    public User findByUsername(String username);
}
