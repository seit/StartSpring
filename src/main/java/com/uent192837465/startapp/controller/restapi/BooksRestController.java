package com.uent192837465.startapp.controller.restapi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.uent192837465.startapp.controller.HomeController;
import com.uent192837465.startapp.controller.restapi.resource.BookResource;
import com.uent192837465.startapp.data.Book;
import com.uent192837465.startapp.model.BookService;

@RestController
@RequestMapping("books")
public class BooksRestController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	BookService bookService;

	@RequestMapping(value = "{bookId}", method = RequestMethod.GET)
	public BookResource getBook(@PathVariable String bookId) {
		logger.info("getBook()", "bookId");

		Book book = bookService.find(bookId);
		BookResource resource = new BookResource();
		resource.setBookID(book.getBookID());
		resource.setName(book.getName());
		resource.setPublishDate(book.getPublishDate());
		return resource;

	}

}
