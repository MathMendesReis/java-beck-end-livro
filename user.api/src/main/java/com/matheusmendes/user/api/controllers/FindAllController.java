package com.matheusmendes.user.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusmendes.user.api.dto.UserDTO;
import com.matheusmendes.user.api.service.FindAllService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class FindAllController {
    private final FindAllService getAllUsersService;
    @GetMapping()
    public List<UserDTO> hello(){
        return getAllUsersService.execute();
    }
}
