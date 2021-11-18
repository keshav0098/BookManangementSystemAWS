package com.keshav.aws.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.keshav.aws.util.Book;

@Repository
public class BookRepository {
	
	static List<Book> bookList=new ArrayList<>();
	static
	{
		bookList.add(new Book(1,"Computer",2000));
		bookList.add(new Book(2, "Physics", 10000));
		bookList.add(new Book(5,"Spring Boot Fundamentals",4000));
		bookList.add(new Book(10,"Microservices SAGA",4500));
		bookList.add(new Book(13,"Mysql Fundamentals",1900));
	}

	public List<Book> getAllBooks()
	{

		return bookList;

	}
}
