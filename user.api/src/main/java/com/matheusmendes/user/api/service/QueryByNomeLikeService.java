package com.matheusmendes.user.api.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.matheusmendes.user.api.dto.UserDTO;
import com.matheusmendes.user.api.model.User;
import com.matheusmendes.user.api.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QueryByNomeLikeService {
 private final UserRepository userRepository;
 
 public List<UserDTO> execute(String nome){
   List<User> users = userRepository.queryByNomeLike(nome);
    return users
    .stream()
    .map(UserDTO::convert)
    .collect(Collectors.toList());
 }
}
