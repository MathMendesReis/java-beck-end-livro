package com.matheusmendes.product.api.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matheusmendes.product.api.model.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, UUID>{
    
}
