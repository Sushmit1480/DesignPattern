package com.sushmit.BehaviouralPattern.TemplatePattern;

class CSVParser{
	public void parse() {
		openFile();
		// CSV specific Parsing logic
		System.out.println("Parsing a CSV File");
		closeFile();
	}
	
	private void openFile() {
		System.out.println("Opening File");
	}
	
	private void closeFile() {
		System.out.println("Closing File");
	}
}

class JSONParser{
	public void parse() {
		openFile();
		// CSV specific Parsing logic
		System.out.println("Parsing a JSON File");
		closeFile();
	}
	
	private void openFile() {
		System.out.println("Opening File");
	}
	
	private void closeFile() {
		System.out.println("Closing File");
	}
}

public class WithoutTemplatePattern {

	public static void main(String[] args) {
		CSVParser csvParser = new CSVParser();
		JSONParser jsonParser = new JSONParser();
		
		csvParser.parse();
		jsonParser.parse();
	}
}
