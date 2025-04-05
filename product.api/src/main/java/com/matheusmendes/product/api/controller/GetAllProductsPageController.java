package com.matheusmendes.product.api.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusmendes.product.api.dto.ProductDTO;
import com.matheusmendes.product.api.service.GetAllPageService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/product")
@RequiredArgsConstructor
public class GetAllProductsPageController {
    private final GetAllPageService getAllPageService;

    @GetMapping("/pageable")
    public Page<ProductDTO> handle(Pageable page){
        return getAllPageService.execute(page);
    }
}
