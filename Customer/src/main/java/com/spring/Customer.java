package com.spring;

public class Customer {
	private Food food;
	
	public Customer() {}

	public Customer(Food food) {
		super();
		this.food = food;
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}
	
	public void OrderAt() {
		food.Order();
	}
	
}
