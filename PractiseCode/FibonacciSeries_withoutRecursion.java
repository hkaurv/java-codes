package PractiseCode;

public class FibonacciSeries_withoutRecursion {

	public static void fibonacci(int N){

		int num1=0;
		int num2=1;
		int counter=0;

		while(counter<N){
			System.out.print(num1+" ");

			int num3=num1+num2;
			num1=num2;
			num2=num3;
			counter++;
		}


	}
	public static void main (String[] args){
		fibonacci(10);
	}

}



