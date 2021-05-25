package Arrays;

public class SwapVariablesAndBubbleSort {

	public static void main(String[] args) {
		int[] a = {4, 34, 25, 12, 22, 11, 90};
		int b = 7;
		int c = 9;

		int temp = 0;
		temp = b;
		b = c;
		c = temp;

		System.out.println(b);
		System.out.println(c);
		// swap without using temp

		b = b + c;
		c = b - c;
		b = b - c;
		System.out.println(b);
		System.out.println(c);



		//bubble sort

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {

				if (a[i] > a[j]) {
					int temp1 = a[i];
					a[i] = a[j];
					a[j] = temp1;

				}
			}
		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
