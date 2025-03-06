package com.sushmit.BehaviouralPattern.StatePattern.GoodCode;

public class DirectionService {

	TransportationMode transportationMode;
	
	public DirectionService(TransportationMode transportationMode) {
		this.transportationMode = transportationMode;
	}
	
	public void setTransportationMode(TransportationMode mode) {
		this.transportationMode = mode;
	}
	
	public int getETA() {
		return transportationMode.calcETA();
	}
	
	public String getDirection() {
		return transportationMode.getDirection();
	}
}
