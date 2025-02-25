package com.sushmit.BehaviouralPattern.MomentoPattern;

public class TextEditorMain {

	public static void main(String[] args) {
		TextEditor editor = new TextEditor();
		Caretaker caretaker = new Caretaker();  // History
		
		editor.write("A");
		caretaker.saveState(editor);
		editor.write("B");
		caretaker.saveState(editor);
		editor.write("C");
		caretaker.saveState(editor);
		
		caretaker.undo(editor);
		caretaker.undo(editor);
		System.out.println(editor.getContent());
	}
}
