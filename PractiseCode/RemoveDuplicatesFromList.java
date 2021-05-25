package PractiseCode;

import java.util.ArrayList;

public class RemoveDuplicatesFromList {

	public static void main(String []args){
		ArrayList<Integer> ab=new ArrayList<>();
		int []a={1,2,3,4,4,4,5,6,6,7,7,8} ;
		int k=0;
		for(int i=0;i<a.length;i++){
			if(!ab.contains(a[i])){
				ab.add(a[i]);
				k++;
			}
			for(int j=i+1;j<a.length;j++){
				if(a[i]==a[j]){
					k++;
				}
			}
		}
		System.out.println(ab);
	}
}
