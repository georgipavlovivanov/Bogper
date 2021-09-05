package com.example.msbogper.repository;

import java.util.List;

import com.example.msbogper.jooq.schemabooks.tables.pojos.Book;

public interface BookRepository {

	public List<Book> getAllBooks();
}
