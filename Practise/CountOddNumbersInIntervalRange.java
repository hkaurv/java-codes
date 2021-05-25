package Practise;

public class CountOddNumbersInIntervalRange {
static int range(int high,int low) {
	//Ideal case:  half of numbers are odd in the given interval but in case the starting or ending number is odd, increment by 1
	int count = (high - low) / 2;
	if (high % 2 != 0 || low % 2 != 0)
		count++;
	return count;
}
}
