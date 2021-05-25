package PractiseCode;

public class FindNoOfPairs {

	public static int NoOfPairs(int n, int[] a) {
		int count = 0;
		for (int i = 0; i < n; i++) {

			if (a[i] != 0) {
				for (int j = i + 1; j < n; j++) {
					if (a[i] == a[j]) {
						count++;
						a[j] = 0;//dont check this number for pairing again
						break;
					}
				}
			}
		}				return count;

	}
			public static void main (String[]args){
				System.out.println(NoOfPairs(9, new int[]{10, 20, 20, 10, 10, 30, 50, 10, 20}));
			}
		}
