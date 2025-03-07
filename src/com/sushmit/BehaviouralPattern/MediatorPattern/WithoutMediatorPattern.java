package com.sushmit.BehaviouralPattern.MediatorPattern;

// Chat system
class User{
	private String name;
	
	public User(String name) {
		this.name = name;
	}
	
	public void sendMessage(String msg, User recipent) {
		System.out.println(this.name + " sending " + msg + " to " + recipent.name);
	}
	
	public String getName() {
		return name;
	}
}

public class WithoutMediatorPattern {

	public static void main(String[] args) {
		User rahul = new User("Rahul");
		User amit = new User("Amit");
		User neha = new User("Neha");
		
		rahul.sendMessage("Hello", neha);
		rahul.sendMessage("Hello", amit);
	}
}
