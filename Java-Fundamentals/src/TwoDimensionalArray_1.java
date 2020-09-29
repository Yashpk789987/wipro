
public class TwoDimensionalArray_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 4) {
			System.out.println("Please enter 4 integer numbers");
		} else {
			int arr[][] = new int[2][2];
			try {
				int count = 0;
				for(int i = 0 ; i < 2 ; i++) {
					for(int j = 0 ; j < 2 ; j++) {
						arr[i][j] = Integer.parseInt(args[count]);
						count++;
					}
				}
				for (int i = 0; i < 2; i++) { 
					int start = 0; 
					int end = 2 - 1; 

					while (start < end) { 
						int temp = arr[i][start]; 
						arr[i][start] = arr[i][end]; 
						arr[i][end] = temp; 
						start++; 
						end--; 
					} 

				} 
				
				for (int i = 1; i >=0 ; i--) { 
					for (int j = 0; j < 2; j++) { 
						System.out.print(arr[i][j] + " "); 
					} 
					System.out.println(); 
				} 
				
			} catch(NumberFormatException e) {
				System.out.println("Please enter 4 integer numbers");
			}
		}
	}

}
