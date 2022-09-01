package com.example.mongodb.service;

import com.example.mongodb.model.Products;
import com.example.mongodb.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Products> getAll(){
        return productRepository.findAllBy();
    };

    public Products create(Products product){
        return productRepository.save(product);
    };
}
