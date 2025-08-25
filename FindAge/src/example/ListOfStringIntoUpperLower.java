package example;

import java.util.Arrays;
import java.util.List;

public class ListOfStringIntoUpperLower {
	
	public static void main(String[] args) {
		 
		//list of string
		List<String> fruits = Arrays.asList("appHJKle","bAnAna");
		
		//uppercase
		List<String> Uppercase = fruits.stream().map(n -> n.toUpperCase()).toList();
	
		//lowercase
		List<String> Lowercase = fruits.stream().map(n -> n.toLowerCase()).toList();
		
		
		System.out.println(Uppercase);
		System.out.println(Lowercase);
		
		//method reference
		//upper
		List<String> MethodUppercase = fruits.stream().map(String::toUpperCase).toList();
		
		System.out.println(MethodUppercase);

		//lower
		List<String> MethodLowercase = fruits.stream().map(String::toLowerCase).toList();

		System.out.println(MethodLowercase);

	}

}
