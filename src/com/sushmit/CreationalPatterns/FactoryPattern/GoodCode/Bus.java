package com.sushmit.CreationalPatterns.FactoryPattern.GoodCode;

public class Bus implements Transport {

	@Override
	public void deliver() {
		System.out.println("Deliver by Bus");
	}

}
