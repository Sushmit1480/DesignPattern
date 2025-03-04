package com.sushmit.BehaviouralPattern.CommandPattern;

class TextEditor{

	public void boldText() {
		System.out.println("Text has been bolded.");
	}
	
	public void italicizeText() {
		System.out.println("Text has been italicized.");
	}
	
	public void underlineText() {
		System.out.println("Text has been underlined.");
	}
}

// UI BUTTON CLASSES
class BoldButton{
	private TextEditor editor;
	
	public BoldButton(TextEditor editor) {
		this.editor = editor;
	}
	
	public void click() {
		editor.boldText();
	}
}

class ItalicButton{
	private TextEditor editor;
	
	public ItalicButton(TextEditor editor) {
		this.editor = editor;
	}
	
	public void click() {
		editor.italicizeText();
	}
}

class UnderlineButton{
	private TextEditor editor;
	
	public UnderlineButton(TextEditor editor) {
		this.editor = editor;
	}
	
	public void click() {
		editor.underlineText();;
	}
}

public class WithoutCommandPattern {

	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		BoldButton boldButton = new BoldButton(editor);
		ItalicButton italicButton = new ItalicButton(editor);
		UnderlineButton underlineButton = new UnderlineButton(editor);
		boldButton.click();
		italicButton.click();
		underlineButton.click();
	}
}
