package com.sushmit.SOLIDPrinciples.OCP.GoodCode;

public class CreditCard implements PaymentMethod{

	@Override
	public void pay(double amount) {
		System.out.println("Making payment via Credit card: "+amount);
	}

}
