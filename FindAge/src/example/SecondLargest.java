package example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

//find the second largest no in the list of Integer

public class SecondLargest {

	public static void main(String[] args) {

		int[] number = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		List<Integer> numbers = Arrays.asList(10);
		Integer secondSmallest = numbers.stream().distinct().sorted().skip(1).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("element not found"));
		System.out.println(secondSmallest);

		/*
		 * Integer secondLargest =
		 * numbers.stream().distinct().sorted(Collections.reverseOrder()).skip(1).
		 * findFirst() .get();
		 * 
		 * System.out.println(secondLargest);
		 */

	}

}
