package PractiseCode;

public class IsNumberBinary {

	/*Check if the number is less than or equal to 1. If it is then, print false.
	Else if number is greater than 1 then, check if every digits of the number is 1 or 0.
	If any digits of the number is greater than 1 then print false, else print true.*/

	// Java program for the above approach

		// Function to check if number
		// is binary or not
		public static boolean isBinaryNumber(int num)
		{

			// Return false if a number
			// is either 0 or 1 or a
			// negative number
			if (num == 0 || num == 1
					|| num < 0) {
				return false;
			}

			// Get the rightmost digit of
			// the number with the help
			// of remainder '%' operator
			// by dividing it with 10
			while (num != 0) {

				// If the digit is greater
				// than 1 return false
				if (num % 10 > 1) {
					return false;
				}
				num = num / 10;
			}
			return true;
		}

		public static void main(String args[])
		{
			// Given Number N
			int N = 1010;

			// Function Call
			System.out.println(isBinaryNumber(N));
		}
	}

