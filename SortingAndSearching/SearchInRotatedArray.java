package SortingAndSearching;

public class SearchInRotatedArray {

	//Search in Rotated Array: Given a sorted array of n integers that has been rotated an unknown
	//number of times, write code to find an element in the array. You may assume that the array was
	//originally sorted in increasing order,

	// Instead of two or more pass of binary search the result can be found in one pass of binary search. The binary search needs to be modified to perform the search. The idea is to create a recursive function that takes l and r as range in input and the key.
	//
	//1) Find middle point mid = (l + h)/2
	//2) If key is present at middle point, return mid.
	//3) Else If arr[l..mid] is sorted
	//    a) If key to be searched lies in range from arr[l]
	//       to arr[mid], recur for arr[l..mid].
	//    b) Else recur for arr[mid+1..h]
	//4) Else (arr[mid+1..h] must be sorted)
	//    a) If key to be searched lies in range from arr[mid+1]
	//       to arr[h], recur for arr[mid+1..h].
	//    b) Else recur for arr[l..mid]

	// Returns index of key in arr[l..h]
	// if key is present, otherwise returns -1


	//Complexity Analysis:
	//
	//Time Complexity: O(log n).
	//Binary Search requires log n comparisons to find the element. So time complexity is O(log n).
	//Space Complexity: O(1).
	//As no extra space is required.

	//How to handle duplicates?
	//It doesn’t look possible to search in O(Logn) time in all cases when duplicates are allowed. For example consider searching 0 in {2, 2, 2, 2, 2, 2, 2, 2, 0, 2} and {2, 0, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}.
	//It doesn’t look possible to decide whether to recur for the left half or right half by doing a constant number of comparisons at the middle.


	static int search(int arr[], int l, int h, int key)
	{
		if (l > h)
			return -1;

		int mid = (l + h) / 2;
		if (arr[mid] == key)
			return mid;

		/* If arr[l...mid] first subarray is sorted */
		if (arr[l] <= arr[mid]) {
            /* As this subarray is sorted, we
               can quickly check if key lies in
               half or other half */
			if (key >= arr[l] && key <= arr[mid])
				return search(arr, l, mid - 1, key);
            /*If key not lies in first half subarray,
           Divide other half  into two subarrays,
           such that we can quickly check if key lies
           in other half */
			return search(arr, mid + 1, h, key);
		}

        /* If arr[l..mid] first subarray is not sorted,
           then arr[mid... h] must be sorted subarry*/
		if (key >= arr[mid] && key <= arr[h])
			return search(arr, mid + 1, h, key);

		return search(arr, l, mid - 1, key);
	}

	// main function
	public static void main(String args[])
	{
		int arr[] = { 4, 5, 6, 7, 8, 9, 1, 2, 3 };
		int n = arr.length;
		int key = 6;
		int i = search(arr, 0, n - 1, key);
		if (i != -1)
			System.out.println("Index: " + i);
		else
			System.out.println("Key not found");
	}

}
