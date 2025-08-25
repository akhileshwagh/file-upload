package string;

import java.util.Arrays;

public class SortStringAlphabetical {
	public static void main(String[] args) {

		String str = "edcba";

		char[] ch = str.toCharArray();

		char temp;

		for (int i = 0; i < ch.length; i++) {
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] > ch[j]) {

					temp = ch[i];
					ch[i] = ch[j];
					ch[j] = temp;
				}

			}
		}

		System.out.println(new String(ch));

		System.out.println("===========================");

		char charArray[] = str.toCharArray();

		Arrays.sort(charArray);

		System.out.println(charArray);

	}

}
