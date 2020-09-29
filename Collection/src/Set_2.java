import java.util.HashSet;
import java.util.Iterator;

public class Set_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set = new HashSet<>();

		set.add("Yash");
		set.add("Khushi");
		set.add("Vithlesh");
		set.add("Aditya");

		Iterator<String> it = set.iterator();
		while (it.hasNext())
			System.out.println(it.next());
	}

}
