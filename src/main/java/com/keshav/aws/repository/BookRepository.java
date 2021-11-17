package com.keshav.aws.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.keshav.aws.util.Book;

@Repository
public class BookRepository {

	public List<Book> getAllBooks()
	{

		return List.of(new Book(1,"Computer",2000),new Book(2, "Physics", 10000),new Book(5,"Spring Boot Fundamentals",4000),
				new Book(10,"Microservices SAGA",4500),new Book(13,"Mysql Fundamentals",1900));

	}
}
