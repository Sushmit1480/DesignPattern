package com.sushmit.SOLIDPrinciples.OCP.GoodCode;

public class Main {

	public static void main(String[] args) {
		PaymentProcessor processor = new PaymentProcessor();
		PaymentMethod creditCard = new CreditCard();
		
		processor.processPayment(creditCard, 5000);
		
		PaymentMethod upi = new UPI();
		processor.processPayment(upi, 8963);
	}

}
