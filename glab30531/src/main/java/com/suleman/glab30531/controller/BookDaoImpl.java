package com.suleman.glab30531.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.suleman.glab30531.Daointerface.BookDao;
import com.suleman.glab30531.Daointerface.ConnectionDao;
import com.suleman.glab30531.model.Books;

public class BookDaoImpl extends ConnectionDao implements BookDao {

	@Override
	public List<Books> getAllBooks() throws ClassNotFoundException, SQLException {

			try {
				Connection con = ConnectionDao.getConnection();
				Statement stmt = con.createStatement();
				ResultSet rs = stmt.executeQuery("SELECT * FROM books");
				List booklist = new ArrayList();
				while(rs.next())
				{
				Books b = new Books();
				b.setIsbn( rs.getInt("isbn") );
				b.setBookName( rs.getString("bookName") );
				booklist.add(b);
				}
				return booklist;
				} catch (SQLException ex) {
				ex.printStackTrace();
				System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
				} catch (ClassNotFoundException e) {
				e.printStackTrace();
				}
	
		return null;
	}

	@Override
	public void saveBook(List<Books> BookList) {
		// TODO Auto-generated method stub
		try {
			Connection connection= ConnectionDao.getConnection();
			
			for(Books b: BookList) {
				String sqlQuery = "INSERT INTO books (isbn,bookName) VALUES (?,?)";
				PreparedStatement prepStmt = connection.prepareStatement(sqlQuery);
				prepStmt.setInt(1, b.getIsbn());
				prepStmt.setString(2, b.getBookName());
				int affectedRows = prepStmt.executeUpdate();
				System.out.println(affectedRows + " row(s) affected !!");
				}
		}
		catch (ClassNotFoundException e)
		{
		} catch (SQLException throwables) {
		throwables.printStackTrace();
		}
	}

	@Override
	public boolean deleteBook(int id) {
		// TODO Auto-generated method stub
		try {
			Connection con = ConnectionDao.getConnection();
			PreparedStatement ps = con.prepareStatement("DELETE FROM books WHERE id=?");
			ps.setInt(1, id);
			int i = ps.executeUpdate();
			if(i == 1) {
			return true;
			}
			} catch (ClassNotFoundException e)
			{
			e.printStackTrace();
			}
			catch (SQLException ex) {
			System.err.format("SQL State: %s\n%s", ex.getSQLState(), ex.getMessage());
			}
			return false;
			
	}

	@Override
	public boolean updateBook(Books book, int id) {
		// TODO Auto-generated method stub
		try {
			Connection con = ConnectionDao.getConnection();
			PreparedStatement ps = con.prepareStatement("UPDATE books SET isbn=?,bookName=? WHERE id=?");
			ps.setInt(1, book.getIsbn());
			ps.setString(2, book.getBookName());
			ps.setInt(3, id);
			int i = ps.executeUpdate();
			if(i == 1) {
			return true;
			}
			}
			catch (ClassNotFoundException e)
			{
			e.printStackTrace();
			}
			catch (SQLException e) {
			e.printStackTrace();
			System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
			}
			return false;
	
	}

	
}
