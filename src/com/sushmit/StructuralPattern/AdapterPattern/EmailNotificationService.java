package com.sushmit.StructuralPattern.AdapterPattern;

public class EmailNotificationService implements NotificationService{

	@Override
	public void send(String to, String subject, String body) {
		System.out.println("Sending Email to: "+to);
		System.out.println("Subject: "+subject);
		System.out.println("Body: "+body);
	}
}
