
public class TwoDimensionalArray_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 9) {
			System.out.println("Please enter 9 integer numbers");
		} else {
			int arr[][] = new int[3][3];
			try {
				int count = 0;
				for(int i = 0 ; i < 3 ; i++) {
					for(int j = 0 ; j < 3 ; j++) {
						arr[i][j] = Integer.parseInt(args[count]);
						count++;
					}
				}
				int max = arr[0][0];
				for(int i = 0 ; i < 3 ; i++) {
					for(int j = 0 ; j < 3 ; j++) {
						 if (arr[i][j] > max) 
			                 max = arr[i][j];
					}
				} 
                System.out.println("The biggest number in the given array is "+max);
				
			} catch(NumberFormatException e) {
				System.out.println("Please enter 9 integer numbers");
			}
		}
	}
}
