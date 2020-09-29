import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandling_3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the arrays");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the elements in the array: ");
		try {
			for (int i = 0; i < n; i++)
				arr[i] = sc.nextInt();
		
			System.out.println("Enter the index of the array element you want to access");

			int index = sc.nextInt();
			System.out.println("The array element at index " + index + " = " + arr[index]);
			System.out.println("The array element successfully accessed");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
		} catch (NumberFormatException e) {
			System.out.println("Entered input is not a valid format for an integer.3");
		}

		sc.close();

	}
}
