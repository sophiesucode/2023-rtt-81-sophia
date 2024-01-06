package com.suleman.customerdao.customerinterface;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.suleman.customerdao.model.Customer;

public class ConnectionDao {
	
	static Connection con = null;
	
	protected PreparedStatement ps= null;
	protected ResultSet rs= null;
	
	public static Connection getConnection()throws ClassNotFoundException
	{
		final String DBURL="jdbc:mysql://localhost:3306/customers/";
		final String DBUSERNAME="root";
		final String DBPASSWORD="SuLe1990";
		
		try {
		con= DriverManager.getConnection(DBURL, DBUSERNAME, DBPASSWORD);
		System.out.println("Connected Database Successfully");
		
		}catch(SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
		return con;
	}

	public void disconnect(){
		try {
			if(rs != null) {
				rs.close();
			}
			if(ps != null) {
				ps.close();
			}if(con != null) {
				con.close();
			}
		}catch(Exception e) {
			//todo:handle exception
		}
	}

	public Customer removeCustomerById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
