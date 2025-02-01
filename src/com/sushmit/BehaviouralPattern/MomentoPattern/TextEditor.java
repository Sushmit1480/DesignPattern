package com.sushmit.BehaviouralPattern.MomentoPattern;

public class TextEditor {

	private String content;
	
	public void write(String text) {
		this.content = text;
	}
	
	public String getContent() {
		return content;
	}
}
