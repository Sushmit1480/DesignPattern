package com.sushmit.CreationalPatterns.FactoryPattern.GoodCode;

public class Bike implements Transport {

	@Override
	public void deliver() {
		System.out.println("Deliver by Bike");
	}

}