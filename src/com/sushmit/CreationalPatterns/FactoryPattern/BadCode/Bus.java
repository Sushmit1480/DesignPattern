package com.sushmit.CreationalPatterns.FactoryPattern.BadCode;

public class Bus implements Transport {

	@Override
	public void deliver() {
		System.out.println("Deliver by Bus");
	}

}
