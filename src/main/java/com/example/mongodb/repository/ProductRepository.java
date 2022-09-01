package com.example.mongodb.repository;

import com.example.mongodb.model.Products;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends MongoRepository<Products, String> {
    public List<Products> findAllBy();
}
