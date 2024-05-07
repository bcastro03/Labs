import java.util.Arrays;

public class Anagram {

	public static boolean checkifAnagram(String s, String t) {
		if (s.length() == t.length()) {
			return true;

		}
		char[] s1 = s.toCharArray();
		char[] t1 = t.toCharArray();
		Arrays.sort(s1);
		Arrays.sort(t1);
		if (s1 == t1) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		String s = "Silent";
		String t = "Listen";
		System.out.print(checkifAnagram(s, t));

	}
}
