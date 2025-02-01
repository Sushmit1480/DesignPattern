package com.sushmit.CreationalPatterns.SingletonPattern.GoodCode;

public class AppSettings {
	// Step 1: Private static instance of class.
	private static AppSettings instance;
	
	private String databaseurl;	
	private String apiKey;
	
	// Step 2: Private Constructor to prevent direct object creation.
	private AppSettings() {
		databaseurl = "jdbc:mysql://loacalhost:3306/mydatabase";
		apiKey = "12345-ABCDE";
	}
	
	// Step 3: Public static method to create single instance
	public static AppSettings getinstance() {
		if(instance == null) {			
			instance = new AppSettings();
		}
		return instance;
	}
	
	public String getDatabaseurl() {
		return databaseurl;
	}

	public String getApiKey() {
		return apiKey;
	}
}
