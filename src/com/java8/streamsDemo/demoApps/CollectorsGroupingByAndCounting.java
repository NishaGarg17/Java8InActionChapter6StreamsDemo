package com.java8.streamsDemo.demoApps;

import com.java8.streamsDemo.entity.Dish;
import com.java8.streamsDemo.enums.Type;
import com.java8.streamsDemo.utility.MenuUtility;
import static java.util.stream.Collectors.*;

import java.util.Map;

public class CollectorsGroupingByAndCounting {

	public static void main(String[] args) {
		Map<Type, Long> dishCountGroupedByType = MenuUtility.getMenu().getDishList().stream().collect(groupingBy(Dish :: getType, counting()));
		
		dishCountGroupedByType.entrySet().forEach(System.out :: println);
		

	}

}
