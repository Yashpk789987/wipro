package school;

public class Teacher extends Person {
	private int salary;
	private String subject;

	public Teacher(String name, String dateOfBirth, int salary, String subject) {
		super(name, dateOfBirth);
		this.salary = salary;
		this.subject = subject;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public String getDateOfBirth() {
		// TODO Auto-generated method stub
		return super.getDateOfBirth();
	}

	@Override
	public void setDateOfBirth(String dateOfBirth) {
		// TODO Auto-generated method stub
		super.setDateOfBirth(dateOfBirth);
	}

	@Override
	public String toString() {
		return "Teacher [Name=" + getName() + ", DOB=" + getDateOfBirth() + ", salary=" + salary + ", subject="
				+ subject + "]";
	}

}