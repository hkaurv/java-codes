package PractiseCode;

import hashTable.HashTable;

import java.util.HashSet;

public class StringCompression {
//I : aabccccccaaaa
	//O :a2b1c5a3

	public static int compressString(char[] stringToCompress) {
		int index = 0;
		int i = 0;
		while (i < stringToCompress.length - 1) {
			int j = i;
			while (j < stringToCompress.length && stringToCompress[j] == stringToCompress[i]) {
				j++;
			}
			stringToCompress[index++] = stringToCompress[i];
			if (j - i > 1) {
				String count = j - i + " ";
				for (char c : count.toCharArray()) {
					stringToCompress[index++] = c;
				}
			}
			i = j;

		}
		System.out.println(stringToCompress);

		return index;
	}

	public static void main(String[] args) {
		String s="aacccccvvvb";
		char[] a = {'a', 'a', 'b', 'j', 'j', 'j', 'j', 'j'};
		//System.out.println(compressString(a));
		System.out.println(Compression(s));
	}


	static String Compression(String s) {

		int count = 1;
		String str = s.charAt(0) + "";// add empty string to convert character to string or use substring(0,1) to get first character
		//assign first character of the string to 0 index of  new string
		System.out.println(s.length());
		for (int i = 1; i < s.length(); i++) {
			char current = s.charAt(i);
			char previous = s.charAt(i - 1);

			if (current == previous) {
				count++;
			} else {
				if (count > 1)
					str += count;
				count = 1;
				str += current;

			}

		}
		if(count>1)
			str += count;
		count = 1;
		return str;
	}
}
