package com.sushmit.SOLIDPrinciples.OCP.GoodCode;

public class UPI implements PaymentMethod{

	@Override
	public void pay(double amount) {
		System.out.println("Making payment via UPI: "+amount);
	}
}
