package com.bookhub.book.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bookhub.book.dto.BookRequest;
import com.bookhub.book.dto.BookResponse;
import com.bookhub.book.service.BookService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/book")
@RequiredArgsConstructor
public class BookController {

	private final BookService bookService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public BookResponse createBook(@RequestBody BookRequest bookRequest) {
		return bookService.createBook(bookRequest);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<BookResponse> getBooks() {
		return bookService.getBooks();
	}
}
