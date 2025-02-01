package com.sushmit.CreationalPatterns.SingletonPattern.BadCode;

public class WithoutSingletonPattern {
	
	public static void main(String[] args) {
		AppSettings appSettings = new AppSettings();
		AppSettings appSettingsCopy = new AppSettings();
		
		System.out.println(appSettings.getApiKey());
		System.out.println(appSettingsCopy.getApiKey());
		
		System.out.println(appSettings == appSettingsCopy);
	}
}
