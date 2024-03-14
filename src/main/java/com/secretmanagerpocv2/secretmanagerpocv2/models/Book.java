package com.secretmanagerpocv2.secretmanagerpocv2.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "books")
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class Book {
    @Id
    private String id;
    private String title;
    private String author;
    private double price;

}
