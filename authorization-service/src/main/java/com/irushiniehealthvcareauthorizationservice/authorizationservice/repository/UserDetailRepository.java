package com.irushiniehealthvcareauthorizationservice.authorizationservice.repository;

import com.irushiniehealthvcareauthorizationservice.authorizationservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserDetailRepository extends JpaRepository<User, Integer> {
    Optional<User> findByUsername(String name);
}
