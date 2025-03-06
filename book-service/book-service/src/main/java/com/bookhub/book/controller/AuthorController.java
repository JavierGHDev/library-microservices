package com.bookhub.book.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bookhub.book.dto.AuthorRequest;
import com.bookhub.book.dto.AuthorResponse;
import com.bookhub.book.service.AuthorService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/author")
@RequiredArgsConstructor
public class AuthorController {

	private final AuthorService authorService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public AuthorResponse createAuthor(@RequestBody AuthorRequest authorRequest) {
		return authorService.createAuthor(authorRequest);
	}
	
	@GetMapping
	@ResponseStatus(HttpStatus.OK)
	public List<AuthorResponse> getAuthors() {
		return authorService.getAuthors();
	}
}
