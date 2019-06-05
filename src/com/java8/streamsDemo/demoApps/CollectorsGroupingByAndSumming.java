package com.java8.streamsDemo.demoApps;

import com.java8.streamsDemo.entity.Dish;
import com.java8.streamsDemo.enums.CaloricLevel;
import com.java8.streamsDemo.enums.Type;
import com.java8.streamsDemo.utility.MenuUtility;
import static java.util.stream.Collectors.*;

import java.util.Map;
import java.util.Set;
public class CollectorsGroupingByAndSumming {

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
