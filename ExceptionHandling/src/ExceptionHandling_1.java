import java.util.Scanner;

public class ExceptionHandling_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);

		System.out.print("Enter an integer: ");
		String str = kb.nextLine();

		try {
			int x = Integer.parseInt(str);
			System.out.println("The square value is: " + x * x);
			System.out.println("The work has been done successfully");
		} catch (NumberFormatException e) {
			System.out.println("Entered input is not a valid format for an integer.");
			
		}

		kb.close();
	}

}
