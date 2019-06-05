package com.java8.streamsDemo.demoApps;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.summingInt;

import java.util.Map;

import com.java8.streamsDemo.entity.Dish;
import com.java8.streamsDemo.enums.Type;
import com.java8.streamsDemo.utility.MenuUtility;


public class CollectorsGroupingByAndSumming {

	public static void main(String[] args) {
		Map<Type, Integer> dishCountGroupedByType = MenuUtility.getMenu().getDishList().stream().collect(groupingBy(Dish :: getType, summingInt(Dish :: getCalories)));
		System.out.println(dishCountGroupedByType);
	}

}
