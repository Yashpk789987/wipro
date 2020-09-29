
public class String_StringBuffer_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Wipro";
		int n = 3;
		
		StringBuffer sb = new StringBuffer();
			
		for (int i = 0; i < n; i++) {
			sb.append(str.substring(str.length() - n));
		}

		System.out.println(sb);
	}

}
