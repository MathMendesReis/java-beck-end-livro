package com.matheusmendes.product.api.model;

import java.util.UUID;

import com.matheusmendes.product.api.dto.ProductDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Table(name = "tb_products")
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String productIdentifier;
    private String nome;
    private Double preco;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;



     public static Product convert(ProductDTO product){
        Product prod = new Product();
        prod.setId(product.getId());
        prod.setProductIdentifier(product.getProductIdentifier());
        prod.setNome(product.getNome());
        prod.setPreco(product.getPreco());
        if(product.getCategory() != null){
            prod.setCategory(Category.convert(product.getCategory()));
        }
        return prod;
    }

}
