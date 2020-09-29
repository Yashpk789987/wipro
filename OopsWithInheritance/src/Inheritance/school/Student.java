package school;

public class Student extends Person {
	private String studentId;

	public Student(String name, String dateOfBirth, String studentId) {
		super(name, dateOfBirth);
		this.studentId = studentId;
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

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", Name=" + super.getName() + ", DateOfBirth="
				+ super.getDateOfBirth() + "]";
	}

}