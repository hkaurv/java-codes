package Recursion;

public class RecursiveMultiply {
	//Recursive Multiply: Write a recursive function to multiply two positive integers without using the
	//* operator. You can use addition, subtraction, and bit shifting, but you should minimize the number
	//of those operations.

	static int multiply(int a,int b){

		if(a==0 || b==0){
			return 0;

		}
		if(a==1){
			return b;
		}
		else{
			return a+(multiply(a,b-1));
		}
	}

	public static void main(String []args){

		System.out.println(multiply(2,5));
	}
}
