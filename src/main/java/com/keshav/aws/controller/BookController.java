package com.keshav.aws.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.keshav.aws.repository.BookRepository;
import com.keshav.aws.util.Book;

@RestController
public class BookController {

	@Autowired
	private BookRepository bookRepo;
	
	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
		return bookRepo.getAllBooks();
		
	}
	
	@GetMapping("/books")
	public Book getBookByID(@RequestParam("bookID") int bookID)
	{
		return bookRepo.getAllBooks().stream().filter(e -> e.getBookID()==bookID).findAny().get();
		
	}
}
