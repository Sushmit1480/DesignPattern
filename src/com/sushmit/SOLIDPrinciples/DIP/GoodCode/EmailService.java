package com.sushmit.SOLIDPrinciples.DIP.GoodCode;

public class EmailService implements NotificationChannel{

	@Override
	public void send(String Msg) {
		System.out.println("Sending Email: "+Msg);
	}
}
