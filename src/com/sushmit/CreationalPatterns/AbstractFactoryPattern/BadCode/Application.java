package com.sushmit.CreationalPatterns.AbstractFactoryPattern.BadCode;

//Windows UI Component
class WindowButton{
	public void render() {
		System.out.println("Rendering Windows Button");
	}
}

class WindowsScrollbar{
	public void scroll() {
		System.out.println("Scrolling Windows Scrollbar");
	}
}

//Mac UI Component
class MacButton{
	public void render() {
		System.out.println("Rendering Mac Button");
	}
}

class MacScrollbar{
	public void scroll() {
		System.out.println("Scrolling Mac Scrollbar");
	}
}

public class Application {

	public static void main(String[] args) {
		// Windows UI
		WindowButton button = new WindowButton();
		WindowsScrollbar scrollbar = new WindowsScrollbar();
		
		button.render();
		scrollbar.scroll();
	}

}
