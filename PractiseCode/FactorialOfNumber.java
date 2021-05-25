package PractiseCode;

public class FactorialOfNumber {
	//factorial= number*(number-1)

	public static int factorial(int n){
		if(n==0)
			return 1;
		else
			return (n*factorial(n-1));
	}
	public static void main (String args[]){
		int fact=1;
		fact=factorial(4);
		System.out.println(fact);
	}

}
