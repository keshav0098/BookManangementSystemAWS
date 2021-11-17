package com.keshav.aws.util;


public class Book {
	private int bookID;
	private String bookName;
	private int price;
	public int getBookID() {
		return bookID;
	}
	public Book() {
	}
	@Override
	public String toString() {
		return "Book [bookID=" + bookID + ", bookName=" + bookName + ", price=" + price + "]";
	}
	public Book(int bookID, String bookName, int price) {
		super();
		this.bookID = bookID;
		this.bookName = bookName;
		this.price = price;
	}
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
