package com.keshav.aws.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.keshav.aws.repository.BookRepository;
import com.keshav.aws.util.Book;

@RestController
public class BookController {
	// Deploy to codebuid aws
	@Autowired
	private BookRepository bookRepo;

	@GetMapping("/books")
	public List<Book> getAllBooks()
	{
		return bookRepo.getAllBooks();

	}
	
	@GetMapping("/welcome")
	public String welcomeMessage()
	{
		
		return "Wecome to book management system !!";
	}
	
	@GetMapping("/books/{id}")
	public Book getBookByID(@PathVariable("id") int id)
	{
		return bookRepo.getAllBooks().stream().filter(e -> e.getBookID()==id).findAny().get();

	}

	
}
