package PractiseCode;

import java.util.Arrays;

public class RemoveFromGivenString {

	public static void stringFilter(String str) {
		char[] a = str.toCharArray();
		int n = str.length();
		int counter = 0;

		for (int i = 0; i < str.length(); i++) {
			if (a[i] == 'b') {//if this is false continue to next statement
				continue;
			} else if (i + 1 < n && a[i] == 'a' && a[i + 1] == 'c') {
				i++;

			} else {
				a[counter++] = a[i];//copy char to headd
			}
		}
		char[] ret = Arrays.copyOfRange(a, 0, counter);
		System.out.println(new String(ret));

	}


public static void main (String [] args) {
	stringFilter("aacbcac");
}
}
