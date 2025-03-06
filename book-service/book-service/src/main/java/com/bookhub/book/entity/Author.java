package com.bookhub.book.entity;

import java.util.Date;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(value = "author")
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Author {

	@Indexed(unique = true)
	private String fullname;
	private Date birthdate;
	private Language language;
	private Country country;
	private Genre genre;
}
