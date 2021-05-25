package PractiseCode;

import java.util.ArrayList;
import java.util.List;

public class GenerateParanthesis {
	public static List<String> generateParenthesis(int n){
		List<String> result= new ArrayList<>();
		generateParenthesis(result,"",n,n);
		return result;
	}

	public static void generateParenthesis(List<String> result,String parentheses, int openningRemaning,int closingRemaining){

		if(openningRemaning==0 &&closingRemaining==0){
			result.add(parentheses);
		}
		else if (openningRemaning<=closingRemaining){
			if(openningRemaning>0){
				generateParenthesis(result, parentheses +"(",openningRemaning -1, closingRemaining);
			}
			if(closingRemaining>0){
				generateParenthesis(result,parentheses+")",openningRemaning,closingRemaining-1);
			}
		}
	}

	public static void main (String args[]){

		System.out.println(generateParenthesis(2));

	}

	// Method 1 : Generate All and then add only the valid ones
// Method 2 : Selectively generate only the valid ones


	public void helper2(List<String> ll, String str, int open, int close, int max){

		if(str.length() == max*2){
			ll.add(str);
			return;
		}

		if(close<open) helper2(ll, str+")", open, close+1, max);
		if(open<max) helper2(ll, str+"(", open+1, close, max);

	}
}



