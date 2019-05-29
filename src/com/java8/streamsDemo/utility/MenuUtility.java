package com.java8.streamsDemo.utility;

import java.util.ArrayList;

import com.java8.streamsDemo.entity.Dish;
import com.java8.streamsDemo.entity.Menu;

public class MenuUtility {
	static Menu menu;
	public static Menu getMenu() {
	 menu = new Menu(DishUtility.createAndGetDishList());
		return menu;
	}
	public static void pritnMenu(ArrayList<Dish> dishList) {
		for(Dish dish : dishList) {
			System.out.println(dish);
		}
	}
}
