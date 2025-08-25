package example;

import java.util.Arrays;
import java.util.List;

public class StringConcat {
	public static void main(String[] args) {

		String x = "abc";
		String y = "abc";

		StringBuilder sb = new StringBuilder(x);
		// x.concat(y);
		// x = x.concat(y);
		// String x =x.concat(y);
		// String b = x.concat(y);
		sb.append(y);
		System.out.println(sb);
		List<Integer>list = Arrays.asList(1,4,50,6,1,4);
        int sum3 = list.stream().mapToInt(i -> i.intValue()).sum();
        System.out.println("Sum of numbers :: " + sum3);

	}

}
