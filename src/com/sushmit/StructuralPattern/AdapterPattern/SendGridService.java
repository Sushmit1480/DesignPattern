package com.sushmit.StructuralPattern.AdapterPattern;

public class SendGridService {

	public void sendEmail(String recipient, String title, String content) {
		System.out.println("Sending Email via SendGrid to: "+recipient);
		System.out.println("Title: "+title);
		System.out.println("Content: "+content);
	}
}
