package example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SkipLimit {
	public static void main(String[] args) {
		 List<Integer> list = Arrays.asList(1,2,5,45,85,12,45,23,29,47,23);

		 List<Integer> first5 = list.stream().limit(5).collect(Collectors.toList());
		 
		 Integer first5Sum = list.stream().limit(5).reduce((p,q)-> (p+q)).get();
		 
		 System.out.println(first5);
		 System.out.println(first5Sum);
		 
         List<Integer> skip5 = list.stream().skip(5).collect(Collectors.toList());
		 
		 Integer skip5Sum = list.stream().skip(5).reduce((p,q)-> (p+q)).get();
		 
		 System.out.println(skip5);
		 System.out.println(skip5Sum);
		 
		 
		 
		 
	}

}
