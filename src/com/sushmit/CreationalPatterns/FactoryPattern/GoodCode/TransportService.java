package com.sushmit.CreationalPatterns.FactoryPattern.GoodCode;

public class TransportService {
	public static void main(String[] args) {
		Transport vehical = TransportFactory.createTransport("bike");
		vehical.deliver();
	}
}
