package com.bookhub.book.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.bookhub.book.entity.Book;

public interface BookRepository extends MongoRepository<Book, String> {

}
