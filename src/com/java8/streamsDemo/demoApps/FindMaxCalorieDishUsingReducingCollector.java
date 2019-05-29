package com.java8.streamsDemo.demoApps;

import java.util.Comparator;
import static java.util.stream.Collectors.*;
import java.util.Optional;

import com.java8.streamsDemo.entity.Dish;
import com.java8.streamsDemo.utility.MenuUtility;

public class FindMaxCalorieDishUsingReducingCollector {

	public static void main(String[] args) {
		Optional<Dish> mostCalorieDish = MenuUtility.getMenu().getDishList().stream()
				.sorted(Comparator.comparing(Dish::getCalories).reversed()).findFirst();
		mostCalorieDish.ifPresent(System.out::println);
		
		// Find out max calorie dish using Collector Reducing
		mostCalorieDish = MenuUtility.getMenu().getDishList().stream().collect(maxBy(Comparator.comparing(Dish :: getCalories)));
		mostCalorieDish.ifPresent(System.out::println);
	}

}
