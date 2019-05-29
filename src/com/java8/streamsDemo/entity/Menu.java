package com.java8.streamsDemo.entity;

import java.util.ArrayList;

public class Menu {
	private ArrayList<Dish> dishList;

	public ArrayList<Dish> getDishList() {
		return dishList;
	}

	public void setDishList(ArrayList<Dish> dishList) {
		this.dishList = dishList;
	}

	public Menu(ArrayList<Dish> dishList) {
		super();
		this.dishList = dishList;
	}
	
}
