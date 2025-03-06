package com.bookhub.book.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookhub.book.entity.Author;

public interface AuthorRepository extends MongoRepository<Author, String> {

}
