package com.example.msbogper.repository.impl;

import java.util.List;

import static org.jooq.impl.DSL.*;
import org.jooq.DSLContext;
import org.jooq.Record1;
import org.jooq.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.msbogper.jooq.schemabooks.Tables;
import com.example.msbogper.jooq.schemabooks.tables.pojos.Book;
import com.example.msbogper.repository.BookRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j // give logs
@Repository
public class JooqBookRepository implements BookRepository {

	@Autowired
	private DSLContext dslContext;

	public JooqBookRepository(DSLContext dslConetext) {
		this.dslContext = dslConetext;
	}

	@Override
	public List<Book> getAllBooks() {
//		dslContext.select(Tables.BOOK.fields()).from(Tables.BOOK).fetchInto(Book.class);
		
		log.info("get all records called" );
		return dslContext.selectFrom(Tables.BOOK).fetchInto(Book.class);
		
		
	}

	@Override
	public List<Book> getBooksByAuthor(String author) {
		log.info("called - getBooksByAuthor-JooqRepository");
	List<Book> bookByAuthor = 	dslContext.selectFrom(Tables.BOOK)
												   .where(Tables.BOOK.AUTHOR.eq(author))
												   .fetchInto(Book.class);
		
	return bookByAuthor;
	}

	@Override
	public List<Book> getAllTitleWhitWord(String word) {
		
		log.info("called- getAllTitleWhitWord-JooqRepository");
		
		List<Book> booksContentTitle = dslContext.selectFrom(Tables.BOOK)
										.where(Tables.BOOK.BOOK_NAME.likeIgnoreCase("%" + word + "%"))
										.fetchInto(Book.class);
		return booksContentTitle;
	}
	
	
	@Override
	public 	List<Book> getBookWhitMostPages() {
		log.info("called- getBookWhitMostPages-JooqRepository");
			
		Record1<Integer> bookMaxPages = dslContext.select(max(Tables.BOOK.NUMBER_OF_PAGES))
		   .from(Tables.BOOK).fetchOne();
		
	List<Book> book =	dslContext.selectFrom(Tables.BOOK)
				  .where(Tables.BOOK.NUMBER_OF_PAGES
				  .eq(dslContext.select(max(Tables.BOOK.NUMBER_OF_PAGES))
				  .from(Tables.BOOK).fetchOne().value1()))
				  .fetchInto(Book.class);
//					System.out.println(book);	
		return book;
	}

	@Override
	public Book getBookByAuthorWhitMaxPages(String author) {
		
		// get all books by author
		List<Book> booksFromAuthor = this.getBooksByAuthor(author);
		Book book = null;
		int maxPages = 0;
			if(!booksFromAuthor.isEmpty()) {
				// find max pages book
				
				 book = booksFromAuthor.get(0);
				 maxPages = book.getNumberOfPages();
				
				for(Book nextBook : booksFromAuthor) {
					int pages = nextBook.getNumberOfPages();
					if(maxPages <= pages) {
						maxPages = pages;
						book = nextBook;
					}
				}
				return book;
			}
		
		
		return null;
	}

	@Override
	public Book getMostForwardReadingBook() {
	
			List<Book> books =	dslContext.select().from(Tables.BOOK).fetchInto(Book.class);;
			
				double maxPercentage = 0;
				int totalPages = 0;
				int percentBase = 100;
				Book book = null;
				
				for(Book nextBook:books) {
					totalPages = nextBook.getNumberOfPages();
					double currentPercentage = (nextBook.getCurrentPage() /(double) totalPages) * percentBase;
//					System.out.println(nextBook + "-" + currentPercentage);
					if(currentPercentage > maxPercentage) {
						maxPercentage = currentPercentage;
						book = nextBook;
					}
				}
			
		return book;
	}
	
}
