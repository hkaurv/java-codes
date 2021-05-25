package PractiseCode;

public class largestSumSubArray {
//current_max = A[0]
//global_max = A[0]
//for i = 1 -> size of A
//    if current_max is less than 0
//        then current_max = A[i]
//    otherwise
//        current_max = current_max + A[i]
//    if global_max is less than current_max
//        then global_max = current_max

	/*Runtime complexity
	The runtime complexity of this solution is linear, O(n).

	Memory complexity
	The memory complexity of this solution is constant, O(1).	*/

	static int findMaxSumSubArray(int[] A) {
		if (A.length < 1) {
			return 0;
		}

		int currMax = A[0];
		int globalMax = A[0];
		for (int i = 1; i < A.length; ++i) {

			if (currMax < 0) {
				currMax = A[i];
			} else {
				currMax += A[i];
			}

			if (globalMax < currMax) {
				globalMax = currMax;
			}
		}

		return globalMax;
	}
	public static void main(String[] args) {
		int[] v = new int[]{-4, 2, -5, 1, 2, 3, 6, -5, 1};
		System.out.println("Sum of largest subarray: " + findMaxSumSubArray(v));
	}
}
