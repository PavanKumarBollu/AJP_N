package com.pavan.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JdbcUtil {
	
	private JdbcUtil() {};// preventing the object creation of this class
	
	private static Connection connection = null;
	
	public static Connection getConncetion() throws SQLException 
	{
		String url = "jdbc:mysql://localhost:3306/javafstack";// include your database name
		String userName = "root";// here mention your userName
		String password = "Pav@0211";// mention your password
	
			connection = DriverManager.getConnection(url, userName, password);
			return  connection ;
	}

}
