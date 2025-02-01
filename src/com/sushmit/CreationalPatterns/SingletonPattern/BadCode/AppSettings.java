package com.sushmit.CreationalPatterns.SingletonPattern.BadCode;

public class AppSettings {
	
	private String databaseurl;
	
	public String getDatabaseurl() {
		return databaseurl;
	}

	public String getApiKey() {
		return apiKey;
	}

	private String apiKey;
	
	public AppSettings() {
		databaseurl = "jdbc:mysql://loacalhost:3306/mydatabase";
		apiKey = "12345-ABCDE";
	}
}
