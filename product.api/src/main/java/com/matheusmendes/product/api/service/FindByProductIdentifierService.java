package com.matheusmendes.product.api.service;

import org.springframework.stereotype.Service;

import com.matheusmendes.product.api.dto.ProductDTO;
import com.matheusmendes.product.api.model.Product;
import com.matheusmendes.product.api.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class FindByProductIdentifierService {
        private final ProductRepository productRepository;
        public  ProductDTO execute(String productIdentifier){
            Product product = productRepository.findByProductIdentifier(productIdentifier);
            if(product !=null){
                return ProductDTO.convert(product);
            }
            return null;
        }

}
