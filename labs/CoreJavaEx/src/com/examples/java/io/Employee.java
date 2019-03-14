package com.examples.java.io;

public class Employee implements java.io.Serializable {

	private static final long serialVersionUID = -7987392421065096694L;
	
	public String name;
	public String address;
	public transient int SSN;
	public int id;

	public void mailCheck() {
		System.out.println("Mailing a check to " + name + " " + address);
	}
}