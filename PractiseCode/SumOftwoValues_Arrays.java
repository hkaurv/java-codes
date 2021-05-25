package PractiseCode;

import java.util.HashSet;
import java.util.Set;

public class SumOftwoValues_Arrays {

	//Given an array of integers and a value, determine if there are any two integers in the array whose sum is equal to the given value.

/*
	Scan the whole array once and store visited elements in a hash set.
	During scan, for every element e in the array, we check if val - e is present in the hash set i.e. val - e is already visited.
	If val - e is found in the hash set, it means there is a pair (e, val - e) in array whose sum is equal to the given val.
	If we have exhausted all elements in the array and didn’t find any such pair, the function will return false.*/
	static boolean findSumOfTwo(int[] A, int val) {
		Set<Integer> foundValues = new HashSet<>();
		for (int a : A) {
			if (foundValues.contains(val - a)) {
				return true;
			}

			foundValues.add(a);
		}
		return false;
	}

	public static void main(String[] args) {
		int[] v = new int[] {5, 7, 1, 2, 8, 4, 3};
		int[] test = new int[] {3, 20, 1, 2, 7};

		for(int i = 0; i < test.length; i++){
			boolean output = findSumOfTwo(v, test[i]);
			System.out.println("findSumOfTwo(v, " + test[i] + ") = " + (output ? "true" : "false"));
		}
	}
}
