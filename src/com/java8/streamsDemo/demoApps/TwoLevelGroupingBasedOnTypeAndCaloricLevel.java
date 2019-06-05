package com.java8.streamsDemo.demoApps;

import static java.util.stream.Collectors.groupingBy;

import java.util.List;
import java.util.Map;
import com.java8.streamsDemo.enums.*;
import com.java8.streamsDemo.entity.Dish;
import com.java8.streamsDemo.enums.CaloricLevel;
import com.java8.streamsDemo.utility.MenuUtility;

public class TwoLevelGroupingBasedOnTypeAndCaloricLevel {
	
	public static void main(String[] args) {
		Map<Type, Map<CaloricLevel, List<Dish>>> dishesGroupedByTypeCaloricLevel = MenuUtility.getMenu().getDishList().stream().collect(groupingBy(Dish :: getType, groupingBy(dish -> {
			if(dish.getCalories() <= 400) 
				return CaloricLevel.DIET;
			else if(dish.getCalories() > 700)
				return CaloricLevel.FAT;
			else 
				return CaloricLevel.NORMAL;
		})));
		
		dishesGroupedByTypeCaloricLevel.entrySet().forEach(System.out :: println);;

	}

}
