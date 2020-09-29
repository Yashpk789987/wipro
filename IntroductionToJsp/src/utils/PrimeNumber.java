package utils;

import java.util.ArrayList;

public class PrimeNumber {
	public static ArrayList<Integer> generateListOfPrimeNumbers(int n) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 1; i < n; i++) {
			int counter = 0;
			for (int num = i; num >= 1; num--) {
				if (i % num == 0) {
					counter = counter + 1;
				}
			}
			if (counter == 2) {
				al.add(i);
			}
		}
		return al;
	}
}
