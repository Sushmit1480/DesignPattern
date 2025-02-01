 package com.sushmit.SOLIDPrinciples.OCP.GoodCode;

public class PaymentProcessor {
	public void processPayment(PaymentMethod paymentMethod, double amount) {
		paymentMethod.pay(amount);
	}
}

//by using this method we can change the specific payment methods which can not violet the coode of other methods