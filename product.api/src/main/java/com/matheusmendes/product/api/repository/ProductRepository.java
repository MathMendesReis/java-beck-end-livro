package com.matheusmendes.product.api.repository;

import java.util.List;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.matheusmendes.product.api.model.Product;

public interface ProductRepository extends JpaRepository<Product,UUID>{

    @Query(value = "SELECT p " 
    + "FROM Product p " 
    + "JOIN p.category c " 
    + "WHERE c.id = :categoryId")
    public List<Product> getProductByCategory(@Param("categoryId") UUID categoryId);
    public Product findByProductIdentifier(String productIdentifier);
}
