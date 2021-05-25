package PractiseCode;

public class SumOfTwoArraysUsingLoop {

	//two values in array with which I can find my sum

	static boolean sumOfTwo( int[]firstArray,int[]secondArray,int value){
		for(int i=0;i<firstArray.length;i++)
		{
			int needed_value=value-firstArray[i];
			for(int j=0;j<secondArray.length;j++){
				if(secondArray[j]==needed_value)
				{
					System.out.println(secondArray[j]);
					System.out.println(firstArray[i]);
					return true;
				}

			}
		}
		return false;
	}
	public static void main (String[] args) {
		int []firstArray={0,0,-5,30221};
		int[]secondArray={-10,-14,-3,9};
		System.out.println(sumOfTwo(firstArray,secondArray,-8));
	}
}
