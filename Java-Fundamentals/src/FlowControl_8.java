
public class FlowControl_8 {

	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Please Specify Only One Character");
		} else if (args[0].length() != 1) {
			System.out.println("Please Specify Only One Character");
		} else {
			char i = args[0].toCharArray()[0];
			switch (i) {
			case 'R':
			case 'r':
				System.out.println("Red");
				break;
			case 'B':
			case 'b':
				System.out.println("Blue");
				break;
			case 'G':
			case 'g':
				System.out.println("Green");
				break;

			case 'Y':
			case 'y':
				System.out.println("Yellow");
				break;
			case 'W':
			case 'w':
				System.out.println("White");
				break;
			default:
				System.out.println("Invalid Code");
			}
		}

	}

}
