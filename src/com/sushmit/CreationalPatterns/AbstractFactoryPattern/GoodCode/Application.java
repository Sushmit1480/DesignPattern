package com.sushmit.CreationalPatterns.AbstractFactoryPattern.GoodCode;

// Interfaces
interface Button{
	void render();
}

interface ScrollBar{
	void scroll();
}

//Windows UI Component
class WindowButton implements Button{
	@Override
	public void render() {
		System.out.println("Rendering Windows Button");
	}
}

class WindowsScrollbar implements ScrollBar{
	@Override
	public void scroll() {
		System.out.println("Scrolling Windows Scrollbar");
	}
}

//Mac UI Component
class MacButton implements Button{
	@Override
	public void render() {
		System.out.println("Rendering Mac Button");
	}
}

class MacScrollbar implements ScrollBar{
	@Override
	public void scroll() {
		System.out.println("Scrolling Mac Scrollbar");
	}
}

interface UIFactory{
	Button createButton();
	ScrollBar createScrollBar();
}

// Concrete Implementation
class WindowsFactory implements UIFactory{

	@Override
	public Button createButton() {
		return new WindowButton();
	}

	@Override
	public ScrollBar createScrollBar() {
		return new WindowsScrollbar();
	}
	
}

class MacOSFactory implements UIFactory{

	@Override
	public Button createButton() {
		return new MacButton();
	}

	@Override
	public ScrollBar createScrollBar() {
		return new MacScrollbar();
	}
	
}

public class Application {

	private Button button;
	private ScrollBar scrollBar;
	
	public Application(UIFactory factory) {
		this.button = factory.createButton();
		this.scrollBar = factory.createScrollBar();
	}
	
	public void renderUI() {
		button.render();
		scrollBar.scroll();
	}
	
	public static void main(String[] args) {
		// Use Windows UI
		UIFactory windowsFactory = new WindowsFactory();
		Application app = new Application(windowsFactory);
		app.renderUI();
	}

}
