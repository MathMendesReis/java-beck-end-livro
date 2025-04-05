package com.matheusmendes.product.api.dto;

import java.util.UUID;

import com.matheusmendes.product.api.model.Product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {
    private UUID id;
    private String productIdentifier;
    private String nome;
    private Double preco;
    private CategoryDTO category;

    public static ProductDTO convert(Product product){
        ProductDTO prod = new ProductDTO();
        prod.setId(product.getId());
        prod.setProductIdentifier(product.getProductIdentifier());
        prod.setNome(product.getNome());
        prod.setPreco(product.getPreco());
        if(product.getCategory() != null){
            prod.setCategory(CategoryDTO.convert(product.getCategory()));
        }
        return prod;
    }
}
