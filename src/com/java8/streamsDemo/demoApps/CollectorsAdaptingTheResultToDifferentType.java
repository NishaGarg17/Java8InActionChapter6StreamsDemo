package com.java8.streamsDemo.demoApps;

import java.util.Optional;

import com.java8.streamsDemo.entity.Dish;
import com.java8.streamsDemo.enums.Type;
import com.java8.streamsDemo.utility.MenuUtility;
import static java.util.Comparator.*;
import static java.util.stream.Collectors.*;

import java.util.Map;

public class CollectorsAdaptingTheResultToDifferentType {

	public static void main(String[] args) {
		Map<Type, Dish> maxCalorieDishTypeBased = MenuUtility.getMenu().getDishList().stream().collect(groupingBy(Dish :: getType,collectingAndThen(maxBy(comparing(Dish :: getCalories)), Optional :: get)));
		System.out.println(maxCalorieDishTypeBased);
	}

}
