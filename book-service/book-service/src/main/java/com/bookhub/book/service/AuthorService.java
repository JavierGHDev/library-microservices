package com.bookhub.book.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bookhub.book.dto.AuthorRequest;
import com.bookhub.book.dto.AuthorResponse;
import com.bookhub.book.entity.Author;
import com.bookhub.book.repository.AuthorRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthorService {

	private final AuthorRepository authorRepository;
	
	public AuthorResponse createAuthor(AuthorRequest authorRequest) {
		Author author = Author.builder()
				.fullname(authorRequest.fullname())
				.birthdate(authorRequest.birthdate())
				.country(authorRequest.country())
				.language(authorRequest.language())
				.genre(authorRequest.genre())
				.build();
		authorRepository.save(author);
		return new AuthorResponse(
					author.getFullname(),
					author.getBirthdate(),
					author.getLanguage(),
					author.getCountry(),
					author.getGenre()
				);
	}

	public List<AuthorResponse> getAuthors() {
		return authorRepository.findAll()
				.stream()
				.map(author -> new AuthorResponse(
						author.getFullname(),
						author.getBirthdate(),
						author.getLanguage(),
						author.getCountry(),
						author.getGenre()
                ))
				.toList();
	}
}
