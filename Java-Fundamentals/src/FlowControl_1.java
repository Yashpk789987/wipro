
public class FlowControl_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 1) {
			System.out.println("Please Pass One Arguement");
		} else {
			try {
				int i = Integer.parseInt(args[0]);
				if (i > 0) {
					System.out.println("This Number Is Positive");
				} else if (i < 0) {
					System.out.println("This Number Is Negative");
				} else {
					System.out.println("This Number Is Zero");
				}

			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
