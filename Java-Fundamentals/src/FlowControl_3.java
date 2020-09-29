
public class FlowControl_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length == 0) {
			System.out.println("No Values");
		} else {
			String locations = args[0];
			for (int i = 1; i < args.length; i++) {
				locations = locations + ","  + args[i];
			}
			System.out.println(locations);
		}
	}

}
