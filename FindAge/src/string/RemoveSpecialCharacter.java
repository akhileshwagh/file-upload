package string;

public class RemoveSpecialCharacter {
	public static void main(String[] args) {
		
		
		String str = "j!a%va ^&i$$s *aw()es_o-me";
		
		String removedSpecialCharacter = str.replaceAll("[^a-zA-Z0-9]", "");
		
		System.out.println(removedSpecialCharacter);
	}

}
