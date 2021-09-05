package com.example.msbogper.mapper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.util.CollectionUtils;

import com.example.msbogper.dto.BookDTO;
import com.example.msbogper.jooq.schemabooks.tables.pojos.Book;


public class BookMapper {
	
	public List<BookDTO> bookPojoToBookDto(List<Book> src){
		if(CollectionUtils.isEmpty(src)) {
			return Collections.emptyList();
		}
		
		List<BookDTO> bookDtos = new ArrayList<>();
		
		for(Book book : src) {
			BookDTO bookDto = new BookDTO(book.getBookName(), book.getAuthor(), book.getBookStatusDecsription(), book.getYear());
			bookDtos.add(bookDto);
		}
		
		return bookDtos;
	}
	
}
