package PractiseCode;

public class FactorsofANumber {

	//if a number is divided by the given number then it is factor of that number
	public static void main(String[] args) {

		// positive number
		int number = 60;

		System.out.print("Factors of " + number + " are: ");

		// loop runs from 1 to 60
		for (int i = 1; i <= number; ++i) {

			// if number is divided by i
			// i is the factor
			if (number % i == 0) {
				System.out.print(i + " ");
			}
		}

		//for negative number
		/*public static void main(String[] args) {

			// negative number
			int number = -60;
			System.out.print("Factors of " + number + " are: ");

			// run loop from -60 to 60
			for(int i = number; i <= Math.abs(number); ++i) {

				// skips the iteration for i = 0
				if(i == 0) {
					continue;
				}
				else {
					if (number % i == 0) {
						System.out.print(i + " ");
					}
				}
			}*/

	}
}