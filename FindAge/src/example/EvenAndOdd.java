package example;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class EvenAndOdd {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

		// even
		Set<Integer> Evenlist = list.stream().filter(e -> e % 2 == 0).collect(Collectors.toSet());

		System.out.println(Evenlist);

		// odd
		Set<Integer> Oddlist = list.stream().filter(e -> e % 2!= 0).collect(Collectors.toSet());

		System.out.println(Oddlist);

	}
}
