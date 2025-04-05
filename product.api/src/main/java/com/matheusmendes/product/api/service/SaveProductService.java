package com.matheusmendes.product.api.service;

import org.springframework.stereotype.Service;

import com.matheusmendes.product.api.dto.ProductDTO;
import com.matheusmendes.product.api.model.Product;
import com.matheusmendes.product.api.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SaveProductService {
    private final ProductRepository productRepository;
    public ProductDTO execute(ProductDTO productDTO){
        Product product = productRepository.save(Product.convert(productDTO));
        return ProductDTO.convert(product);
    }
}
