public class StringContainsVowels {

	public static boolean 
		stringContainsVowels(String input) {

		return input.toLowerCase().matches(".*[aeiou].*");

	}	

	public static void main(String[] args) {

		String input = "fdfd";

		System.out.print(input + " ");

		if (stringContainsVowels(input) == true) {
		System.out.println("contains vowel"); 
		} else {
		System.out.println("does not contain vowel");
		}
	}

}
