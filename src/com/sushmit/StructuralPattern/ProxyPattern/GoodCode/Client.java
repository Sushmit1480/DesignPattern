package com.sushmit.StructuralPattern.ProxyPattern.GoodCode;

public class Client {

	public static void main(String[] args) {
	
		Image image = new ProxyImage("dog.png");
		Image image2 = new ProxyImage("cat.png");
		
		// Unnecessary it loads image so it low down the application
		image2.display();
		image2.display();
	}
}
