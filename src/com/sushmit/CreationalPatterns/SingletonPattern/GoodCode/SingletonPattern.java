package com.sushmit.CreationalPatterns.SingletonPattern.GoodCode;

public class SingletonPattern {
	
	public static void main(String[] args) {
		AppSettings appSettings = AppSettings.getinstance();
		AppSettings appSettingsCopy = AppSettings.getinstance();
		
		System.out.println(appSettings.getApiKey());
		System.out.println(appSettingsCopy.getApiKey());
		
		System.out.println(appSettings == appSettingsCopy);
	}
}
