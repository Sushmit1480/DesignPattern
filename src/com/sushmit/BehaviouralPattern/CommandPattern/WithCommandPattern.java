package com.sushmit.BehaviouralPattern.CommandPattern;

// Command Interface
interface Command{
	void execute();
}

// Concrete Classes for Commands
class BoldCommand implements Command{

	private TextEditorII editor;
	
	public BoldCommand(TextEditorII editor) {
		this.editor = editor;
	}
	
	@Override
	public void execute() {
		editor.boldText();	
	}
}

class ItalicCommand implements Command{

	private TextEditorII editor;
	
	public ItalicCommand(TextEditorII editor) {
		this.editor = editor;
	}
	
	@Override
	public void execute() {
		editor.italicizeText();	
	}
}

class UnderlineCommand implements Command{

	private TextEditorII editor;
	
	public UnderlineCommand(TextEditorII editor) {
		this.editor = editor;
	}
	
	@Override
	public void execute() {
		editor.underlineText();	
	}
}

// Button Class
class Button{
	private Command command;
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void click() {
		command.execute();
	}
}

class TextEditorII{

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

public class WithCommandPattern {

	public static void main(String[] args) {
		TextEditorII editor = new TextEditorII();
		
		// Button
		Button button = new Button();
		button.setCommand(new BoldCommand(editor));
		
		button.setCommand(new ItalicCommand(editor));
		button.click();
	}
}
