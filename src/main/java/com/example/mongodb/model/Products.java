package com.example.mongodb.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@Document("product")
public class Products {
    @Id
    private String id;
    @Field("name")
    private String name;
    @Field("description")
    private String description;
}
