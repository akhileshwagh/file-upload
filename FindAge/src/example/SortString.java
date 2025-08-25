package example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortString {
	public static void main(String[] args) {
		 List<String > fruits = Arrays.asList( "mango","banana","apple","tomato","pineapple","grape");
		 
		 List<String> Sorted = fruits.stream().sorted().toList();
		 System.out.println(Sorted);
		 
		 List<String> reversedSorted = fruits.stream().sorted(Comparator.reverseOrder()).toList();
		  System.out.println(reversedSorted);
		  
		  List<String> reversedSorted1 = fruits.stream().sorted(Collections.reverseOrder()).toList();
		  System.out.println(reversedSorted1);
		 
	}

}
