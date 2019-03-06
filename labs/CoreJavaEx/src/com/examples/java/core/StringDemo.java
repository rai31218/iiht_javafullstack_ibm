package com.examples.java.core;

public class StringDemo {

	public static void main(String[] args) {
	
		String msg1 = "Hello World";
		String msg2 = new String("Hello World");
			
		System.out.println(msg1 == msg2);
		System.out.println(msg1.length());
		System.out.println(msg1.charAt(5));		
	}

}
