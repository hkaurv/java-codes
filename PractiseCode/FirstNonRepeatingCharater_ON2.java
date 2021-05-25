package PractiseCode;

public class FirstNonRepeatingCharater_ON2 {

	static char firstNonRepeatingCharacter(String s){

		for(int i=0;i<s.length();i++){
			boolean seenDuplicate=false;

			for(int j=0;j<s.length();j++){
				if(s.charAt(i)==s.charAt(j) && (i!=j)){
					seenDuplicate=true;
					break;
				}
			}
			if(!seenDuplicate) return s.charAt(i);
		}
		return '_';
	}

	public static void main(String [] args){
		System.out.println(firstNonRepeatingCharacter("aaabbhbbbsns"));
	}
}
