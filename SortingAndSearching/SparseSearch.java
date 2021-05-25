package SortingAndSearching;

public class SparseSearch {
//Sparse Search: Given a sorted array of strings that is interspersed with empty strings, write a
//method to find the location of a given string.
//EXAMPLE
//Input: ball,{"at" , "" , "" , "" , "ball" , "" , "car" , "" , "" , "dad" , "" ,
//any
//Output: 4

	//Worst case order O(n), Avg. O(logN), O(N) space
	//Algorithm: Just ignore the empty strings. If you find an empty string, then preform a radial search outwards from that location until you find a non-empty string.
	// This works because all be need is the closest thing to compare the target string with the middle.
	// Technically, either the right or left string from the space could work,
	// because either one will notify us whether we need to search right or left. We just chose the faster alternative.


}
