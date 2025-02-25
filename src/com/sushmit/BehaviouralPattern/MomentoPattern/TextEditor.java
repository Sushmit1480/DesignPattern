package com.sushmit.BehaviouralPattern.MomentoPattern;

public class TextEditor {

	private String content;
	
	public void write(String text) {
		this.content = text;
	}
	
	public String getContent() {
		return content;
	}
	
	// Save the current state of editor
	public EditorMemento save() {
		return new EditorMemento(content);
	}
	
	// Restore (Momento ->  Update the state of current editor)
	public void restore(EditorMemento memento) {
		content = memento.getContent();
	}
}
