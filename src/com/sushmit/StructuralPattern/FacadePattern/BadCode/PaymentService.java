package com.sushmit.StructuralPattern.FacadePattern.BadCode;

public class PaymentService {

	public String processPayment(String paymentId) {
		return "Processing payment with paymentId: " + paymentId;
	}
}
