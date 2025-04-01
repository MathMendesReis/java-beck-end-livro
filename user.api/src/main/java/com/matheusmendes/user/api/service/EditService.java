package com.matheusmendes.user.api.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.matheusmendes.user.api.dto.UserDTO;
import com.matheusmendes.user.api.model.User;
import com.matheusmendes.user.api.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EditService {
    
    private final UserRepository userRepository;

    public UserDTO execute(UUID userId, UserDTO userDTO){
        User usr = userRepository.findById(userId).orElseThrow(()->new RuntimeException());

        if(userDTO.getNome() !=null && !usr.getNome().equals(userDTO.getNome())){
            usr.setNome(userDTO.getNome());
        }
        if(userDTO.getCpf() !=null && !usr.getCpf().equals(userDTO.getCpf())){
            usr.setCpf(userDTO.getCpf());
        }
        if(userDTO.getTelefone() !=null && !usr.getTelefone().equals(userDTO.getTelefone())){
            usr.setTelefone(userDTO.getTelefone());
        }
        if(userDTO.getEndereco() !=null && !usr.getEndereco().equals(userDTO.getEndereco())){
            usr.setEndereco(userDTO.getEndereco());
        }

        userRepository.save(usr);

        return UserDTO.convert(usr);

    };
}
