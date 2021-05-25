package PractiseCode;

import java.util.Scanner;

public class SquareRootOfANumber {
	public static void main(String[] args)
	{
		double number = 0, sqrt=0;
//object of the Scanner class
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
//reading a double value from the user
		number = sc.nextDouble();
//method calling
		sqrt = squareRoot(number);
//prints the result
		System.out.println("The square root of "+number+ " is " +sqrt);
	}
	//user-defined method to find the square root of a number
	private static double squareRoot(double number)
	{
//iterator variable
		int i = 1;
		while(true)
		{
//for perfect square numbers
			if(i*i == number)
				return i;
//for not perfect square numbers
			else if(i*i > number)
//returns the value calculated by the method decimalSqrt()
				return decimalSqrt(number,i-1,i);
//increments the variable i by 1
			i++;
		}
	}
	// recursive method to find the square root of a number up to 7 decimal places
	private static double decimalSqrt(double number, double i, double j)
	{
//calculates the middle of i and j
		double midvalue = (i+j)/2;
//finds the square of the midvalue
		double square = midvalue * midvalue;
//compares the midvalue with square up to n decimal places
		if(square==number||Math.abs(square-number)<0.0000001)
			return midvalue;
//if the square root belongs to second half
		else if(square>number)
			return decimalSqrt(number, i, midvalue);
//if the square root belongs to first half
		else
			return decimalSqrt(number, midvalue, j);
	}
}


