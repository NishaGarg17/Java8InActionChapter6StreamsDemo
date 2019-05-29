package com.java8.streamsDemo.entity;

import com.java8.streamsDemo.enums.Type;

public class Dish {
	private final String name;
	private final boolean vegetarian;
	private final int calories;
	private final Type type;
	public String getName() {
		return name;
	}
	public boolean isVegetarian() {
		return vegetarian;
	}
	public int getCalories() {
		return calories;
	}
	public Type getType() {
		return type;
	}
	
	@Override
	public String toString() {
		return "Dish [name=" + name + ", vegetarian=" + vegetarian + ", calories=" + calories + ", type=" + type + "]";
	}
	public Dish(String name, boolean vegetarian, int calories, Type type) {
		super();
		this.name = name;
		this.vegetarian = vegetarian;
		this.calories = calories;
		this.type = type;
	}
	
	
}
