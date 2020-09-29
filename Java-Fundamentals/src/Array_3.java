
public class Array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5, 4, 3, 9, 1, 7, 9};
		int searching_variable = 9;
		int index = -1;
		
		for (int i = 0; i < array.length; i++) {
			if (array[i] == searching_variable) {
				index = i + 1;
				break;
			}
		}

		System.out.println(index);
	}

}
