package com.sushmit.BehaviouralPattern.StrategyPattern;

interface PaymentStrategy{
	void processPayment();
}

class PaymentServiceII{
	private PaymentStrategy strategy;
	public void setStrategy(PaymentStrategy strategy) {
		this.strategy = strategy;
	}
	
	public void pay() {
		strategy.processPayment();
	}
}

class DebitCard implements PaymentStrategy{

	@Override
	public void processPayment() {
		System.out.println("Making Payment via Debit Card");
	}
	
}

class CreditCard implements PaymentStrategy{

	@Override
	public void processPayment() {
		System.out.println("Making Payment via Credit Card");
	}
	
}

public class StrategyPattern {
	
	public static void main(String[] args) {
		PaymentServiceII paymentService = new PaymentServiceII();
		paymentService.setStrategy(new CreditCard());
		paymentService.pay();
	}
}
