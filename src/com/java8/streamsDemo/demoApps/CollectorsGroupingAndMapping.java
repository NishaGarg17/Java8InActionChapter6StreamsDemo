package com.java8.streamsDemo.demoApps;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.mapping;
import static java.util.stream.Collectors.toSet;

import java.util.Map;
import java.util.Set;

import com.java8.streamsDemo.entity.Dish;
import com.java8.streamsDemo.enums.CaloricLevel;
import com.java8.streamsDemo.enums.Type;
import com.java8.streamsDemo.utility.MenuUtility;

public class CollectorsGroupingAndMapping {

	public static void main(String[] args) {
		Map<Type, Set<CaloricLevel>> typeBasedCaloricLevel = MenuUtility.getMenu().getDishList().stream().collect(groupingBy(Dish :: getType, mapping(dish ->
		{
			if(dish.getCalories() <= 400) 
				return CaloricLevel.DIET;
			else if(dish.getCalories() > 700)
				return CaloricLevel.FAT;
			else
				return CaloricLevel.NORMAL;
			
		}, toSet())));
		typeBasedCaloricLevel.entrySet().forEach(System.out :: println);
		
	}
}


