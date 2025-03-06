package com.bookhub.book.entity;

import java.util.Date;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(value = "book")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Book {

	@Indexed(unique = true)
	private String isbn;
	private String title;
	private String author;
	private String publisher;
	private Date publishingDate;
	private Language language;
	private String description;
}
