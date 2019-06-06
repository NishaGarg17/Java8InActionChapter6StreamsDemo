package com.java8.streamsDemo.demoApps;

import java.util.Scanner;
import java.util.stream.IntStream;
import static java.util.stream.Collectors.*;

import java.util.List;
import java.util.Map;

public class CollectorsPartitioningNumbersIntoPrimeOrNot {
	public static void main(String args[]) {
		System.out.println("Provide Range to check primes: ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Map<Boolean, List<Integer>> givenRangePartionedByPrimes = IntStream.rangeClosed(2, n).boxed()
				.collect(partitioningBy(candidate -> isPrimeNumber(candidate)));
		givenRangePartionedByPrimes.get(true).forEach(System.out::println);
	}

	public static boolean isPrimeNumber(int candidate) {
		return IntStream.range(2, candidate).noneMatch(i -> candidate % i == 0);
	}
}
