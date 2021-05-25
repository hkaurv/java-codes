package PractiseCode;


public class APrimeNumber {


	public static void IsPrime(int n) {
		boolean flag=false;

		for (int i = 2; i <= n / 2; i++) { //while(i<=num /2)
			if (n % i == 0) {
				flag=true;
				break;
			}                                  //i++
		}

		if(!flag) {
			System.out.println(n + " is a prime number");
		}
		else
		{
			System.out.println(n+"is not a Prime number");
		}
	}

	public static void main (String args[]){
		IsPrime(29);
	}
}


