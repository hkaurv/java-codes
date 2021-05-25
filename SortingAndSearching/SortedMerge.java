package SortingAndSearching;

public class SortedMerge {
//You are given two sorted arrays, A and B, where A has a large enough buffer at the
//end to hold B. Write a method to merge B into A in sorted order.


	//One way is to merge the two arrays by inserting the smaller elements to front of A,
	// but the issue with this approach is that we have to shift every element to right after every insertion.

	//So, instead from comparing which one is smaller element, we can compare which one is larger and then inserting that element to end of A.

	//Time complexity is O(m+n).


	static int NA =-1;
	static void sortedMerge(int a[], int b[], int n, int m)
	{
		int i = n - 1;// index of i
		int j = m - 1;// index of j

		int lastIndex = n + m - 1;

		// Merge a and b, starting
		// from last element in each
		while (j >= 0)
		{

			/* End of a is greater than end of b */
			if (i >= 0 && a[i] > b[j])
			{
				// Copy Element
				a[lastIndex] = a[i];
				i--;
			} else
			{
				// Copy Element
				a[lastIndex] = b[j];
				j--;
			}
			// Move indices
			lastIndex--;
		}
	}

	// Helper function to print the array
	static void printArray(int arr[], int n)
	{
		System.out.println ( "Array A after merging B in sorted order : " ) ;
		for (int i = 0; i < n; i++)
			System.out.print(arr[i] +" ");
	}

	// Driver code
	public static void main (String[] args)
	{
		int a[] = {10, 12, 13, 14, 18, NA, NA, NA, NA, NA};
		int n = 5;
		int size_a = 10;
		int b[] = {16, 17, 19, 20, 22};
		int m = 5;
		sortedMerge(a, b, n, m);
		printArray(a, size_a);
	}
}


