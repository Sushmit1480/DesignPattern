package com.sushmit.StructuralPattern.DecoratorPattern.GoodCode;

public class CheeseDecorator extends PizzaDecorator{
	
	public CheeseDecorator(Pizza pizza) {
		super(pizza);
	}
	
	public String getDescription() {
		return decoratedPizza.getDescription() + ", Cheese";
	}
	
	public double getCost() {
		return decoratedPizza.getCost() + 1.00;
	}
}
