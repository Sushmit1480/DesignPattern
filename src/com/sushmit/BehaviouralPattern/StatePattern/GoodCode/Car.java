package com.sushmit.BehaviouralPattern.StatePattern.GoodCode;

public class Car implements TransportationMode{

	@Override
	public int calcETA() {
		System.out.println("Calculating ETA  (Car)");
		return 5;
	}

	@Override
	public String getDirection() {
		return "Direction for Car Route";
	}

}
