package PractiseCode;

import java.util.HashSet;

public class removeDuplicates_usingCollections {

	public static void main(String []args){
		int []a={1,2,3,4,5,4,3,2,3,4,5,6};

		HashSet<Integer> hs= new HashSet <>(); // hash set does not store duplicate elements

		for(int i=0;i<a.length;i++){
hs.add(a[i]);

	}
		for(int no:hs ){ //for each loop
			System.out.print(no + " ");
		}


	}
}
