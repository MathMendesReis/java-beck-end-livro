package com.matheusmendes.product.api.controller;

import java.util.UUID;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusmendes.product.api.dto.ProductDTO;
import com.matheusmendes.product.api.model.Product;
import com.matheusmendes.product.api.service.EditProductService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class EditProductController {
    
    private final EditProductService editProductService;

    public void seedProducts(){
        Product product = new Product();
    }
    
    @PostMapping("/{id}")
    public ProductDTO execute(@PathVariable UUID producUuid, @RequestBody ProductDTO productDTO){
        return editProductService.execute(producUuid, productDTO);
    }
}
