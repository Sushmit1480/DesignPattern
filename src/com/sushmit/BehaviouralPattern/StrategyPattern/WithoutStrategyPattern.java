package com.sushmit.BehaviouralPattern.StrategyPattern;

class PaymentService{
	public void processPayment(String paymentMethod) {
		if(paymentMethod.equals("CreditCard")) {
			System.out.println("Making Payment via Credit Card");
		}else if(paymentMethod.equals("DebitCard")) {
			System.out.println("Making Payment via Debit Card");
		}else {
			System.out.println("Unsupported Payment method");
		}
	}
}

public class WithoutStrategyPattern {

	public static void main(String[] args) {
		PaymentService paymentService = new PaymentService();
		paymentService.processPayment("DebitCard");
		paymentService.processPayment("CreditCard");
	}
}
