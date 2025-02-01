package com.sushmit.StructuralPattern.DecoratorPattern.GoodCode;

public class MushroomDecorator extends PizzaDecorator{

	public MushroomDecorator(Pizza pizza) {
		super(pizza);
	}
	
	public String getDescription() {
		return decoratedPizza.getDescription() + ", Mushroom";
	}
	
	public double getCost() {
		return decoratedPizza.getCost() + 2.00;
	}
}
