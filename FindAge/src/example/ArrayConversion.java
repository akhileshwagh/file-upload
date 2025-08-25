package example;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayConversion {
	public static void main(String[] args) {

		String[] arr = { "t", "r", "v" };

		String join = String.join(":", arr);

		System.out.println(join);

		// Using Stream

		String join1 = Arrays.asList(arr).stream().collect(Collectors.joining("|"));

		System.out.println(join1);

		String join2 = Arrays.asList(1, 2, 3, 4, 5).stream().map(m -> String.valueOf(m))
				.collect(Collectors.joining("|"));
		
		System.out.println(join2);

		System.out.println(joinString(";", arr));
		System.out.println(joinInt(";", 1, 2, 3, 4, 5));

	}

	public static String joinString(String separator, String... values) {

		StringBuilder sb = new StringBuilder();
		int end = 0;

		for (String s : values) {
			if (s != null) {
				sb.append(s);
				end = sb.length();
				sb.append(";");

			}

		}
		return sb.substring(0, end);
	}

	public static String joinInt(String separator, Integer... values) {

		StringBuilder sb = new StringBuilder();
		int end = 0;

		for (Integer s : values) {
			if (s != null) {
				sb.append(s);
				end = sb.length();
				sb.append(";");

			}

		}
		return sb.substring(0, end);
	}

}
