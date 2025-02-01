package com.sushmit.SOLIDPrinciples.OCP.BadCode;

public class PaymentProcessor {
	
	public void processPayment(String paymentMethod, double amount) {
		if(paymentMethod.equals("CreditCard")) {
			System.out.println("Making payment via Credit card: "+amount);
		}
		else if(paymentMethod.equals("DebitCard")) {
			System.out.println("Making payment via Debit card: "+amount);
		}
		else if(paymentMethod.equals("Paypal")) {
			System.out.println("Making payment via Paypal: "+amount);
		}
		else {
			throw new IllegalArgumentException("Unsupported payment method "+paymentMethod);
		}
	}
}

// if want to add new payment method then we have to add in this class and it voilated the Open/Close principle