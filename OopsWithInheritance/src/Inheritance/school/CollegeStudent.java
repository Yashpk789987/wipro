package school;

public class CollegeStudent extends Student {
	private int year;
	private String major;

	public CollegeStudent(String name, String dateOfBirth, String studentId, int year, String major) {
		super(name, dateOfBirth, studentId);
		this.year = year;
		this.major = major;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
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
	public String getStudentId() {
		// TODO Auto-generated method stub
		return super.getStudentId();
	}

	@Override
	public void setStudentId(String studentId) {
		// TODO Auto-generated method stub
		super.setStudentId(studentId);
	}

	@Override
	public String toString() {
		return "CollegeStudent [name=" + getName() + ", DOB=" + getDateOfBirth() +  ", StudentId=" + getStudentId() + ", Year=" + year
				+ ", major=" + major + "]";
	}
	
	

}