package PractiseCode;

public class ReverseAnArrayAndNumber {

	public static void main(String [] args){

		int []a= {1,2,3,4,5,6};

		int noToReverse=3456;
		for(int i=a.length-1;i>=0;i--){
			System.out.println(a[i]);
		}



		//reverse  a number
		int reverse=0;
		int remainder=0;
		while(noToReverse!=0){
			remainder=noToReverse%10;
			reverse=reverse*10+remainder;
			noToReverse=noToReverse/10;

		}
		System.out.println(reverse);
	}

	//A method for reverse
	public static void reverseMethod(int number) {
		if (number < 10) {
			System.out.println(number);
			return;
		}
		else {
			System.out.print(number % 10);
			//Method is calling itself: recursion
			reverseMethod(number/10);
		}
	}
	static int[] reverseArray(int[]a) {
		int startIndex = 0;
		int endIndex = a.length - 1;

		while (endIndex > startIndex) {
			swap(a, startIndex, endIndex);
			startIndex++;
			endIndex--;
		}
		return a;
	}
	static void swap(int []a,int startIndex,int endIndex){

		int temp=a[startIndex];
		a[startIndex]=a[endIndex];
		a[endIndex]=temp;
	}
}
