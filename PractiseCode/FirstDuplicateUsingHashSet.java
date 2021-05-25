package PractiseCode;

import java.util.HashSet;

public class FirstDuplicateUsingHashSet {//more space will be used if the duplicate is the last integer in array
	//duplicate =hashsets

	static int firstDuplicate(int[]s)
	{
		HashSet<Integer> hs= new HashSet<>();

		for(int i=0;i<s.length;i++){

			hs.add(s[i]);
			if(hs.contains(s[i])){
				return s[i];
			}
			else
			{
				hs.add(s[i]);
			}
		}
		return -1;

	}
	public static void main (String [] args){
		int []a={2,1,3,5,3,2};
		System.out.println(firstDuplicate(a));
	}
}
