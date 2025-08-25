package example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class MaxMinInListOfInteger {
	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(5, 8, 10, 52, 45, 85);

		Stream<Integer> stream = numbers.stream();
		
		//max
		int max = stream.mapToInt((num) -> num.intValue()).max().getAsInt();
		//System.out.println(max);
		
		
		Integer max1 = numbers.stream().max(Comparator.comparing(x -> x.intValue())).get();
		System.out.println(max1);
		
		
		//min
		int min = numbers.stream().mapToInt((num) -> num.intValue()).min().getAsInt();
		
		Integer min1 = numbers.stream().min(Comparator.comparing(Integer::intValue)).get();
		System.out.println(min1);
		
		//System.out.println(min1);

		//shortcut + method reference
		
		//int max = numbers.stream().mapToInt(Integer::intValue).max().getAsInt();
		
	}

}
