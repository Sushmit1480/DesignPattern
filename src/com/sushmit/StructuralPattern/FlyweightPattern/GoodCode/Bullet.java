package com.sushmit.StructuralPattern.FlyweightPattern.GoodCode;

public class Bullet {

	private BulletType type;
	private int x,y;
	private int velocity;
	
	public Bullet(String color,int x, int y, int velocity) {
		this.type = BulletTypeFactory.getBulletType(color);
		this.x = x;
		this.y= y;
		this.velocity = velocity;
		
		System.out.println("Creating Bullet at (" + x + ", " + y + ") with velocity: " + velocity);
	}
	
	public void display() {
        System.out.println("Bullet at (" + x + ", " + y + ") moving at velocity: " + velocity);
    }
}
