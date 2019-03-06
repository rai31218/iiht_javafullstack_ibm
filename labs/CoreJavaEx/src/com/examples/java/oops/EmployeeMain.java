package com.examples.java.oops;

public class EmployeeMain {
	
	public static void main(String[] args)
	{
		//Employee employee = new Employee(100, "Anand", 35, "Male", "Sr.Developer", "IT", 50000);
		Employee employee = new Employee();
		employee.setDepartment("Admin");
		employee.setDesignation("Software Engineer");
		employee.printDetails();		
	}

}
