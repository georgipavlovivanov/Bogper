package com.example.msbogper.repository;

import java.util.List;

import com.example.msbogper.jooq.schemabooks.tables.pojos.Book;




public interface BookRepository {

	public List<Book> getAllBooks();

	public List<Book> getBooksByAuthor(String author);
	
	public List<Book> getAllTitleWhitWord(String word);
	
	public List<Book> getBookWhitMostPages();
	
	public Book getBookByAuthorWhitMaxPages(String author);
	
	public Book getMostForwardReadingBook();
}
