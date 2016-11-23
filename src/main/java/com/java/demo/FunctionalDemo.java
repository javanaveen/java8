package main.java.com.java.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FunctionalDemo {
	public void demo() {
		System.out.println("Demonstration of functional paradigm in Java 8");
		
		List<Integer> list = Arrays.asList(11, 22, 33, 44, 55, 66, 77, 88, 99);
		
		System.out.println("Printing list using forEach and lambda expression...");
		list.forEach((a) -> System.out.println(a));
		
		System.out.println("Printing through parallel stream...");
		list.parallelStream().forEach((a) -> System.out.println(a));
		
		System.out.println("Doubling each element using map...");
		list = list.stream().map(i -> 2 * i).collect(Collectors.toList());
		
		System.out.println(list);
		
		System.out.println("Filter elements greater than 100 ...");
		list = list.stream().filter(i -> i <= 100).collect(Collectors.toList());
		
		System.out.println(list);
		
		System.out.println("Sum of the remaining elements...");
		int sum = list.stream().reduce(0, (i, j) -> i + j);
		
		System.out.println(sum);
	}
}
