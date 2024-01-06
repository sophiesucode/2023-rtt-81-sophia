package com.suleman.BookDaoNew;
import java.util.ArrayList;

import com.suleman.BookDaoNew.controller.*;
import com.suleman.BookDaoNew.model.*;
import com.suleman.BookDaoNew.daointerface.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BookDao obj = new BookDaoImpl();
        //System.out.println(obj.getAllBooks());
        
        ArrayList<Book> bookList= new ArrayList<Book>();
        bookList.add(new Book(6,101,"Advanced Java Development"));
         obj.saveBook(bookList);
         System.out.println("Book submitted succesfully");
         
         
    }
}
