package com.sushmit.StructuralPattern.FlyweightPattern.BadCode;

public class Game {

	public static void main(String[] args) {
		
		// 5 Red Bullet Objects
		for(int i = 0; i < 5; i++) {			
			Bullet bullet = new Bullet("Red", i*10, i*12, 5);
		}
		
		// 5 Green Bullet Objects
		for(int i = 0; i < 5; i++) {			
			Bullet bullet = new Bullet("Green", i*10, i*12, 5);
			bullet.display();
		}
		
		//Problems
        // Memory Overhead : Every bullet stores redundant data like Color, Image
        // Performance : Slow performance when many bullets are created
	}
}
