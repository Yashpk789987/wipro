
public class FlowControl_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 1) {
			System.out.println("Please enter an integer number ");
			return;
		} else {
			try {
				int num = Integer.parseInt(args[0]);
				if (num == 0 || num == 1) {
					System.out.println(num + " is neither prime nor composite");
					return;
				}
				boolean flag = false;
				for (int i = 2; i <= num / 2; ++i) {
					if (num % i == 0) {
						flag = true;
						break;
					}
				}

				if (!flag)
					System.out.println(num + " is a prime number.");
				else
					System.out.println(num + " is not a prime number.");
			} catch (Exception e) {
				System.out.println("Please enter an integer number ");
			}
		}

	}

}
