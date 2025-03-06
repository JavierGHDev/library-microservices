package com.bookhub.book.dto;

import java.util.Date;

import com.bookhub.book.entity.Country;
import com.bookhub.book.entity.Genre;
import com.bookhub.book.entity.Language;

public record AuthorResponse(
	String fullname,
	Date birthdate,
	Language language,
	Country country,
	Genre genre
) {}
