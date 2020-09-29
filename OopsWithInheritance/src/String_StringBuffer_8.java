
public class String_StringBuffer_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "ab*cd";

		String[] strs = str.split(".[\\*]+.");

		StringBuffer sb = new StringBuffer();

		for (String x : strs)
			sb.append(x);

		System.out.println(sb);
	}

}
