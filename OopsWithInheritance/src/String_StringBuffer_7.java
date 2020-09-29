
public class String_StringBuffer_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "xHix";

		if (str.charAt(0) == 'x')
			str = str.substring(1, str.length());

		if (str.charAt(str.length() - 1) == 'x')
			str = str.substring(0, str.length() - 1);

		System.out.println(str);
	}

}
