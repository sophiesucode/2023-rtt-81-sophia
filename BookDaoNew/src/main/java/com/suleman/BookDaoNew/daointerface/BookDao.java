package com.suleman.BookDaoNew.daointerface;

import java.sql.SQLException;
import java.util.List;

import com.suleman.BookDaoNew.model.Book;

public interface BookDao {
	
	List<Book> getAllBooks() ;
	void saveBook(List<Book> booList);
	boolean deleteBook(int id);
	boolean updateBook(Book book, int id);
}
