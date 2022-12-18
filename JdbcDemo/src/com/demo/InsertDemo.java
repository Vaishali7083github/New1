package com.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class InsertDemo {
	

	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		try {
			String sql ="insert into user (LastName,FirstName,Address,City,Salary)value('Patil','ram','Abc coleony','Mumbai','2500')";
			// Load the Driver 
			Class.forName("com.mysql.jdbc.Driver"); //load the driver
			//Establish the Connection
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo","root","Vaishali@7083");
			//create the sql statement
			Statement statement = con.createStatement();//to submit the sql querry we use statement
			// submit the sql statement to database..
			//statement.executeUpdate(sql);
			statement.execute(sql);
			System.out.println("Insertion Successful");
			con.close();
			statement.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
