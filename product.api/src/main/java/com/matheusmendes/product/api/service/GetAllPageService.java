package com.matheusmendes.product.api.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.matheusmendes.product.api.dto.ProductDTO;
import com.matheusmendes.product.api.model.Product;
import com.matheusmendes.product.api.repository.ProductRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class GetAllPageService {
    private final ProductRepository productRepository;
    
     public Page<ProductDTO> execute(Pageable page){
        Page<Product>  products = productRepository.findAll(page);
        return products.map(ProductDTO::convert);
    }
    
}
