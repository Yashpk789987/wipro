package practice;

import java.util.Arrays;

public class first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = { 1, 2, 38, 9 };
		Arrays.sort(arr);
		String ar = "yash";
		int index = Arrays.binarySearch(arr, 3);
		System.out.print(index);
		for (int i = 0; i < ar.length(); i++) {
			System.out.println(ar.charAt(i));
		}
	}

}
