package com.sushmit.StructuralPattern.DecoratorPattern.BadCode;

public class PizzaApp {

	public static void main(String[] args) {
		Pizza pizza = new CheeseOlivePizza();
		System.out.println(pizza.getDescription());
		System.out.println(pizza.getCost());
		
		Pizza pizza2 = new CheesePizza();
		System.out.println(pizza2.getDescription());
		System.out.println(pizza2.getCost());
		
		Pizza pizza3 = new BasicPizza();
		System.out.println(pizza3.getDescription());
		System.out.println(pizza3.getCost());
	}
}
