package com.examples.java.oops;

/**
 * Models Employee object
 */
public class Employee extends Person {
	
	// access modifiers
	// private, public, protected, default
	
	// properties
	private int empId;
	private String designation;
	private String department;
	private double salary;
	
	// default constructor
	public Employee()
	{
		//this(100, "Anand", 35, "Male", "Sr.Developer", "IT", 50000);
		System.out.println("Employee class default constructor");
	}

	// overloaded custom constructor
	public Employee(int empId, String name, int age, String gender, String designation, String department, double salary) {
		super(name, age, gender);
		this.empId = empId;
		this.designation = designation;
		this.salary = salary;
	}
	
	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public void printDetails() {
		// print employee details
		System.out.println("EmpId: " + this.getEmpId());
		System.out.println("Name: " + this.getName());
		System.out.println("Age: " + this.getAge());
		System.out.println("Gender: " + this.getGender());
		System.out.println("Designation: " + this.getDesignation());
		System.out.println("Department: " + this.getDepartment());
		System.out.println("Salary: " + this.getSalary());
	}	
}
