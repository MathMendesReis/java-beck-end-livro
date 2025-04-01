package com.matheusmendes.user.api.controllers;

import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusmendes.user.api.service.DeleteService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class DeleteController {
    private final DeleteService deleteService;
    @DeleteMapping("/{id}")
    public void handle(@PathVariable String id){
        deleteService.execute(UUID.fromString(id));
    }
}
