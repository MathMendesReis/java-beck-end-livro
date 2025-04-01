package com.matheusmendes.user.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusmendes.user.api.dto.UserDTO;
import com.matheusmendes.user.api.service.SaveService;

import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
public class SaveController {
    private final SaveService insertUserService;
    @PostMapping()
    public UserDTO handle(@RequestBody UserDTO entity) {
      return  insertUserService.execute(entity);
    }
    
}
