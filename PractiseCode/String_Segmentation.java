package PractiseCode;

import java.util.HashSet;
import java.util.Set;

public class String_Segmentation {
	//Given a dictionary of words and an input string tell whether the input string can be completely segmented into dictionary words.
//Algo
	//n = length of input string
	//for i = 0 to n - 1
	//  first_word = substring (input string from index [0, i] )
	//  second_word = substring (input string from index [i + 1, n - 1] )
	//  if dictionary has first_word
	//    if second_word is in dictionary OR second_word is of zero length, then return true
	//    recursively call this method with second_word as input and return true if it can be segmented

	public static boolean canSegmentString(String s, Set <String> dictionary) {
		for (int i = 1; i <= s.length(); ++i) {
			String first = s.substring(0, i);
			if (dictionary.contains(first)) {
				String second = s.substring(i);

				if (second == null || second.length() == 0 || dictionary.contains(second) || canSegmentString(second, dictionary)) {
					return true;
				}

			}
		}
		return false;
	}

	public static void main(String[] args) {
		Set< String > dictionary = new HashSet< String >();
		String s = new String();
		s = "hellonow";

		dictionary.add("hello");
		dictionary.add("hell");
		dictionary.add("on");
		dictionary.add("now");
		if (canSegmentString(s, dictionary)) {
			System.out.println("String Can be Segmented");
		} else {
			System.out.println("String Can NOT be Segmented");
		}
	}
}
