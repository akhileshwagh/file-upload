package example;

public class CapitalizeString {

	public static String capitalizeWord(String str) {
		
		
		if(str == null) {
			System.out.println("string is null");
			return str;
		}
		
		
		if(str.length()==1) {
			return str.toUpperCase();
		}

		String[] words = str.split("\\s");
		String result = "";

		for (String w : words) {

			String first = w.substring(0, 1).toUpperCase(); // A
			String restString = w.substring(1, w.length()); // khilesh

			//result = result + first + restString; // AkhileshSoftwareDeveloper
			 result = result + first + restString + " "; //Akhilesh Software Developer
		}

		// System.out.println(result);
		return result.trim();

	}

	public static void main(String[] args) {

		String cap = capitalizeWord("akhilesh software developer"); // AkhileshSoftwareDeveloper
		System.out.println(cap);
	
		cap = capitalizeWord("akhilesh"); // Akhilesh
		System.out.println(cap);
		
		cap = capitalizeWord("a"); // A
		System.out.println(cap);
		
		cap = capitalizeWord("a a a a "); // A
		System.out.println(cap);
		
		cap = capitalizeWord("123"); // A
		System.out.println(cap);
	
		cap = capitalizeWord("123 akhilesh"); // A
		System.out.println(cap);
	
	}

}
