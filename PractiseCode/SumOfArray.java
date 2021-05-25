package PractiseCode;

public class SumOfArray {
	public static void main (String[] args){

		long n=6;
		int a[]={1000000001,1000000002,1000000003,1000000004,1000000005};
		long sum=0;
		for(int i=0;i<a.length;i++){
			sum=sum+a[i];// it will take the initial value of sum and add the values in array to that initial value

		}
		System.out.println(sum);
	}


}
