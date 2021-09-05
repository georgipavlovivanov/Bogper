package com.example.msbogper.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.msbogper.dto.BookDTO;
import com.example.msbogper.jooq.schemabooks.tables.pojos.Book;
import com.example.msbogper.mapper.BookMapper;
import com.example.msbogper.service.BookService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class BookController {

	private final BookService bookService;

	@Autowired
	public BookController(BookService bookService) {
		this.bookService = bookService;
	}

	// some how to list all books
	@GetMapping(value = "/allBooks")
	public ResponseEntity<List<BookDTO>> getAllBook() {
			
		log.info("called - getALlBooks()-BookCOntroller");
		
		// invoke service to get ALl books from DB
		List<Book> books = bookService.getAllBooks();

		// retunr result must make filtration of data - need to use make mapper give
		BookMapper bookMapper = new BookMapper();

		return new ResponseEntity(bookMapper.bookPojoToBookDto(books), HttpStatus.OK);
//		return bookMapper.bookPojoToBookDto(books);
	}

}
