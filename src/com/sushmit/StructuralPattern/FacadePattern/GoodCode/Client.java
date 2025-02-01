package com.sushmit.StructuralPattern.FacadePattern.GoodCode;

public class Client {

	public static void main(String[] args) {
		APIGateway api = new APIGateway();
		
		System.out.println(api.getFullOrderDetails("123", "456", "789"));
	}
}
