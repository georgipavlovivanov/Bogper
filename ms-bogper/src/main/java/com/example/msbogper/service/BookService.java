package com.example.msbogper.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.msbogper.jooq.schemabooks.tables.pojos.Book;
import com.example.msbogper.repository.BookRepository;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class BookService {

	private final BookRepository bookRepository;
	
	@Autowired
	public BookService(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	public List<Book> getAllBooks() {
		log.info("called - getALlBooks()-BookService");
		List<Book> books = bookRepository.getAllBooks();
		// invoke DB to get Data
		return (books == null) ? Collections.emptyList() : books ;
	}

}
