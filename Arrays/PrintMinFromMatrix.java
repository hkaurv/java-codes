package Arrays;

public class PrintMinFromMatrix {

	public static void main(String[] args) {
		int[][] c = {{2, 2, 3}, {3, 4, 5}, {1, 5, 6}};
		int min = c[0][0];
		int mc = 0;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (c[i][j] < min) {
					min = c[i][j];
					mc = j;
				}
			}
		}
		System.out.println(min);


		int k = 0;
		int max = c[k][mc];

		while (k < 3) {
			if (c[k][mc] > max) {
				max = c[k][mc];
			}
			k++;
		}
		System.out.println(max);
	}
}
