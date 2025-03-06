package com.sushmit.BehaviouralPattern.StatePattern.GoodCode;

public class Cycling implements TransportationMode{

	@Override
	public int calcETA() {
		System.out.println("Calculating ETA  (Cycling)");
		return 4;
	}

	@Override
	public String getDirection() {
		return "Direction for Cycling";
	}
	
}
