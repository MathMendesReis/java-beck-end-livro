package com.matheusmendes.user.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusmendes.user.api.dto.UserDTO;
import com.matheusmendes.user.api.service.FindByCpfService;

import lombok.RequiredArgsConstructor;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class FindByCpfController {
    private final FindByCpfService findByCpfService;
    
    @GetMapping("/{cpf}/cpf")
    public UserDTO handle(@PathVariable String cpf){
        return findByCpfService.execute(cpf);
    }
}
