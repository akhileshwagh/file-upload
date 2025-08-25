package example;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PrintDuplicateNo {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1, 1, 2, 3, 4, 4, 5, 6, 7, 7, 8, 9, 9);
		List<Integer> list1 = Arrays.asList(1, 2, 2, 3, 3, 4, 5, 6, 6, 7, 8, 8, 9);


		Set<Integer> duplicateNo = list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet());
		System.out.println(duplicateNo);
		
		
		Set<Integer> dupNum = new HashSet<>();
		Set<Integer> duplicateNo2 = list1.stream().filter(e->!dupNum.add(e)).collect(Collectors.toSet());
	
	  System.out.println(duplicateNo2);
	
	}

}
