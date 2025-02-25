package com.sushmit.BehaviouralPattern.MomentoPattern;

import java.util.Stack;

// Caretaker Class: manage mementos (snapshots of the textEditor state)
public class Caretaker {

	private final Stack<EditorMemento> history = new Stack<>();
	
	public void saveState(TextEditor editor) {
		history.push(editor.save());
	}
	
	public void undo(TextEditor editor) {
		if(!history.empty()) {
			history.pop();
			editor.restore(history.peek());
		}
	}
}
