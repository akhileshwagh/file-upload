package example;

import java.util.Arrays;
import java.util.List;

public class AverageOfNumbers {
	
	public static void main(String[] args) {
		
		List<Integer> numbers = Arrays.asList(10,20,30,40);
		
		double average = numbers.stream().mapToInt(num->num.intValue()).average().getAsDouble();
		
		System.out.println(average);
	}

}
