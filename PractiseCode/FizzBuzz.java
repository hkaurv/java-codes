package PractiseCode;

import java.util.LinkedHashMap;
import java.util.Map;

public class FizzBuzz {
	public static void main(String []args) {

		for (int i = 0; i <= 100; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if (i % 3 == 0) {
				System.out.println("Fizz");
			} else if (i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}
	}


	public void fizzbuzz(int n, LinkedHashMap<Integer, String> m) {
		for (int i = 0; i < n; i++) {
			StringBuilder sb = new StringBuilder();
			for (Map.Entry<Integer, String> entry : m.entrySet()) {
				if (i % entry.getKey() == 0) {
					sb.append(entry.getValue());
				}
			}
			if (sb.length() == 0) {
				sb.append(i);
			}
			System.out.println(sb.toString());
		}
	}}
