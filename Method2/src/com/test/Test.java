package com.test;

public class Test {
	public static Employe getEmployeeById() {
	    int id = 10;
		return new Employe (id); // return empId here
	}

	public static void main(String[] args) {
        
		Employe e = getEmployeeById();
		System.out.println(e.id);
	}

}
