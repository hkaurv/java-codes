package Recursion;

public class TripleStep {

	//Triple Step: A child is running up a staircase with n steps and can hop either 1 step, 2 steps, or 3
	//steps at a time, implement a method to count how many possible ways the child can run up the
	//stairs.

//Method 1: Recursive.
//There are n stairs, and a person is allowed to jump next stair, skip one stair or skip two stairs. So there are n stairs. So if a person is standing at i-th stair, the person can move to i+1, i+2, i+3-th stair. A recursive function can be formed where at current index i the function is recursively called for i+1, i+2 and i+3 th stair.
//There is another way of forming the recursive function. To reach a stair i, a person has to jump either from i-1, i-2 or i-3 th stair or i is the starting stair.
//Algorithm:
//
//Create a recursive function (count(int n)) which takes only one parameter.
//Check the base cases. If the value of n is less than 0 then return 0, and if the value of n is equal to zero then return 1 as it is the starting stair.
//Call the function recursively with values n-1, n-2 and n-3 and sum up the values that are returned, i.e. sum = count(n-1) + count(n-2) + count(n-3)
//Return the value of the sum.


// Program to find n-th stair
// using step size 1 or 2 or 3.

	//Complexity Analysis:
	//
	//Time Complexity: O(3n).
	//The time complexity of the above solution is exponential, a close upper bound will be O(3n). From each state, 3 recursive function are called. So the upperbound for n states is O(3n).
	//Space Complexity:O(1).
	//As no extra space is required.

		// Returns count of ways to reach
		// n-th stair using 1 or 2 or 3 steps.
		public static int findStep(int n)
		{
			if (n == 1 || n == 0)
				return 1;
			else if (n == 2)
				return 2;

			else
				return findStep(n - 3) + findStep(n - 2) + findStep(n - 1);
		}

		// Driver function
		public static void main(String argc[])
		{
			int n = 4;
			System.out.println(findStep(n));
		}

		//dynamic programming

	//The idea is similar, but it can be observed that there are n states but the recursive function is called 3 ^ n times. That means that some states are called repeatedly. So the idea is to store the value of states. This can be done in two ways.
	//
	//Top-Down Approach: The first way is to keep the recursive structure intact and just store the value in a HashMap and whenever the function is called again return the value store without computing ().
	//Bottom-Up Approach: The second way is to take an extra space of size n and start computing values of states from 1, 2 .. to n, i.e. compute values of i, i+1, i+2 and then use them to calculate the value of i+3.
	//Algorithm:
	//
	//Create an array of size n + 1 and initialize the first 3 variables with 1, 1, 2. The base cases.
	//Run a loop from 3 to n.
	//For each index i, computer value of ith position as dp[i] = dp[i-1] + dp[i-2] + dp[i-3].
	//Print the value of dp[n], as the Count of the number of ways to reach n th step.

		// A recursive function used by countWays
		public static int countWays(int n)
		{
			int[] res = new int[n + 1];
			res[0] = 1;
			res[1] = 1;
			res[2] = 2;

			for (int i = 3; i <= n; i++)
				res[i] = res[i - 1] + res[i - 2]
						+ res[i - 3];

			return res[n];
		}

	// Driver function

}


