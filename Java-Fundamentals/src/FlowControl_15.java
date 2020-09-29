import java.util.Scanner;

public class FlowControl_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.print("I/P:");
		int n = kb.nextInt();
		int sum = 0;

		while (n != 0) {
			sum = sum + n % 10;
			n = n / 10;
		}
		System.out.println("O/P:" + sum);

	}

}
