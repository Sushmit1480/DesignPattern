package com.sushmit.StructuralPattern.FlyweightPattern.GoodCode;

// FlyWeight class
public class BulletType {

	private String color;
	
	public BulletType(String color) {
		this.color = color;
		System.out.println("Creating BulletType with color: " + color);
	}
}
