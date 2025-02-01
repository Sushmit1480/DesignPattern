package com.sushmit.StructuralPattern.ProxyPattern.BadCode;

public class Client {

	public static void main(String[] args) {
		Image image = new RealImage("dog.png");
		Image image2 = new RealImage("dog.png");
		
		// Unnecessary it loads image so it low down the application
		image2.display();
		image2.display(); 
	}
}
