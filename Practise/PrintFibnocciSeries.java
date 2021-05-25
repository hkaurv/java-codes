package Practise;

public class PrintFibnocciSeries {

public static void main (String [] args){

	int N=10;
	int num1=0;
	int num2=1;
	int counter=0;

	while(counter<N){
		System.out.println(num1);

		int num3=num1+num2;
		num1=num2;
		num2=num3;
		counter++;
	}
}
}
