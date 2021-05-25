package PractiseCode;

import java.util.ArrayList;

public class StringHasAllUniqueCharactters {

	static boolean isUnique(String a) {

		for (int i = 0; i <= a.length(); i++) {

			for (int j = i + 1; j < a.length(); j++) {
				if (a.charAt(i) == a.charAt(j)) {

					return false;
				}
			}
		}
		return true;
	}

	public static void main(String[] args){
		System.out.println(isUnique("harjot"));
	}
}
