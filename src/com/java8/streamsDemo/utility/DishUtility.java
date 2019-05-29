package com.java8.streamsDemo.utility;

import java.util.ArrayList;

import com.java8.streamsDemo.entity.Dish;
import com.java8.streamsDemo.enums.Type;

public class DishUtility {
	public static ArrayList<Dish> createAndGetDishList() {
		ArrayList<Dish> dishList = new ArrayList<Dish>();
		dishList.add(new Dish("pork", false, 800, Type.MEAT));
		dishList.add(new Dish("salmon", false, 450, Type.FISH));
		dishList.add(new Dish("french fries", true, 530, Type.VEG));
		dishList.add(new Dish("rice", true, 350, Type.VEG));
		dishList.add(new Dish("pizza", true, 550, Type.VEG));
		dishList.add(new Dish("prawns", false, 300, Type.FISH));
		dishList.add(new Dish("season fruit", true, 120, Type.VEG));
		dishList.add(new Dish("beef", false, 700, Type.MEAT));
		dishList.add(new Dish("chicken", false, 400, Type.MEAT));
		return dishList;
	}
}
