package example;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CountCharacter {
	
	public static void main(String[] args) {
		
		String input = "hello left right";
		
		IntStream stream = input.chars();
		
		Map<Character,Long> characterCount = stream.mapToObj((c)-> (char)c)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.print(characterCount);
	
	}
	
	

}
