package PractiseCode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class PalindromePermutation {

	public boolean canPermutePalindrome(String s) {

		//The idea of finding permute (possible arrangments) palindrom by using parity check that is to keep track of
		// frequency of characters in string using HashSet.
		// If length of the string is odd this means there will be a middle character that is occuring once and other all characters will be in even frequency.
		// By the end of the traversal our HashSet should contain maximum one character for valid palindrom strings.
		if(s.length() <= 1) return true;

		HashSet<Character> set = new HashSet();

		for (int i = 0; i < s.length(); i++) {
			Character c = s.charAt(i);

			if(set.contains(c)) {
				set.remove(c);
			} else {
				set.add(c);
			}
		}

		return (set.size() <= 1);
	}
	class Solution {
		public boolean canPermutePalindrome(String s) {
			char[] sToChars = new char[256];
			int oddAmount = 0;

			for(char c: s.toCharArray()){
				sToChars[c]++;
			}

			for (int i:sToChars){
				oddAmount += (i % 2 == 1) ? 1 : 0;

				if(oddAmount > 1){
					return false;
				}
			}
			return true;
		}
	}
	// it can be palindrome if these conditions met:
	// 1. odd length s, max only 1 char with odd freq
	// 2. even length s, 0 char with odd freq, so over all at most there is only 1 odd freq char
	static boolean Pap(String s){
		HashMap<Character, Integer> map = new HashMap<>();

		for(int i=0; i<s.length(); i++) {
		map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
	}

	int numOfOddChar = 0;
		for(Map.Entry<Character,Integer> entry: map.entrySet()) {
		if(entry.getValue() % 2 != 0) {
			numOfOddChar++;
		}
	}

		return numOfOddChar <= 1;
}
}
