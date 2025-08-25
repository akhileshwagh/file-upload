package string;

public class ReplaceCharacterWithOccurence {

	public static void main(String[] args) {
		String input = "opentext";

		char characterToReplace = 't';

		if (input.indexOf(characterToReplace) == -1) {
			System.out.println("given character is not present in the string");
			System.exit(0);
			}
		

		int count = 1;
		for (int i = 0; i < input.length(); i++) {
			char ch = input.charAt(i);
			if (ch == characterToReplace) {

				input = input.replaceFirst(String.valueOf(characterToReplace), String.valueOf(count));
				count++;
			}
			
		}
		System.out.println(input);

	}

}
