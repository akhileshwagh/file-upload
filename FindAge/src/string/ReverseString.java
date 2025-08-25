package string;

public class ReverseString {
	public static void main(String[] args) {

		String str = "hello";
		// approach 1
		char[] charArray = str.toCharArray();

		for (int i = charArray.length - 1; i >= 0; i--) {
			System.out.print(charArray[i]);
		}

		System.out.println("");

		// approach 2
		for (int i = str.length() - 1; i >= 0; i--) {

			System.out.print(str.charAt(i));
		}

		System.out.println("");

		// approach 3
		StringBuffer sb = new StringBuffer(str);
		StringBuffer reverse = sb.reverse();
		System.out.print(reverse);
		
		System.out.println("");

		// approach 4
		StringBuilder sb1= new StringBuilder(str);
		StringBuilder reverse1 = sb1.reverse();
		System.out.print(reverse1);

	}

}
