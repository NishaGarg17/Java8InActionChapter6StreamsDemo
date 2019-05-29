package com.java8.streamsDemo.demoApps;

import com.java8.streamsDemo.entity.Dish;
import com.java8.streamsDemo.utility.MenuUtility;
import static java.util.stream.Collectors.*;

import java.util.Optional;
public class CollectorReducing {

	public static void main(String[] args) {
		Integer totalCalorieCount = MenuUtility.getMenu().getDishList().stream().collect(reducing(0, Dish :: getCalories, (i,j) -> i+j));
		System.out.println("Total Calorie value is: " + totalCalorieCount);
		
		Optional<Dish> mostCalorieDish = MenuUtility.getMenu().getDishList().stream().collect(reducing((d1,d2) -> d1.getCalories() > d2.getCalories() ? d1 : d2));
		mostCalorieDish.ifPresent(System.out :: println);
	}

}
