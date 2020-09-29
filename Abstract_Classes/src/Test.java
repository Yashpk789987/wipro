public class Test {
	String name;

	Test(String name) {
		this.name = name;
	} // line 4

	public static void main(String[] args) {
		Test e1 = new Test("Arun");
		System.out.println(e1.name);
	}
}
