package com.sushmit.StructuralPattern.DecoratorPattern.GoodCode;

abstract class PizzaDecorator implements Pizza{

	protected Pizza decoratedPizza;
	
	public PizzaDecorator(Pizza pizza) {
		this.decoratedPizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return decoratedPizza.getDescription();
	}

	@Override
	public double getCost() {
		return decoratedPizza.getCost();
	}

}
