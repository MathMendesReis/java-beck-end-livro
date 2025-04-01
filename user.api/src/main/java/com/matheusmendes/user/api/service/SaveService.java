package com.matheusmendes.user.api.service;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.matheusmendes.user.api.dto.UserDTO;
import com.matheusmendes.user.api.model.User;
import com.matheusmendes.user.api.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SaveService {
 private final UserRepository userRepository;
 
 public UserDTO execute(UserDTO user){
    user.setDataCadastro(LocalDateTime.now());
    User usr = User.convert(user);
    userRepository.save(usr);
    return UserDTO.convert(usr);
 };
}
