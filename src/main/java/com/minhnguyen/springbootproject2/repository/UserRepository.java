package com.minhnguyen.springbootproject2.repository;


import com.minhnguyen.springbootproject2.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    // Custom query methods if needed
}