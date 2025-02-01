package com.sushmit.SOLIDPrinciples.DIP.BadCode;

public class NotificationService {
	private EmailService emailService;
	private SMSService smsService;
	
	public NotificationService() {
		this.emailService = emailService;
		this.smsService = smsService;
	}
	
	public void notifyByEmail(String msg) {
		emailService.sendEmail(msg);
	}
	
	public void notifyBySMS(String msg) {
		smsService.sendSMS(msg);
	}
}

// In this code high level Notification service is depend on low level classes like EmailService and SMSService
// Which voilets the rule of Dependency Inversion Principle
// because if we want to add new notification method then we ahve to edit notification serivce class too