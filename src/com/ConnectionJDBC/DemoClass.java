package com.ConnectionJDBC;
import java.sql.*;

public class DemoClass {

	//Import -- java.sql	
	//Load and register the driver --> com.mysql.jdbc.Driver
	//Create Connection --> Connection
	//Create a statement --> Statement
	//Execute the Query ->
	//Process the Result ->
	//Close
	
	
	public static void main(String[] args)throws Exception {
		
		String url = "jdbc:mysql://localhost:3306";
		String uname = "root";
		String pass = "ArielCindy123&";
		
		//DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement stmt = con.createStatement();
		String s = "drop database ariell;";
		
		stmt.execute(s);
	}

}
