package com.java8.streamsDemo.demoApps;

import static java.util.stream.Collectors.*;

import java.util.Map;
import java.util.Optional;

import static java.util.Comparator.*;

import com.java8.streamsDemo.entity.Dish;
import com.java8.streamsDemo.enums.Type;
import com.java8.streamsDemo.utility.MenuUtility;

public class CollectorsGroupingByAndMax {

	public static void main(String[] args) {
		Map<Type, Optional<Dish>> maxCalorieDishesGroupedByType = MenuUtility.getMenu().getDishList().stream().collect(groupingBy(Dish :: getType, maxBy(comparing(Dish :: getCalories))));
	maxCalorieDishesGroupedByType.values().forEach(dish -> {Dish dishValue = dish.get();
	System.out.println(dishValue);;
	});
		//maxCalorieDishesGroupedByType.values().forEach(System.out :: println);
		
	}

}
