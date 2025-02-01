package com.sushmit.BehaviouralPattern.MomentoPattern;

public class TextEditorMain {

	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		editor.write("Hello World!!");
		editor.write("Hello Everyone!!");
		
		System.out.println(editor.getContent());
	}
}
