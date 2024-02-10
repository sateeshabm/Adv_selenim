package com_Adv_Selenium_mvn_generic;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class Generic_jdbc 
{
	static Connection conn;
	 static Statement state;
	static ResultSet result;
	static String user;
	static String pass;
	@Test
	public static String fecthuser(String url,String un,String pwd,String query,int c1)
	{
		
		try {
			conn = DriverManager.getConnection(url, un, pwd);
			 state = conn.createStatement();
			  result = state.executeQuery(query);
			  while(result.next())
			  {
				  user = result.getString(c1);
				  
			  }
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return user;
		 
	}
	public static String fecthpass(String url,String un,String pwd,String query,int c2)
	{
		
		try {
			conn = DriverManager.getConnection(url, un, pwd);
			 state = conn.createStatement();
			  result = state.executeQuery(query);
			  while(result.next())
			  {
				   pass= result.getString(c2);
				  
			  }
		} 
		catch (SQLException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return pass;
		 
	}
	

}
