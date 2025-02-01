package com.sushmit.SOLIDPrinciples.DIP.GoodCode;

public class Main {

	public static void main(String[] args) {
		NotificationService emailNotification = new NotificationService(new EmailService());
		emailNotification.notify("Your order has been dispatched.");
		
		NotificationService smsNotification = new NotificationService(new SMSService());
		smsNotification.notify("Your order has been out for delivery.");
	}

}
