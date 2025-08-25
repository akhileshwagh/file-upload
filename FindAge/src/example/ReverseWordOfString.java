package example;

import java.util.stream.Collectors;
import java.util.stream.Stream;

//reverse word of a string

public class ReverseWordOfString {
	public static void main(String[] args) {
		String input = "hellogh bhai";
		
		String result = Stream
				.of(input.split(" "))
				.map((word)-> new StringBuilder(word).reverse().toString())
				.collect(Collectors.joining(" "));

		System.out.print(result);
	}

}
