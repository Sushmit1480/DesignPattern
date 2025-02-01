package com.sushmit.StructuralPattern.DecoratorPattern.GoodCode;

public class PizzaApp {

	public static void main(String[] args) {
		// Start witb basic pizza
		Pizza pizza = new BasicPizza();
		
		// Add cheese
		pizza = new CheeseDecorator(pizza);
		pizza = new MushroomDecorator(pizza);
		pizza = new OliveDecorator(pizza);
		
		System.out.println(pizza.getDescription());
		System.out.println(pizza.getCost());
	}
}
