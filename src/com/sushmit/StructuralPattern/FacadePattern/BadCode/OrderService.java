package com.sushmit.StructuralPattern.FacadePattern.BadCode;

public class OrderService {

	public String getOrderDetails(String orderId) {
		return "Order details for orderId: " + orderId;
	}
}
