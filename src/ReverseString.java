public class ReverseString {

	public static void main(String[] args) {

		String str = "789";
		System.out.println(reverseString(str));
	}

	public static String reverseString(String in) {
		if (in == null)
			throw new IllegalArgumentException("input null");

		StringBuilder out = new StringBuilder();

		char[] chars = in.toCharArray();

		for (int i = chars.length - 1; i >= 0; i--)
			out.append(chars[i]);

		return out.toString();
	}
}
