package com.java8.streamsDemo.demoApps;

import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.*;

import static java.util.Comparator.*;
import java.util.Map;
import java.util.Optional;

import com.java8.streamsDemo.entity.Dish;
import com.java8.streamsDemo.utility.MenuUtility;

public class CollectorsTwoLevelPartitioning {

	public static void main(String[] args) {
		// Dish List partitioned by veg and then grouped by Type
		System.out.println("List partitioned by veg and then grouped by Type");
		System.out.println(MenuUtility.getMenu().getDishList().stream()
				.collect(partitioningBy(Dish::isVegetarian, groupingBy(Dish::getType))));

		// Dish List partitioned by Type and then to find most Caloric dish
		Map<Boolean, Dish> maxCalorieDishAmongVegAndNonVeg = MenuUtility.getMenu().getDishList().stream()
				.collect(partitioningBy(Dish::isVegetarian,
						collectingAndThen(maxBy(comparing(Dish::getCalories)), Optional::get)));
		System.out.println("Max Calorie Dish Among Veg And Non Veg: ");
		System.out.println(maxCalorieDishAmongVegAndNonVeg);
	}

}
