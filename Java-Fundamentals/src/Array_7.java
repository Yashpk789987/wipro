import java.util.Arrays;

public class Array_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int my_array[] = { 10, 22, 10, 20, 11, 22 };
		System.out.print("I/P:{");

		for (int i = 0; i < my_array.length; i++) {
			if (i == my_array.length - 1) {
				System.out.print(my_array[i]);
			} else {
				System.out.print(my_array[i] + ",");
			}
		}

		System.out.print("}");
		System.out.print("\n");
		int no_unique_elements = my_array.length;

		for (int i = 0; i < no_unique_elements; i++) {
			for (int j = i + 1; j < no_unique_elements; j++) {

				if (my_array[i] == my_array[j]) {
					my_array[j] = my_array[no_unique_elements - 1];
					no_unique_elements--;
					j--;
				}
			}
		}

		int[] array1 = Arrays.copyOf(my_array, no_unique_elements);

		System.out.print("O/P:{");

		for (int i = 0; i < array1.length; i++) {
			if (i == array1.length - 1) {
				System.out.print(array1[i]);
			} else {
				System.out.print(array1[i] + ",");
			}
		}

		System.out.print("}");

	}

}
