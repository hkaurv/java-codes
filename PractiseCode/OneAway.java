package PractiseCode;

import java.util.Arrays;

public class OneAway {

	/*The length difference between two input strings should not be more than 1.
	When the length of the strings is same, the number of different chars should not be more than 1.
	If the length difference is 1, then either one char can be inserted in the short string or deleted
	from the longer string. Considering that, the number of different char should not be more than 1.
*/
	/*private static boolean isOneEdit(String first, String second) {
		// if the input string are same
		if (first.equals(second))
			return false;

		int len1 = first.length();
		int len2 = second.length();
		// If the length difference of the stings is more than 1, return false.
		if ((len1 - len2) > 1 || (len2 - len1) > 1  ) {
			return false;
		}
		int i = 0, j = 0;
		int diff = 0;
		while (i<len1 && j<len2) {
			char f = first.charAt(i);
			char s = second.charAt(j);
			if (f != s) {
				diff++;
				if (len1 > len2)
					i++;
				if (len2 > len1)
					j++;
				if (len1 == len2)
					i++; j++;
			}
			else{
				i++; j++;
			}
			if (diff > 1) {
				return false;
			}
		}
		// If the length of the string is not same. ex. "abc" and "abde" are not one edit distance.
		if (diff == 1 && len1 != len2 && (i != len1 || j != len2)) {
			return false;
		}
		return true;
	}
*/
	public static boolean oneEdit(String w1, String w2)
	{
		char[] word1= w1.trim().toCharArray();
		char[] word2 = w2.trim().toCharArray();

		int length1=word1.length;
		int length2=word2.length;

		if(Math.abs(length2-length1) > 1) return false;

		Arrays.sort(word1);
		Arrays.sort(word2);

		int length = word1.length >= word2.length? word2.length:word1.length; //take the minimum length

		int falseCounter=0;
		for(int i=0; i < length; i++ ) {
			if(word1[i] != word2[i] && ++falseCounter > 1){
				return false;
			}
		}
		return true;
	}
}
