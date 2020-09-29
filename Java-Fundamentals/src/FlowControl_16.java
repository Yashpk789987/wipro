
public class FlowControl_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 1) {
			System.out.println("Please enter an integer number ");
			return;
		} else {
			try {
				int rows, number = 1, counter, j;
				rows = Integer.parseInt(args[0]);
				for (counter = 1; counter <= rows; counter++) {
					for (j = 1; j <= counter; j++) {
						System.out.print("* ");
						number++;
					}
					System.out.println();
				}
			} catch (Exception e) {
				System.out.println("Please enter an integer number ");
			}
		}
	}

}
