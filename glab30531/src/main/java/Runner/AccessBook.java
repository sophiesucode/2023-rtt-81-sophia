package Runner;

import java.sql.SQLException;
import java.util.ArrayList;

import com.suleman.glab30531.Daointerface.BookDao;
import com.suleman.glab30531.controller.BookDaoImpl;
import com.suleman.glab30531.model.Books;

public class AccessBook {

	public static void main(String[] args) {
	
		BookDao obj = new BookDaoImpl();
		System.out.println("Inserting book records....");
		
		ArrayList<Books> bookList= new ArrayList<Books>();
		
		Books b1= new Books(120,"Java Book");
		
		//bookList.add(b1);
		
		Books b2= new Books();
		
		b2.setIsbn(102);
		b2.setBookName("Design 101");
		
		//bookList.add(b2);
		
		Books b3= new Books();
		b3.setIsbn(112);
		b3.setBookName("Python for Dummies");
		
		Books b4 = new Books();
		b4.setIsbn(256);
		b4.setBookName("SQL Book");
		
		bookList.add(b4);
		
		bookList.add(b3);
		obj.saveBook(bookList);
		
		
		System.out.println( " ====== Display list of all books ====");
		try {
		for (Books cc : obj.getAllBooks()) {
		int ISBN = cc.getIsbn();
		String BookName = cc.getBookName();
		System.out.println("======================");
		System.out.println("ISBN Number :" + ISBN + " and Book name: " + BookName);
		}
		} catch (ClassNotFoundException e) {
		e.printStackTrace();
		} catch (SQLException e) {
		e.printStackTrace();
		}
		
		
		System.out.println("----Book information is updating -----");
		Books Bookupdating = new Books();
		Bookupdating.setIsbn(3);
		Bookupdating.setBookName("Algorithms Book");
		boolean result = obj.updateBook(Bookupdating, 3);
		System.out.println(result);
		
		boolean a =obj.deleteBook(4); // 4 is a id of book
		if(a == true) {
		System.out.println("Record is deleted");
		}
		else
		{
		System.out.println("Record is not deleted");
		}
}
}
