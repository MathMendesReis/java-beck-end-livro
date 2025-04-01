package com.matheusmendes.user.api.service;

import org.springframework.stereotype.Service;

import com.matheusmendes.user.api.dto.UserDTO;
import com.matheusmendes.user.api.model.User;
import com.matheusmendes.user.api.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FindByCpfService {
    private final UserRepository userRepository;
    public UserDTO execute(String cpf){
        User user = userRepository.findByCpf(cpf);
        if(user != null){
            return UserDTO.convert(user);   
        }
        return null;
    }
}
