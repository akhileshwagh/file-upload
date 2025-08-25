package example;

import java.util.stream.IntStream;

//get sum of all digit
public class SumAllDigit {
	public static void main(String[] args) {
		 
		int input = 123456;
		
		IntStream stream = String.valueOf(input).chars();
		
		//int sum = stream.map((ch)->Character.getNumericValue(ch)).sum();
		
		int sum =String.valueOf(input).chars().map(Character::getNumericValue).sum();
		
		System.out.println(sum);
	}

}
