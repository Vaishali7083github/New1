package com.TCS.employee.details;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Employee {
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		try {
			String str = "insert into employee(empLname,empFname,empgmail,empNo,empAddress,empSalary)value('Ubale','Shyam','sam@gmail.com',87583,'pnC colony',26780)";
					Class.forName("com.mysql.jdbc.Driver");
			
					Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/tcsemployee","root","Vaishali@7083");
			        Statement statement = con.createStatement();
			        statement.execute(str);
			        System.out.println("Insertion Successful");
			        con.close();
			        statement.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
