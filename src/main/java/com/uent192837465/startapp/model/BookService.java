package com.uent192837465.startapp.model;


import java.time.LocalDate;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Service;

import com.uent192837465.startapp.data.Book;

@Service
public class BookService {
	private final Map<String,Book> bookRepository = new ConcurrentHashMap<>();

	/*
	 * Bean構築後に呼ばれる。bookRepositoryを準備する
	 */
	@PostConstruct
	public void loadDummyData() {
		Book book = new Book();
		book.setBookID("000-000-000");
		book.setName("オーバーロード11巻");
		book.setPublishDate(LocalDate.of(2019, 2, 26));
		bookRepository.put(book.getBookID(), book);
	}

	public Book find(String bookId) {
		Book book = bookRepository.get(bookId);
		return book;
	}

}
