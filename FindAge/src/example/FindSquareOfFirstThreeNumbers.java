package example;

import java.util.Arrays;
import java.util.List;

public class FindSquareOfFirstThreeNumbers {
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		List<Integer> result = numbers
				.stream()
				.filter((n) -> n % 2 == 0)
				.limit(4)
				.map((n) -> n * n)
				.toList();

		System.out.println(result);
	}

}
