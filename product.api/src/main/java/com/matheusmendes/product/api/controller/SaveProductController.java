package com.matheusmendes.product.api.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusmendes.product.api.dto.ProductDTO;
import com.matheusmendes.product.api.service.SaveProductService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class SaveProductController {
    private final SaveProductService saveProductService;

    @PostMapping()
    public ProductDTO handle(@RequestBody ProductDTO productDTO){
        return saveProductService.execute(productDTO);
    }
}
