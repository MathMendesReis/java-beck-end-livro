package com.matheusmendes.user.api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusmendes.user.api.model.User;

public interface UserRepository extends JpaRepository<User, UUID>{
    
}
