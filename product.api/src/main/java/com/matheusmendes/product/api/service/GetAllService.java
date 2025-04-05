package com.matheusmendes.product.api.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.matheusmendes.product.api.dto.ProductDTO;
import com.matheusmendes.product.api.model.Product;
import com.matheusmendes.product.api.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GetAllService {
    private final ProductRepository productRepository;
    public List<ProductDTO> execute(){
        List<Product> prods = productRepository.findAll();
        return prods
        .stream()
        .map(ProductDTO::convert)
        .collect(Collectors.toList());
    }
}
