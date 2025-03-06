package com.sushmit.BehaviouralPattern.StatePattern.GoodCode;

public class Train implements TransportationMode{

	@Override
	public int calcETA() {
		System.out.println("Calculating ETA  (Train)");
		return 2;
	}

	@Override
	public String getDirection() {
		return "Direction for train Route";
	}
	
}
