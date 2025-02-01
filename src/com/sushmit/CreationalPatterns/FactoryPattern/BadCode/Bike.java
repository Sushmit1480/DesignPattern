package com.sushmit.CreationalPatterns.FactoryPattern.BadCode;

public class Bike implements Transport {

	@Override
	public void deliver() {
		System.out.println("Deliver by Bike");
	}

}
