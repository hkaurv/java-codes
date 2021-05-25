package PractiseCode;

public class FirstNonRepeatingCharacter_O_N {//linear time

	static char firstNonRepeatingChar(String s) {
		int[] char_counts = new int[26]; // take an array for all alpabets

		for (char c : s.toCharArray()) char_counts[c - 'a']++; //a-a =0; then increment by 1
		for (char c : s.toCharArray()) {
			if (char_counts[c - 'a'] == 1) return c; // where frequency is one
		}
		return '_';

	}

}
