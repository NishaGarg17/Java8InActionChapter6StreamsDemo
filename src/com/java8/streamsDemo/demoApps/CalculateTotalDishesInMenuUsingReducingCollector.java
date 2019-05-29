package com.java8.streamsDemo.demoApps;

import com.java8.streamsDemo.utility.MenuUtility;
import static java.util.stream.Collectors.*;

public class CalculateTotalDishesInMenuUsingReducingCollector {

	public static void main(String[] args) {
	 Long dishCountInMenu = MenuUtility.getMenu().getDishList().stream().collect(counting());
	 System.out.println("Dish Count is: " + dishCountInMenu);

	}

}
