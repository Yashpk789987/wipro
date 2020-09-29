
public class Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 1, 2, 3, 4, 5 };

		int sum = 0;
		int avg;

		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}

		avg = sum / array.length;
		System.out.println("Sum: " + sum);
		System.out.println("Average: " + avg);
	}

}
