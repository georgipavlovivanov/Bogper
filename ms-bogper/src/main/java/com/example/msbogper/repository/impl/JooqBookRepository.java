package com.example.msbogper.repository.impl;

import java.util.List;

import org.jooq.DSLContext;
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

}
