package com.TCS.employee.details;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectStatement {

	public static void main(String[] args) { 
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/tcsemployee","root","Vaishali@7083");
			
			//select query
			PreparedStatement ps=con.prepareStatement("select * from employee");
			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				
				System.out.println("ID="+rs.getInt(1));
				System.out.println("Username="+rs.getString(2));
				System.out.println("Password="+rs.getString(3));
			}
			
			con.close();
			ps.close();
			rs.close();
			
		}
		
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}



