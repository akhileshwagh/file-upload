package example;

import java.util.Arrays;
import java.util.List;

public class RemoveDuplicateElement {

	public static void main(String[] args) {

		// list of Integer
		List<Integer> numbers = Arrays.asList(1, 2, 2, 5, 6, 5, 9);
		List<Integer> list = numbers.stream().distinct().toList();

		System.out.println(list);

		// list of string
		List<String> fruits = Arrays.asList("apple", "banana", "banana", "mango");

		List<String> list2 = fruits.stream().distinct().toList();

		System.out.println(list2);

	}

}
