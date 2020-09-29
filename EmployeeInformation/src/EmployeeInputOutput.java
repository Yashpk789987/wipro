import java.util.HashMap;
import java.util.Map;

public class EmployeeInputOutput {
	static double calculateSalary(double basic, double hra, double it, double da) {
		return basic + hra + da - it;
	}

	static HashMap<String, Double> getDesignationAndDa(String designation_code) {
		HashMap<String, Double> d = new HashMap<String, Double>();
		switch (designation_code) {
		case "e":
			d.put("Engineer", (double) 20000);
			return d;
		case "c":
			d.put("Consultant", (double) 32000);
			return d;
		case "k":
			d.put("Clerk", (double) 12000);
			return d;
		case "r":
			d.put("Receptionist", (double) 15000);
			return d;
		case "m":
			d.put("Manager", (double) 40000);
			return d;
		default:
			return d;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee employees[] = { new Employee(1001, "Ashish", "01/04/2009", "e", "R&D", 20000, 8000, 3000),
				new Employee(1002, "Sushma", "23/08/2012", "c", "PM", 30000, 12000, 9000),
				new Employee(1003, "Rahul", "12/11/2008", "k", "Acct", 10000, 8000, 1000),
				new Employee(1004, "Chahat", "29/01/2013", "r", "Front Desk", 12000, 6000, 2000),
				new Employee(1005, "Ranjan", "16/07/2005", "m", "Engg", 50000, 20000, 20000),
				new Employee(1006, "Suman", "01/01/2000", "e", "Manufacturing", 23000, 9000, 4400),
				new Employee(1007, "Tanmay", "02/06/2006", "c", "PM", 29000, 12000, 10000), };
		if (args.length != 1) {
			System.out.println("Please Enter Employee Number");
		} else {

			
				int emp_no = Integer.parseInt(args[0]);
				boolean found = false;
				for (int i = 0; i < employees.length; i++) {
					if (employees[i].emp_no == emp_no) {
						found = true;
						System.out.println("Emp No.   Emp Name    Department    Designation  Salary");
						HashMap designation_da = getDesignationAndDa(employees[i].designation_code);
						Object designation =  designation_da.keySet().toArray()[0];
						double salary = calculateSalary(employees[i].basic, employees[i].hra, employees[i].it,
								(double) designation_da.get(designation));
						System.out.println(emp_no + "        " + employees[i].name + "       " + employees[i].department + "          "
								+ designation + "      " + (int)salary);
					}
					if (found) {
						break;
					}
				}
				if (!found) {
					System.out.println("There is no employee with empid: "+emp_no);
				}
			
		}

	}

}
