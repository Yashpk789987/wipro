
public class String_StringBuffer_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "hi";
		String b = "hello";
		String output;

		if (a.length() < b.length())
			output = a + b + a;
		else
			output = b + a + b;

		System.out.println(output);
	}

}
