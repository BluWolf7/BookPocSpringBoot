package com.secretmanagerpocv2.secretmanagerpocv2.repository;

import com.secretmanagerpocv2.secretmanagerpocv2.models.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book, String> {
}
