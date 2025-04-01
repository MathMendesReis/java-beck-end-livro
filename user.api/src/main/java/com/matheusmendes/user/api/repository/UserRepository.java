package com.matheusmendes.user.api.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matheusmendes.user.api.model.User;

public interface UserRepository extends JpaRepository<User, UUID>{
    User findByCpf(String cpf);
    List<User> queryByNomeLike(String nome);
}
