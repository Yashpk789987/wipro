
public class FlowControl_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char i = 's';
		if ((i >= 'a' && i <= 'z') || (i >= 'A' && i <= 'Z')) {
			System.out.println("Alphabhet");
		} else if ((i >= '0' && i <= '9')) {
			System.out.println("Digit");
		} else {
			System.out.println("Special Character");
		}
	}

}
