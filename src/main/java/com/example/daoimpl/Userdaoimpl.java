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
	public int save(User user)
	{
		System.out.println("Userdaoimpl 1====:---   " +user);
		c = databaseconection.makeConnection();
		
		
		try {
			
			System.out.println("in try block");
			int id=10;
			sql = "insert into emp(did,dname)values(?,?)";
			ps = c.prepareStatement(sql);
			ps.setInt(1, id);
			ps.setString(2,user.getUsername());
			int x = ps.executeUpdate(); //1
			if(x >0)
			{
				System.out.println("insert data");
				return x;
				
			}else
			{
				System.out.println("not insert data");	
			}
			
		} catch (Exception e) {
			System.out.println("in catch block");
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			
			try {
				c.close();
			} catch (Exception e2) {
				e2.printStackTrace();
				// TODO: handle exception
			}
			
		}
		
		
	
		
		// TODO Auto-generated method stub
		return 0;
	}

	

}
