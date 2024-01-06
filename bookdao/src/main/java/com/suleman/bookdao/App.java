package com.suleman.bookdao;
import com.suleman.bookdao.controller.*;
import com.suleman.bookdao.daointerface.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      BookDao obj= new BookDaoImp();
      System.out.println(obj.getAllBooks()); 
    }
}
