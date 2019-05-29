package com.java8.streamsDemo.demoApps;

import com.java8.streamsDemo.entity.Dish;
import com.java8.streamsDemo.utility.MenuUtility;
import static java.util.stream.Collectors.*;

import java.util.IntSummaryStatistics;

public class CollectorSummarizing {

	public static void main(String[] args) {
		IntSummaryStatistics menuStatistics = MenuUtility.getMenu().getDishList().stream().collect(summarizingInt(Dish :: getCalories));
		System.out.println("Dish Calorie Summary Statistics" + menuStatistics);

	}

}
