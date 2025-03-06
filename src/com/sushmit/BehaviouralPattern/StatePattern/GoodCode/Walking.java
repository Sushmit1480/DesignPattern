package com.sushmit.BehaviouralPattern.StatePattern.GoodCode;

public class Walking implements TransportationMode{

	@Override
	public int calcETA() {
		System.out.println("Calculating ETA  (Walking)");
		return 10;
	}

	@Override
	public String getDirection() {
		return "Direction for Walking";
	}

}
