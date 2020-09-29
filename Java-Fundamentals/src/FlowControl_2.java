
public class FlowControl_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 1) {
			System.out.println("Please Pass One Arguement");
		} else {
			try {
				int i = Integer.parseInt(args[0]);
				if (i % 2 == 0) {
					System.out.println("This Number Is Even");
				} else {
					System.out.println("This Number Is Odd");
				}

			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
