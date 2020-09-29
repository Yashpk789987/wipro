
public class FlowControl_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (args.length != 2) {
			System.out.println("Pass Gender And Age Both");
		} else if (!(args[0].equalsIgnoreCase("Male") || args[0].equalsIgnoreCase("Female"))) {
			System.out.println("First Arguement Is Invalid. It Must Be Either Male Or Female");
		} else {
			try {
				int age = Integer.parseInt(args[1]);
				if (args[0].equalsIgnoreCase("Male") && (age >= 1 && age <= 58)) {
					System.out.println("The percentage of interest is 8.4%.");
				} else if (args[0].equalsIgnoreCase("Male") && (age >= 59 && age <= 100)) {
					System.out.println("The percentage of interest is 10.5%.");
				} else if (args[0].equalsIgnoreCase("Female") && (age >= 1 && age <= 58)) {
					System.out.println("The percentage of interest is 8.2%.");
				} else if (args[0].equalsIgnoreCase("Female") && (age >= 59 && age <= 100)) {
					System.out.println("The percentage of interest is 9.2%.");
				} else {
					System.out.println("Second Arguement Must Be Valid Age Between 1 and 100.");
				}
			} catch (NumberFormatException e) {
				System.out.println("Second Arguement Must Be Valid Age Between 1 and 100.");
			}
		}
	}

}
