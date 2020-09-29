class Patient {
	public String name;
	public double height;
	public double weight;

	public Patient(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}

	public double computeBMI() {
		return this.weight / (this.height * this.height);
	}

	public String toString() {
		return "Name:: " + this.name + "\nHeight:: " + this.height + " metres\nWeight:: " + this.weight + " Kgs\n";
	}

}

public class TestBMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Patient P = new Patient("Yash", 5.5, 50);
		System.out.println(P);
		System.out.println("BMI Of This Patient Is :: " + P.computeBMI());
	}

}
