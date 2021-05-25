package Practise;

public class CountNoOfOccuranceOfACharacter {

	public static void main (String [] args){

		int count=countNoOfOccurance("abbbbbbbbbbcvgdj" ,'b');
		System.out.println(count);

	}

	static int countNoOfOccurance(String s,char character){
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==character){
				count++;
			}
		}
		return count;

	}
}
