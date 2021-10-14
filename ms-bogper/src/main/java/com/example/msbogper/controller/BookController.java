package com.example.msbogper.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.msbogper.dto.BookDTO;
import com.example.msbogper.jooq.schemabooks.tables.pojos.Book;
import com.example.msbogper.mapper.BookMapper;
import com.example.msbogper.service.BookService;

import jdk.internal.org.jline.utils.Log;
import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class BookController {

	private final BookService bookService;
	
	private final BookMapper bookMapper;
	
	@Autowired
	public BookController(BookService bookService, BookMapper bookMapper) {
		this.bookService = bookService;
		this.bookMapper = bookMapper;
	}

	// list all books
	@GetMapping(value = "/books")
	public ResponseEntity<List<BookDTO>> getAllBook() {
			
		log.info("called - getALlBooks()-BookCOntroller");
		
		// invoke service to get ALl books from DB
		List<Book> books = bookService.getAllBooks();

		// retunr result must make filtration of data - need to use make mapper give
//	BookMapper	 bookMapper = new BookMapper();

		return new ResponseEntity(bookMapper.bookPojoToBookDto(books), HttpStatus.OK);
//		return bookMapper.bookPojoToBookDto(books);
	}

	@GetMapping(value = "/author-books")
	public ResponseEntity<List<BookDTO>> getAllBooksyAuthor(@RequestParam String author) {
		
		
		log.info("called - getAllBookByAuthor-BookController");
		// invoke service to search for author books
		List<Book> books = bookService.getAllBookByAuthor(author);
		
		// return response to visualization before that make dto transformation(filter data to represent to client)
		return new ResponseEntity<>(bookMapper.bookPojoToBookDto(books), HttpStatus.OK);
	}
	
	@GetMapping(value = "/books-word")
	public ResponseEntity<List<BookDTO>> getAllBooksContentWordInTitle(@RequestParam String word){
		
		// invoke service to ask for books
		List<Book> booksContentInTitleWord =	bookService.getAllBooksContentInTitleWord(word);
		
		
		return new  ResponseEntity<>(bookMapper.bookPojoToBookDto(booksContentInTitleWord), HttpStatus.OK);
	}
	
	@GetMapping(value = "/book-max-pages")
	public  ResponseEntity<List<BookDTO>> getBookWhitMostPages(){
		List<Book> bookMaxPages = bookService.getBookWhitMostPages();
		
		return new  ResponseEntity<>(bookMapper.bookPojoToBookDto(bookMaxPages), HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/book-author-max-pages")
	public  ResponseEntity<List<BookDTO>> getBookByAuthorWhitMostPages(@RequestParam String author){

			Book book =	bookService.getBookByAuthorWhitMostPages(author);
			List<Book> books = null;
				if(book != null) {
					books = new ArrayList<>();
					books.add(book);
				}
				
			return new 	ResponseEntity<>(bookMapper.bookPojoToBookDto(books),HttpStatus.OK);
	}
	
	
	@GetMapping(value = "/book- most - reading - pages")
	public ResponseEntity<List<BookDTO>> getBookWhitMostReadingPages(){
		
		Book book = bookService.getBooksProgressOfReading();
		List<Book> books = null;
		if(book != null) {
			books = new ArrayList<>();
			books.add(book);
		}
		return new ResponseEntity<>(bookMapper.bookPojoToBookDto(books),HttpStatus.OK);
	}
	
}
