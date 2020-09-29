import java.util.Iterator;
import java.util.Vector;


class Employee {
	private int id;
	private String name;
	private String address;
	private Double salary;

	public Employee(int id, String name, String address, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", address=" + address + ", salary=" + salary + "]";
	}
}

public class List_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector<Employee> list = new Vector<>();

		list.add(new Employee(10, "Yash", "Maihar",  40000.0));
		list.add(new Employee(11, "Khushi", "Satna",  50000.0));
		list.add(new Employee(12, "Vithlesh", "Gwalior",  60000.0));
		
		Iterator<Employee> it = list.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

}
