package PractiseCode;

import java.util.Arrays;

public class RotateImage {

	public static void rotate(int[][] matrix) {

	}
	public static void main (String args[]) {
		int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//step 1-Transpose matrix- turn rows-columns

		for(int i=0;i<matrix.length;i++){
			for(int j=i;j<matrix.length;j++){
				int temp=matrix[i][j];
				matrix [i][j]=matrix[j][i];
				matrix [j][i]=temp;

			}
		}

		//step 2  -flip horizontally

		for(int i=0;i<matrix.length;i++) {
			for (int j = 0; j < matrix.length/2; j++) {
				int temp = matrix[i][j];
				matrix[i][j] = matrix[i][matrix.length-1-j];
				matrix[i][matrix.length-1-j] = temp;
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(Arrays.toString(matrix[i]));
		}
	}
}
