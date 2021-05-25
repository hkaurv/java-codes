package PractiseCode;

public class fibnocciSeries_memoization {
	public static long fibArray[]=new long[26];

	public static long fibonacci(long n){
		long fibValue=0;
		if(n==0 ){
			return 0;
		}else if(n==1){
			return 1;
		}else if(fibArray[(int)n]!=0){
			return fibArray[(int)n];
		}else{
			fibValue=fibonacci(n-1)+fibonacci(n-2);
			fibArray[(int) n]=fibValue;
			return fibValue;
		}
	}
	public static void main(String args[]){
		fibArray[0]=1;
		fibArray[1]=1;
		long preTime=System.currentTimeMillis();
		System.out.println("Value of 25th number in Fibonacci series->"+fibonacci(25));
		long postTime=System.currentTimeMillis();
		System.out.println("Time taken to compute in milliseconds->"+(postTime-preTime));
	}
}
	/*in t fibonacci(in t n) {
	2 if (n == 0) return 0;
	3
	A
else if (n == 1) return 1;
	5 int[ ] memo = new int[n] j
	6 memo[0] = 0J
	7 memo[l] = 1;
	8 f o r (in t i = 2; i < nj i++) {
		9 memo[i] = rnemofi - 1] + trtemo[i
		10 >
				i l return memo[n - 1] + memo[n - 2];
		12 >
*/