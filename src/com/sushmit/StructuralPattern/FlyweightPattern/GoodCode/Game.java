package com.sushmit.StructuralPattern.FlyweightPattern.GoodCode;

public class Game {

	public static void main(String[] args) {
		// Red Bullet
		for(int i = 0; i < 5; i++) {
			Bullet bullet = new Bullet("Red", i*10, i*12, 5);
		}
		
		// Green Bullet
		for(int i = 0; i < 5; i++) {
			Bullet bullet = new Bullet("Green", i*10, i*12, 5);
		}
		
	}
}
