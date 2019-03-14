package com.examples.java.io;

import java.io.*;

public class SerializeEx {

	public static void main(String[] args) {
		Employee e = new Employee();
		e.name = "Reyan Ali";
		e.address = "Phokka Kuan, Ambehta Peer";
		e.SSN = 11122333;
		e.id = 101;

		try {
			FileOutputStream fileOut = new FileOutputStream("D:\\Temp\\employee.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(e);
			out.close();
			fileOut.close();
			System.out.printf("Serialized data is saved in D:\\Temp\\employee.ser");
		} catch (IOException i) {
			i.printStackTrace();
		}
	}
}