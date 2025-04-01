package com.matheusmendes.user.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusmendes.user.api.dto.UserDTO;
import com.matheusmendes.user.api.service.QueryByNomeLikeService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class QueryByNomeLikeController {
    private final QueryByNomeLikeService queryByNomeLikeService;

    @GetMapping("/search")
    public List<UserDTO> execute(@RequestParam(name = "nome",required = true) String param) {
        return queryByNomeLikeService.execute(param);
    }
    
}
