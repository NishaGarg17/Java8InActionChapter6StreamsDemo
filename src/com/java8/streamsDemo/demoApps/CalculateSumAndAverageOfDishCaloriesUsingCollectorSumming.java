package com.java8.streamsDemo.demoApps;

import com.java8.streamsDemo.entity.Dish;
import com.java8.streamsDemo.utility.MenuUtility;
import static java.util.stream.Collectors.*;

public class CalculateSumAndAverageOfDishCaloriesUsingCollectorSumming {
	public static void main(String args[]) {
		Integer dishCaloriesSum = MenuUtility.getMenu().getDishList().stream().collect(summingInt(Dish :: getCalories));
		System.out.println("Sum of Calories are: " + dishCaloriesSum);
		Double dishCalorieAverage = MenuUtility.getMenu().getDishList().stream().collect(averagingInt(Dish :: getCalories));
		System.out.println("Average of Calories are: " + dishCalorieAverage);
	}
}
