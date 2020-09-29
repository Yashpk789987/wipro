package Set_3;

import java.util.Iterator;
import java.util.TreeSet;

public class Search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> set = new TreeSet<>();
		set.add("Yash");
		set.add("khushi");
		set.add("Vithlesh");
		set.add("Aditya");
		Iterator<String> it = set.iterator();
		String query = "Yashi";
		boolean result = false;

		while (it.hasNext()) {
			if (it.next().equals(query)) {
				result = true;
				break;
			}
		}

		if (result)
			System.out.println(query + " exists");
		else
			System.out.println(query + " doesn't exist");
	}

}
