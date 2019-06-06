package com.java8.streamsDemo.demoApps;


import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import com.java8.streamsDemo.entity.Dish;
import com.java8.streamsDemo.enums.Type;
import com.java8.streamsDemo.utility.MenuUtility;
import static java.util.stream.Collectors.*;

public class CollectorsPartitioning {

	public static void main(String[] args) {
		Predicate<Dish> predicate = dish -> dish.isVegetarian(); 
		
	
		Map<Boolean, List<Dish>> dishListPartionedByVegAsTrue = 
				MenuUtility.getMenu().getDishList().stream().collect(partitioningBy(predicate));
		System.out.println(dishListPartionedByVegAsTrue.get(true));
		
		Map<Boolean, List<Dish>> dishListPartionedByNonVegAsTrue =MenuUtility.getMenu().getDishList().stream().collect(partitioningBy(predicate.negate()));
		System.out.println(dishListPartionedByNonVegAsTrue.get(true));
		
	}

}
