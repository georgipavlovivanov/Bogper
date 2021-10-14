package com.example.msbogper.service;

import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.msbogper.jooq.schemabooks.tables.pojos.Book;
import com.example.msbogper.repository.BookRepository;

import jdk.internal.org.jline.utils.Log;
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

	public List<Book> getAllBookByAuthor(String author) {
		log.info("called - getAllBookByAuthor()-BookService");
			// invoke our repository to get book from this author
		List<Book>	booksByAuthor = bookRepository.getBooksByAuthor(author);
		// invoke DB to  get Data
		return (booksByAuthor == null) ? Collections.emptyList() : booksByAuthor; 
		
	}

	
	public List<Book> getAllBooksContentInTitleWord(String word) {
		log.info("called - getAllBookByAuthor()-BookService");
		List<Book> booksContentInTitleWord = bookRepository.getAllTitleWhitWord(word);
		
		return (booksContentInTitleWord == null) ? Collections.emptyList() : booksContentInTitleWord; 
		
	}
	
	
	public List<Book> getBookWhitMostPages(){
		log.info("called - getBookWhitMostPages()-BookService");
		List<Book> bookMostPages = bookRepository.getBookWhitMostPages();
		
		return (bookMostPages == null) ? Collections.emptyList() : bookMostPages; 
		
	}
	
	
	public Book getBookByAuthorWhitMostPages(String author) {
		
		Book book = bookRepository.getBookByAuthorWhitMaxPages(author);
		 
		 return book;
	}
	
	public Book  getBooksProgressOfReading() {
		Book book = bookRepository.getMostForwardReadingBook();
		
		return book;
	}
}
