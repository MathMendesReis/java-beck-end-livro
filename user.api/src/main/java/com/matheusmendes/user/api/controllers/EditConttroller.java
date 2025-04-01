package com.matheusmendes.user.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusmendes.user.api.dto.UserDTO;
import com.matheusmendes.user.api.service.EditService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.UUID;

import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class EditConttroller {
    private final EditService editService;
    @PatchMapping("/{id}")
    public UserDTO handle(@PathVariable String id, @RequestBody UserDTO userDTO) {
        return editService.execute(UUID.fromString(id), userDTO);
    }
}
