package com.matheusmendes.product.api.model;

import java.util.UUID;

import com.matheusmendes.product.api.dto.CategoryDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_category")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String nome;


    public static Category convert(CategoryDTO cat){
        Category c = new Category();
        c.setId(cat.getId());
        c.setNome(cat.getNome());
        return c;
    }
}
