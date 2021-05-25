package Practise;

public class MaxDiff_Multiplication_SumofAllElements {

	public static void main(String[] args) {

		// sum of all elements in array

		int[] a = {1, 1, 1, 1, 1};
		int sum = 0;

		for (int i = 0; i < a.length; i++) {
			sum += a[i];
		}
		System.out.println("sum of all ints in array" + sum);


		//print multiplication table without using multiple operator
		// first int has to sum itself for j times to get the result

		int i = 5;
		int j = 5;
		int k = 1;
		int sum1 = 0;

		while (k <= j) {

			sum1 = sum1 + i;
			k++;

		}
		System.out.println("multiplication of two number" + sum1);


		// max difference between any adjacent index in array

		int[] b = {2, 4, 8, 12, 22,55};
		int diff = 0;
		int maxDiff = 0;

		for (int o = 0; o < b.length - 1; o++) {
			if (b[o + 1] - b[o] > diff) {
				diff = b[o + 1] - b[o];
			}
		}
		System.out.println("Max differnce "+diff);

	}
}


