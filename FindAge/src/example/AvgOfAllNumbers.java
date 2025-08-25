package example;

import java.util.Arrays;
import java.util.List;

public class AvgOfAllNumbers {
	public static void main(String[] args) {
		
		List<Integer> list= Arrays.asList(-1,2,3,4,5);
		
		double average = list.stream().mapToInt(e->e.intValue()).average().getAsDouble();
		
		System.out.println(average);
		
		
		
	}

}
