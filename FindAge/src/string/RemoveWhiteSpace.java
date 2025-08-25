package string;

public class RemoveWhiteSpace {
	
	public static void main(String[] args) {
		 String str = "  j   a v  a st a   r  ";
		 
		 String removedSpaces = str.replaceAll("\\s", "");
		 
		 System.out.println(removedSpaces);
		 
	}

}
