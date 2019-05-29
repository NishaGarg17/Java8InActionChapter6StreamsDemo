package com.java8.streamsDemo.demoApps;


import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

import java.util.ArrayList;

import com.java8.streamsDemo.entity.Dish;
import com.java8.streamsDemo.enums.Type;
import com.java8.streamsDemo.utility.MenuUtility;

public class GroupDishesByTypeFunctionalStyleUsingStreams {

	public static void main(String[] args) {
		ArrayList<Dish> dishList = MenuUtility.getMenu().getDishList();
		MenuUtility.pritnMenu(dishList);
		
		Map<Type, List<Dish>> dishesGroupedByTypeMap = MenuUtility.getMenu().getDishList().stream().collect(groupingBy(Dish :: getType));
		
		dishesGroupedByTypeMap.entrySet().forEach(System.out :: println);
	

	}


}
