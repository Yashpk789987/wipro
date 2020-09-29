
public class FlowControl_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 1) {
			System.out.println("Please enter an integer number ");
			return;
		} else {
			try {

				int num = Integer.parseInt(args[0]), reversedInteger = 0, remainder, originalInteger;

				originalInteger = num;

				while (num != 0) {
					remainder = num % 10;
					reversedInteger = reversedInteger * 10 + remainder;
					num /= 10;
				}

				if (originalInteger == reversedInteger)
					System.out.println(originalInteger + " is a palindrome.");
				else
					System.out.println(originalInteger + " is not a palindrome.");
				
			} catch (Exception e) {
				System.out.println("Please enter an integer number ");
			}
		}
	}

}
