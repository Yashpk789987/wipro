
public class Employee {
	public Employee(int emp_no, String name, String join_date, String designation_code, String department, double basic,
			double hra, double it) {
		super();
		this.emp_no = emp_no;
		this.name = name;
		this.join_date = join_date;
		this.designation_code = designation_code;
		this.department = department;
		this.basic = basic;
		this.hra = hra;
		this.it = it;
	}

	public int emp_no;
	public String name;
	public String join_date;
	public String designation_code;
	public String department;
	public double basic;
	public double hra;
	public double it;
	
	

	public int getEmp_no() {
		return emp_no;
	}

	public void setEmp_no(int emp_no) {
		this.emp_no = emp_no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getJoin_date() {
		return join_date;
	}

	public void setJoin_date(String join_date) {
		this.join_date = join_date;
	}

	public String getDesignation_code() {
		return designation_code;
	}

	public void setDesignation_code(String designation_code) {
		this.designation_code = designation_code;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getBasic() {
		return basic;
	}

	public void setBasic(double basic) {
		this.basic = basic;
	}

	public double getHra() {
		return hra;
	}

	public void setHra(double hra) {
		this.hra = hra;
	}

	public double getIt() {
		return it;
	}

	public void setIt(double it) {
		this.it = it;
	}

}
