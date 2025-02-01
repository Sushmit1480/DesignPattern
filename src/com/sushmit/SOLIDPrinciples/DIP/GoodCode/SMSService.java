package com.sushmit.SOLIDPrinciples.DIP.GoodCode;

public class SMSService implements NotificationChannel{

	@Override
	public void send(String Msg) {
		System.out.println("Sending SMS: "+Msg);
	}
}
