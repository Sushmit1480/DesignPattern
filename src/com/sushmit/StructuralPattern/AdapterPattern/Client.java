package com.sushmit.StructuralPattern.AdapterPattern;

public class Client {

	public static void main(String[] args) {
		NotificationService emailService = new EmailNotificationService();
		emailService.send("sushmit@infosys.com", "Order Confirmation", "Your order has been received!!");
		
		NotificationService emailServiceUsingSendGrid = new SendGridAdapter(new SendGridService());
		emailServiceUsingSendGrid.send("sushmit1@infosys.com", "Order Confirmation2", "Your order has been received3!!");
	}
}
