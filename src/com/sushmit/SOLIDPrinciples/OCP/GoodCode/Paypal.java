package com.sushmit.SOLIDPrinciples.OCP.GoodCode;

public class Paypal implements PaymentMethod{

	@Override
	public void pay(double amount) {
		System.out.println("Making payment via Paypal: "+amount);
	}

}
