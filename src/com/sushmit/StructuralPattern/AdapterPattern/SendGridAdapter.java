package com.sushmit.StructuralPattern.AdapterPattern;

public class SendGridAdapter implements NotificationService{

	private SendGridService sendGridService;
	
	public SendGridAdapter(SendGridService sendGridService) {
		this.sendGridService = sendGridService;
	}
	
	@Override
	public void send(String to, String subject, String body) {
		// Adapter method -> COnvert parameter and calls to SendGrid Method
		sendGridService.sendEmail(to, subject, body);
	}

}
