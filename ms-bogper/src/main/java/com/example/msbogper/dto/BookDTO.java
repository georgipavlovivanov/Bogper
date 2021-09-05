package com.example.msbogper.dto;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BookDTO {
	private String title;
	private String author;
	private String description;
	private int year;
	
	public BookDTO(String title, String author, String description, int year) {
		this.title = title;
		this.author = author;
		this.description= description;
		this.year = year;
	}
	
}
