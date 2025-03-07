package com.sushmit.CreationalPatterns.PrototypePattern.BadCode;

public class GamePiece {
	private String color;
	private int position;
	
	
	public GamePiece(String color, int position) {
		super();
		this.color = color;
		this.position = position;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setPosition(int position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "GamePiece [color=" + color + ", position=" + position + "]";
	}

	public String getColor() {
		return color;
	}

	public int getPosition() {
		return position;
	}
	
	
}
