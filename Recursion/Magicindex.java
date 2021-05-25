package Recursion;

public class Magicindex {

	//Magic Index: A magic index in an array A[0. . .n-1 ] is defined to be an index such that A[i ] =
	//i. Given a sorted array of distinct integers, write a method to find a magic index, if one exists, in
	//array A.
	//FOLLOW UP
	//What if the values are not distinct?

	//Naive approach is to do the linear scan and find the magic index in O(n).
	//
	//Better solution would Modify the Binary Search – Time Complexity O(logN).
	//
	//Check mid = (start+end)/2, with A[mid], check if A[mid] = mid. if yes then return mid.
	//If mid>A[mid] means fixed point might be on the right half of the array, make a recursive call to search(A, mid + 1, end).
	//If mid<A[mid] means fixed point might be on the left half of the array, make a recursive call to search(A, start, mid – 1).
	// perform modified binary search
	public static int search(int[] A, int start, int end) {
		if (start <= end) {
			int mid = (start + end) / 2;
			if (mid == A[mid]) // check for magic index.
				return mid;
			if (mid > A[mid]) { // If mid>A[mid] means fixed point might be on
				// the right half of the array
				return search(A, mid + 1, end);
			} else {// If mid<A[mid] means fixed point might be on
				// the left half of the array
				return search(A, start, mid - 1);
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] A = { -1, 0, 1, 2, 4, 10 };
		System.out.println("Magic index " + search(A, 0, A.length - 1));
	}



}
