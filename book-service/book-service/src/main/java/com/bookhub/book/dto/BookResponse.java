package com.bookhub.book.dto;

import java.util.Date;

import com.bookhub.book.entity.Language;

public record BookResponse(
	String isbn,
	String title,
	String author,
	String publisher,
	Date publishingDate,
	Language language,
	String description
) {}
