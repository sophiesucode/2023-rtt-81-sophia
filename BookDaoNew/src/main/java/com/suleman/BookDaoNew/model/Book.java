package com.suleman.BookDaoNew.model;

public class Book {
	private int id;
	private int isbn;
	private String bookName;
	
	public Book() {
		this.id = id;
		this.isbn = isbn;
	}
	
	
	public Book(int id, int isbn, String bookName) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.bookName = bookName;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getIsbn() {
		return isbn;
	}


	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}


	public String getBookName() {
		return bookName;
	}


	public void setBookName(String bookName) {
		this.bookName = bookName;
	}


	@Override
	public String toString() {
		return "Book [id=" + id + ", isbn=" + isbn + ", bookName=" + bookName + "]";
	}



	
	
	

}
