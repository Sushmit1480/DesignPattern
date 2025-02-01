package com.sushmit.CreationalPatterns.FactoryPattern.BadCode;

public class TransportService {
	
	public static void main(String[] args) {
		Transport car = new Car();
		Transport bike = new Bike();
		Transport bus = new Bus();
	}
}

// TransportService is tightly couple with other classes