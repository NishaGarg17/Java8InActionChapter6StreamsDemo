package com.java8.streamsDemo.demoApps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.java8.streamsDemo.entity.Dish;
import com.java8.streamsDemo.enums.Type;
import com.java8.streamsDemo.utility.MenuUtility;

public class GroupDishesByTypeImerativeStyle {
	public static void main(String args[]) {
		ArrayList<Dish> dishList = MenuUtility.getMenu().getDishList();
		MenuUtility.pritnMenu(dishList);
		
		HashMap<Type, List<Dish>> dishesGroupedByType = new HashMap<Type, List<Dish>>();
		
		for(Dish dish : dishList) {
			Type dishType = dish.getType();
			List<Dish> dishesByType = dishesGroupedByType.get(dishType);
			if(dishesByType == null) {
				dishesByType = new ArrayList<Dish>();
				dishesGroupedByType.put(dishType, dishesByType);
			}
			dishesByType.add(dish);
		}
		
		dishesGroupedByType.entrySet().forEach(System.out :: println);
	}
}
