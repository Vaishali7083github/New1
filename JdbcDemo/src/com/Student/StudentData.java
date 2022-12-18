package com.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class StudentData {
	
	private static Connection connection = null; 
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		StudentData studentDatabase = new StudentData();
		try {
		     Class.forName("Com.mysql.cj.jdbc.Driver");
		     String dbURL = "jdbc:mysql://localhost:3306/studentdata";
		     String username ="root";
		     String password = "Vaishali@7083";
		     connection = DriverManager.getConnection(dbURL,username,password);
		     System.out.println("Enter choice");
		     System.out.println("1. Insert record");
		     System.out.println("2. Select record");
		     
		     int choice = Integer.parseInt(scanner.nextLine());
		     
		     switch (choice){
		    	 case 1:
		    		 studentDatabase.insertRecord();
		    		 break;
		    		 
		    	default:
		    		break;
		     }
		}
		catch (Exception e) {
			throw new RuntimeException("Something went wrong");
		}
	
	}
	private void insertRecord() throws SQLException{
		String sql ="insert into student(name,marks,Grade,)values(?,?,?)";
		
		PreparedStatement preparedSatetment = connection.prepareStatement(sql);
		System.out.println("Enter name");
		preparedSatetment.setString(1,scanner.nextLine());
		
		System.out.println("Enter marks");
		preparedSatetment.setInt(2, scanner.nextInt());
		
		System.out.println("Enter Grade");
		preparedSatetment.setString(3,scanner.nextLine());
		
		
		
	}

}



