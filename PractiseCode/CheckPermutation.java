package PractiseCode;

import java.util.Arrays;

public class CheckPermutation {

	static boolean isPermutation(String a,String b){

		int n1=a.length();
		int n2=b.length();

		if(n1!=n2){
			return false;
		}

		char []c1=a.toCharArray();
		char [] c2=b.toCharArray();
		for(int i=0;i<n1;i++){

			Arrays.sort(c1);
			Arrays.sort(c2);

			if(c1[i]!=c2[i]){
				return false;
			}
		}
		return true;
	}

	public static void main (String [] args){
		System.out.println(isPermutation("abc","cba"));
	}
}
