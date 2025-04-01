package com.matheusmendes.user.api.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.matheusmendes.user.api.model.User;
import com.matheusmendes.user.api.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class DeleteService {
    private final UserRepository userRepository;

    public void execute(UUID userId){
        User user = userRepository.findById(userId).orElseThrow(()->new RuntimeException());
        userRepository.delete(user);
    };
}
