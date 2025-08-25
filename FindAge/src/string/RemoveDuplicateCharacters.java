package string;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateCharacters {
	public static void main(String[] args) {
		String str = "programming";

		/*
		 * // approach 1 StringBuilder sb = new StringBuilder();
		 * str.chars().distinct().forEach(c -> sb.append((char) c));
		 * System.out.println(sb);
		 * 
		 * // approach 2
		 * 
		 * StringBuilder sb1 = new StringBuilder(); for (int i = 0; i < str.length();
		 * i++) {
		 * 
		 * char ch = str.charAt(i); int indexOf = str.indexOf(ch, i + 1); if (indexOf ==
		 * -1) { sb1.append(ch); }
		 * 
		 * } System.out.println(sb1);
		 */

		// approach 4

		// StringBuilder sb4 = new StringBuilder();
		Set<Character> set = new LinkedHashSet<>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		for (Character c : set) {

			// sb4.append(h);
			System.out.print(c);
		}

		// approach 4.2

		StringBuilder sb4 = new StringBuilder();
		Set<Character> set1 = new LinkedHashSet<>();
		for (int i = 0; i < str.length(); i++) {
			set.add(str.charAt(i));
		}
		for (Character c : set) {
			sb4.append(c);
		}
		System.out.print(sb4);
	}
}
