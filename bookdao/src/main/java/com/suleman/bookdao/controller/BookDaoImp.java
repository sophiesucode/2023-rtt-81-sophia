package com.suleman.bookdao.controller;

import java.util.ArrayList;
import java.util.List;

import com.suleman.bookdao.daointerface.BookDao;
import com.suleman.bookdao.models.Book;

public class BookDaoImp implements BookDao {

	private ArrayList<Book>bookObj;
	
	public BookDaoImp() {
		bookObj= new ArrayList<Book>();
		
	bookObj.add(new Book(102,"Java Class"));
		bookObj.add(new Book(201,"Python Book"));
		bookObj.add(new Book(301,"C++ Book"));
		
	}

	@Override
	public List<Book> getAllBooks() {
		
		return this.bookObj;
	}

	@Override
	public Book getBookByIsbn(int isbn) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void saveBook(Book book) {
		// TODO Auto-generated method stub
		
	}



     
	@Override
	public void deletBook(Book book) {
		bookObj.remove(book);
		
	}
	
	
	

	

}

