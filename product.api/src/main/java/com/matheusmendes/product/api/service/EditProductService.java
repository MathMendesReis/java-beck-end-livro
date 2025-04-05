package com.matheusmendes.product.api.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.matheusmendes.product.api.dto.ProductDTO;
import com.matheusmendes.product.api.model.Product;
import com.matheusmendes.product.api.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class EditProductService {
    private final ProductRepository productRepository;

    public ProductDTO execute(UUID producId, ProductDTO productDTO){
        Product product = productRepository.findById(producId).orElseThrow(()->new RuntimeException());
        if(productDTO.getNome() != null && !productDTO.getNome().equals(product.getNome())){
            product.setNome(productDTO.getNome());
        }
        if(productDTO.getPreco() != null && !productDTO.getPreco().equals(product.getPreco())){
            product.setPreco(productDTO.getPreco());
        }

        productRepository.save(product);
        return ProductDTO.convert(product);
    }
}
