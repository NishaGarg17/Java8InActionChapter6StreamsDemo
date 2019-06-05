package com.java8.streamsDemo.demoApps;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.java8.streamsDemo.entity.Dish;
import com.java8.streamsDemo.enums.CaloricLevel;
import com.java8.streamsDemo.utility.MenuUtility;

public class FindCaloricLevelUsingCollectorsGrouping {
	

	public static void main(String[] args) {
		Map<CaloricLevel, List<Dish>> dishesGroupedByCaloricLevel = MenuUtility.getMenu().getDishList().
		stream().collect(Collectors.groupingBy(dish -> {
			if(dish.getCalories()<= 400) return CaloricLevel.DIET;
			else if(dish.getCalories()<= 700) return CaloricLevel.NORMAL;
			else 
				return CaloricLevel.FAT;
			 }));
		
		dishesGroupedByCaloricLevel.entrySet().forEach(System.out :: println);

	}

}
