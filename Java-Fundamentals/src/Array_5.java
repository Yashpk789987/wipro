
public class Array_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = { 48, 73, 738, 39, 12 };

		// sorting in ASC order using bubble sort
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		System.out.println("Smallest two in the array: " + array[0] + " and " + array[1]);
		System.out.println("Largest two in the array: " + array[array.length - 1] + " and " + array[array.length - 2]);
	}

}
