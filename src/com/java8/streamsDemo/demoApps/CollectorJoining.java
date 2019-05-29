package com.java8.streamsDemo.demoApps;

import com.java8.streamsDemo.entity.Dish;
import com.java8.streamsDemo.utility.MenuUtility;
import static java.util.stream.Collectors.*;
public class CollectorJoining {

	public static void main(String[] args) {
		String shortMenu = MenuUtility.getMenu().getDishList().stream().map(Dish :: getName).collect(joining());
		System.out.println("Short Menu is: " + shortMenu);
		String shortMenuReadable = MenuUtility.getMenu().getDishList().stream().map(Dish :: getName).collect(joining(","));
		System.out.println("Short Menu is(Readable): " + shortMenuReadable);
	}

}
