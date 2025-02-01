package com.sushmit.SOLIDPrinciples.DIP.GoodCode;

public class NotificationService {
	private NotificationChannel channel;
	
	public NotificationService(NotificationChannel channel) {
		this.channel = channel;
	}
	
	public void notify(String msg) {
		channel.send(msg);
	}
}
