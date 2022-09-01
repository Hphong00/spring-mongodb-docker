package com.example.mongodb.controller;

import com.example.mongodb.model.Products;
import com.example.mongodb.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/mongodb")
public class ProductController {
    @Autowired
    public final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = "/product")
    public ResponseEntity<List<Products>> getAll() {
        return ResponseEntity.ok().body(productService.getAll());
    }

    @PostMapping(value = "/product")
    public ResponseEntity<Products> create(Products product) {
        return ResponseEntity.ok().body(productService.create(product));
    }
}
