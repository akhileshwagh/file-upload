package example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumberStartWith2 {

	public static void main(String[] args) {
		
		  List<Integer> numbers = Arrays.asList(
				  -21, 52, -24, 89, 23, 252, 93, 247);
		  
		  //1st method
		  
		  List<Integer> numStartWith2 = numbers .stream() .map(e -> String.valueOf(e))
		  .filter(e -> e.startsWith("2") || e.startsWith("-2")) .map(Integer::parseInt)
		  //.map(Integer::valueOf)
		  
		  .collect(Collectors.toList());
		 
		// 2nd method
		  List<Integer> numStartWith3 = numbers.stream().map(e->String.valueOf(e))
		  .filter(e->e.startsWith("2")) .map(Integer::valueOf)
		  .collect(Collectors.toList());
		 

		System.out.println(numStartWith2);
		 System.out.println(numStartWith3);

	}

}
