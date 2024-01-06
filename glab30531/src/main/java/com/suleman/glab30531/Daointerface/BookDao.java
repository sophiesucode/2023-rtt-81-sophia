package com.suleman.glab30531.Daointerface;


import java.sql.SQLException;
import java.util.List;

import com.suleman.glab30531.model.Books;

public interface BookDao {

	List<Books> getAllBooks() throws ClassNotFoundException,SQLException;
	
	void saveBook(List<Books>BookList);
	
	boolean deleteBook(int id);
	
	boolean updateBook(Books book, int id);
	
	
	
}
