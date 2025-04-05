package com.matheusmendes.product.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusmendes.product.api.dto.ProductDTO;
import com.matheusmendes.product.api.service.GetAllService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class GetProductsController {
    private final GetAllService getAllService;
    @GetMapping()
    public List<ProductDTO> handle() {
        return getAllService.execute();
    }
    
}
