package PractiseCode;

public class SumOfDigitsInNumber {

	public static void main(String[] args) {
		int num = 321;
		int sum = 0;
		while (num > 0) {
			sum = sum + num % 10;
			num = num / 10;
		}
		System.out.println(sum);
	}

	//Sum of digits till single digit is obtained
	public int sumOfDigits(int num)
	{
		int sum = 0;

		while (num > 0)
		{
			sum = sum + num % 10;
			num = num / 10;
		}

		sum = (sum <10) ? sum : sumOfDigits(sum);

		return sum;
	}
}
