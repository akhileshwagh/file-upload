package example;

import java.util.ArrayList;
import java.util.List;

public class FindFirstDigitAs1 {

	public static int getFirstNumber(int num) {

		while (num >= 10) {
			num = num / 10;
		}
		return num;
	}

	public static List<Integer> getNumbersList(int arr[]) {

		List<Integer> numbers = new ArrayList<>();

		for (int num : arr) {

			int n = getFirstNumber(num);
			if (n == 1) {
				numbers.add(num);

			}

		}
		return numbers;
	}

	public static void main(String[] args) {

		// find first no fromthe given array
		int arr[] = { 1, 31, 1215, 56, 121, 45, 151, 26, 18 };
		
		System.out.println(getNumbersList(arr));
	}

}
