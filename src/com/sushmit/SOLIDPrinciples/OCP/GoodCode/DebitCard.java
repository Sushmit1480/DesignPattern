package com.sushmit.SOLIDPrinciples.OCP.GoodCode;

public class DebitCard implements PaymentMethod{

	@Override
	public void pay(double amount) {
		System.out.println("making payment via Debit Card: "+amount);
	}
}
