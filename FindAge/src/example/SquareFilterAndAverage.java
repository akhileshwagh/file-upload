package example;

import java.util.Arrays;
import java.util.List;

public class SquareFilterAndAverage {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 5, 10, 12,15);
		
		double result = list.stream()
				.map(e->e*e)
					.filter(e->e>100)
						.mapToInt(e->e.intValue())
							.average()
								.getAsDouble();
		
		System.out.println(result);

	}

}
