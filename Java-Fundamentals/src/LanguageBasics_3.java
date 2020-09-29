
public class LanguageBasics_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 2) {
			System.out.println("Two Arguements Required");
		} else {
			try {
				int first = Integer.parseInt(args[0]);
				int second = Integer.parseInt(args[1]);
				int sum = first + second;
				System.out.println("The Sum Of " + first + " And " + second + " Is " + sum);
			} catch (NumberFormatException e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
