package PractiseCode;

import java.util.HashSet;

public class SumOfTwoUsingDS {

	//Hash sets and hastable have constant time to put and look up
	//not a nested for loop so will be fast

	static boolean sumOfTwo(int[] a, int[] b, int v) {

		HashSet differences = new HashSet();
		for (int i = 0; i < a.length; i++) {
			int difference = v - a[i];
			differences.add(difference);
		}
		for (int i = 0; i < b.length; i++) {

			if (differences.contains(b[i])) ;
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int[] a = {0, 0, -5, 30221};
		int[] b = {-10, -14, -3, 9};
		System.out.println(sumOfTwo(a, b, -8));
	}
}