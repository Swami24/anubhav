package com.example.dbconnection;


import java.sql.Connection;
import java.sql.DriverManager;

public class databaseconection 
{
	
	
	
	public static Connection makeConnection()
	{
		try
		{
			 
			// Connection URL
			 	Class.forName("com.mysql.jdbc.Driver");
			 	String url = "jdbc:mysql://localhost:3309/college";
	            // Database credentials
	            String username = "root";
	            String password = "123456";

	            // Establish the database connection
	            Connection con = DriverManager.getConnection(url, username, password);

	            System.out.println("Connected to the database!");
	            // Return the connection object
	            return con;
			
		} catch (Exception e)
		{
			e.printStackTrace();
			// TODO: handle exception
		}
		
		return null;
		
		
	}
	
	

}
