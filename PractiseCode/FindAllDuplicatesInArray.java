package PractiseCode;


import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesInArray {


	static List<Integer> findDupliccates(int[] a) {

		List<Integer> output_arr = new ArrayList<>();
		for (int i = 0; i < a.length; i++) {
			int index = Math.abs(a[i] - 1);
			if (a[index] < 0) output_arr.add(index + 1);
			a[index] = -a[index];
		}
		return output_arr;
	}




	public static void main(String []args) {
		int[] a = {1, 2, 3, 4, 5, 4, 3, 2, 3, 4, 5, 6};

	}
}

