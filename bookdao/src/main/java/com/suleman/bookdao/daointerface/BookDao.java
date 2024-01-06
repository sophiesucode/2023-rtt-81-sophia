package com.suleman.bookdao.daointerface;

import java.util.List;

import com.suleman.bookdao.models.Book;

public interface BookDao {

List<Book>getAllBooks();

Book getBookByIsbn(int isbn);

void saveBook(Book book);



void deletBook(Book book);



}
