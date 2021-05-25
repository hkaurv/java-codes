package PractiseCode;

public class FindLargestNumber {
	public static void main(String []args){
		int[]a={12,3,74,7,8,90};
		int large=0;
		for(int i=0;i<a.length;i++){
			large=a[i];
			if(a[i]>large){
				large=a[i];
			}
		}
		System.out.println(large);
	}
}
