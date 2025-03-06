package com.bookhub.book.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bookhub.book.dto.BookRequest;
import com.bookhub.book.dto.BookResponse;
import com.bookhub.book.entity.Book;
import com.bookhub.book.repository.BookRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class BookService {

	private final BookRepository bookRepository;
	
	public BookResponse createBook(BookRequest bookRequest) {
		Book book = Book.builder()
				.isbn(bookRequest.isbn())
				.title(bookRequest.title())
				.author(bookRequest.author())
				.publisher(bookRequest.publisher())
				.publishingDate(bookRequest.publishingDate())
				.language(bookRequest.language())
				.description(bookRequest.description())
				.build();
		bookRepository.save(book);
		return new BookResponse(
				book.getIsbn(), 
				book.getTitle(), 
				book.getAuthor(), 
				book.getPublisher(),
				book.getPublishingDate(), 
				book.getLanguage(), 
				book.getDescription());
	}

	public List<BookResponse> getBooks() {
		return bookRepository.findAll()
				.stream()
				.map(book -> new BookResponse(
                        book.getIsbn(),
                        book.getTitle(),
                        book.getAuthor(),
                        book.getPublisher(),
                        book.getPublishingDate(),
                        book.getLanguage(),
                        book.getDescription()
                ))
				.toList();
	}
}
