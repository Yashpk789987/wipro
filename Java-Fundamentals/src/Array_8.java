
public class Array_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 10, 3, 6, 1, 2, 7, 9 };

		int sum = 0;
		int sum_till_6 = 0;
		boolean six_found = false;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 6) {
				sum_till_6 = sum;
				six_found = true;
			}
			if (array[i] == 7 && six_found) {
				sum = sum_till_6 - 7;
			}
			sum += array[i];
		}

		System.out.println("Sum: " + sum);

	}

}
