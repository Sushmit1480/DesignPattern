package com.sushmit.CreationalPatterns.FactoryPattern.BadCode;

public class Car implements Transport{

	@Override
	public void deliver() {
		System.out.println("Deliver by Car");
	}

}
