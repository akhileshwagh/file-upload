package string;

import java.util.HashMap;
import java.util.Map;

public class FindOccurenceOfEachCharacter {
	public static void main(String[] args) {

		String str = "alalkjcbje";

		Map<Character, Integer> map = new HashMap<>();

		char[] charArray = str.toCharArray();

		for (char ch : charArray) {

			if (!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				int count = map.get(ch);
				map.put(ch, count+1);
			}
		}
		System.out.println(map);
	}

}
