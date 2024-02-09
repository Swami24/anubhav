package com.example.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.example.dao.Userdao;
import com.example.dbconnection.databaseconection;
import com.example.pojo.User;

public class Userdaoimpl implements Userdao
{
	Connection c;
	PreparedStatement ps;
	String sql;
	

	@Override
	public String save(User user)
	{
		System.out.println("Userdaoimpl====:---   " +user);
		c = databaseconection.makeConnection();
		try {
			
			sql = "insert into emp(did,dname) vlaues(?,?)";
			ps = c.prepareStatement(sql);
			ps.setInt(1, 5);
			ps.setString(2,user.getUsername());
			int x = ps.executeUpdate(); 
			if(x >0)
			{
				
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
	
		
		// TODO Auto-generated method stub
		return null;
	}

	

}
