package Practise;

import java.util.ArrayList;

public class CompareIndexesandprintSameVallues {

	public static void main(String[] args) {

		int[] a = {1, 2, 3, 4, 5, 6};
		int[] b = {1, 2, 3, 6, 7, 8};

		ArrayList<Integer> ab = new ArrayList<>();

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < b.length; j++) {
				if (a[i] == b[j]) {
					ab.add(a[i]);
				}
			}
		}

		Object[] c=ab.toArray();
		for (Object cs : c) {
			System.out.print(cs+" ");
		}

	}
}
