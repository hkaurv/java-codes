package Practise;

public class PrintMaxAndMinFrom3dArray {


	static int max(int[][] a) {

		int max = a[0][0];

		for (int i = 0; i < a.length; i++) {

			for (int j = 0; j < a.length; j++) {

				if (a[i][j] > max) {

					max = a[i][j];
				}
			}
		}
		System.out.println(max);
return max;
	}

	public static void main (String [] args){

		int[][] a = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

		max(a);
	}
}
