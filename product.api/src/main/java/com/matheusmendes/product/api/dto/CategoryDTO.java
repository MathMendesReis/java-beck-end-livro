package com.matheusmendes.product.api.dto;

import java.util.UUID;

import com.matheusmendes.product.api.model.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CategoryDTO {
    private UUID id;
    private String nome;

    public static CategoryDTO convert(Category cat){
        CategoryDTO c = new CategoryDTO();
        c.setId(cat.getId());
        c.setNome(cat.getNome());
        return c;
    }
}
