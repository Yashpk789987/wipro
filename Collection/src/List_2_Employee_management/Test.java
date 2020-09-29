package List_2_Employee_management;

public class Test {

	public static void main(String[] args) {
		EmployeeDB empDb = new EmployeeDB();
		
		Employee emp1 = new Employee(10, "Yash", "yash2128@gmail.com", 'M', 40000);
		Employee emp2 = new Employee(11,"vithlesh", "vithlesh@gmail.com", 'M', 30000);
		Employee emp3 = new Employee(12, "Khushi", "khushi2128@gmail.com", 'F', 50000);
		
		
		empDb.addEmployee(emp1);
		empDb.addEmployee(emp2);
		empDb.addEmployee(emp3);
		
       for (Employee emp : empDb.listAll())
			System.out.println(emp.GetEmployeeDetails());
		
		System.out.println();
		empDb.deleteEmployee(12);
		
		for (Employee emp : empDb.listAll())
			System.out.println(emp.GetEmployeeDetails());
		
		System.out.println();
		
		System.out.println(empDb.showPaySlip(10));
	}

}