
public class FlowControl_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char i = 'r';
		if (i >= 'a' && i <= 'z') {
			System.out.println(i + " -> " + (char) ((int) i - 32));
		} else if (i >= 'A' && i <= 'Z') {
			System.out.println(i + " -> " + (char) ((int) i + 32));
		} else {
			System.out.println("Invalid Value In Varial");
		}
	}

}
