package com.matheusmendes.product.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusmendes.product.api.dto.CategoryDTO;
import com.matheusmendes.product.api.model.Category;
import com.matheusmendes.product.api.repository.CategoryRepository;

import jakarta.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/category")
@RequiredArgsConstructor
public class SaveCategoryController {

    private final CategoryRepository categoryRepository;

 
    
    @PostMapping()
    public CategoryDTO execute(@RequestBody CategoryDTO categoryDTO) {
       categoryDTO.setNome(categoryDTO.getNome().toLowerCase());
       Category cat = categoryRepository.save(Category.convert(categoryDTO));
       return CategoryDTO.convert(cat);
    }
    
}
