package com.abhinav.utility;
import java.sql.*;
public class DBConnection {
	public static Connection initializeDatabase() throws SQLException, ClassNotFoundException {
		String dbDriver = "com.mysql.jdbc.Driver";
		String dbURL = "jdbc:mysql://localhost:3306/CartDatabase"; 
		String dbUsername = "root"; 
		String dbPassword = "root";
		Class.forName(dbDriver);
		Connection conn = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
		return conn;
	}
}

