package com.sushmit.SOLIDPrinciples.LSP.BadCode;

public class File {
	public void read() {
		System.out.println("Reading from file");
	}
	
	public void write() {
		System.out.println("Writing from file");
	}
}

// In this code there is one issue if file is of read-only type then by using this code we have to override writ method too
// which violate the Liskov Substitution Principle pattern
